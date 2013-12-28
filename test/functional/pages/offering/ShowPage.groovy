package pages.offering

import geb.Page
import pages.offering.EditPage
import pages.offering.ListPage
class ShowPage extends Page{
	
	static at = {
		title ==~ /CSCIE56 Final Project - Church Management System/
	}
	
	static content = {
		offeringData { $('li.fieldcontain span.property-label', text: it).parent() }
		editButton(to: EditPage) { $('a', text: 'Edit') }
		listButton(to: ListPage) { $('a', text: 'List') }
	}
}