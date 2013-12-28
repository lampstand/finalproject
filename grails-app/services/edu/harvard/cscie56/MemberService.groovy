package edu.harvard.cscie56
import edu.harvard.cscie56.Member
import grails.transaction.Transactional
import edu.harvard.cscie56.MemberCommand

@Transactional
class MemberService {

    def saveMember(MemberCommand cmd) {

		def memberInstance = new Member(fullname:cmd.fullname,gender:cmd.gender,email:cmd.email,phone:cmd.phone,agegroup:cmd.agegroup,city:cmd.city,state:cmd.state,zip:cmd.zip,
								address:cmd.address, address1:cmd.address1,dateCreated: cmd.dateCreated,dateModified: cmd.dateModified,createdBy:cmd.createdBy)
		assert memberInstance != null
                
                memberInstance.save(flush: true,failOnError: true)
		return memberInstance
    }

    def updateMember(Member memberInstance,MemberCommand cmd){
       memberInstance.properties['fullname','gender','email','agegroup','city','state','zip','phone','address','address1','dateCreated','dateModified','createdBy'] = cmd.properties
                memberInstance.save(flush:true)

    }

	def searchPhone(MemberCommand cmd){
		def memberInstance = Member.findByPhone(cmd.phone)
		return memberInstance
	}
	def searchEmail(MemberCommand cmd){
		def memberInstance = Member.findByEmail(cmd.email)
		return memberInstance
	}
	def searchName(MemberCommand cmd){
		def memberInstance = Member.findByFullname(cmd.fullname)
		return memberInstance
	}
      
    def deleteMember(Member memberInstance){
        
    }
}
