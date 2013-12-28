import edu.harvard.cscie56.Guest
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_guestshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/guest/show.gsp" }
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
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("list"),'action':("index")],2)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(6)
invokeTag('message','g',18,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (guestInstance?.guestStatus)) {
printHtmlPart(11)
invokeTag('message','g',26,['code':("guest.guestStatus.label"),'default':("Guest Status")],-1)
printHtmlPart(12)
invokeTag('fieldValue','g',28,['bean':(guestInstance),'field':("guestStatus")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.homePhone)) {
printHtmlPart(15)
invokeTag('message','g',35,['code':("guest.homePhone.label"),'default':("Home Phone")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',37,['bean':(guestInstance),'field':("homePhone")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.mobilePhone)) {
printHtmlPart(17)
invokeTag('message','g',44,['code':("guest.mobilePhone.label"),'default':("Mobile Phone")],-1)
printHtmlPart(18)
invokeTag('fieldValue','g',46,['bean':(guestInstance),'field':("mobilePhone")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.email)) {
printHtmlPart(19)
invokeTag('message','g',53,['code':("guest.email.label"),'default':("Email")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',55,['bean':(guestInstance),'field':("email")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.address)) {
printHtmlPart(21)
invokeTag('message','g',62,['code':("guest.address.label"),'default':("Address")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',64,['bean':(guestInstance),'field':("address")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.address1)) {
printHtmlPart(23)
invokeTag('message','g',71,['code':("guest.address1.label"),'default':("Address1")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',73,['bean':(guestInstance),'field':("address1")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.ageGroup)) {
printHtmlPart(25)
invokeTag('message','g',80,['code':("guest.ageGroup.label"),'default':("Age Group")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',82,['bean':(guestInstance),'field':("ageGroup")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.attendance)) {
printHtmlPart(27)
invokeTag('message','g',89,['code':("guest.attendance.label"),'default':("Attendance")],-1)
printHtmlPart(28)
createTagBody(3, {->
expressionOut.print(guestInstance?.attendance?.service?.encodeAsHTML())
})
invokeTag('link','g',91,['controller':("attendance"),'action':("show"),'id':(guestInstance?.attendance?.id)],3)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.city)) {
printHtmlPart(29)
invokeTag('message','g',98,['code':("guest.city.label"),'default':("City")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',100,['bean':(guestInstance),'field':("city")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.comments)) {
printHtmlPart(31)
invokeTag('message','g',107,['code':("guest.comments.label"),'default':("Comments")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',109,['bean':(guestInstance),'field':("comments")],-1)
printHtmlPart(13)
}
printHtmlPart(33)
if(true && (guestInstance?.gender)) {
printHtmlPart(34)
invokeTag('message','g',117,['code':("guest.gender.label"),'default':("Gender")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',119,['bean':(guestInstance),'field':("gender")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.maritalStatus)) {
printHtmlPart(36)
invokeTag('message','g',126,['code':("guest.maritalStatus.label"),'default':("Marital Status")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',128,['bean':(guestInstance),'field':("maritalStatus")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.name)) {
printHtmlPart(38)
invokeTag('message','g',135,['code':("guest.name.label"),'default':("Name")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',137,['bean':(guestInstance),'field':("name")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.state)) {
printHtmlPart(40)
invokeTag('message','g',144,['code':("guest.state.label"),'default':("State")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',146,['bean':(guestInstance),'field':("state")],-1)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (guestInstance?.zip)) {
printHtmlPart(42)
invokeTag('message','g',153,['code':("guest.zip.label"),'default':("Zip")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',155,['bean':(guestInstance),'field':("zip")],-1)
printHtmlPart(13)
}
printHtmlPart(44)
createTagBody(2, {->
invokeTag('message','g',162,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',162,['class':("edit"),'action':("edit"),'resource':(guestInstance)],2)
printHtmlPart(45)
})
invokeTag('captureBody','sitemesh',166,[:],1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388205778491L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 18, 18, 19, 19, 20, 20, 21, 21, 24, 24, 26, 26, 28, 28, 31, 33, 33, 33, 35, 35, 37, 37, 40, 42, 42, 42, 44, 44, 46, 46, 49, 51, 51, 51, 53, 53, 55, 55, 58, 60, 60, 60, 62, 62, 64, 64, 67, 69, 69, 69, 71, 71, 73, 73, 76, 78, 78, 78, 80, 80, 82, 82, 85, 87, 87, 87, 89, 89, 91, 91, 91, 91, 91, 94, 96, 96, 96, 98, 98, 100, 100, 103, 105, 105, 105, 107, 107, 109, 109, 112, 115, 115, 115, 117, 117, 119, 119, 122, 124, 124, 124, 126, 126, 128, 128, 131, 133, 133, 133, 135, 135, 137, 137, 140, 142, 142, 142, 144, 144, 146, 146, 149, 151, 151, 151, 153, 153, 155, 155, 158, 158, 162, 162, 162, 162, 162, 166, 166, 166, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "show.gsp"
)
class ___LineNumberPlaceholder { }
