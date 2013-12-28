package pages.member


import geb.Page
import geb.Module

import pages.member.EditPage
import pages.member.CreatePage
class ListPage extends Page{
	static url = 'member/index'
	
	static at  = {
		title == 'CSCIE56 Final Project - Church Management System'
	}
	
	static content = {
		newMemberButton(to: CreatePage) { $('a', text: 'New Members') }
		memberTable { $("div.content table",0)}
		memberRow { module MemberRow, memberRows[it] }
		memberRows(required: false) {memberTable.find("tbody").find("tr")}
		}
	}

class MemberRow extends Module {
	static content = {
		cell { $("td", it) }
		cellText {cell(it).text() }
		phone{cellText(1)}
		cellHrefText{ cell(it).find('a').text()}
		showLink(to: EditPage) {cell(0).find("a") }
	}
}
