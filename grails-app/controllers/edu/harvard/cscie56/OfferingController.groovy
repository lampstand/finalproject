package edu.harvard.cscie56



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import java.text.SimpleDateFormat
@Secured('ROLE_ADMIN')

class OfferingController {

	def offeringService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Offering.list(params), model:[offeringInstanceCount: Offering.count()]
    }

    def show(Long id) {
	  def offeringInstance = Offering.get(id)
	  if(!offeringInstance || offeringInstance == null){
		  notFound()
		  return
	  }
	  render (view: 'show', model: [offeringInstance: offeringInstance])
    }

    def create() {
        respond new Offering(params)
    }

	def search(){
		render view: 'searchOffering' 
	}

    def save(OfferingCommand cmd) {
		def offeringInstance = offeringService.saveOffering(cmd)
        if (!offeringInstance) {
			flash.message = 'k'
            return
        }

        if (offeringInstance.hasErrors()) {
            respond offeringInstance.errors, view:'create'
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'offeringInstance.label', default: 'Offering'), offeringInstance.id])
        redirect (action: 'index', model:[offeringInstance: offeringInstance])

    }

    def edit(Long id) {
	  def offeringInstance = Offering.get(id)
	  if(!offeringInstance || offeringInstance == null){
		  notFound()
		  return
	  }
	  render (view: 'edit', model: [offeringInstance: offeringInstance])
    }


    def update(Long id,OfferingCommand cmd) {
		def offeringInstance = Offering.get(id)
        if (offeringInstance == null || !offeringInstance) {
            return
        }

        if (offeringInstance.hasErrors()) {
            respond offeringInstance.errors, view:'edit'
            return
        }

        offeringInstance.properties  = cmd

			if(!offeringService.updateOffering(cmd, offeringInstance))
			{
			flash.message = 'Error occured while processing your request..Try again later.'
			return
			}
			flash.message = message(code: 'default.updated.message', args: [message(code: 'Offering.label', default: 'Offering'), offeringInstance.id])
			redirect (action: 'show', id: id)
    }

	def searchOffering(String offeringDate){
		def date = new SimpleDateFormat('MM/dd/yyyy')
		def offeringdate = date.parse(offeringDate)

		def offeringInstance = Offering.findByOfferingDate(offeringdate)
		if (!offeringInstance || offeringInstance == null){
			log.info "No Offering was found $offeringdate"
			flash.message = "No Offering was found. Try again."
			redirect(action: 'search')
			return
		}
		log.info "Offering was found successfully for date: $offeringDate"
		flash.message = "Offering was found successfully for date: $offeringDate"
		render view: 'searchOffering', model : [offeringInstanceList: offeringInstance]
		
	}



    protected void notFound() {
        request.withFormat {
            form {
                flash.message = "No Offering was found. Try again"
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
class OfferingCommand{
	Long id
	String service
	Float amountCheck
	Float amountCash
	Date offeringDate
	String approvedBy
	
	static constraints = {
	}
	static mapping = {
		version false
	}
}