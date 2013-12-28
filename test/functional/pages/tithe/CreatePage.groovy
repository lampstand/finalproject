package pages.tithe

import geb.Page

import pages.tithe.ShowPage
class CreatePage extends Page{
	
	static at = {
		title ==~ /Tithe/
	}
	
static content = {
		createButton(to: ShowPage) { create() }
}
}