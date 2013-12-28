
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
			<g:if test="${membersInstance?.fullname}">
			<span class="property-value" aria-labelledby="guestStatus-label"><g:fieldValue bean="${membersInstance}" field="fullname"/></span>
					
				</g:if>
			</h1>

			<ol class="property-list guest">
			
				<g:if test="${membersInstance?.gender}">
				<li class="fieldcontain">
					<span id="guestStatus-label" class="property-label"><g:message code="guest.guestStatus.label" default="Gender" />:</span>
					
						<span class="property-value" aria-labelledby="guestStatus-label"><g:fieldValue bean="${membersInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${membersInstance?.agegroup}">
				<li class="fieldcontain">
					<span id="homePhone-label" class="property-label"><g:message code="guest.homePhone.label" default="Age Group" />:</span>
					
						<span class="property-value" aria-labelledby="homePhone-label"><g:fieldValue bean="${membersInstance}" field="agegroup"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${membersInstance?.address}">
				<li class="fieldcontain">
					<span id="mobilePhone-label" class="property-label"><g:message code="guest.mobilePhone.label" default="Address" />:</span>
					
						<span class="property-value" aria-labelledby="mobilePhone-label"><g:fieldValue bean="${membersInstance}" field="address"/>&nbsp;<g:fieldValue bean="${memberInstance}" field="address1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${membersInstance?.city}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="guest.email.label" default="City" />:</span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${membersInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${membersInstance?.state}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="guest.address.label" default="State" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${membersInstance}" field="state"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${memberInstance?.zip}">
				<li class="fieldcontain">
					<span id="address1-label" class="property-label"><g:message code="guest.address1.label" default="Zip Code:" /></span>
					
						<span class="property-value" aria-labelledby="address1-label"><g:fieldValue bean="${membersInstance}" field="zip"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${membersInstance?.phone}">
				<li class="fieldcontain">
					<span id="ageGroup-label" class="property-label"><g:message code="guest.ageGroup.label" default="Phone Number" /></span>
					
						<span class="property-value" aria-labelledby="ageGroup-label"><g:fieldValue bean="${membersInstance}" field="phone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${membersInstance?.email}">
				<li class="fieldcontain">
					<span id="attendance-label" class="property-label"><g:message code="guest.attendance.label" default="Email Address:" /></span>
					
						<span class="property-value" aria-labelledby="attendance-label">${membersInstance?.email?.encodeAsHTML()}</span>
					
				</li>
				</g:if>
			
			
			</ol><fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${guestInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					</fieldset>
				
				</div>

	</body>
</html>
