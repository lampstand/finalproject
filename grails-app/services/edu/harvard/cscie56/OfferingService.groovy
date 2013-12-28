package edu.harvard.cscie56

import edu.harvard.cscie56.Offering
import edu.harvard.cscie56.OfferingCommand
import grails.transaction.Transactional


@Transactional
class OfferingService {

    def saveOffering(OfferingCommand cmd) {
		def offeringInstance = new Offering(service: cmd.service,amountCash:cmd.amountCash,amountCheck:cmd.amountCheck,
									approvedBy:cmd.approvedBy, offeringDate:cmd.offeringDate)
		offeringInstance.save(flush: true)
		

		return offeringInstance
    }
	
	def updateOffering(OfferingCommand cmd, Offering offeringInstance){
		offeringInstance.properties['service','amountCash','amountCheck','approvedby','offeringDate'] = cmd.properties
		offeringInstance.save(flush:true)
		return offeringInstance
	}
	def searchOffering(Date offering){
		def offeringInstance = Offering.findByOfferingDate(offering)
		return offeringInstance
	}

}
