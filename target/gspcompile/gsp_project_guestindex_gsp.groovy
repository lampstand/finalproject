import edu.harvard.cscie56.Guest
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_guestindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/guest/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'guest.label', default: 'Guest'))],-1)
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
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('sortableColumn','g',26,['property':("name"),'title':(message(code: 'guest.guestStatus.label', default: 'Guest Name'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',28,['property':("Phone Number"),'title':(message(code: 'guest.homePhone.label', default: 'Phone Number'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',30,['property':("email"),'title':(message(code: 'guest.email.label', default: 'Email'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',32,['property':("address"),'title':(message(code: 'guest.address.label', default: 'Address'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',34,['property':("guestStatus"),'title':(message(code: 'guest.address1.label', default: 'Guest Status'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( guestInstance in (guestInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: guestInstance, field: "name"))
})
invokeTag('link','g',42,['action':("show"),'id':(guestInstance.id)],3)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: guestInstance, field: "mobilePhone"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: guestInstance, field: "homePhone"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: guestInstance, field: "email"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: guestInstance, field: "address"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: guestInstance, field: "address1"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: guestInstance, field: "city"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: guestInstance, field: "state"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: guestInstance, field: "zip"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: guestInstance, field: "guestStatus"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: guestInstance, field: "attendance.service"))
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',57,['total':(guestInstanceCount ?: 0)],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',60,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388203503357L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 14, 14, 18, 18, 19, 19, 20, 20, 21, 21, 26, 28, 28, 30, 30, 32, 32, 34, 34, 34, 39, 39, 39, 39, 40, 40, 42, 42, 42, 42, 42, 44, 44, 44, 44, 46, 46, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 50, 50, 51, 51, 53, 53, 53, 53, 57, 57, 60, 60, 60, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
