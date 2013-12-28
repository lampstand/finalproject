package pages.offering

import geb.Page

import pages.offering.ShowPage
class CreatePage extends Page{

	static at = { title =='CSCIE56 Final Project - Church Management System'}

	static content = {
		offeringForm { $("form") }
		member { $('input', type: 'text',     name: 'member') }
		titheID { $('input', type: 'text',     name: 'titheID') }
		offeringButton (to: ShowPage){ $("input", value: "Create") }

	}

}