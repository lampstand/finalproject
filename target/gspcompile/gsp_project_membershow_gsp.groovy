import edu.harvard.cscie56.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_membershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'members.label', default: 'Members'))],-1)
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
if(true && (flash.message)) {
printHtmlPart(5)
expressionOut.print(flash.message)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (membersInstance?.fullname)) {
printHtmlPart(8)
invokeTag('fieldValue','g',17,['bean':(membersInstance),'field':("fullname")],-1)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (membersInstance?.gender)) {
printHtmlPart(11)
invokeTag('message','g',26,['code':("guest.guestStatus.label"),'default':("Gender")],-1)
printHtmlPart(12)
invokeTag('fieldValue','g',28,['bean':(membersInstance),'field':("gender")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (membersInstance?.agegroup)) {
printHtmlPart(15)
invokeTag('message','g',35,['code':("guest.homePhone.label"),'default':("Age Group")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',37,['bean':(membersInstance),'field':("agegroup")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (membersInstance?.address)) {
printHtmlPart(17)
invokeTag('message','g',44,['code':("guest.mobilePhone.label"),'default':("Address")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',46,['bean':(membersInstance),'field':("address")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',46,['bean':(memberInstance),'field':("address1")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (membersInstance?.city)) {
printHtmlPart(20)
invokeTag('message','g',53,['code':("guest.email.label"),'default':("City")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',55,['bean':(membersInstance),'field':("city")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (membersInstance?.state)) {
printHtmlPart(22)
invokeTag('message','g',62,['code':("guest.address.label"),'default':("State")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',64,['bean':(membersInstance),'field':("state")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (memberInstance?.zip)) {
printHtmlPart(24)
invokeTag('message','g',71,['code':("guest.address1.label"),'default':("Zip Code:")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',73,['bean':(membersInstance),'field':("zip")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (membersInstance?.phone)) {
printHtmlPart(26)
invokeTag('message','g',80,['code':("guest.ageGroup.label"),'default':("Phone Number")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',82,['bean':(membersInstance),'field':("phone")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (membersInstance?.email)) {
printHtmlPart(28)
invokeTag('message','g',89,['code':("guest.attendance.label"),'default':("Email Address:")],-1)
printHtmlPart(29)
expressionOut.print(membersInstance?.email?.encodeAsHTML())
printHtmlPart(13)
}
printHtmlPart(30)
createTagBody(2, {->
invokeTag('message','g',98,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',98,['class':("edit"),'action':("edit"),'resource':(guestInstance)],2)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',103,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388211308582L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 12, 12, 12, 12, 13, 13, 14, 14, 16, 16, 17, 17, 19, 19, 24, 24, 26, 26, 28, 28, 31, 33, 33, 33, 35, 35, 37, 37, 40, 42, 42, 42, 44, 44, 46, 46, 46, 46, 49, 51, 51, 51, 53, 53, 55, 55, 58, 60, 60, 60, 62, 62, 64, 64, 67, 69, 69, 69, 71, 71, 73, 73, 76, 78, 78, 78, 80, 80, 82, 82, 85, 87, 87, 87, 89, 89, 91, 91, 94, 94, 98, 98, 98, 98, 98, 103, 103, 103, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "show.gsp"
)
class ___LineNumberPlaceholder { }
