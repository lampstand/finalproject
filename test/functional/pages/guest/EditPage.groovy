package pages.guest

import geb.Page


import pages.guest.ListPage
class EditPage extends Page {
	static url = 'guest/edit'
	static at = {
		title ==~ /CSCIE56 Final Project - Church Management System/
}

static content = {
		updateButton(to: ListPage) { $("input", value: "Update") }
	}
}