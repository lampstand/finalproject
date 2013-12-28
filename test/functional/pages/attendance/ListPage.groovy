package pages.attendance


import geb.Page
import geb.Module

import pages.attendance.EditPage
import pages.attendance.CreatePage
class ListPage extends Page{
	static url = 'attendance/index'
	
	static at  = {
		title == 'CSCIE56 Final Project - Church Management System'
	}
	
	static content = {
		newAttendanceButton(to: CreatePage) { $('a', text: 'New Attendance') }
		attendanceTable { $("div.content table",0)}
		attendanceRow { module AttendanceRow, attendanceRows[it] }
		attendanceRows(required: false) {attendanceTable.find("tbody").find("tr")}
		}
	}

class AttendanceRow extends Module {
	static content = {
		cell { $("td", it) }
		cellText {cell(it).text() }
		service{cellText(2)}
		cellHrefText{ cell(it).find('a').text()}
		showLink(to: EditPage) {cell(0).find("a") }
	}
}
