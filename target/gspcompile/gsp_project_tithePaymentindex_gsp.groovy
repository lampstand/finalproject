import edu.harvard.cscie56.TithePayment
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_tithePaymentindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tithePayment/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'tithePayment.label', default: 'TithePayment'))],-1)
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
invokeTag('sortableColumn','g',27,['property':("acceptedBy"),'title':(message(code: 'tithePayment.acceptedBy.label', default: 'Accepted By'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("amount"),'title':(message(code: 'tithePayment.amount.label', default: 'Amount'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("datePaid"),'title':(message(code: 'tithePayment.datePaid.label', default: 'Date Paid'))],-1)
printHtmlPart(14)
invokeTag('message','g',33,['code':("tithePayment.tithe.label"),'default':("Tithe")],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',35,['property':("titheMonth"),'title':(message(code: 'tithePayment.titheMonth.label', default: 'Tithe Month'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("titheYear"),'title':(message(code: 'tithePayment.titheYear.label', default: 'Tithe Year'))],-1)
printHtmlPart(16)
loop:{
int i = 0
for( tithePaymentInstance in (tithePaymentInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: tithePaymentInstance, field: "acceptedBy"))
})
invokeTag('link','g',45,['action':("show"),'id':(tithePaymentInstance.id)],3)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: tithePaymentInstance, field: "amount"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: tithePaymentInstance, field: "datePaid"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: tithePaymentInstance, field: "tithe"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: tithePaymentInstance, field: "titheMonth"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: tithePaymentInstance, field: "titheYear"))
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',62,['total':(tithePaymentInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1385699474580L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 14, 15, 15, 15, 15, 15, 19, 19, 20, 20, 21, 21, 22, 22, 27, 29, 29, 31, 31, 31, 33, 33, 35, 37, 37, 37, 42, 42, 42, 42, 43, 43, 45, 45, 45, 45, 45, 47, 47, 49, 49, 51, 51, 53, 53, 55, 55, 58, 58, 58, 58, 62, 62, 65, 65, 65, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
