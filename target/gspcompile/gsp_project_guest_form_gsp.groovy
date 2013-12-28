import edu.harvard.cscie56.Guest
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_guest_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/guest/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(guestInstance?.serviceName)
printHtmlPart(1)
invokeTag('message','g',6,['code':("guest.name.label"),'default':("Name")],-1)
printHtmlPart(2)
expressionOut.print(guestInstance?.name)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: guestInstance, field: 'gender', 'error'))
printHtmlPart(4)
invokeTag('select','g',20,['name':("gender"),'from':(['Male','Female']),'value':(guestInstance?.gender),'noSelection':(['': 'Select Gender'])],-1)
printHtmlPart(5)
invokeTag('select','g',24,['name':("ageGroup"),'from':(['0-18','18-29','30-38','39-45','46-54','55-64','65 and Over']),'value':(guestInstance?.ageGroup),'noSelection':(['': 'Select Age Group'])],-1)
printHtmlPart(6)
invokeTag('message','g',33,['code':("guest.address.label"),'default':("Address")],-1)
printHtmlPart(7)
invokeTag('textField','g',36,['name':("address"),'value':(guestInstance?.address),'size':("30")],-1)
printHtmlPart(8)
invokeTag('message','g',43,['code':("guest.address1.label"),'default':("Address1")],-1)
printHtmlPart(7)
invokeTag('textField','g',46,['name':("address1"),'value':(guestInstance?.address1),'placeholder':("Optional"),'size':("30")],-1)
printHtmlPart(9)
invokeTag('message','g',55,['code':("guest.city.label"),'default':("City")],-1)
printHtmlPart(10)
invokeTag('message','g',56,['code':("guest.state.label"),'default':("State")],-1)
printHtmlPart(11)
invokeTag('message','g',57,['code':("guest.zip.label"),'default':("Zip")],-1)
printHtmlPart(12)
invokeTag('textField','g',59,['name':("city"),'value':(guestInstance?.city),'size':("20")],-1)
printHtmlPart(13)
invokeTag('textField','g',60,['name':("state"),'value':(guestInstance?.state?: 'MA'),'placeholder':("State"),'size':("20")],-1)
printHtmlPart(14)
invokeTag('textField','g',61,['name':("zip"),'value':(guestInstance?.zip),'maxLength':("5"),'placeholder':("Zip Code"),'size':("5")],-1)
printHtmlPart(15)
invokeTag('message','g',68,['code':("guest.email.label"),'default':("Email")],-1)
printHtmlPart(7)
invokeTag('textField','g',71,['name':("email"),'value':(guestInstance?.email),'size':("30")],-1)
printHtmlPart(16)
invokeTag('message','g',78,['code':("guest.homePhone.label"),'default':("Home Phone")],-1)
printHtmlPart(7)
invokeTag('textField','g',81,['name':("homePhone"),'value':(guestInstance?.homePhone),'placeholder':("XXX-XXX-XXXX")],-1)
printHtmlPart(17)
invokeTag('message','g',88,['code':("guest.mobilePhone.label"),'default':("Mobile Phone")],-1)
printHtmlPart(7)
invokeTag('textField','g',91,['name':("mobilePhone"),'value':(guestInstance?.mobilePhone),'required placeholder':("XXX-XXX-XXXX")],-1)
printHtmlPart(18)
invokeTag('message','g',97,['code':("guest.attendance.label"),'default':("Church Service Attended")],-1)
printHtmlPart(19)
invokeTag('select','g',100,['id':("attendance"),'name':("attenance"),'from':(edu.harvard.cscie56.Attendance.list()),'optionKey':("id"),'optionValue':("service"),'required':(""),'value':(guestInstance?.attendance?.id ?: attendanceName?.service),'class':("many-to-one")],-1)
printHtmlPart(20)
expressionOut.print(guestInstance?.attendance?.id ?: attendanceName?.service)
printHtmlPart(21)
expressionOut.print(guestInstance?.attendance?.id ?: attendanceName?.id)
printHtmlPart(22)
invokeTag('message','g',109,['code':("guest.comments.label"),'default':("Comments")],-1)
printHtmlPart(7)
invokeTag('textArea','g',112,['name':("comments"),'value':(guestInstance?.comments),'rows':("5"),'cols':("40"),'size':("30")],-1)
printHtmlPart(23)
invokeTag('radio','g',118,['name':("guestStatus"),'value':(guestInstance?.guestStatus?:'First Time Guest')],-1)
printHtmlPart(24)
invokeTag('radio','g',119,['name':("guestStatus"),'value':(guestInstance?.guestStatus?:'New To Area')],-1)
printHtmlPart(25)
invokeTag('radio','g',120,['name':("guestStatus"),'value':(guestInstance?.guestStatus?:'Would Like to become a Member')],-1)
printHtmlPart(26)
invokeTag('radio','g',121,['name':("guestStatus"),'value':(guestInstance?.guestStatus?:'Other')],-1)
printHtmlPart(27)
invokeTag('radio','g',127,['name':("maritalStatus"),'value':(guestInstance?.maritalStatus?:'Single')],-1)
printHtmlPart(28)
invokeTag('radio','g',128,['name':("maritalStatus"),'value':(guestInstance?.maritalStatus?:'Married')],-1)
printHtmlPart(29)
invokeTag('radio','g',129,['name':("maritalStatus"),'value':(guestInstance?.maritalStatus?:'Single Parent')],-1)
printHtmlPart(30)
invokeTag('radio','g',130,['name':("maritalStatus"),'value':(guestInstance?.maritalStatus?:'Widowed')],-1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388200101240L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 8, 8, 13, 13, 20, 20, 24, 24, 33, 33, 36, 36, 43, 43, 46, 46, 55, 56, 56, 56, 57, 57, 59, 59, 60, 60, 61, 61, 68, 68, 71, 71, 78, 78, 81, 81, 88, 88, 91, 91, 97, 97, 100, 100, 103, 103, 104, 104, 109, 109, 112, 112, 118, 118, 119, 119, 120, 120, 121, 121, 127, 127, 128, 128, 129, 129, 130, 130, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
