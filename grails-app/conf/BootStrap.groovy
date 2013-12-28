import java.util.Date;

import edu.harvard.cscie56.Member
import edu.harvard.cscie56.Role
import edu.harvard.cscie56.User
import edu.harvard.cscie56.UserRole
import edu.harvard.cscie56.Attendance
import edu.harvard.cscie56.Guest
import edu.harvard.cscie56.Member
import edu.harvard.cscie56.Tithe
import edu.harvard.cscie56.TithePayment

class BootStrap {
	def init = {

		def adminRole = Role.findOrSaveByAuthority('ROLE_ADMIN')
		
		def attendance = new Attendance(service: 'Half-Night',serviceDate: new Date(), adultsNumber: 5, guestNumber: 5,
		childrenNumber: 4, memberNumber: 6).save()
		
		def guest = new Guest(comments:'Ok good',ageGroup: '18-24',gender: 'female',maritalStatus: 'Single',
									name:'Kantu Achirah',address:'54 Ollinville Ave',address1:'',city: 'Bronx',state:'NY',
										zip: '02861',homePhone: '718-854-7896',mobilePhone: '214-958-8541',email:'hkbafsd@gmail.com',attendance:attendance).save(flush: true)
		
		def members = new Member(fullname: 'Hubert Boateng',email:'hkboateng@gmail.com',phone:'347-967-7223',gender: 'male',address:'67 Webster Street',address1: '#7',city: 'Pawtucket',state: 'RI',zip: '02145',
		agegroup: '0-18').save()

		def tithe = new Tithe(titheID: 1,member: members).save(flush: true)
		def tithePayment = new TithePayment(tithe: tithe,titheMonth:'June',titheYear: '2013',datePaid:new Date(),acceptedBy: 'Gina Ofori').save()
		if (!User.count()) {
			def admin = new User(member: members,username: 'admin',
			password: 'password').save()
			UserRole.create admin, adminRole, true
		}
	}
}
