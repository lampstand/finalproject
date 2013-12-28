<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>CSCIE56 Final Project - Church Management System</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'icon.ico')}" type="image/x-icon">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'default.css')}" type="text/css">
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'component.css')}" type="text/css">
		<g:javascript library="jquery" />
		<g:javascript src="project.js"/>
		<g:layoutHead/>
		<r:layoutResources />
	</head>
	<body>
		<div class="appHeader">
		<span>CSCIE56 Final Project 2013</span>
		<span id="appName">
		<sec:ifLoggedIn> 
		Welcome ! <sec:loggedInUserInfo field="username"/>
		&nbsp;&nbsp; | &nbsp;&nbsp;</sec:ifLoggedIn>
		Church Management System&nbsp;&nbsp;<sec:ifLoggedIn>|&nbsp;&nbsp; <g:link controller='logout'>Logout</g:link>&nbsp;&nbsp;</sec:ifLoggedIn></span>
		</div>
		<div class="header">

		<nav id="cbp-hrmenu" class="cbp-hrmenu">
					<ul>
						<li>
							<a href="#">Membership</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div>
										<ul>
											<li><g:link action='create' controller='member'>New Member</g:link></li>
											<li><g:link controller='member' action='index'>List Members</g:link></li>
											<li><g:link controller='member' action='find'>Search for Member</g:link></li>
										</ul>
									</div>
								</div>
							</div>
						</li>
						<li>
							<a href="#">Offering and Tithes</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner">
									<div>
										<h4>Offering</h4>
										<ul>
											<li><g:link action='create' controller='offering'>Create Offering</g:link></li>
											<li><g:link action='index' controller='offering'>List Offering</g:link></li>
											<li><g:link action='search' controller='offering'>Search Offering</g:link></li>
										</ul>
									</div>
									<div>
										<h4>Tithes</h4>
										<ul>
											<li><g:link action='create' controller='tithe'>Member Tithe</g:link></li>
											<li><g:link action='create' controller='tithePayment'>Tithe Payments</g:link></li>
											<li><g:link action='searchPayments' controller='tithePayment'>Search Payment</g:link></li>
										</ul>
									</div>									
								</div>
							</div>
						</li>
						<li>
							<a href="#">Tools</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>Attendance</h4>
										<ul>
											<li><g:link controller='attendance' action='create'>Add Attendance</g:link></li>
											<li><g:link controller='attendance' action='index'>List Attendance</g:link></li>
											<li><g:link controller='attendance' action='search'>Search Attendance</g:link></li>
										</ul>
									</div>
									<div>
										<h4>Guest</h4>
										<ul>
										<li><g:link controller="guest" action="index">List Guest</g:link></li>
										</ul>
									</div>									
								</div>
							</div>
						</li>
						<sec:ifLoggedIn>
						<li>
							<a href="#">Administrator</a>
							<div class="cbp-hrsub">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>Users</h4>
										<ul>
											<li><g:link controller="user" action="create">Add New Users</g:link></li>
											<li><g:link controller="user" action="search">Search Users</g:link></li>
										</ul>
										
									</div>
									<div>
										<h4>User Roles</h4>
										<ul>
										<li><g:link controller="role" action="create">Create Roles</g:link></li>
										<li><g:link controller="role" action="search">Add New Users</g:link></li>
										</ul>
										
									</div>
									
								</div>
							</div>
						</li>
						</sec:ifLoggedIn>
					</ul>
				</nav>
				</div>
				
		<div class="container">
		<div class="gap_50"></div>
		<g:layoutBody/>
		</div>
		
		<div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
		<g:javascript library="application"/>
		<g:javascript src="cbpHorizontalMenu.js"/>
				<script>
			$(function() {
				cbpHorizontalMenu.init();
			});
		</script>
		<r:layoutResources />
		<g:javascript src='jquery/jquery.jgrowl.js' plugin='spring-security-ui'/>
<g:javascript src='jquery/jquery.checkbox.js' plugin='spring-security-ui'/>
<g:javascript src='spring-security-ui.js' plugin='spring-security-ui'/>
	</body>
	<div class="footer">Copyright &copy; 2013. All Rights Reserved for Hubert Kyeremateng Boateng</div>
</html>
