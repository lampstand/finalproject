import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='console', version='1.2')
class gsp_console_consoleindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/console-1.2/grails-app/views/console/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('resources','con',8,[:],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'h.png', plugin: 'console'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'images', file: 'v.png', plugin: 'console'))
printHtmlPart(7)
invokeTag('textArea','g',37,['name':("code"),'value':(code),'rows':("25"),'cols':("100")],-1)
printHtmlPart(8)
invokeTag('layoutResources','con',53,[:],-1)
printHtmlPart(9)
expressionOut.print(resource(plugin: 'console'))
printHtmlPart(10)
expressionOut.print(createLink(action: 'execute'))
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1341688274000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 11, 19, 19, 19, 19, 22, 22, 37, 37, 53, 53, 56, 56, 57, 57, 61, 61, 61, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
