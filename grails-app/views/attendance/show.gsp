
<%@ page import="edu.harvard.cscie56.Attendance" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'attendance.label', default: 'Attendance')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-attendance" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
			<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-attendance" class="content scaffold-show" role="main">
			<h1> 
                				<g:if test="${attendanceInstance?.service}">
				<div class="fieldcontain">
                                    <span class="property-value" aria-labelledby="service-label">Attendance for <b><g:fieldValue bean="${attendanceInstance}" field="service"/></b> on <g:formatDate date="${attendanceInstance?.serviceDate}" type="date" style="LONG" /></span>
                                    
                                    <span class="property-value" aria-labelledby="serviceDate-label"></span>
				</div>
				</g:if>
                        </h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list attendance">
			
				<g:if test="${attendanceInstance?.adultsNumber}">
				<li class="fieldcontain">
					<span id="adultsNumber-label" class="property-label"><g:message code="attendance.adultsNumber.label" default="Adults Number" /></span>
					
                                        <span class="property-value" aria-labelledby="adultsNumber-label"><b><g:fieldValue bean="${attendanceInstance}" field="adultsNumber"/></b></span>
					
				</li>
				</g:if>
			
				<g:if test="${attendanceInstance?.childrenNumber}">
				<li class="fieldcontain">
					<span id="childrenNumber-label" class="property-label"><g:message code="attendance.childrenNumber.label" default="Children Number" /></span>
					
						<span class="property-value" aria-labelledby="childrenNumber-label"><g:fieldValue bean="${attendanceInstance}" field="childrenNumber"/></span>
					
				</li>
				</g:if>
			
		
			
				<g:if test="${attendanceInstance?.guestNumber}">
				<li class="fieldcontain">
					<span id="guestNumber-label" class="property-label"><g:message code="attendance.guestNumber.label" default="Guest Number" /></span>
					
						<span class="property-value" aria-labelledby="guestNumber-label"><g:fieldValue bean="${attendanceInstance}" field="guestNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${attendanceInstance?.memberNumber}">
				<li class="fieldcontain">
					<span id="memberNumber-label" class="property-label"><g:message code="attendance.memberNumber.label" default="Member Number" /></span>
					
						<span class="property-value" aria-labelledby="memberNumber-label"><g:fieldValue bean="${attendanceInstance}" field="memberNumber"/></span>
					
				</li>
				</g:if>
			</ol>
                        <g:if test="${guestInstance}">
			<h2>  Guest Information </h2>
                        <table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'guest.guestStatus.label', default: 'Guest Name')}" />
					
						<g:sortableColumn property="Phone Number" title="${message(code: 'guest.homePhone.label', default: 'Phone Number')}" />
					
						<g:sortableColumn property="email" title="${message(code: 'guest.email.label', default: 'Email')}" />
					
						<g:sortableColumn property="address" title="${message(code: 'guest.address.label', default: 'Address')}" />
					
						<g:sortableColumn property="guestStatus" title="${message(code: 'guest.address1.label', default: 'Guest Status')}" />
						<th>Service Name</th>
					</tr>
				</thead>
				<tbody>
				<g:each in="${guestInstance}" status="i" var="guestsInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${guestsInstance?.id}">${guestsInstance?.name}</g:link></td>
					
						<td>C:${guestsInstance?.mobilePhone}&nbsp;<br> H:${guestsInstance?.homePhone}</td>
					
						<td>${guestsInstance?.email}</td>
					
						<td>${guestsInstance?.address}&nbsp;${guestsInstance?.address1}&nbsp;<br>${guestsInstance?.city}&nbsp;${guestsInstance?.state}&nbsp;,${guestsInstance?.zip}</td>
					
						<td>${guestsInstance?.guestStatus}</td>
						<td>${guestsInstance?.comments}</td>
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${guestInstanceCount ?: 0}" />
			</div>
                        </g:if>
                        <g:else>
                        <div class="message">No Guest Information has being found for this Service Attendance. To Add Guest, please click here to</div>
                        </g:else>
			<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${attendanceInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
				</fieldset>

		</div>
	</body>
</html>
