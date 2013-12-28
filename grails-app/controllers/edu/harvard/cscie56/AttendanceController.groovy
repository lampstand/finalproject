package edu.harvard.cscie56

import edu.harvard.cscie56.Guest

import static org.springframework.http.HttpStatus.*
import grails.converters.JSON

import java.util.Date;

import grails.validation.Validateable
import grails.plugin.springsecurity.annotation.Secured
@Secured('ROLE_ADMIN')

class AttendanceController {
	
	def attendanceService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        render  (view:'index', model:[attendanceInstanceList:Attendance.list(params), attendanceInstanceCount: Attendance.count()])
    }

	def addGuest(Long id){
		log.info "Request to add Add Guest Information to Attendance"
		redirect ( controller:'guest',action:'addGuest',id: id)
	}
    def show(Long id) {
	  def attendanceInstance = Attendance.get(id)
      def guestsInstance = getGuest(id)
	  if(!attendanceInstance || attendanceInstance == null){
		  notFound()
		  return
	  }
	  log.info ""
      render (view: 'show', model:[attendanceInstance: attendanceInstance, guestInstance: guestsInstance])
    }

    def create() {
        respond new Attendance(params)
    }


    def search(){
        render view: 'search'
    }
    def save(AttendanceCommand cmd) {
		
		def attendanceInstance = attendanceService.saveAttendance(cmd)

		if (attendanceInstance == null || !attendanceInstance) {
			notFound()
			return
		}
                log.info "Attendance has been saved Successfully"
                flash.message = " Attendance has been saved Successfully"
                redirect (action: 'index')
        
    }

    def edit(Attendance attendanceInstance) {
        respond attendanceInstance
    }

    def getGuest(Long id){
        def guestInstance = attendanceService.getGuest(id)
        return guestInstance
    }
    def update(Long id,AttendanceCommand cmd) {
		def attendanceInstance = Attendance.get(id)
        if (!attendanceInstance ||attendanceInstance == null) {
            flash.message 'No record was found for Attendance'
            return
        }

                attendanceInstance.properties = cmd
		def attendance = attendanceService.updateAttendance(attendanceInstance,cmd)
		if(!attendance){
			flash.message "Error occured while Updating Attendance.."
			return
		}
        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Attendance.label', default: 'Attendance'), attendanceInstance.id])
                redirect action: 'index', method: 'GET'
            }
            '*'{ respond attendanceInstance, [status: OK] }
        }
    }



    def searchAttendance(AttendanceCommand cmd){
        
        def attendanceInstance = attendanceService.searchAttendance(cmd)

        if(!attendanceInstance  || attendanceInstance  == null){
            render 'No Record was found for Service Date $cmd.serviceDate'
            return
        }
        render (view: 'search', model:[attendancesInstance: attendanceInstance ])
    }
    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'attendanceInstance.label', default: 'Attendance'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
@Validateable
class AttendanceCommand{
	Long id
	String service
	Date serviceDate
	Long memberNumber
	Long guestNumber
	Long childrenNumber
	Long adultsNumber
	
	static constraints = {
		
	}
	
	static mapping = {
		serviceDate column: 'serviceDate', index: 'servicedate_Idx'
	}
}
