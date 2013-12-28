import geb.spock.GebReportingSpec

import spock.lang.*
import geb.Page
import pages.*
import pages.guest.ListPage
import pages.guest.CreatePage
import pages.guest.EditPage
@Stepwise
class GuestSpec extends GebReportingSpec{

	def 'List Guest'(){
		given:
		to ListPage
		
		when:
		at ListPage
		then:
		title =='CSCIE56 Final Project - Church Management System'
	}
	
}