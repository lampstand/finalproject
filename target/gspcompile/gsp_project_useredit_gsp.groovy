import org.codehaus.groovy.grails.plugins.PluginManagerHolder
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_project_useredit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(2)
if(true && (user.username)) {
printHtmlPart(2)
invokeTag('set','g',7,['var':("canRunAs"),'value':(true)],-1)
printHtmlPart(2)
}
printHtmlPart(2)
})
invokeTag('ifAllGranted','sec',9,['roles':("ROLE_SWITCH_USER")],2)
printHtmlPart(3)
})
invokeTag('ifNotSwitched','sec',10,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',14,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',15,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',15,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',15,[:],2)
printHtmlPart(4)
invokeTag('require','r',16,['modules':("spring-security-ui")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('message','g',26,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('hiddenField','g',29,['name':("id"),'value':(user?.id)],-1)
printHtmlPart(3)
invokeTag('hiddenField','g',30,['name':("version"),'value':(user?.version)],-1)
printHtmlPart(1)

def tabData = []
tabData << [name: 'userinfo', icon: 'icon_user', messageCode: 'spring.security.ui.user.info']
tabData << [name: 'roles',    icon: 'icon_role', messageCode: 'spring.security.ui.user.roles']
boolean isOpenId = PluginManagerHolder.pluginManager.hasGrailsPlugin('springSecurityOpenid')
if (isOpenId) {
	tabData << [name: 'openIds', icon: 'icon_role', messageCode: 'spring.security.ui.user.openIds']
}

printHtmlPart(1)
createTagBody(3, {->
printHtmlPart(10)
createTagBody(4, {->
printHtmlPart(11)
invokeTag('textFieldRow','s2ui',48,['name':("member"),'labelCode':("user.member.label"),'bean':(user),'labelCodeDefault':("Member Name"),'value':(user?.member?.fullname),'disabled':("disabled")],-1)
printHtmlPart(12)
invokeTag('textFieldRow','s2ui',50,['name':("username"),'labelCode':("user.username.label"),'bean':(user),'labelCodeDefault':("Username"),'value':(user?.username)],-1)
printHtmlPart(13)
invokeTag('passwordFieldRow','s2ui',53,['name':("password"),'labelCode':("user.password.label"),'bean':(user),'labelCodeDefault':("Password"),'value':(user?.password)],-1)
printHtmlPart(13)
invokeTag('checkboxRow','s2ui',56,['name':("enabled"),'labelCode':("user.enabled.label"),'bean':(user),'labelCodeDefault':("Enabled"),'value':(user?.enabled)],-1)
printHtmlPart(13)
invokeTag('checkboxRow','s2ui',59,['name':("accountExpired"),'labelCode':("user.accountExpired.label"),'bean':(user),'labelCodeDefault':("Account Expired"),'value':(user?.accountExpired)],-1)
printHtmlPart(13)
invokeTag('checkboxRow','s2ui',62,['name':("accountLocked"),'labelCode':("user.accountLocked.label"),'bean':(user),'labelCodeDefault':("Account Locked"),'value':(user?.accountLocked)],-1)
printHtmlPart(13)
invokeTag('checkboxRow','s2ui',65,['name':("passwordExpired"),'labelCode':("user.passwordExpired.label"),'bean':(user),'labelCodeDefault':("Password Expired"),'value':(user?.passwordExpired)],-1)
printHtmlPart(14)
})
invokeTag('tab','s2ui',68,['name':("userinfo"),'height':("275")],4)
printHtmlPart(10)
createTagBody(4, {->
printHtmlPart(4)
for( entry in (roleMap) ) {
printHtmlPart(15)
invokeTag('checkBox','g',73,['name':(entry.key.authority),'value':(entry.value)],-1)
printHtmlPart(12)
createTagBody(6, {->
expressionOut.print(entry.key.authority.encodeAsHTML())
})
invokeTag('link','g',74,['controller':("role"),'action':("edit"),'id':(entry.key.id)],6)
printHtmlPart(16)
}
printHtmlPart(2)
})
invokeTag('tab','s2ui',77,['name':("roles"),'height':("275")],4)
printHtmlPart(10)
if(true && (isOpenId)) {
printHtmlPart(2)
createTagBody(5, {->
printHtmlPart(2)
if(true && (user?.openIds)) {
printHtmlPart(17)
for( openId in (user.openIds) ) {
printHtmlPart(18)
expressionOut.print(openId.url)
printHtmlPart(19)
}
printHtmlPart(20)
}
else {
printHtmlPart(21)
}
printHtmlPart(2)
})
invokeTag('tab','s2ui',91,['name':("openIds"),'height':("275")],5)
printHtmlPart(2)
}
printHtmlPart(1)
})
invokeTag('tabs','s2ui',94,['elementId':("tabs"),'height':("375"),'data':(tabData)],3)
printHtmlPart(22)
invokeTag('submitButton','s2ui',97,['elementId':("update"),'form':("userEditForm"),'messageCode':("default.button.update.label")],-1)
printHtmlPart(1)
if(true && (user)) {
printHtmlPart(3)
invokeTag('deleteButton','s2ui',100,[:],-1)
printHtmlPart(3)
}
printHtmlPart(1)
if(true && (canRunAs)) {
printHtmlPart(23)
expressionOut.print(message(code:'spring.security.ui.runas.submit'))
printHtmlPart(24)
}
printHtmlPart(25)
})
invokeTag('form','g',109,['action':("update"),'name':("userEditForm"),'class':("button-style")],2)
printHtmlPart(1)
if(true && (user)) {
printHtmlPart(3)
invokeTag('deleteButtonForm','s2ui',112,['instanceId':(user.id)],-1)
printHtmlPart(3)
}
printHtmlPart(1)
if(true && (canRunAs)) {
printHtmlPart(26)
expressionOut.print(request.contextPath)
printHtmlPart(27)
invokeTag('hiddenField','g',117,['name':("j_username"),'value':(user.username)],-1)
printHtmlPart(28)
}
printHtmlPart(29)
invokeTag('initCheckboxes','s2ui',126,[:],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',135,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1388204226854L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9, 9, 10, 10, 10, 12, 13, 13, 13, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 17, 17, 17, 19, 21, 21, 21, 21, 23, 23, 25, 25, 26, 26, 29, 29, 29, 30, 30, 32, 32, 32, 32, 42, 44, 44, 48, 48, 48, 50, 50, 53, 53, 56, 56, 59, 59, 62, 62, 65, 65, 65, 68, 68, 70, 71, 71, 71, 71, 73, 74, 74, 74, 74, 74, 74, 76, 77, 77, 77, 79, 79, 80, 81, 81, 81, 81, 83, 83, 84, 84, 85, 85, 87, 88, 88, 90, 91, 91, 91, 92, 92, 94, 94, 94, 94, 97, 99, 99, 100, 100, 101, 101, 103, 103, 103, 104, 104, 105, 105, 109, 109, 111, 111, 112, 112, 113, 113, 115, 115, 115, 116, 116, 117, 117, 120, 120, 126, 126, 135, 135, 135, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "edit.gsp"
)
class ___LineNumberPlaceholder { }
