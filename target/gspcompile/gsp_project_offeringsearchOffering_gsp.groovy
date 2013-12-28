import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_offeringsearchOffering_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/offering/searchOffering.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(3)
createClosureForHtmlPart(4, 1)
invokeTag('form','g',14,['action':("searchOffering")],1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
if(true && (offeringInstanceList)) {
printHtmlPart(9)
invokeTag('sortableColumn','g',28,['property':("amountCash"),'title':(message(code: 'offering.amountCash.label', default: 'Amount Cash'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',30,['property':("amountCheck"),'title':(message(code: 'offering.amountCheck.label', default: 'Amount Check'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',32,['property':("approvedBy"),'title':(message(code: 'offering.approvedBy.label', default: 'Approved By'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',34,['property':("offeringDate"),'title':(message(code: 'offering.offeringDate.label', default: 'Offering Date'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',36,['property':("service"),'title':(message(code: 'offering.service.label', default: 'Service'))],-1)
printHtmlPart(11)
loop:{
int i = 0
for( offeringInstance in (offeringInstanceList) ) {
printHtmlPart(12)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(13)
expressionOut.print(fieldValue(bean: offeringInstance, field: "amountCash"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: offeringInstance, field: "amountCheck"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: offeringInstance, field: "approvedBy"))
printHtmlPart(14)
invokeTag('formatDate','g',50,['date':(offeringInstance?.offeringDate),'type':("date"),'style':("LONG")],-1)
printHtmlPart(14)
expressionOut.print(fieldValue(bean: offeringInstance, field: "service"))
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',53,['action':("edit"),'id':(offeringInstance.id)],3)
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
}
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388185272211L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 14, 14, 14, 18, 18, 19, 19, 20, 20, 22, 22, 28, 30, 30, 32, 32, 34, 34, 36, 36, 36, 41, 41, 41, 41, 42, 42, 44, 44, 46, 46, 48, 48, 50, 50, 52, 52, 53, 53, 53, 55, 55, 55, 55, 58, 58, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "searchOffering.gsp"
)
class ___LineNumberPlaceholder { }
