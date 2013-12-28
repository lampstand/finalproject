package pages.tithe

import geb.Page

import pages.tithe.ShowPage
import pages.tithe.ListPage
class EditPage extends Page {
	static at = {
		heading.text() ==~ /Edit.+/
}

static content = {
		updateButton(to: ShowPage) { $("input", value: "Update") }
		deleteButton(to: ListPage) { $("input", value: "Delete") }
	}
}