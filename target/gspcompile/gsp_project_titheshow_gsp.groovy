import edu.harvard.cscie56.Tithe
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_titheshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/tithe/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'tithe.label', default: 'Tithe'))],-1)
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
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'name':("list"),'action':("list")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',19,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
expressionOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
if(true && (titheInstance?.member)) {
printHtmlPart(12)
invokeTag('message','g',27,['code':("tithe.titheID.label"),'default':("Member Name")],-1)
printHtmlPart(13)
expressionOut.print(titheInstance?.member?.fullname)
printHtmlPart(14)
}
printHtmlPart(15)
if(true && (titheInstance?.titheID)) {
printHtmlPart(16)
invokeTag('message','g',36,['code':("tithe.titheID.label"),'default':("Tithe ID")],-1)
printHtmlPart(17)
invokeTag('fieldValue','g',38,['bean':(titheInstance),'field':("titheID")],-1)
printHtmlPart(14)
}
printHtmlPart(18)
createTagBody(2, {->
printHtmlPart(19)
invokeTag('hiddenField','g',46,['name':("id"),'value':(titheInstance?.id)],-1)
printHtmlPart(20)
createTagBody(3, {->
invokeTag('message','g',47,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',47,['class':("edit"),'name':("edit"),'action':("edit"),'id':(titheInstance?.id)],3)
printHtmlPart(21)
})
invokeTag('form','g',49,[:],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',51,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388115930641L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 10, 11, 11, 11, 11, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 19, 19, 20, 20, 21, 21, 22, 22, 25, 25, 27, 27, 29, 29, 32, 34, 34, 34, 36, 36, 38, 38, 41, 41, 46, 46, 46, 47, 47, 47, 47, 47, 47, 49, 49, 49, 51, 51, 51, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "show.gsp"
)
class ___LineNumberPlaceholder { }
