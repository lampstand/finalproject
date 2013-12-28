package edu.harvard.cscie56

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(TitheController)
@Mock([Member,Tithe,TitheService,TitheCommand])
class TitheControllerSpec extends Specification {

	def cmd
	
	@Before 
	def setup(){
		/*def member = new Member(fullname:'John Doe',email:'hkboateng@gmail.com',phone: '347-967-3456',gender: 'male',
			address: '807 Sesame Drive',address1:' ',agegroup :'18-25',city:'Arlington',state:'Texas',zip : 76010).save(flush:true)*/
		cmd = mockCommandObject(TitheCommand)
		cmd.titheID = 5

	}

    void "Test that create view will be rendered"() {
		when: 'A new Tithe ID is to be created'
		controller.create()
		
		then: 'Create view will be rendered'
			view == '/tithe/create'
    }
	
	void "Test the save action correctly persists an instance"(){
		given:
		def memberInstance = new Member(fullname:'John Doe',email:'hkboateng@gmail.com',phone: '347-967-3456',gender: 'male',
			address: '807 Sesame Drive',address1:' ',agegroup :'18-25',city:'Arlington',state:'Texas',zip : 76010).save()

		
		when: 'The save action is executed with valid paramters'
		cmd.member = memberInstance
			controller.save(cmd)
		
		then : 'Check that the tithe instance was saved'
			Tithe.count() ==1
			flash.message == 'default.created.message'
			response.redirectedUrl == '/tithe/show/1'
	}
	
	void "Test the update action correctly update"(){
		given:
		def memberInstance = new Member(fullname:'John Doe',email:'hkboateng@gmail.com',phone: '347-967-3456',gender: 'male',
			address: '807 Sesame Drive',address1:' ',agegroup :'18-25',city:'Arlington',state:'Texas',zip : 76010).save(flush:true)
		cmd.member = memberInstance
		controller.save(cmd)

		when: 'the update action is executed'
		response.reset()
			controller.update(1,cmd)
			
		then: ''
		flash.message == 'default.updated.message'
		response.redirectedUrl == '/tithe/show/1'
	
		where:
		titheID = 5
		
	}


}
