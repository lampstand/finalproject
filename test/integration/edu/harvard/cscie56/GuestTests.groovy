package edu.harvard.cscie56


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import edu.harvard.cscie56.Guest
import edu.harvard.cscie56.GuestService
class GuestTests extends GroovyTestCase {

	def cmd
	def guestService = new GuestService()
	def controller = new GuestController()
	@Before
    public void setUp() {
		cmd = new GuestCommand()
		def attendanceInstance = new Attendance(service: 'Sunday Service', memberNumber: 10, guestNumber: 19,
			serviceDate: new Date('12/23/2013'),childrenNumber: 13, adultsNumber: 21).save()
			
		cmd.attendance = attendanceInstance
		cmd.comments = 'Everything is OK'
		cmd.ageGroup = '18-34'
		cmd.gender = 'male'
		cmd.maritalStatus = 'Single'
		cmd.guestStatus = 'First Visit'
		cmd.name = 'John Doe'
		cmd.address = '34 Webster street'
		cmd.address1 = 'fsf '
		cmd.city = 'Waco'
		cmd.state = 'Texas'
		cmd.zip ='76010'
		cmd.homePhone = '214-856-9658'
		cmd.mobilePhone = '214-856-9658'
		cmd.email = 'john.joe@yahoo.com'
		
    }

	@Test
    public void testSaveGuest() {
		def guest = guestService.saveGuest(cmd)
		assert guest.count == 1
		assert guest.email == 'john.joe@yahoo.com'
    }
	
	@Test
	public void testUpdateGuest(){
		def guestInstance = controller.guestService.saveGuest(cmd)
		cmd.email = 'johnjay@gmail.com'
		cmd.address1 = ''
		def guest = controller.guestService.updateGuest(guestInstance, cmd)
		assert guest.address1 == null
		assert guest.email == 'johnjay@gmail.com'
	}
	
	@Test
	public void testSearchGuest(){
		controller.guestService.saveGuest(cmd)
		def guest = controller.guestService.searchGuest(new Date('12/23/2013'),'Sunday Service')
		assert !guest.empty
		guest.count == 1
	}
}
