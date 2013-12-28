import edu.harvard.cscie56.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_usercreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(1)
invokeTag('require','r',8,['modules':("spring-security-ui")],-1)
printHtmlPart(2)
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
createTagBody(2, {->
printHtmlPart(8)
invokeTag('select','g',24,['name':("member"),'from':(Member.list()),'optionKey':("id"),'optionValue':("fullname")],-1)
printHtmlPart(9)
expressionOut.print(user?.username)
printHtmlPart(10)
expressionOut.print(user?.password)
printHtmlPart(11)
invokeTag('checkBox','g',42,['name':("enabled"),'value':(user?.enabled)],-1)
printHtmlPart(12)
invokeTag('checkBox','g',48,['name':("accountExpired"),'value':(user?.accountExpired)],-1)
printHtmlPart(13)
invokeTag('checkBox','g',54,['name':("accountLocked"),'value':(user?.accountLocked)],-1)
printHtmlPart(14)
invokeTag('checkBox','g',60,['name':("passwordExpired"),'value':(user?.passwordExpired)],-1)
printHtmlPart(15)
for( auth in (authorityList) ) {
printHtmlPart(16)
createTagBody(4, {->
expressionOut.print(auth.authority.encodeAsHTML())
printHtmlPart(17)
})
invokeTag('link','g',67,['controller':("role"),'action':("edit"),'id':(auth.id)],4)
printHtmlPart(18)
invokeTag('checkBox','g',68,['name':(auth.authority)],-1)
printHtmlPart(15)
}
printHtmlPart(19)
})
invokeTag('form','g',74,['action':("save"),'name':("userCreateForm"),'class':("lampstand-form")],2)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',77,['class':("container")],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388204188240L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 9, 11, 13, 13, 13, 13, 15, 15, 17, 17, 24, 24, 24, 24, 30, 30, 36, 36, 42, 42, 48, 48, 54, 54, 60, 60, 63, 63, 67, 67, 67, 67, 67, 67, 68, 68, 71, 71, 74, 74, 74, 77, 77, 77, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "create.gsp"
)
class ___LineNumberPlaceholder { }
