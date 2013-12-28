import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_guestsearchguest_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/guest/searchguest.gsp" }
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
invokeTag('select','g',19,['name':("service"),'noSelection':(['':'Select Church Service']),'from':(['Sunday Worship Service','Mid-Week Bible Studies','Friday Half-Night','Special Service']),'value':("")],-1)
printHtmlPart(8)
if(true && (guestInstanceList)) {
printHtmlPart(9)
expressionOut.print(serviceName)
printHtmlPart(10)
expressionOut.print(serviceDate)
printHtmlPart(11)
invokeTag('sortableColumn','g',34,['property':("name"),'title':(message(code: 'guest.guestStatus.label', default: 'Guest Status'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',36,['property':("Phone Number"),'title':(message(code: 'guest.homePhone.label', default: 'Phone Number'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',38,['property':("email"),'title':(message(code: 'guest.email.label', default: 'Email'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',40,['property':("address"),'title':(message(code: 'guest.address.label', default: 'Address'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',42,['property':("guestStatus"),'title':(message(code: 'guest.address1.label', default: 'Guest Status'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( guestInstance in (guestInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
createTagBody(4, {->
expressionOut.print(fieldValue(bean: guestInstance, field: "name"))
})
invokeTag('link','g',50,['action':("show"),'id':(guestInstance.id)],4)
printHtmlPart(16)
expressionOut.print(fieldValue(bean: guestInstance, field: "mobilePhone"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: guestInstance, field: "homePhone"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: guestInstance, field: "email"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: guestInstance, field: "address"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: guestInstance, field: "address1"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: guestInstance, field: "city"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: guestInstance, field: "state"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: guestInstance, field: "zip"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: guestInstance, field: "guestStatus"))
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (flash.message)) {
printHtmlPart(25)
expressionOut.print(flash.message)
printHtmlPart(26)
}
printHtmlPart(27)
invokeTag('javascript','g',73,['src':("picker.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',74,['src':("picker.date.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',75,['src':("legacy.js")],-1)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',81,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1386433312833L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 8, 8, 9, 19, 19, 19, 19, 24, 24, 26, 26, 27, 27, 34, 36, 36, 38, 38, 40, 40, 42, 42, 42, 47, 47, 47, 47, 48, 48, 50, 50, 50, 50, 50, 52, 52, 52, 52, 54, 54, 56, 56, 56, 56, 56, 56, 56, 56, 56, 56, 58, 58, 61, 61, 61, 61, 64, 64, 66, 66, 67, 67, 68, 68, 73, 74, 74, 75, 75, 75, 81, 81, 81, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "searchguest.gsp"
)
class ___LineNumberPlaceholder { }
