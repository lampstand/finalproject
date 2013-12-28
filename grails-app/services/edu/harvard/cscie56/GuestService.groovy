package edu.harvard.cscie56
import edu.harvard.cscie56.GuestCommand
import grails.transaction.Transactional

@Transactional
class GuestService {

    def saveGuest(GuestCommand cmd) {
        def guestInstance = new Guest(comments: cmd.comments,ageGroup:cmd.ageGroup,gender: cmd.gender,maritalStatus: cmd.maritalStatus,
                                    	guestStatus: cmd.guestStatus, name: cmd.name, address: cmd.address, address1: cmd.address1, city: cmd.city,
											state: cmd.state, zip:cmd.zip, homePhone: cmd.homePhone, mobilePhone: cmd.mobilePhone, email: cmd.email, attendance: cmd.attendance).save(flush:true)
							
            return guestInstance
    }
    
	def updateGuest(Guest guestInstance,GuestCommand cmd){
		guestInstance.properties['attendance','name','comments','ageGroup','gender','address','address1','guestStatus','maritalStatus','email','city','zip','state','mobilePhone','homePhone'] = cmd.properties
		guestInstance.save(flush:true)
		return guestInstance
	}
    def getGuest(Long id){
        def guestInstance = Guest.get(id)
        return guestInstance
    }
	
	def searchGuest(Date serviceDate, String service){
		def guestInstance =Guest.executeQuery("select a from Guest a where a.attendance.serviceDate=? and a.attendance.service=?",[serviceDate,service])
		return guestInstance
	}
}
