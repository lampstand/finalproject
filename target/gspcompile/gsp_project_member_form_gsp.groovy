import edu.harvard.cscie56.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_member_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(membersInstance?.fullname)
printHtmlPart(1)
expressionOut.print(membersInstance?.email)
printHtmlPart(2)
expressionOut.print(membersInstance?.phone)
printHtmlPart(3)
expressionOut.print(membersInstance?.address)
printHtmlPart(4)
expressionOut.print(membersInstance?.address1)
printHtmlPart(5)
expressionOut.print(membersInstance?.city)
printHtmlPart(6)
if(true && ("{membersInstance}")) {
printHtmlPart(7)
expressionOut.print(membersInstance?.state)
printHtmlPart(6)
}
else {
printHtmlPart(8)
}
printHtmlPart(9)
expressionOut.print(membersInstance?.zip)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: membersInstance, field: 'gender', 'error'))
printHtmlPart(11)
invokeTag('message','g',109,['code':("members.gender.label"),'default':("Gender")],-1)
printHtmlPart(12)
if(true && (membersInstance?.gender)) {
printHtmlPart(13)
expressionOut.print(membersInstance?.gender)
printHtmlPart(14)
}
else {
printHtmlPart(15)
invokeTag('select','g',120,['name':("gender"),'from':(['Male','Female']),'valueMessagePrefix':("members.gender"),'value':(membersInstance?.gender),'noSelection':(['': 'Select Gender'])],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (membersInstance?.agegroup)) {
printHtmlPart(18)
expressionOut.print(membersInstance?.agegroup)
printHtmlPart(14)
}
else {
printHtmlPart(19)
}
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387077463049L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 7, 15, 15, 23, 23, 30, 30, 36, 36, 43, 43, 44, 44, 45, 45, 46, 47, 47, 100, 100, 101, 101, 107, 107, 109, 109, 112, 112, 113, 113, 114, 115, 120, 120, 121, 121, 121, 129, 129, 130, 130, 131, 132, 132, 137, 137, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
