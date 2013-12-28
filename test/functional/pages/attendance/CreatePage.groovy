package pages.attendance

import geb.Page


class CreatePage extends Page{
	static url = 'attendance/create'
	static at = {
		title ==~ /CSCIE56 Final Project - Church Management System/
	}
	static content = {
		attendForm { $('form', name: 'attendForm') }
		attendButton { $('input', type: 'submit', value: 'Save') }
	}

}