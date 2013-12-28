import edu.harvard.cscie56.Attendance
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_attendance_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/attendance/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(resource(dir: 'css', file: 'classic.css'))
printHtmlPart(1)
expressionOut.print(resource(dir: 'css', file: 'classic.date.css'))
printHtmlPart(2)
invokeTag('select','g',11,['name':("service"),'noSelection':(['':'Select Church Service']),'from':(['Sunday Worship Service','Mid-Week Bible Studies','Friday Half-Night','Special Service']),'value':(attendanceInstance?.service)],-1)
printHtmlPart(3)
invokeTag('datePicker','g',18,['name':("serviceDate"),'precision':("day"),'value':(attendanceInstance?.serviceDate),'relativeYears':([-2..7]),'default':(new Date())],-1)
printHtmlPart(4)
invokeTag('textField','g',24,['name':("adultsNumber"),'value':(attendanceInstance?.adultsNumber),'size':("10")],-1)
printHtmlPart(5)
invokeTag('textField','g',30,['name':("childrenNumber"),'value':(attendanceInstance?.childrenNumber),'size':("10")],-1)
printHtmlPart(6)
expressionOut.print(attendanceInstance?.memberNumber)
printHtmlPart(7)
invokeTag('textField','g',42,['name':("guestNumber"),'value':(attendanceInstance?.guestNumber),'size':("10")],-1)
printHtmlPart(8)
invokeTag('javascript','g',47,['src':("picker.js")],-1)
printHtmlPart(9)
invokeTag('javascript','g',48,['src':("picker.date.js")],-1)
printHtmlPart(9)
invokeTag('javascript','g',49,['src':("legacy.js")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387158664646L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 11, 11, 18, 18, 24, 24, 30, 30, 36, 36, 42, 42, 47, 48, 48, 49, 49, 49, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
