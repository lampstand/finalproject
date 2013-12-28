
<%@ page import="edu.harvard.cscie56.Offering" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'offering.label', default: 'Offering')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-offering" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><g:link controller="tithePayment" class="create" action="create">Add Tithe Payment</g:link></li>
				<li><g:link class="search" action="search">Search Offering</g:link></li>
				<li><g:link class="create" action="create"> New Offering</g:link></li>
			</ul>
		</div>
		<div id="show-offering" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list offering">
			
				<g:if test="${offeringInstance?.amountCash}">
				<li class="fieldcontain">
					<span id="amountCash-label" class="property-label"><g:message code="offering.amountCash.label" default="Amount Cash" />:</span>
					
						<span class="property-value" aria-labelledby="amountCash-label"><g:fieldValue bean="${offeringInstance}" field="amountCash"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${offeringInstance?.amountCheck}">
				<li class="fieldcontain">
					<span id="amountCheck-label" class="property-label"><g:message code="offering.amountCheck.label" default="Amount Check" />:</span>
					
						<span class="property-value" aria-labelledby="amountCheck-label"><g:fieldValue bean="${offeringInstance}" field="amountCheck"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${offeringInstance?.approvedBy}">
				<li class="fieldcontain">
					<span id="approvedBy-label" class="property-label"><g:message code="offering.approvedBy.label" default="Approved By" />:</span>
					
						<span class="property-value" aria-labelledby="approvedBy-label"><g:fieldValue bean="${offeringInstance}" field="approvedBy"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${offeringInstance?.offeringDate}">
				<li class="fieldcontain">
					<span id="offeringDate-label" class="property-label"><g:message code="offering.offeringDate.label" default="Offering Date" />:</span>
					
						<span class="property-value" aria-labelledby="offeringDate-label"><g:formatDate date="${offeringInstance?.offeringDate}" type="date" style="LONG" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${offeringInstance?.service}">
				<li class="fieldcontain">
					<span id="service-label" class="property-label"><g:message code="offering.service.label" default="Service" />:</span>
					
						<span class="property-value" aria-labelledby="service-label"><g:fieldValue bean="${offeringInstance}" field="service"/></span>
					
				</li>
				</g:if>
			
			</ol>
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${offeringInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
				</fieldset>

		</div>
	</body>
</html>
