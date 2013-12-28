import edu.harvard.cscie56.Tithe
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_tithelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tithe/list.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'tithe.label', default: 'Tithe'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',25,['property':("titheID"),'title':(message(code: 'tithe.titheID.label', default: 'Tithe ID'))],-1)
printHtmlPart(12)
invokeTag('message','g',26,['code':("tithe.member.label"),'default':("Member")],-1)
printHtmlPart(13)
loop:{
int i = 0
for( titheInstance in (titheInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: titheInstance, field: "titheID"))
})
invokeTag('link','g',34,['action':("show"),'id':(titheInstance.id)],3)
printHtmlPart(16)
expressionOut.print(titheInstance?.member?.fullname)
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',43,['total':(titheInstanceTotal)],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',46,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388205814873L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 14, 14, 18, 18, 19, 19, 20, 20, 21, 21, 25, 25, 26, 26, 31, 31, 31, 31, 32, 32, 34, 34, 34, 34, 34, 36, 36, 39, 39, 39, 39, 43, 43, 46, 46, 46, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "list.gsp"
)
class ___LineNumberPlaceholder { }
