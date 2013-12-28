import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'icon.ico'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'main.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'style.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'default.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'component.css'))
printHtmlPart(6)
invokeTag('javascript','g',17,['library':("jquery")],-1)
printHtmlPart(1)
invokeTag('javascript','g',18,['src':("project.js")],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',19,[:],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',20,[:],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('loggedInUserInfo','sec',27,['field':("username")],-1)
printHtmlPart(10)
})
invokeTag('ifLoggedIn','sec',28,[:],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',29,['controller':("logout")],3)
printHtmlPart(14)
})
invokeTag('ifLoggedIn','sec',29,[:],2)
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',41,['action':("create"),'controller':("member")],2)
printHtmlPart(17)
createClosureForHtmlPart(18, 2)
invokeTag('link','g',42,['controller':("member"),'action':("index")],2)
printHtmlPart(17)
createClosureForHtmlPart(19, 2)
invokeTag('link','g',43,['controller':("member"),'action':("find")],2)
printHtmlPart(20)
createClosureForHtmlPart(21, 2)
invokeTag('link','g',56,['action':("create"),'controller':("offering")],2)
printHtmlPart(17)
createClosureForHtmlPart(22, 2)
invokeTag('link','g',57,['action':("index"),'controller':("offering")],2)
printHtmlPart(17)
createClosureForHtmlPart(23, 2)
invokeTag('link','g',58,['action':("search"),'controller':("offering")],2)
printHtmlPart(24)
createClosureForHtmlPart(25, 2)
invokeTag('link','g',64,['action':("create"),'controller':("tithe")],2)
printHtmlPart(17)
createClosureForHtmlPart(26, 2)
invokeTag('link','g',65,['action':("create"),'controller':("tithePayment")],2)
printHtmlPart(17)
createClosureForHtmlPart(27, 2)
invokeTag('link','g',66,['action':("searchPayments"),'controller':("tithePayment")],2)
printHtmlPart(28)
createClosureForHtmlPart(29, 2)
invokeTag('link','g',79,['controller':("attendance"),'action':("create")],2)
printHtmlPart(17)
createClosureForHtmlPart(30, 2)
invokeTag('link','g',80,['controller':("attendance"),'action':("index")],2)
printHtmlPart(17)
createClosureForHtmlPart(31, 2)
invokeTag('link','g',81,['controller':("attendance"),'action':("search")],2)
printHtmlPart(32)
createClosureForHtmlPart(33, 2)
invokeTag('link','g',87,['controller':("guest"),'action':("index")],2)
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
createClosureForHtmlPart(36, 3)
invokeTag('link','g',101,['controller':("user"),'action':("create")],3)
printHtmlPart(17)
createClosureForHtmlPart(37, 3)
invokeTag('link','g',102,['controller':("user"),'action':("search")],3)
printHtmlPart(38)
createClosureForHtmlPart(39, 3)
invokeTag('link','g',109,['controller':("role"),'action':("create")],3)
printHtmlPart(40)
createClosureForHtmlPart(36, 3)
invokeTag('link','g',110,['controller':("role"),'action':("search")],3)
printHtmlPart(41)
})
invokeTag('ifLoggedIn','sec',118,[:],2)
printHtmlPart(42)
invokeTag('layoutBody','g',125,[:],-1)
printHtmlPart(43)
invokeTag('message','g',128,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(44)
invokeTag('javascript','g',129,['library':("application")],-1)
printHtmlPart(1)
invokeTag('javascript','g',130,['src':("cbpHorizontalMenu.js")],-1)
printHtmlPart(45)
invokeTag('layoutResources','r',136,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',137,['src':("jquery/jquery.jgrowl.js"),'plugin':("spring-security-ui")],-1)
printHtmlPart(46)
invokeTag('javascript','g',138,['src':("jquery/jquery.checkbox.js"),'plugin':("spring-security-ui")],-1)
printHtmlPart(46)
invokeTag('javascript','g',139,['src':("spring-security-ui.js"),'plugin':("spring-security-ui")],-1)
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',140,[:],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388213617233L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 8, 8, 9, 9, 10, 10, 10, 10, 10, 10, 11, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 18, 18, 19, 19, 20, 20, 21, 21, 21, 22, 26, 26, 27, 27, 27, 27, 28, 28, 28, 29, 29, 29, 29, 29, 29, 29, 29, 41, 41, 41, 42, 42, 42, 43, 43, 43, 56, 56, 56, 57, 57, 57, 58, 58, 58, 64, 64, 64, 65, 65, 65, 66, 66, 66, 79, 79, 79, 80, 80, 80, 81, 81, 81, 87, 87, 87, 101, 101, 101, 101, 101, 102, 102, 102, 109, 109, 109, 110, 110, 110, 118, 118, 118, 125, 125, 128, 128, 129, 130, 130, 130, 136, 137, 137, 138, 138, 139, 139, 140, 140, 140, 140, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "main.gsp"
)
class ___LineNumberPlaceholder { }
