import edu.harvard.cscie56.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_membersearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/search.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'members.label', default: 'Members'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
if(true && (membersInstance)) {
printHtmlPart(4)
invokeTag('sortableColumn','g',16,['property':("email"),'title':("Full Name")],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',18,['property':("phone"),'title':("Email Address")],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',20,['property':("fullname"),'title':("Phone")],-1)
printHtmlPart(5)
invokeTag('sortableColumn','g',22,['property':("gender"),'title':("Gender")],-1)
printHtmlPart(6)
loop:{
int i = 0
for( memberInstance in (membersInstance) ) {
printHtmlPart(7)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(8)
expressionOut.print(memberInstance?.fullname?.encodeAsHTML())
printHtmlPart(9)
expressionOut.print(memberInstance?.email?.encodeAsHTML())
printHtmlPart(9)
expressionOut.print(memberInstance?.phone?.encodeAsHTML())
printHtmlPart(9)
expressionOut.print(memberInstance?.gender?.encodeAsHTML())
printHtmlPart(10)
createClosureForHtmlPart(11, 4)
invokeTag('link','g',38,['action':("show"),'id':(memberInstance.id)],4)
printHtmlPart(10)
createClosureForHtmlPart(12, 4)
invokeTag('link','g',39,['action':("edit"),'id':(membersInstance.id)],4)
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
}
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',45,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387036398540L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 10, 10, 10, 16, 18, 18, 20, 20, 22, 22, 22, 28, 28, 28, 28, 29, 29, 31, 31, 33, 33, 35, 35, 37, 37, 38, 38, 38, 39, 39, 39, 41, 41, 41, 41, 44, 45, 45, 45, 45, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "search.gsp"
)
class ___LineNumberPlaceholder { }
