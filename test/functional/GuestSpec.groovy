import geb.spock.GebReportingSpec

import spock.lang.*
import geb.Page
import pages.*
import pages.guest.ListPage
import pages.guest.CreatePage
import pages.guest.EditPage
@Stepwise
class GuestSpec extends GebReportingSpec{
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
	
	def 'Create New Guest'(){
		given:
		to ListPage
		
		when:
		at ListPage
		then:
		to CreatePage
		title =='CSCIE56 Final Project - Church Management System'
	}
	
}