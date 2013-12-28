package pages.member

import geb.Page


import pages.member.ListPage
class EditPage extends Page {
	static url = 'member/edit'
	static at = {
		title ==~ /CSCIE56 Final Project - Church Management System/
}

static content = {
		updateButton(to: ListPage) { $("input", value: "Update") }
	}
}