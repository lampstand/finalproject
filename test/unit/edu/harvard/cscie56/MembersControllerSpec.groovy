package edu.harvard.cscie56



import grails.test.mixin.*
import spock.lang.*

@TestFor(MemberController)
@Mock([Member,MemberService])
class MembersControllerSpec extends Specification {

	def cmd
	def service
	def memberService = new MemberService()

	@Before
	def setup(){
		cmd = mockCommandObject(MemberCommand)
		service = mockFor(MemberService).createMock()
		cmd.fullname='John Doe'
		cmd.email='hkboateng@gmail.com'
		cmd.phone= '347-967-3456'
		cmd.gender= 'male'
		cmd.address = '807 Sesame Drive'
		cmd.address1 = ' '
		cmd.agegroup = '18-25'
		cmd.city = 'Arlington'
		cmd.state = 'Texas'
		cmd.zip = 76010		
	}


    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.membersInstanceList
            model.membersInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.membersInstance == null
			Member.count() == 0
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
		controller.save(cmd)
		//controller.memberService.saveMember(cmd)



        then:"A redirect is issued to the index action"
            response.redirectedUrl == '/member/create'
            flash.message == 'New Member has been created successfully'
            Member.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A valid domain instance is passed to the show action"
		def members = controller.memberService.saveMember(cmd)
            controller.show(members)
			
        then:"A model is populated containing the domain instance"
            model.memberInstance == members
			model.memberInstance != null
    }



    void "Test the update action performs an update on a valid domain instance"() {
        given:
		def membersInstance = controller.memberService.saveMember(cmd)
		assert membersInstance != null
			
		when: "Update is called for a domain instance"
			 cmd.fullname = 'Jane Eva'
			 cmd.gender = 'female'
			 def memberInstance = controller.memberService.updateMember(membersInstance,cmd)
			 controller.update(1,cmd)
		then: "Check that new parameters where updated correctly"
			flash.message == 'Members Information has been updated Successfully.'
			response.redirectedUrl == '/member/show'
		
			memberInstance.fullname == 'Jane Eva'
			memberInstance.gender == 'female'
    }
	
	void "Test that find view is rendered when the method"(){
		when: 'The find button is clicked'
		controller.find()
		
		then: 'The view rendered is find'
		assert view == '/member/find'
	}
	
	void "Test Search Phone method"(){
		given:
		//controller.save(cmd)
		when: 'Search Email is called with incorrect parameter'
		response.reset() 
		controller.memberService.searchPhone(cmd)
		controller.searchPhone(cmd)
	
		then: 'Renders error message and redirect to the find page'

		response.redirectedUrl == '/member/find'
		flash.message == "No record was found for Phone Number: $cmd.phone"
		
		when: 'Search Phone is called with correct parameter'
		controller.memberService.saveMember(cmd)
		def members=controller.searchPhone(cmd)
	
		then: 'Redirects to teh Find view with the memberInstance'
		assert response.redirectUrl == '/member/find'
		model.memberInstance == members
	}
	
	void "Test Search Email method"(){
		given:
		//controller.save(cmd)
		when: 'Search Email is called with incorrect parameter'
		response.reset()
		controller.memberService.searchEmail(cmd)
		controller.searchEmail(cmd)
	
		then: 'Renders error message and redirect to the find page'

		response.redirectedUrl == '/member/find'
		flash.message == "No record was found for Email Address: $cmd.email"
		
		when: 'Search Phone is called with correct parameter'
		controller.memberService.saveMember(cmd)
		def members=controller.searchEmail(cmd)
	
		then: 'Redirects to teh Find view with the memberInstance'
		assert response.redirectUrl == '/member/find'
		model.memberInstance == members
	}
	void "Test Search Name method"(){
		given:
		//controller.save(cmd)
		when: 'Search Email is called with incorrect parameter'
		response.reset()
		controller.memberService.searchName(cmd)
		controller.searchName(cmd)
	
		then: 'Renders error message and redirect to the find page'

		response.redirectedUrl == '/member/find'
		flash.message == "No record was found for Full Name $cmd.fullname"
		
		when: 'Search Phone is called with correct parameter'
		controller.memberService.saveMember(cmd)
		def members=controller.searchName(cmd)
	
		then: 'Redirects to teh Find view with the memberInstance'
		assert response.redirectUrl == '/member/find'
		model.memberInstance == members
	}
/***
    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            controller.delete(null)

        then:"A 404 is returned"
            status == 302

        when:"A domain instance is created"
            response.reset()
            //populateValidParams(params)
            def members = new Members(params).save()
			assert members != null
			controller.save(members)
        then:"It exists"
            Members.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(members)

        then:"The instance is deleted"
            Members.count() == 0
            response.redirectedUrl == '/members/index'
            flash.message != null
    }****/
}
