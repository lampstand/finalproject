import geb.spock.GebReportingSpec

import spock.lang.*
import geb.Page
import pages.*
import pages.member.ListPage
import pages.member.CreatePage
import pages.member.EditPage
@Stepwise
class MemberSpec extends GebReportingSpec{
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
	
	def 'Create New Member'(){
		given:
		to ListPage
		
		when:
		at ListPage
		newMemberButton.click()
		then:
		
		to CreatePage
		title =='CSCIE56 Final Project - Church Management System'
	}
	def 'Show Member'(){
		given:
		to ListPage
		
		when:
		at ListPage
		def row = memberRow(0)
		row.phone == '347-967-7223'
		memberRow(0).showLink.click()
		then:
		
		to CreatePage
		
		title =='CSCIE56 Final Project - Church Management System'
	}
}