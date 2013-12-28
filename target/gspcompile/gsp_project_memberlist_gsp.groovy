import edu.harvard.cscie56.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_memberlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/list.gsp" }
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
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("email"),'title':(message(code: 'members.email.label', default: 'Email'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("phone"),'title':(message(code: 'members.phone.label', default: 'Phone'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("fullname"),'title':(message(code: 'members.fullname.label', default: 'Fullname'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("gender"),'title':(message(code: 'members.gender.label', default: 'Gender'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( membersInstance in (membersInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
expressionOut.print(fieldValue(bean: membersInstance, field: "email"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: membersInstance, field: "phone"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: membersInstance, field: "fullname"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: membersInstance, field: "gender"))
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',49,['action':("show"),'id':(membersInstance.id)],3)
printHtmlPart(18)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',50,['action':("edit"),'id':(membersInstance.id)],3)
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
invokeTag('paginate','g',57,['total':(membersInstanceTotal)],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',60,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387036398548L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 14, 15, 15, 15, 15, 15, 19, 19, 20, 20, 21, 21, 22, 22, 27, 29, 29, 31, 31, 33, 33, 33, 39, 39, 39, 39, 40, 40, 42, 42, 44, 44, 46, 46, 48, 48, 49, 49, 49, 50, 50, 50, 53, 53, 53, 53, 57, 57, 60, 60, 60, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "list.gsp"
)
class ___LineNumberPlaceholder { }
