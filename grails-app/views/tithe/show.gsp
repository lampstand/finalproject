
<%@ page import="edu.harvard.cscie56.Tithe" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'tithe.label', default: 'Tithe')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-tithe" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
			<li><g:link class="list" name="list"action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-tithe" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list tithe">
			
				<g:if test="${titheInstance?.member}">
				<li class="fieldcontain">
					<span id="member-label" class="property-label"><g:message code="tithe.titheID.label" default="Member Name" /></span>
					
						<span class="property-value" aria-labelledby="member-label">${titheInstance?.member?.fullname }</span>
					
				</li>
				</g:if>
			
				<g:if test="${titheInstance?.titheID}">
				<li class="fieldcontain">
					<span id="titheID-label" class="property-label"><g:message code="tithe.titheID.label" default="Tithe ID" /></span>
					
						<span class="property-value" aria-labelledby="titheID-label"><g:fieldValue bean="${titheInstance}" field="titheID"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${titheInstance?.id}" />
					<g:link class="edit" name='edit'action="edit" id="${titheInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
