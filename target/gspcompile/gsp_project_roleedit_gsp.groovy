import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_roleedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/role/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'role.label', default: 'Role'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
invokeTag('require','r',7,['modules':("spring-security-ui")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('message','g',17,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('hiddenField','g',20,['name':("id"),'value':(role?.id)],-1)
printHtmlPart(3)
invokeTag('hiddenField','g',21,['name':("version"),'value':(role?.version)],-1)
printHtmlPart(4)

def tabData = []
tabData << [name: 'roleinfo', icon: 'icon_role',  messageCode: 'spring.security.ui.role.info']
tabData << [name: 'users',    icon: 'icon_users', messageCode: 'spring.security.ui.role.users']

printHtmlPart(4)
createTagBody(3, {->
printHtmlPart(10)
createTagBody(4, {->
printHtmlPart(11)
invokeTag('textFieldRow','s2ui',35,['name':("authority"),'labelCode':("role.authority.label"),'bean':(role),'labelCodeDefault':("Authority"),'value':(role?.authority)],-1)
printHtmlPart(12)
})
invokeTag('tab','s2ui',38,['name':("roleinfo"),'height':("150")],4)
printHtmlPart(10)
createTagBody(4, {->
printHtmlPart(1)
if(true && (users.empty)) {
printHtmlPart(1)
invokeTag('message','g',42,['code':("spring.security.ui.role_no_users")],-1)
printHtmlPart(1)
}
printHtmlPart(1)
for( u in (users) ) {
printHtmlPart(13)
createTagBody(6, {->
expressionOut.print(u.username.encodeAsHTML())
})
invokeTag('link','g',45,['controller':("user"),'action':("edit"),'id':(u.id)],6)
printHtmlPart(14)
}
printHtmlPart(2)
})
invokeTag('tab','s2ui',47,['name':("users"),'height':("150")],4)
printHtmlPart(4)
})
invokeTag('tabs','s2ui',49,['elementId':("tabs"),'height':("150"),'data':(tabData)],3)
printHtmlPart(15)
if(true && (role)) {
printHtmlPart(3)
invokeTag('deleteButton','s2ui',52,[:],-1)
printHtmlPart(16)
}
printHtmlPart(17)
invokeTag('submitButton','s2ui',57,['elementId':("update"),'form':("roleEditForm"),'messageCode':("default.button.update.label")],-1)
printHtmlPart(18)
})
invokeTag('form','g',62,['action':("update"),'name':("roleEditForm")],2)
printHtmlPart(4)
if(true && (role)) {
printHtmlPart(3)
invokeTag('deleteButtonForm','s2ui',65,['instanceId':(role.id)],-1)
printHtmlPart(3)
}
printHtmlPart(4)
})
invokeTag('captureBody','sitemesh',68,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388204226405L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 8, 10, 12, 12, 12, 12, 14, 14, 16, 16, 17, 17, 20, 20, 20, 21, 21, 23, 23, 23, 23, 29, 31, 31, 35, 35, 35, 35, 38, 38, 40, 41, 41, 41, 42, 42, 43, 43, 44, 44, 45, 45, 45, 45, 45, 45, 46, 47, 47, 47, 49, 49, 49, 49, 51, 52, 52, 52, 53, 53, 57, 57, 62, 62, 64, 64, 65, 65, 66, 66, 68, 68, 68, 68, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "edit.gsp"
)
class ___LineNumberPlaceholder { }
