package edu.harvard.cscie56



import java.util.Date;

import grails.test.mixin.*
import spock.lang.*

@TestFor(GuestController)
@Mock([Guest,GuestService,Attendance,AttendanceService])

class GuestControllerSpec extends Specification {
 
	def guestService = new GuestService()
	def cmd
	def attend
	def service
	def serv
 
	@Before 
	def setup(){ 
		cmd = mockCommandObject(GuestCommand) 
		cmd.comments = 'Everything is OK'
		cmd.ageGroup = '18-34'
		cmd.gender = 'male'
		cmd.maritalStatus = 'Single'
		cmd.guestStatus = 'First Visit'
		cmd.name = 'John Doe'
		cmd.address = '34 Webster street'
		cmd.address1 = ''
		cmd.city = 'Waco'
		cmd.state = 'Texas'
		cmd.zip ='76010'
		cmd.homePhone = ''
		cmd.mobilePhone = '214-856-9658'
		cmd.email = 'johnjoe@yahoo.com'
	}

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.guestInstanceList
            model.guestInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.guestInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed without an Attendance"

			def attendanceInstance = new Attendance(service: 'Sunday Service', memberNumber: 10, guestNumber: 19,
													serviceDate: new Date('12/23/2013'),childrenNumber: 13, adultsNumber: 21).save(flush: true)
			cmd.attendance = attendanceInstance	
			controller.save(cmd)
			def guest = controller.guestService.saveGuest(cmd)
        then:"The create view is rendered again with the correct model"
            guest != null
			response.redirectedUrl == '/guest/show'
            controller.flash.message != null
            Guest.count() == 2
			assert guest.zip == '76010'
			assert guest.name == 'John Doe'
			assert guest.state == 'Texas' 
    }
 
    void "Test that the show action returns the correct model"() {
		given:
		def attendanceInstance = new Attendance(service: 'Sunday Service', memberNumber: 10, guestNumber: 19,
			serviceDate: new Date('12/23/2013'),childrenNumber: 13, adultsNumber: 21).save(flush: true)
			cmd.attendance = attendanceInstance
			def guests = controller.guestService.saveGuest(cmd)
			
		when:"A domain instance is passed to the show action"
			def guestInstance =controller.show(1)
			
		then:"A model is populated containing the domain instance"
		view == '/guest/show'
		
        when:"The show action is executed with a incorrect id"
            controller.show(5)

        then:"Error message is returned"
            flash.message == 'No Record was found..Try again'

        
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(0)

        then:"A 302 error is returned"
			flash.message == 'No record was found for Guest'
            response.status == 302
			

        when:"A domain instance is passed to the edit action"
		response.reset()
            def guest = controller.edit(1)

        then:"A model is populated containing the domain instance"
            model.guestInstance == guest
    }

	
    void "Test the update action performs an update on a valid domain instance"() {
		given:
		def attendanceInstance = new Attendance(service: 'Sunday Service', memberNumber: 10, guestNumber: 19,
			serviceDate: new Date('12/23/2013'),childrenNumber: 13, adultsNumber: 21).save(flush: true)
			cmd.attendance = attendanceInstance
			def guests = controller.guestService.saveGuest(cmd)
		/**	
        when:"An invalid domain instance is passed to the update action"
            controller.update(2,cmd)

        then:"The edit view is rendered again with the invalid instance"
			response.status ==302
            response.redirectedUrl== '/guest/edit/2'
			flash.message == 'No record was found. Try again.'
			
**/
        when:"A valid domain instance is passed to the update action"
				cmd.name = 'Jane Foo'
				cmd.gender = 'female'
            def guest = controller.guestService.updateGuest(guests,cmd)

			then:"A redirect is issues to the show action"
			guest.name == 'Jane Foo'
			assert guest != null
            flash.message == null
			
			where:
			gender = 'female'
			name = 'Jane Foo'
    }
	
/**
    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            status == 404

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def guest = new Guest(params).save(flush: true)

        then:"It exists"
            Guest.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(guest)

        then:"The instance is deleted"
            Guest.count() == 0
            response.redirectedUrl == '/guest/index'
            flash.message != null
    }**/
	
}
