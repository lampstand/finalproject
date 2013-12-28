package edu.harvard.cscie56



import grails.test.mixin.*
import java.text.SimpleDateFormat
import spock.lang.*

@TestFor(OfferingController)
@Mock([Offering,OfferingService])
class OfferingControllerSpec extends Specification {
	def r = new SimpleDateFormat("MM/dd/yyyy")

	def offeringService
	def cmd
	@Before
    def setup() {
       cmd = mockCommandObject(OfferingCommand)
		def date = r.parse('12/13/2013')
        cmd.service = 'Mid-Week Service'
		cmd.amountCheck = 200
		cmd.amountCash = 100
		cmd.offeringDate = date
		cmd.approvedBy = 'John Doe'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.offeringInstanceList
            model.offeringInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.offeringInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an valid instance"
			controller.offeringService.saveOffering(cmd)
			def offeringInstance = controller.save(cmd)

        then:"A redirect is issued to the show action"
           	Offering.count() == 2
			response.redirectedUrl == '/offering/index'
			flash.message =='default.created.message'

    }

    void "Test that the show action returns the correct model"() {
	given:
		controller.offeringService.saveOffering(cmd)
		controller.save(cmd)
		when:"A domain instance is passed to the show action"
		def offering = controller.show(1)

	then:"A model is populated containing the domain instance"
		view == '/offering/show'

    when:"The show action is executed with a null domain"
	response.reset()
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 302

        
    }

    void "Test that the edit action returns the correct model"() {
		given:
		controller.offeringService.saveOffering(cmd)
		def offering = controller.save(cmd)
		when:"A domain instance is passed to the edit action"
					controller.edit(1)
		
		then:"A model is populated containing the domain instance"
				view == '/offering/edit'
			
        when:"The edit action is executed with a null domain"
            controller.edit(2)

        then:"A 404 error is returned"
            response.status == 302

       
    }

    void "Test the update action performs an update on a valid domain instance"() {
		given:
		def offeringInstance =controller.offeringService.saveOffering(cmd)

		
		when:"A valid domain instance is passed to the update action"
			cmd.amountCash = 250
			def offering =controller.offeringService.updateOffering(cmd,offeringInstance)
			controller.update(1,cmd)

		then:"A redirect is issues to the show action"
			response.redirectedUrl == "/offering/show/1"
			flash.message != null
			offering.amountCash == 250
        when:"Update is called for a domain instance that doesn't exist"
			response.reset()
            controller.update(3,cmd)

        then:"A 302 error is returned"
            status == 302

    }

	
	void "Test that search view is rendered"(){
	
		when: 'When the search method is executed'
		controller.search()
		
		then : 'Search view is renderd'
		view == '/offering/searchOffering'
		
	}
	
	void "Test that search view is"(){
		given:
		controller.offeringService.saveOffering(cmd)
		controller.save(cmd)

		when: 'When searchOffering is exeuted with correct offering date'
		def offeringInstance = controller.searchOffering('12/13/2013')
		
		then: 'Error message is rendered'
		//flash.message == "No Offering was found. Try again."
		view == '/offering/searchOffering'
		model.offeringInstance == offeringInstance
		flash.message == "Offering was found successfully for date: 12/13/2013"
		response.reset()
		
		when: 'When searchOffering is exeuted with incorrect offering date'
		
		controller.searchOffering('11/20/2013')
		
		then: 'Error message is rendered'
		flash.message == "No Offering was found. Try again."
		view == '/offering/searchOffering'
		
	}
	
}
