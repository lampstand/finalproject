import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_tithePaymentcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tithePayment/create.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',12,['class':("list"),'action':("index")],2)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(7)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(8)
expressionOut.print(error.field)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('message','g',25,['error':(error)],-1)
printHtmlPart(11)
})
invokeTag('eachError','g',26,['bean':(tithePaymentInstance),'var':("error")],3)
printHtmlPart(12)
})
invokeTag('hasErrors','g',28,['bean':(tithePaymentInstance)],2)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('submitButton','g',33,['name':("search"),'value':("Search Tithe")],-1)
printHtmlPart(15)
})
invokeTag('form','g',34,['name':("idSearch"),'action':("searchTitheID")],2)
printHtmlPart(16)
if(true && (flash.message)) {
printHtmlPart(17)
expressionOut.print(flash.message)
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (titheInstance || titheInstanceID)) {
printHtmlPart(19)
createTagBody(3, {->
printHtmlPart(20)
invokeTag('render','g',43,['template':("form")],-1)
printHtmlPart(20)
invokeTag('submitButton','g',45,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(19)
})
invokeTag('form','g',46,['url':([resource:tithePaymentInstance, action:'save']),'class':("lampstand-form")],3)
printHtmlPart(19)
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',49,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1386441608480L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 7, 10, 10, 12, 12, 12, 22, 22, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 26, 26, 26, 28, 28, 28, 33, 33, 33, 34, 34, 34, 34, 36, 36, 38, 38, 40, 41, 41, 42, 43, 43, 43, 45, 45, 46, 46, 46, 47, 47, 47, 49, 49, 49, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "create.gsp"
)
class ___LineNumberPlaceholder { }
