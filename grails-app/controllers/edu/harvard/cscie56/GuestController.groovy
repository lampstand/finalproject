package edu.harvard.cscie56



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import org.codehaus.groovy.grails.validation.Validateable
import edu.harvard.cscie56.Attendance
import edu.harvard.cscie56.GuestService
@Secured('ROLE_ADMIN')

class GuestController {

    def guestService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Guest.list(params), model:[guestInstanceCount: Guest.count()]
    }

    def show(Long id) {
		def guestInstance = Guest.get(id)
		if(guestInstance == null){
			flash.message = 'No Record was found..Try again'
			return
		} 
       render(view: 'show',model: [guestInstance:guestInstance])
    }

    def create() {
        respond new Guest(params)
    }

	def search(){
		render view: 'searchguest'
	}

	def searchGuest(GuestCommand cmd,String service){

		def attendanceInstance = guestService.searchGuest(cmd,service)
		
		if(!attendanceInstance){
			log.warn "No Recored was found for $searchDate"
			flash.message = "No record was found for Service Date: $searchDate"
			return
		}

		log.info "Service Date search was successful."
		flash.message = "Service Date search was successful."
		render view: 'searchGuest', model: [guestInstanceList: attendanceInstance, serviceName: service, serviceDate: searchdate]
	}
	
	def addGuest(Long id){
		
		render (view: 'create', model:[attendanceName: Attendance.get(id)])
	}

    def save(GuestCommand cmd) {
        def guestInstance = guestService.saveGuest(cmd)
        if(!guestInstance || guestInstance == null){
			log.info "Error occured while procession your transaction. Try again later"
            flash.message = 'Error occured while procession your transaction. Try again later'
            return
        }
		log.info 'Guest Information was saved Successfully.'
        flash.message =  'Guest Information was saved Successfully.'
        redirect (action: 'show', guestInstance: guestInstance)
    }

    def edit(Long id) {
        def guestInstance = Guest.get(id)
		if(guestInstance== null || !guestInstance){
			flash.message = 'No record was found for Guest'
			redirect(action: "index")
			return
		}
		[guestInstance : guestInstance]
    }


    def update(Long id,GuestCommand cmd) {
		def guestInstance = Guest.get(id)
        if (guestInstance == null) {
			log.info "No record was found. Try again."
			flash.message = 'No record was found. Try again.'
            redirect(action: 'edit', id: id)
            return
        }
		
        if (guestInstance.hasErrors()) {
            respond guestInstance.errors, view:'edit'
            return
        }

        guestInstance.properties = cmd
		def guest = guestService.updateGuest(guestInstance, cmd)
		if(!guest ){
        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Guest.label', default: 'Guest'), guestInstance.id])
				redirect guestInstance
				}
            '*'{ respond guestInstance, [status: OK] }
        	}
		}
		
		flash.message = 'Guest has been updated successfully.'
		redirect (action: 'show', model: [guestInstance: guest])
    }

}
@Validateable
class GuestCommand{
    Long id
	Date serviceDate
    String comments
	String ageGroup
	String gender
	String maritalStatus
	String guestStatus
	String name
	String address
	String address1
	String city
	String state
	String zip
	String homePhone
	String mobilePhone 
	String email
	Attendance attendance
	
	static constraints = {
		homePhone phoneUS:true
		mobilePhone phoneUS:true
		email email:true
		address1 nullable: true
		homePhone nullable: true
	}
	
	static mapping = {
		cache true
	}
}