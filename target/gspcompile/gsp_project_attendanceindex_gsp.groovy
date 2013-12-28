import edu.harvard.cscie56.Attendance
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_attendanceindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendance/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(6)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('sortableColumn','g',27,['property':("service"),'title':(message(code: 'attendance.adultsNumber.label', default: 'Service Name'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',29,['property':("serviceDate"),'title':(message(code: 'attendance.childrenNumber.label', default: 'Service Date'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',31,['property':("memberNumber"),'title':(message(code: 'attendance.memberNumber.label', default: 'Member Number'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',33,['property':("guestNumber"),'title':(message(code: 'attendance.guestNumber.label', default: 'Guest Number'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( attendanceInstance in (attendanceInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "service"))
printHtmlPart(15)
invokeTag('formatDate','g',45,['format':("E, MMMM dd yyyy"),'style':("LONG"),'date':(attendanceInstance?.serviceDate)],-1)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "memberNumber"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "guestNumber"))
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',51,['action':("show"),'id':(attendanceInstance.id)],3)
printHtmlPart(17)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',52,['action':("edit"),'id':(attendanceInstance.id)],3)
printHtmlPart(17)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',53,['action':("addGuest"),'id':(attendanceInstance.id)],3)
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',59,['total':(attendanceInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',62,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388202594650L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 15, 15, 15, 15, 15, 19, 19, 20, 20, 21, 21, 22, 22, 27, 29, 29, 31, 31, 33, 33, 33, 40, 40, 40, 40, 41, 41, 43, 43, 45, 45, 47, 47, 49, 49, 51, 51, 51, 52, 52, 52, 53, 53, 53, 55, 55, 55, 55, 59, 59, 62, 62, 62, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
