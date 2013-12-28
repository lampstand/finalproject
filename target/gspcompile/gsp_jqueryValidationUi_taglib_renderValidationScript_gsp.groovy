import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='jquery-validation-ui', version='1.4.8')
class gsp_jqueryValidationUi_taglib_renderValidationScript_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/jquery-validation-ui-1.4.8/grails-app/views/taglib/_renderValidationScript.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('set','g',4,['var':("hasResourcesPlugin"),'value':(grailsApplication.mainContext.pluginManager.hasGrailsPlugin('resources'))],-1)
printHtmlPart(0)
if(true && (hasResourcesPlugin)) {
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(1)
invokeTag('render','g',8,['plugin':("jqueryValidationUi"),'template':("/taglib/validationScript"),'model':(pageScope.variables)],-1)
printHtmlPart(1)
})
invokeTag('script','r',10,[:],2)
printHtmlPart(2)
}
else {
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(1)
invokeTag('render','g',12,['plugin':("jqueryValidationUi"),'template':("/taglib/validationScript"),'model':(pageScope.variables)],-1)
printHtmlPart(3)
})
invokeTag('javascript','g',12,[:],2)
printHtmlPart(2)
}
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1383703264000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [12, 12, 12, 12, 12, 12, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 5, 5, 5, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12],
	sourceName = "_renderValidationScript.gsp"
)
class ___LineNumberPlaceholder { }
