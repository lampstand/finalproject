import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_rolesearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/role/search.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(2)
invokeTag('require','r',6,['modules':("spring-security-ui")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
createTagBody(3, {->
printHtmlPart(8)
invokeTag('message','g',23,['code':("role.authority.label"),'default':("Authority")],-1)
printHtmlPart(9)
invokeTag('textField','g',24,['name':("authority"),'class':("textField"),'size':("50"),'maxlength':("255"),'autocomplete':("off"),'value':(authority)],-1)
printHtmlPart(10)
invokeTag('submitButton','s2ui',28,['elementId':("search"),'form':("roleSearchForm"),'messageCode':("spring.security.ui.search")],-1)
printHtmlPart(11)
})
invokeTag('form','g',32,['action':("roleSearch"),'name':("roleSearchForm")],3)
printHtmlPart(7)
})
invokeTag('form','s2ui',34,['width':("100%"),'height':("200"),'elementId':("formContainer"),'titleCode':("spring.security.ui.role.search")],2)
printHtmlPart(7)
if(true && (searched)) {
printHtmlPart(5)

def queryParams = [authority: authority]

printHtmlPart(12)
invokeTag('sortableColumn','g',46,['property':("authority"),'title':(message(code: 'role.authority.label', default: 'Authority')),'params':(queryParams)],-1)
printHtmlPart(13)
loop:{
int i = 0
for( role in (results) ) {
printHtmlPart(14)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(15)
createTagBody(4, {->
expressionOut.print(fieldValue(bean: role, field: "authority"))
})
invokeTag('link','g',53,['action':("edit"),'id':(role.id)],4)
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
invokeTag('paginate','g',61,['total':(totalCount),'params':(queryParams)],-1)
printHtmlPart(18)
invokeTag('paginationSummary','s2ui',65,['total':(totalCount)],-1)
printHtmlPart(19)
}
printHtmlPart(20)
expressionOut.print(createLink(action: 'ajaxRoleSearch'))
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',82,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388204226511L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7, 7, 7, 9, 14, 14, 16, 16, 23, 23, 23, 23, 24, 24, 28, 28, 32, 32, 34, 34, 34, 36, 36, 38, 38, 38, 38, 40, 46, 46, 51, 51, 51, 51, 52, 52, 53, 53, 53, 53, 53, 55, 55, 55, 55, 61, 61, 65, 65, 68, 68, 77, 77, 82, 82, 82, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "search.gsp"
)
class ___LineNumberPlaceholder { }
