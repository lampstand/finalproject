import edu.harvard.cscie56.Offering
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_offering_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/offering/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(resource(dir: 'css', file: 'classic.css'))
printHtmlPart(1)
expressionOut.print(resource(dir: 'css', file: 'classic.date.css'))
printHtmlPart(2)
invokeTag('select','g',8,['name':("service"),'noSelection':(['':'Select Church Service']),'from':(['Sunday Worship Service','Mid-Week Bible Studies','Friday Half-Night','Special Service']),'value':(offeringInstance?.service)],-1)
printHtmlPart(3)
expressionOut.print(fieldValue(bean: offeringInstance, field: 'amountCheck'))
printHtmlPart(4)
expressionOut.print(fieldValue(bean: offeringInstance, field: 'amountCash'))
printHtmlPart(5)
invokeTag('textField','g',28,['name':("approvedBy"),'value':(offeringInstance?.approvedBy)],-1)
printHtmlPart(6)
invokeTag('datePicker','g',34,['name':("offeringDate"),'precision':("day"),'date':(new Date())],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1387036363124L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 4, 4, 8, 8, 14, 14, 21, 21, 28, 28, 34, 34, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
