package pages.attendance

import geb.Page


import pages.attendance.ListPage
class EditPage extends Page {
	static url = 'attendance/edit'
	static at = {
		title ==~ /CSCIE56 Final Project - Church Management System/
}

static content = {
		updateButton(to: ListPage) { $("input", value: "Update") }
	}
}