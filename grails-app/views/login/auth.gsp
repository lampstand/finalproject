<html>

<head>
<link rel="shortcut icon" href="${resource(dir: 'images', file: 'icon.ico')}" type="image/x-icon">
<title>Login</title>
<link rel="stylesheet" href="${resource(dir: 'css', file: 'style.css')}" type="text/css">
</head>
<body>
<div class="login s2ui_center ui-corner-all" style='text-align:center;'>
    <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form action='${postUrl}' method='POST' id="loginForm" name="loginForm" autocomplete='off'> 
                                <h1>Log in</h1> 
                                <p> 
                                    
                                    <label for="username" class="uname" data-icon="u" > Your email or username </label>
                                    <input id="username" name="j_username" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="j_password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox"  id="loginkeeping" name="${rememberMeParameter}" /> 
									<label for="loginkeeping">Keep me logged in</label>
                                                                        <g:link controller='register' action='forgotPassword'><g:message code='spring.security.ui.login.forgotPassword'/></g:link>
								</p>
                                <p class="login button"> 
                                    <input name="submitLogin" type="submit" value="Login" /> 
				</p>

                            </form>
                        </div>
</div>

<script>
$(document).ready(function() {
	$('#username').focus();
});



</script>

</body>
</html>

