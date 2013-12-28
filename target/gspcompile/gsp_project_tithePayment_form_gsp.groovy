import edu.harvard.cscie56.TithePayment
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_tithePayment_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tithePayment/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( tithe in (titheInstance) ) {
printHtmlPart(1)
expressionOut.print(tithe.member?.fullname)
printHtmlPart(2)
}
printHtmlPart(3)
expressionOut.print(hasErrors(bean: tithePaymentInstance, field: 'acceptedBy', 'error'))
printHtmlPart(4)
invokeTag('message','g',12,['code':("tithePayment.acceptedBy.label"),'default':("Accepted By")],-1)
printHtmlPart(5)
invokeTag('textField','g',15,['name':("acceptedBy"),'value':(tithePaymentInstance?.acceptedBy)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: tithePaymentInstance, field: 'amount', 'error'))
printHtmlPart(7)
invokeTag('message','g',20,['code':("tithePayment.amount.label"),'default':("Amount")],-1)
printHtmlPart(8)
invokeTag('field','g',23,['name':("amount"),'value':(fieldValue(bean: tithePaymentInstance, field: 'amount')),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: tithePaymentInstance, field: 'datePaid', 'error'))
printHtmlPart(9)
invokeTag('message','g',28,['code':("tithePayment.datePaid.label"),'default':("Date Paid")],-1)
printHtmlPart(5)
invokeTag('datePicker','g',31,['name':("datePaid"),'value':(new Date() ?: tithePaymentInstance?.datePaid),'precision':("day"),'relativeYears':([-2..7])],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: tithePaymentInstance, field: 'tithe', 'error'))
printHtmlPart(11)
invokeTag('hiddenField','g',36,['name':("tithe.id"),'value':(titheInstanceID)],-1)
printHtmlPart(12)
invokeTag('select','g',37,['id':("tithe"),'name':("tithe.id"),'from':(edu.harvard.cscie56.Tithe.list()),'optionKey':("id"),'required':(""),'value':(tithePaymentInstance?.tithe?.id),'class':("many-to-one")],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: tithePaymentInstance, field: 'titheMonth', 'error'))
printHtmlPart(14)
invokeTag('message','g',42,['code':("tithePayment.titheMonth.label"),'default':("Tithe Month")],-1)
printHtmlPart(5)
invokeTag('textField','g',45,['name':("titheMonth"),'value':(tithePaymentInstance?.titheMonth)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: tithePaymentInstance, field: 'titheYear', 'error'))
printHtmlPart(15)
invokeTag('message','g',50,['code':("tithePayment.titheYear.label"),'default':("Tithe Year")],-1)
printHtmlPart(5)
invokeTag('textField','g',53,['name':("titheYear"),'value':(tithePaymentInstance?.titheYear)],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388185783596L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 7, 7, 8, 8, 10, 10, 12, 12, 15, 15, 18, 18, 20, 20, 23, 23, 26, 26, 28, 28, 31, 31, 35, 35, 36, 36, 37, 37, 40, 40, 42, 42, 45, 45, 48, 48, 50, 50, 53, 53, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
