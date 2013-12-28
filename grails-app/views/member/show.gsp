
<%@ page import="edu.harvard.cscie56.Member" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'members.label', default: 'Members')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
<div id="show-guest" class="content scaffold-show" role="main">
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<h1>Profile for
			<g:if test="${memberInstance?.fullname}">
			<span class="property-value" aria-labelledby="guestStatus-label"><g:fieldValue bean="${memberInstance}" field="fullname"/></span>
					
				</g:if>
			</h1>

			<ol class="property-list guest">
			
				<g:if test="${memberInstance?.gender}">
				<li class="fieldcontain">
					<span id="guestStatus-label" class="property-label"><g:message code="guest.guestStatus.label" default="Gender" />:</span>
					
						<span class="property-value" aria-labelledby="guestStatus-label"><g:fieldValue bean="${guestInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${memberInstance?.agegroup}">
				<li class="fieldcontain">
					<span id="homePhone-label" class="property-label"><g:message code="guest.homePhone.label" default="Age Group" />:</span>
					
						<span class="property-value" aria-labelledby="homePhone-label"><g:fieldValue bean="${memberInstance}" field="agegroup"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${memberInstance?.address}">
				<li class="fieldcontain">
					<span id="mobilePhone-label" class="property-label"><g:message code="guest.mobilePhone.label" default="Address" />:</span>
					
						<span class="property-value" aria-labelledby="mobilePhone-label"><g:fieldValue bean="${memberInstance}" field="address"/>&nbsp;<g:fieldValue bean="${memberInstance}" field="address1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${memberInstance?.city}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="guest.email.label" default="City" />:</span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${guestInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="guest.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${guestInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.address1}">
				<li class="fieldcontain">
					<span id="address1-label" class="property-label"><g:message code="guest.address1.label" default="Address1" /></span>
					
						<span class="property-value" aria-labelledby="address1-label"><g:fieldValue bean="${guestInstance}" field="address1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.ageGroup}">
				<li class="fieldcontain">
					<span id="ageGroup-label" class="property-label"><g:message code="guest.ageGroup.label" default="Age Group" /></span>
					
						<span class="property-value" aria-labelledby="ageGroup-label"><g:fieldValue bean="${guestInstance}" field="ageGroup"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.attendance}">
				<li class="fieldcontain">
					<span id="attendance-label" class="property-label"><g:message code="guest.attendance.label" default="Attendance" /></span>
					
						<span class="property-value" aria-labelledby="attendance-label"><g:link controller="attendance" action="show" id="${guestInstance?.attendance?.id}">${guestInstance?.attendance?.service?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="guest.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${guestInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.comments}">
				<li class="fieldcontain">
					<span id="comments-label" class="property-label"><g:message code="guest.comments.label" default="Comments" /></span>
					
						<span class="property-value" aria-labelledby="comments-label"><g:fieldValue bean="${guestInstance}" field="comments"/></span>
					
				</li>
				</g:if>

			
				<g:if test="${guestInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="guest.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:fieldValue bean="${guestInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.maritalStatus}">
				<li class="fieldcontain">
					<span id="maritalStatus-label" class="property-label"><g:message code="guest.maritalStatus.label" default="Marital Status" /></span>
					
						<span class="property-value" aria-labelledby="maritalStatus-label"><g:fieldValue bean="${guestInstance}" field="maritalStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="guest.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${guestInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.state}">
				<li class="fieldcontain">
					<span id="state-label" class="property-label"><g:message code="guest.state.label" default="State" /></span>
					
						<span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${guestInstance}" field="state"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${guestInstance?.zip}">
				<li class="fieldcontain">
					<span id="zip-label" class="property-label"><g:message code="guest.zip.label" default="Zip" /></span>
					
						<span class="property-value" aria-labelledby="zip-label"><g:fieldValue bean="${guestInstance}" field="zip"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:guestInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${guestInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>

	</body>
</html>
