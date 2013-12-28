package edu.harvard.cscie56

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import java.text.SimpleDateFormat
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestFor(TithePaymentController)
@Mock([TithePayment,TithePaymentService,Tithe,Member])
class TithePaymentControllerSpec extends Specification {
	 
	def cmd
	def tithePaymentService = new TithePaymentService() 
	@Before
	def setup() {
		cmd = mockCommandObject(TithePaymentCommand)
		def memberInstance = new Member(fullname:'John Doe',email:'hkboateng@gmail.com',phone: '347-967-3456',gender: 'male',
			address: '807 Sesame Drive',address1:' ',agegroup :'18-25',city:'Arlington',state:'Texas',zip : 76010).save(flush:true)
		
		def titheInstance = new Tithe(titheID: 1, member: memberInstance).save(flush:true)
		cmd.amount = 100
		cmd.datePaid = new Date('12/27/2013')
		cmd.titheMonth = 'June' 
		cmd.titheYear = '2013'
		cmd.tithe = titheInstance
		cmd.acceptedBy = 'John Foo'
	}

	void "Test the index action correctly redirects"() {

		when:"The index action is executed"
			controller.index()

		then:"The model is correct"
			response.redirectedUrl == '/tithePayment/list'
	}

	void "Test the list action returns the correct model"() {

		when:"The list action is executed"
			def model = controller.list()

		then:"The model is correct"
			!model.tithePaymentInstanceList
			model.tithePaymentInstanceTotal == 0
	}

	void "Test the create action returns the correct model"() {
		when:"The create action is executed"
			def model = controller.create()

		then:"The model is correctly created"
			model.tithePaymentInstance
	}

	void "Test the save action correctly persists an instance"() {
		when:"The save action is executed with an invalid instance"
			//controller.tithePaymentService.savePayment(cmd)
			controller.save(cmd)
		then:"The create view is rendered again with the correct model"
			flash.message == 'default.created.message'
			response.redirectedUrl == '/tithePayment/show/1'
			response.reset()
	}

	void "Test that the show action returns the correct model"() {
		
		when:"A domain instance is passed to the show action"
			def tithePayment = controller.tithePaymentService.savePayment(cmd)
			controller.show(1)

		then:"A model is populated containing the domain instance"
			flash.message == null
			model.tithePaymentInstance == tithePayment
			
		when:"The show action is executed with an invalid id"
			controller.show(1000)

		then:"A 302 error is returned"
			response.status == 302

	}

	void "Test that searchPayements return the correct view"(){
		when: 'The searchPayment action is executed'
				controller.searchPayments()
		
		then: 'The searchPayment view is rendered'
				view == '/tithePayment/searchTithePayment'
	}
	void "Test that the edit action returns the correct model"() {
		when:"The edit action is executed with an invalid id"
			controller.edit(1000)

		then:"A 302 error is returned"
			response.status == 302

		when:"A domain instance is passed to the edit action"
		response.reset()
			controller.edit(1)

		then:"A model is populated containing the domain instance"
			model.tithePaymentInstance == null
	}

	void "Test the update action performs an update on a valid domain instance"() {
		when:"Update is called for a domain instance that doesn't exist"
			controller.update(1,cmd)

		then:"A 302 error is returned"
			response.redirectedUrl == '/tithePayment/list'
			flash.message == 'default.not.found.message'

		when:"A valid domain instance is passed to the update action"
			response.reset() 
			def tithePayment  = controller.tithePaymentService.savePayment(cmd)
			controller.update(1,cmd)

		then:"A redirect is issues to the show action"
			flash.message == 'default.updated.message'
			response.redirectedUrl == "/tithePayment/show/1"
			
	}

	void "Test that SearchTithe renders the correct tithe payment instance"(){
		when: 'SearchTithe action is executed with correct TitheID and Year'
				def search = controller.tithePaymentService.savePayment(cmd)
				controller.searchTithe(1, '2013')
		then:'The correct view is rendered and the instance is displayed'
				view == '/tithePayment/searchTithePayment'

	}


}
