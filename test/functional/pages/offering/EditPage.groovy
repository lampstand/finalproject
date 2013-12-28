package pages.offering
import geb.Page
import pages.offering.ShowPage
import pages.offering.ListPage
class EditPage extends Page {
	static content = {
		updateButton(to: ShowPage) { $('input', value: 'Update') }
	}
}