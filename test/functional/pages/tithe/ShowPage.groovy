package pages.tithe

import geb.Page

import pages.tithe.EditPage
class ShowPage extends Page{
	
	static at = {
		title ==~ /Tithe/
	}
	
	static content = {
		editButton(to: EditPage) {$('a', text: 'Edit') }
		row { $("li.fieldcontain span.property-label", text: it).parent() }
		value { row(it).find("span.property-value").text() }
		titheID {value("Tithe ID") }
		Member { value ("Member Name")}
	}
}