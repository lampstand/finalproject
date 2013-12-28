<%@ page import="edu.harvard.cscie56.Member" %>
<html>

<head>
	<meta name='layout' content='main'/>
	<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}"/>
	<title><g:message code="default.create.label" args="[entityName]"/></title>
	<r:require modules="spring-security-ui"/>
</head>

<body class="container">
<div class="gap_50"></div>
<g:if test="${flash.message }">
<div class="messages">
${flash.message }
</div>
</g:if>
<section class="lampstand-wrapper">
    <h1>Create New User</h1>
<g:form action="save" name='userCreateForm' class="lampstand-form">
<div class="lampstand-outer lampstand-required" >
	<div class="lampstand-inner">
		<label for="member">Member Name:</label> 
                <g:select name="member" from="${Member.list() }"optionKey="id" optionValue="fullname"/>
	</div>
</div>
<div class="lampstand-outer lampstand-required" >
	<div class="lampstand-inner">
		<label for="username">Username:</label>
               <input type="text" name="username" id="email" required size="50" value="${user?.username}">
	</div>
</div>
<div class="lampstand-outer lampstand-required" >
	<div class="lampstand-inner">
		<label for="password">Password:</label>
               <input type="text" name="password" id="email" required size="50" value="${user?.password}">
	</div>
</div>
<div class="lampstand-outer lampstand-required" >
	<div class="lampstand-inner">
		<label for="enabled">Enabled:</label>
               <g:checkBox name="enabled" value="${user?.enabled}"/>
	</div>
</div>
<div class="lampstand-outer lampstand-required" >
	<div class="lampstand-inner">
		<label for="enabled">Account Expired:</label>
               <g:checkBox name="accountExpired" value="${user?.accountExpired}"/>
	</div>
</div>
<div class="lampstand-outer lampstand-required" >
	<div class="lampstand-inner">
		<label for="enabled">Account Locked:</label>
               <g:checkBox name="accountLocked" value="${user?.accountLocked}"/>
	</div>
</div>
<div class="lampstand-outer lampstand-required" >
	<div class="lampstand-inner">
		<label for="enabled">Password Expired:</label>
               <g:checkBox name="passwordExpired" value="${user?.passwordExpired}"/>
	</div>
</div>
<g:each var="auth" in="${authorityList}">
<div class="lampstand-outer lampstand-required" >
	<div class="lampstand-inner">
            
		<label for="enabled"><g:link controller='role' action='edit' id='${auth.id}'>${auth.authority.encodeAsHTML()}:</g:link></label>
                    <g:checkBox name="${auth.authority}" />
	</div>
</div>
</g:each>
<input type="submit" value="Create User" />

   </g:form>
    </section>

</body>
</html>
