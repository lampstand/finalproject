import edu.harvard.cscie56.Member
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_memberedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/member/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'members.label', default: 'Members'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',10,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(4)
createTagBody(2, {->
invokeTag('message','g',13,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',13,['class':("list"),'action':("index")],2)
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(6)
invokeTag('message','g',18,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
expressionOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(12)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(13)
expressionOut.print(error.field)
printHtmlPart(14)
}
printHtmlPart(15)
invokeTag('message','g',25,['error':(error)],-1)
printHtmlPart(16)
})
invokeTag('eachError','g',26,['bean':(membersInstance),'var':("error")],3)
printHtmlPart(17)
})
invokeTag('hasErrors','g',28,['bean':(membersInstance)],2)
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
invokeTag('hiddenField','g',31,['name':("version"),'value':(membersInstance?.version)],-1)
printHtmlPart(19)
invokeTag('hiddenField','g',32,['name':("id"),'value':(membersInstance?.id)],-1)
printHtmlPart(20)
invokeTag('render','g',33,['template':("form")],-1)
printHtmlPart(21)
invokeTag('actionSubmit','g',34,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(22)
})
invokeTag('form','g',36,['url':([action:'update']),'method':("PUT"),'class':("lampstand-form")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',39,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388201839673L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 10, 10, 10, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 18, 18, 19, 19, 20, 20, 21, 22, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 28, 28, 28, 31, 31, 31, 32, 32, 33, 33, 34, 34, 36, 36, 36, 36, 39, 39, 39, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "edit.gsp"
)
class ___LineNumberPlaceholder { }
