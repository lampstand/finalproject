    package edu.harvard.cscie56



    import static org.springframework.http.HttpStatus.*
    import grails.plugin.springsecurity.annotation.Secured
    @Secured('ROLE_ADMIN')
    class MemberController {

            def memberService
        static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

        def index(Integer max) {
            params.max = Math.min(max ?: 10, 100)
            render (view: 'index', model:[membersInstanceList:Member.list(),membersInstanceCount: Member.count()])
        }

        def show(Long id) {
            def membersInstance = Member.get(id)
			if(!membersInstance){
				flash.message = 'No Member was found for ID: $id'
				return
			}
			[membersInstance: membersInstance]
        }

        def create() {
            respond new Member(params)
        }

            def find(){
                    render view: 'find'
            }

        def save(MemberCommand cmd) {
                    def membersInstance = memberService.saveMember(cmd)
                    //membersInstance.save flush:true
                    if (!membersInstance || membersInstance == null) {

                            flash.message = 'Did not save'
                            return
                    }
            request.withFormat {
                form {
                    flash.message = 'New Member has been created successfully'

                    redirect action: 'create'
                }
                '*' { respond membersInstance, [status: CREATED] }
            }
        }
            def searchPhone(MemberCommand cmd){

                            def memberInstance = memberService.searchPhone(cmd)
                                    if(!memberInstance || memberInstance == null){
                                            flash.message = "No record was found for Phone Number: $cmd.phone"
                                            redirect(action: 'find')
                                            return
                                    }

                                    render (view: 'find', model:[ membersInstance: memberInstance])
                            }
                            def searchEmail(MemberCommand cmd){

                                    def memberInstance = memberService.searchEmail(cmd)
                                    if(!memberInstance || memberInstance == null){
                                            flash.message = "No record was found for Email Address: $cmd.email"
                                            redirect(action: 'find')
                                            return
                                    }

                                    render (view: 'find', model:[ membersInstance: memberInstance])
                            }
                            def search(){
                                    render view: 'search'
                            }
       def searchName(MemberCommand cmd){

          def memberInstance = memberService.searchName(cmd)
          if(!memberInstance || memberInstance == null){
                flash.message = "No record was found for Full Name $cmd.fullname"
                redirect(action: 'find')
                return
           }

          render (view: 'find', model:[ membersInstance: memberInstance])
        }

        def edit(Long id) {
            def memberInstance = Member.get(id)
            if(!memberInstance){
                flash.message ='I think you are a Ghost....Calling the Ghostbutters'
                return
            }
            render view: 'edit' , model :[membersInstance: memberInstance]
        }

        def update(Long id,MemberCommand cmd) {
                    def membersInstance = Member.get(id)
            if (!membersInstance || membersInstance == null) {
                flash.message = "No Member was found. Try again"
                redirect (action: 'edit')
                return
            }

                    membersInstance.properties = cmd

                    if(!memberService.updateMember(membersInstance,cmd)){
                            flash.message = "An Error occured while process your request. Contact your Admin or you can try gain later"
                            render( view: 'edit', model: [membersInstance: membersInstance])
                            return
                    }
                    flash.message = "Members Information has been updated Successfully."
                    redirect (action: 'show', model: [membersInstance: membersInstance])

        }

    }
    class MemberCommand{
        Long id
            String fullname
            String email
            String phone
            String gender
            String agegroup
            String address
            String address1
            String city
            String state
            String zip
            String createdBy
            Date	dateCreated
            Date	dateModified

        static constraints = {
                    email email: true
                    phone phoneUS: true
                    dateModified nullable: true
        }

            static mapping = {
                    cache true
            }
    }