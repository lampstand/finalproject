package pages.offering

import geb.Page
import geb.Module
import pages.offering.CreatePage
class ListPage extends Page{
	static url = 'tithe/offering'
	
	static at = {
		title == 'CSCIE56 Final Project - Church Management System'
	}
	
	static content = {
		newOfferingButton(to: CreatePage) { $('a', text: 'New Tithe') }
		offeringTable { $('div.list table', 0) }
		OfferingRow { module OfferingRow, offeringRows[it] }
		offeringRows(required: false) { offeringTable.find('tbody').find('tr') }
	}
}
class OfferingRow extends Module {
	static content = {
		cell { i -> $('td', i) }
		cellText { i -> cell(i).text() }
		cellHrefText{ i -> cell(i).find('a').text() }
		member { cellText(1) }
		showLink(to: ShowPage) { cell(0).find('a') }
	}
}