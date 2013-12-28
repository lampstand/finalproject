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
		
		def members = new Member(fullname: 'Hubert Boateng',email:'hkboateng@gmail.com',phone:'347-967-7223',gender: 'male',address:'67 Webster Street',address1: '#7',city: 'Pawtucket',state: 'RI',zip: '02145',
		agegroup: '0-18').save()
			if (!User.count()) {
			def admin = new User(member: members,username: 'admin',
			password: 'password').save()
			UserRole.create admin, adminRole, true
		}
	}
}
