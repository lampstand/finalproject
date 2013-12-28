package edu.harvard.cscie56

import edu.harvard.cscie56.Tithe;
import edu.harvard.cscie56.TithePayment;
import edu.harvard.cscie56.TithePaymentCommand
import grails.transaction.Transactional

@Transactional
class TithePaymentService {

    def tithePayment(Long titheID, String titheYr) {

		def search = Tithe.findByTitheID(titheID)
		
		def results = TithePayment.findAllByTitheAndTitheYear(search,titheYr)
		return results
    }
	
	def savePayment(TithePaymentCommand cmd){

		def tithePayment = new TithePayment(tithe: cmd.tithe, titheYear: cmd.titheYear, titheMonth: cmd.titheMonth,
															datePaid: cmd.datePaid, amount:cmd.amount,acceptedBy: cmd.acceptedBy).save(flush: true)
		//tithePayment.save(flush: true)
		assert tithePayment != null
		return tithePayment
	}
	def updatePayment(TithePaymentCommand cmd,TithePayment tithePaymentInstance){
		tithePaymentInstance.properties['tithe','titheYear','titheMonth','datePaid','amount','acceptedBy'] = cmd.properties
		tithePaymentInstance.save(flsuh: true)
		return tithePaymentInstance
	}
	def getTitheId(Long titheID){
		
				def titheInstance = Tithe.executeQuery("select distinct c from Tithe c where c.titheID = ?", [titheID])
				
				return titheInstance
			}
}
