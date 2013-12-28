import edu.harvard.cscie56.Attendance
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_attendancelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendance/list.gsp" }
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
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',15,['class':("create"),'action':("create"),'controller':("guest")],2)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',16,['class':("create"),'action':("search"),'controller':("attendace")],2)
printHtmlPart(10)
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('sortableColumn','g',28,['property':("adultsNumber"),'title':(message(code: 'attendance.adultsNumber.label', default: 'Adults Number'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',30,['property':("childrenNumber"),'title':(message(code: 'attendance.childrenNumber.label', default: 'Children Number'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',32,['property':("createdBy"),'title':(message(code: 'attendance.createdBy.label', default: 'Created By'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',34,['property':("guestNumber"),'title':(message(code: 'attendance.guestNumber.label', default: 'Guest Number'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',36,['property':("memberNumber"),'title':(message(code: 'attendance.memberNumber.label', default: 'Member Number'))],-1)
printHtmlPart(16)
loop:{
int i = 0
for( attendanceInstance in (attendanceInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "adultsNumber"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "childrenNumber"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "createdBy"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "guestNumber"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: attendanceInstance, field: "memberNumber"))
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',53,['action':("edit"),'id':(attendanceInstance.id)],3)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',59,['total':(attendanceInstanceTotal)],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387164748642L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 14, 14, 15, 15, 15, 16, 16, 16, 20, 20, 21, 21, 22, 22, 23, 23, 28, 30, 30, 32, 32, 34, 34, 36, 36, 36, 41, 41, 41, 41, 42, 42, 44, 44, 46, 46, 48, 48, 50, 50, 52, 52, 53, 53, 53, 55, 55, 55, 55, 59, 59, 63, 63, 63, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "list.gsp"
)
class ___LineNumberPlaceholder { }
