import edu.harvard.cscie56.TithePayment
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_tithePaymentshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tithePayment/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (tithePaymentInstance?.acceptedBy)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("tithePayment.acceptedBy.label"),'default':("Accepted By")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(tithePaymentInstance),'field':("acceptedBy")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tithePaymentInstance?.amount)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("tithePayment.amount.label"),'default':("Amount")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(tithePaymentInstance),'field':("amount")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tithePaymentInstance?.datePaid)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("tithePayment.datePaid.label"),'default':("Date Paid")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',48,['date':(tithePaymentInstance?.datePaid),'type':("date"),'style':("LONG")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tithePaymentInstance?.tithe)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("tithePayment.tithe.label"),'default':("Tithe")],-1)
printHtmlPart(23)
createTagBody(3, {->
expressionOut.print(tithePaymentInstance?.tithe?.titheID?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("tithe"),'action':("show"),'id':(tithePaymentInstance?.tithe?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tithePaymentInstance?.titheMonth)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("tithePayment.titheMonth.label"),'default':("Tithe Month")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(tithePaymentInstance),'field':("titheMonth")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (tithePaymentInstance?.titheYear)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("tithePayment.titheYear.label"),'default':("Tithe Year")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(tithePaymentInstance),'field':("titheYear")],-1)
printHtmlPart(16)
}
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
createTagBody(3, {->
invokeTag('message','g',83,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',83,['class':("edit"),'action':("edit"),'resource':(tithePaymentInstance)],3)
printHtmlPart(30)
invokeTag('actionSubmit','g',84,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',86,['url':([resource:tithePaymentInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',88,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388185739205L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 14, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 20, 20, 21, 21, 22, 22, 23, 23, 26, 26, 28, 28, 30, 30, 33, 35, 35, 35, 37, 37, 39, 39, 42, 44, 44, 44, 46, 46, 48, 48, 51, 53, 53, 53, 55, 55, 57, 57, 57, 57, 57, 60, 62, 62, 62, 64, 64, 66, 66, 69, 71, 71, 71, 73, 73, 75, 75, 78, 78, 83, 83, 83, 83, 83, 83, 84, 84, 84, 86, 86, 86, 88, 88, 88, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "show.gsp"
)
class ___LineNumberPlaceholder { }
