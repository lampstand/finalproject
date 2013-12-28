import edu.harvard.cscie56.Attendance
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_attendanceshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendance/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'attendance.label', default: 'Attendance'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("index")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(7)
if(true && (attendanceInstance?.service)) {
printHtmlPart(8)
invokeTag('fieldValue','g',22,['bean':(attendanceInstance),'field':("service")],-1)
printHtmlPart(9)
invokeTag('formatDate','g',22,['date':(attendanceInstance?.serviceDate),'type':("date"),'style':("LONG")],-1)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (attendanceInstance?.adultsNumber)) {
printHtmlPart(15)
invokeTag('message','g',35,['code':("attendance.adultsNumber.label"),'default':("Adults Number")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',37,['bean':(attendanceInstance),'field':("adultsNumber")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (attendanceInstance?.childrenNumber)) {
printHtmlPart(19)
invokeTag('message','g',44,['code':("attendance.childrenNumber.label"),'default':("Children Number")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',46,['bean':(attendanceInstance),'field':("childrenNumber")],-1)
printHtmlPart(21)
}
printHtmlPart(22)
if(true && (attendanceInstance?.guestNumber)) {
printHtmlPart(23)
invokeTag('message','g',55,['code':("attendance.guestNumber.label"),'default':("Guest Number")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',57,['bean':(attendanceInstance),'field':("guestNumber")],-1)
printHtmlPart(21)
}
printHtmlPart(18)
if(true && (attendanceInstance?.memberNumber)) {
printHtmlPart(25)
invokeTag('message','g',64,['code':("attendance.memberNumber.label"),'default':("Member Number")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',66,['bean':(attendanceInstance),'field':("memberNumber")],-1)
printHtmlPart(21)
}
printHtmlPart(27)
if(true && (guestInstance)) {
printHtmlPart(28)
invokeTag('sortableColumn','g',77,['property':("name"),'title':(message(code: 'guest.guestStatus.label', default: 'Guest Name'))],-1)
printHtmlPart(29)
invokeTag('sortableColumn','g',79,['property':("Phone Number"),'title':(message(code: 'guest.homePhone.label', default: 'Phone Number'))],-1)
printHtmlPart(29)
invokeTag('sortableColumn','g',81,['property':("email"),'title':(message(code: 'guest.email.label', default: 'Email'))],-1)
printHtmlPart(29)
invokeTag('sortableColumn','g',83,['property':("address"),'title':(message(code: 'guest.address.label', default: 'Address'))],-1)
printHtmlPart(29)
invokeTag('sortableColumn','g',85,['property':("guestStatus"),'title':(message(code: 'guest.address1.label', default: 'Guest Status'))],-1)
printHtmlPart(30)
loop:{
int i = 0
for( guestsInstance in (guestInstance) ) {
printHtmlPart(31)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(32)
createTagBody(4, {->
expressionOut.print(guestsInstance?.name)
})
invokeTag('link','g',93,['action':("show"),'id':(guestsInstance?.id)],4)
printHtmlPart(33)
expressionOut.print(guestsInstance?.mobilePhone)
printHtmlPart(34)
expressionOut.print(guestsInstance?.homePhone)
printHtmlPart(35)
expressionOut.print(guestsInstance?.email)
printHtmlPart(35)
expressionOut.print(guestsInstance?.address)
printHtmlPart(36)
expressionOut.print(guestsInstance?.address1)
printHtmlPart(37)
expressionOut.print(guestsInstance?.city)
printHtmlPart(36)
expressionOut.print(guestsInstance?.state)
printHtmlPart(38)
expressionOut.print(guestsInstance?.zip)
printHtmlPart(35)
expressionOut.print(guestsInstance?.guestStatus)
printHtmlPart(39)
expressionOut.print(guestsInstance?.comments)
printHtmlPart(40)
i++
}
}
printHtmlPart(41)
invokeTag('paginate','g',108,['total':(guestInstanceCount ?: 0)],-1)
printHtmlPart(42)
}
else {
printHtmlPart(43)
}
printHtmlPart(44)
createTagBody(2, {->
invokeTag('message','g',115,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',115,['class':("edit"),'action':("edit"),'resource':(attendanceInstance)],2)
printHtmlPart(45)
})
invokeTag('captureBody','sitemesh',119,[:],1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388203813652L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 20, 20, 22, 22, 22, 22, 26, 26, 28, 28, 29, 29, 30, 30, 33, 33, 35, 35, 37, 37, 40, 42, 42, 42, 44, 44, 46, 46, 49, 53, 53, 53, 55, 55, 57, 57, 60, 62, 62, 62, 64, 64, 66, 66, 69, 69, 71, 71, 77, 79, 79, 81, 81, 83, 83, 85, 85, 85, 90, 90, 90, 90, 91, 91, 93, 93, 93, 93, 93, 95, 95, 95, 95, 97, 97, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 101, 101, 102, 102, 104, 104, 104, 104, 108, 108, 110, 111, 111, 113, 113, 115, 115, 115, 115, 115, 119, 119, 119, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "show.gsp"
)
class ___LineNumberPlaceholder { }
