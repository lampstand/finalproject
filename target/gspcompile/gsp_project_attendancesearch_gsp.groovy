import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_attendancesearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendance/search.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',4,['var':("entityName"),'value':(message(code: 'guest.label', default: 'Guest'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'classic.css'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'classic.date.css'))
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('datePicker','g',17,['name':("serviceDate"),'precision':("day"),'value':(attendanceInstance?.serviceDate),'relativeYears':([-2..7]),'default':(new Date())],-1)
printHtmlPart(9)
})
invokeTag('form','g',20,['name':("searchattendance"),'url':([controller: 'attendance', action:'searchAttendance'])],2)
printHtmlPart(10)
if(true && (attendancesInstance)) {
printHtmlPart(11)
invokeTag('sortableColumn','g',30,['property':("service"),'title':(message(code: 'attendance.adultsNumber.label', default: 'Service Name'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',32,['property':("serviceDate"),'title':(message(code: 'attendance.childrenNumber.label', default: 'Service Date'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',34,['property':("memberNumber"),'title':(message(code: 'attendance.memberNumber.label', default: 'Member Number'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',36,['property':("guestNumber"),'title':(message(code: 'attendance.guestNumber.label', default: 'Guest Number'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( attendanceInstance in (attendancesInstance) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "service"))
printHtmlPart(16)
invokeTag('formatDate','g',48,['format':("E, MMMM dd yyyy"),'style':("LONG"),'date':(attendanceInstance?.serviceDate)],-1)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "memberNumber"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "guestNumber"))
printHtmlPart(16)
createClosureForHtmlPart(17, 4)
invokeTag('link','g',54,['action':("show"),'id':(attendanceInstance.id)],4)
printHtmlPart(18)
createClosureForHtmlPart(19, 4)
invokeTag('link','g',55,['action':("edit"),'id':(attendanceInstance.id)],4)
printHtmlPart(18)
createClosureForHtmlPart(20, 4)
invokeTag('link','g',56,['action':("addGuest"),'id':(attendanceInstance.id)],4)
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
}
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',64,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387165094643L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 15, 15, 17, 17, 17, 17, 20, 20, 20, 23, 23, 30, 32, 32, 34, 34, 36, 36, 36, 43, 43, 43, 43, 44, 44, 46, 46, 48, 48, 50, 50, 52, 52, 54, 54, 54, 55, 55, 55, 56, 56, 56, 58, 58, 58, 58, 61, 61, 64, 64, 64, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "search.gsp"
)
class ___LineNumberPlaceholder { }
