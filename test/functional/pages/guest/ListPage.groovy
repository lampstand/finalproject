package pages.guest


import geb.Page
import geb.Module

import pages.guest.EditPage
import pages.guest.CreatePage
class ListPage extends Page{
	static url = 'guest/index'
	
	static at  = {
		title == 'CSCIE56 Final Project - Church Management System'
	}
	
	static content = {
		newGuestButton(to: CreatePage) { $('a', text: 'New Guest') }
		guestTable { $("div.content table",0)}
		guestRow { module GuestRow, guestRows[it] }
		guestRows(required: false) {guestTable.find("tbody").find("tr")}
		}
	}

class GuestRow extends Module {
	static content = {
		cell { $("td", it) }
		cellText {cell(it).text() }
		cellHrefText{ cell(it).find('a').text()}
		editLink(to: EditPage) {cell(0).find("a") }
	}
}
