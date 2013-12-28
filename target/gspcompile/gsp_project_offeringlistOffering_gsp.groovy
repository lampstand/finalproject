import edu.harvard.cscie56.Offering
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_offeringlistOffering_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/offering/listOffering.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':("Offering")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',17,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',25,['property':("adultsNumber"),'title':(message(code: 'attendance.adultsNumber.label', default: 'Adults Number'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("childrenNumber"),'title':(message(code: 'attendance.childrenNumber.label', default: 'Children Number'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',29,['property':("createdBy"),'title':(message(code: 'attendance.createdBy.label', default: 'Created By'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',31,['property':("dateCreated"),'title':(message(code: 'attendance.dateCreated.label', default: 'Date Created'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',33,['property':("guestNumber"),'title':(message(code: 'attendance.guestNumber.label', default: 'Guest Number'))],-1)
printHtmlPart(13)
loop:{
int i = 0
for( offeringInstance in (offeringInstanceList) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(15)
expressionOut.print(fieldValue(bean: offeringInstance, field: "service"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: offeringInstance, field: "offeringDate"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: offeringInstance, field: "approvedBy"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: offeringInstance, field: "amountCash"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: offeringInstance, field: "amountCheck"))
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',56,['total':(offeringInstanceTotal)],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',59,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1385180299264L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 17, 17, 18, 18, 19, 19, 20, 20, 25, 27, 27, 29, 29, 31, 31, 33, 33, 33, 38, 38, 38, 38, 39, 39, 41, 41, 43, 43, 45, 45, 47, 47, 49, 49, 52, 52, 52, 52, 56, 56, 59, 59, 59, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "listOffering.gsp"
)
class ___LineNumberPlaceholder { }
