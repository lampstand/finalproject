package pages.guest

import geb.Page


class CreatePage extends Page{
	static url = 'guest/create'
	static at = {
		title ==~ /CSCIE56 Final Project - Church Management System/
	}
	static content = {
		guestForm { $('form', name: 'attendForm') }
		guestButton { $('input', type: 'submit', value: 'Save') }
	}

}