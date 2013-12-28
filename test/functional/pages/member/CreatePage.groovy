package pages.member

import geb.Page


class CreatePage extends Page{
	static url = 'member/create'
	static at = {
		title ==~ /CSCIE56 Final Project - Church Management System/
	}
	static content = {
		memberForm { $('form', name: 'attendForm') }
		memberButton { $('input', type: 'submit', value: 'Save') }
	}

}