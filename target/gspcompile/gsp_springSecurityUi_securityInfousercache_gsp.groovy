import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='spring-security-ui', version='1.0-RC1')
class gsp_springSecurityUi_securityInfousercache_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/spring-security-ui-1.0-RC1/grails-app/views/securityInfo/usercache.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("springSecurityUI")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (cache)) {
printHtmlPart(6)
expressionOut.print(cache.getClass().name)
printHtmlPart(7)
expressionOut.print(cache.size)
printHtmlPart(8)
expressionOut.print(cache.status)
printHtmlPart(9)
expressionOut.print(cache.name)
printHtmlPart(10)
expressionOut.print(cache.guid)
printHtmlPart(11)
expressionOut.print(cache.statistics.cacheHits)
printHtmlPart(12)
expressionOut.print(cache.statistics.inMemoryHits)
printHtmlPart(13)
expressionOut.print(cache.statistics.onDiskHits)
printHtmlPart(14)
expressionOut.print(cache.statistics.cacheMisses)
printHtmlPart(15)
expressionOut.print(cache.statistics.objectCount)
printHtmlPart(16)
expressionOut.print(cache.statistics.memoryStoreObjectCount)
printHtmlPart(17)
expressionOut.print(cache.statistics.diskStoreObjectCount)
printHtmlPart(18)
expressionOut.print(cache.statistics.statisticsAccuracyDescription)
printHtmlPart(19)
expressionOut.print(cache.statistics.averageGetTime)
printHtmlPart(20)
expressionOut.print(cache.statistics.evictionCount)
printHtmlPart(21)
expressionOut.print(cache.size)
printHtmlPart(22)
expressionOut.print(cache.size == 1 ? '' : 's')
printHtmlPart(23)
for( k in (cache.keys) ) {
printHtmlPart(24)
expressionOut.print(k)
printHtmlPart(25)
expressionOut.print(cache.get(k)?.value)
printHtmlPart(26)
}
printHtmlPart(27)
}
else {
printHtmlPart(28)
}
printHtmlPart(4)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1384212130000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 8, 12, 12, 12, 12, 13, 13, 20, 20, 24, 24, 28, 28, 32, 32, 40, 40, 44, 44, 48, 48, 52, 52, 56, 56, 60, 60, 64, 64, 68, 68, 72, 72, 76, 76, 82, 82, 82, 82, 87, 87, 89, 89, 90, 90, 92, 92, 94, 95, 95, 97, 99, 99, 99, 99, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "usercache.gsp"
)
class ___LineNumberPlaceholder { }
