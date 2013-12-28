import geb.spock.GebReportingSpec

import spock.lang.*

import pages.*
import pages.tithe.ListPage
import pages.user.CreateUserPage
import pages.user.EditUserPage
import pages.user.ListUserPage
import pages.user.ShowUserPage
@Stepwise
class TitheSpec extends GebReportingSpec {
		
		def "there are no people"() {
				given:
				to LoginPage
				
				when: 'I login in'
				loginForm.j_username = "admin"
				loginForm.j_password = "password"
				loginButton.click()
				
				then:

				$().text().contains("CSCIE56 Final Project 2013")
		}
		
/*
		def 'add a user'() {
			when:
				to ListUserPage
				to CreateUserPage
	
			then:
				at CreateUserPage
	
			when:
				username = 'new_user'
				password = 'p4ssw0rd'
				$('#enabled').click()
				createButton.click()
	
			then:
				at ShowUserPage
				username == 'new_user'
				enabled == true
		}*/
}