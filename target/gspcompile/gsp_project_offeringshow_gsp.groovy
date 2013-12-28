import edu.harvard.cscie56.Offering
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_offeringshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/offering/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'offering.label', default: 'Offering'))],-1)
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
createClosureForHtmlPart(6, 2)
invokeTag('link','g',14,['controller':("tithePayment"),'class':("create"),'action':("create")],2)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',15,['class':("search"),'action':("search")],2)
printHtmlPart(7)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(10)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
expressionOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (offeringInstance?.amountCash)) {
printHtmlPart(15)
invokeTag('message','g',28,['code':("offering.amountCash.label"),'default':("Amount Cash")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',30,['bean':(offeringInstance),'field':("amountCash")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (offeringInstance?.amountCheck)) {
printHtmlPart(19)
invokeTag('message','g',37,['code':("offering.amountCheck.label"),'default':("Amount Check")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',39,['bean':(offeringInstance),'field':("amountCheck")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (offeringInstance?.approvedBy)) {
printHtmlPart(21)
invokeTag('message','g',46,['code':("offering.approvedBy.label"),'default':("Approved By")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',48,['bean':(offeringInstance),'field':("approvedBy")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (offeringInstance?.offeringDate)) {
printHtmlPart(23)
invokeTag('message','g',55,['code':("offering.offeringDate.label"),'default':("Offering Date")],-1)
printHtmlPart(24)
invokeTag('formatDate','g',57,['date':(offeringInstance?.offeringDate),'type':("date"),'style':("LONG")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (offeringInstance?.service)) {
printHtmlPart(25)
invokeTag('message','g',64,['code':("offering.service.label"),'default':("Service")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',66,['bean':(offeringInstance),'field':("service")],-1)
printHtmlPart(17)
}
printHtmlPart(27)
createTagBody(2, {->
invokeTag('message','g',73,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',73,['class':("edit"),'action':("edit"),'resource':(offeringInstance)],2)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',77,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388186122928L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 15, 15, 15, 16, 16, 16, 20, 20, 21, 21, 22, 22, 23, 23, 26, 26, 28, 28, 30, 30, 33, 35, 35, 35, 37, 37, 39, 39, 42, 44, 44, 44, 46, 46, 48, 48, 51, 53, 53, 53, 55, 55, 57, 57, 60, 62, 62, 62, 64, 64, 66, 66, 69, 69, 73, 73, 73, 73, 73, 77, 77, 77, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "show.gsp"
)
class ___LineNumberPlaceholder { }
