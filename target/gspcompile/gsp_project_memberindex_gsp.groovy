import edu.harvard.cscie56.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_memberindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/index.gsp" }
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
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("create"),'action':("create")],2)
printHtmlPart(5)
invokeTag('message','g',17,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('sortableColumn','g',25,['property':("fullname"),'title':(message(code: 'members.email.label', default: 'Full Name'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',27,['property':("phone"),'title':(message(code: 'members.phone.label', default: 'Phone'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',29,['property':("gender"),'title':(message(code: 'members.gender.label', default: 'Gender'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',31,['property':("email"),'title':(message(code: 'members.fullname.label', default: 'Email Address'))],-1)
printHtmlPart(11)
loop:{
int i = 0
for( membersInstance in (membersInstanceList) ) {
printHtmlPart(12)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(13)
expressionOut.print(fieldValue(bean: membersInstance, field: "fullname"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: membersInstance, field: "phone"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: membersInstance, field: "gender"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: membersInstance, field: "email"))
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',47,['action':("show"),'id':(membersInstance.id)],3)
printHtmlPart(15)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',48,['action':("edit"),'id':(membersInstance.id)],3)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',54,['total':(membersInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388201911398L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 13, 13, 13, 13, 13, 13, 13, 17, 17, 18, 18, 19, 19, 20, 20, 25, 27, 27, 29, 29, 31, 31, 31, 37, 37, 37, 37, 38, 38, 40, 40, 42, 42, 44, 44, 46, 46, 47, 47, 47, 48, 48, 48, 50, 50, 50, 50, 54, 54, 57, 57, 57, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
