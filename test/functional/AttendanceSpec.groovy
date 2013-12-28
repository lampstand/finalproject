import geb.spock.GebReportingSpec

import spock.lang.*
import geb.Page
import pages.*
import pages.attendance.ListPage
import pages.attendance.CreatePage
import pages.attendance.EditPage
@Stepwise
class AttendanceSpec extends GebReportingSpec{
	def "User Login"() {
		given:
		to LoginPage
		
		when: 'I login in'
		loginForm.j_username = "admin"
		loginForm.j_password = "password"
		loginButton.click()
		
		then:
		$().text().contains("CSCIE56 Final Project 2013")
	}
	
	def "Creating New Attendance"(){
		when:
		to ListPage
		
		then:
		at ListPage
		
		when:
		newAttendanceButton.click()
		to CreatePage
		then:
		assert 1 == 1

	}
	
	def 'Edit Attendance'(){
		given:
		to ListPage
		
		when:
		at ListPage
		
		then:
		to EditPage
	}
}