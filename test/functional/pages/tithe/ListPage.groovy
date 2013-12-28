package pages.tithe


import geb.Page
import geb.Module

import pages.tithe.ShowPage
import pages.tithe.CreatePage
class ListPage extends Page{
	static url = 'tithe/list'
	
	static at  = {
		title == 'Tithe List'
	}
	
	static content = {
		newTitheButton(to: CreatePage) { $('a', text: 'New Tithe') }
		titheTable { $("div.content table",0)}
		titheRow { module TitheRow, titheRows[it] }
		titheRows(required: false) {titheTable.find("tbody").find("tr")}
		}
	}

class TitheRow extends Module {
	static content = {
		cell { $("td", it) }
		cellText {cell(it).text() }
		cellHrefText{ cell(it).find('a').text()}
		titheID {cellText(0)}
		member {cellText(1)}
		showLink(to: ShowPage) {cell(0).find("a") }
	}
}
