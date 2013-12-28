package edu.harvard.cscie56



import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(AttendanceController)
@Mock([Attendance,AttendanceService,Guest])
class AttendanceControllerSpec extends Specification {

    def attendanceService = new AttendanceService()
	def cmd
	def serv
	
	void setup(){
		cmd = mockCommandObject(AttendanceCommand)
		serv = mockFor(AttendanceService).createMock()
		cmd.service = 'Worship Service'
		cmd.serviceDate = new Date()
		cmd.memberNumber = 20
		cmd.guestNumber = 20
		cmd.childrenNumber = 20
		cmd.adultsNumber = 20
	}
    
    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.attendanceInstanceList
            model.attendanceInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.attendanceInstance!= null
    }

    void "Test the save action correctly persists an instance"() {
		
        when:"The save action is executed with an invalid instance"

			def attendanceInstance =controller.save(cmd)
			
        then:"The create view is rendered again with the correct model"
			assert Attendance.count() == 1
			flash.message == ' Attendance has been saved Successfully'
        where: 'List the Values of the Attendance save'
		id = 1
		memberNumber = 20
		guestNumber = 20
		childrenNumber = 20
		adultsNumber = 20
		service = 'Worship Service'
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
			response.reset()
            controller.show(null)

        then:"A 302 error is returned and render index view"
			model.attendanceInstance ==null
            response.status == 302
			flash.message == 'default.not.found.message'
			response.redirectedUrl == '/attendance/index'

        when:"A domain instance is passed to the show action"
			response.reset();
			def attendanceInstance = controller.save(cmd)
			controller.show(1)

        then:"A model is populated containing the domain instance"
			view == '/attendance/show'
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"

            def attendance = new Attendance(params)
            controller.edit(attendance)

        then:"A model is populated containing the domain instance"
            model.attendanceInstance == attendance
    }

    void "Test the update action performs an update on a valid domain instance"() {
        given:"Update is called for a domain instance"
			def attendanceInstance = controller.save(cmd)
           

        when:"The User makes changes"
		response.reset()
		cmd.adultsNumber = 12
		cmd.service = 'Friday Half-Night'
		

        then:"A domain instance is passed to the update action"
		def attendances = controller.update(1,cmd)
		
		where:
		service = 'Friday Half-Night'
		adultsNumber = 12
    }
	void "Test when Attendance was created and a guest has to be created"(){
		when: "Attendance attendance is saved."
		controller.save(cmd)
		response.reset()
		controller.addGuest(1)
		
		then: 'Add Guest Information to Attendance'
		assert response.redirectedUrl == "/guest/addGuest/1"
	}

}
