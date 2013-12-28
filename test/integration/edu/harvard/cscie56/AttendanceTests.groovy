package edu.harvard.cscie56;

import static org.junit.Assert.*;

import javax.sound.midi.ControllerEventListener;

import org.junit.Before;
import org.junit.Test;

import edu.harvard.cscie56.Attendance
class AttendanceTests extends GroovyTestCase{

	def attendanceService
	def cmd
	@Before
	public void setUp() throws Exception {
		cmd = new AttendanceCommand()
		cmd.service = 'Worship Service'
		cmd.serviceDate = new Date('12/27/2013')
		cmd.memberNumber = 20
		cmd.guestNumber = 20
		cmd.childrenNumber = 20
		cmd.adultsNumber = 20
	}

	@Test
	public void testSaveAttendance() {
		def controller = new AttendanceController()
		def attendance = controller.attendanceService.saveAttendance(cmd)
		
		assert attendance != null
		assert attendance.service == 'Worship Service'

	}
	
	@Test
	public void testUpdateAttendance(){
		def controller = new AttendanceController()
		controller.attendanceService = attendanceService
		def attendanceInstance = controller.attendanceService.saveAttendance(cmd)
		cmd.service = 'Bible Studies'
		cmd.serviceDate = new Date('12/27/2013')
		def attendance = controller.attendanceService.updateAttendance(attendanceInstance,cmd)
		
		attendance.count == 1
		assert attendance.service == 'Bible Studies'
		assert attendance.serviceDate == new Date('12/27/2013')
	}
	
	@Test
	public void testSearchAttendance(){
		def controller = new AttendanceController()
		controller.attendanceService = attendanceService
		def attendanceInstance = controller.attendanceService.saveAttendance(cmd)
				
		def searchAttendance = controller.attendanceService.searchAttendance(cmd)

		assert searchAttendance.serviceDate == new Date('12/27/2013')
		assert Attendance.count() == 1
		searchAttendance == 'Worship Service'
	
		
	}

	@Test
	public void testGetGuest(){
		def controller = new AttendanceController()
		def attendanceInstance = controller.attendanceService.saveAttendance(cmd)
		def guest = new Guest(comments:'Everything is OK',ageGroup: '18-34',gender:'male', maritalStatus :'Single',homePhone: '',mobilePhone: '214-856-9658', guestStatus:'First Visit',
			name: 'John Doe',address:'34 Webster street',address1:'',city:'Waco',state: 'Texas',zip:76010,email :'john.joe@yahoo.com',attendance : attendanceInstance).save()
	
		def guestInstance = controller.attendanceService.getGuest(1)
		
		assert guestInstance != null
		assert guestInstance.size() == 1
		guestInstance.name == 'John Doe'
	}
}
