<%@ page import="edu.harvard.cscie56.Tithe" %>

<div class="lampstand-outer lampstand-required">
	<div class="lampstand-inner">
		<label for="email">Church Member<span class="required-indicator">*</span></label>
<g:select id="member" name="member" from="${edu.harvard.cscie56.Member.list()}" optionKey="id" required="" optionValue="fullname" value="${titheInstance?.member?.fullname}" class="many-to-one"/>
	</div>
</div>
<div class="lampstand-outer lampstand-required">
	<div class="lampstand-inner">
		<label for="email">Tithe ID:<span class="required-indicator">*</span></label>
		 <input type="text"	id="titheID" required size="10"	name="titheID" value="${titheInstance?.titheID}">
	</div>
</div>





