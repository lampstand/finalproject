import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_memberfind_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/find.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('form','g',20,['action':("searchName")],2)
printHtmlPart(5)
createClosureForHtmlPart(6, 2)
invokeTag('form','g',26,['action':("searchPhone")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('form','g',32,['action':("searchEmail")],2)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
if(true && (membersInstance)) {
printHtmlPart(13)
invokeTag('sortableColumn','g',51,['property':("email"),'title':("Full Name")],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',53,['property':("phone"),'title':("Email Address")],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',55,['property':("fullname"),'title':("Phone")],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',57,['property':("gender"),'title':("Gender")],-1)
printHtmlPart(15)
loop:{
int i = 0
for( memberInstance in (membersInstance) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
expressionOut.print(memberInstance?.fullname?.encodeAsHTML())
printHtmlPart(18)
expressionOut.print(memberInstance?.email?.encodeAsHTML())
printHtmlPart(18)
expressionOut.print(memberInstance?.phone?.encodeAsHTML())
printHtmlPart(18)
expressionOut.print(memberInstance?.gender?.encodeAsHTML())
printHtmlPart(19)
createClosureForHtmlPart(20, 4)
invokeTag('link','g',73,['action':("show"),'id':(memberInstance.id)],4)
printHtmlPart(19)
createClosureForHtmlPart(21, 4)
invokeTag('link','g',74,['action':("edit"),'id':(memberInstance.id)],4)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
}
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',111,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388201889861L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 6, 17, 17, 20, 20, 20, 26, 26, 26, 32, 32, 32, 38, 38, 41, 41, 42, 42, 44, 44, 51, 53, 53, 55, 55, 57, 57, 57, 63, 63, 63, 63, 64, 64, 66, 66, 68, 68, 70, 70, 72, 72, 73, 73, 73, 74, 74, 74, 76, 76, 76, 76, 79, 79, 111, 111, 111, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "find.gsp"
)
class ___LineNumberPlaceholder { }
