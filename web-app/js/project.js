function menu(){
	
	var str = '<nav id="cbp-hrmenu" class="cbp-hrmenu">';
	str += '<ul>';
	str += '<li>';
	str += '<a href="#">Membership</a>';
	str += '<div class="cbp-hrsub">';
	str += '<div class="cbp-hrsub-inner"> ';
	str += '<div>';
	str += '<ul>';
	str += '<li><g:link action=\'create\' controller=\'member\'>New Member</g:link></li>';
	str += '<li><%= link(action:\'index\',controller:\'member\') { \'List Members\' }%></li>';
	str += '<li><%= link(action:\'find\',controller:\'members\') { 'Search for Member' }%></li>';
	str += '</ul>';
	str += '</div>';
	str += '</div><!-- /cbp-hrsub-inner -->';
	str += '</div><!-- /cbp-hrsub -->';
	str += '</li>';
	str += '<li>';
	str += '<a href="#">Offering and Tithes</a>';
	str += '<div class="cbp-hrsub">';
	str += '<div class="cbp-hrsub-inner">';
	str += '<div>';
	str += '<h4>Offering</h4>';
	str += '<ul>';
	str += '<li><g:link action=\'create\',controller=\'offering\'>Create Offering</g:link></li>';
	str += '<li><%= link(action:\'index\',controller:\'offering\') { \'List Offering\' }%></li>';
	str += '<li><%= link(action: \'search\', controller: \'offering\'){\'Search Offering\'} %></li>';
	str += '</ul>';
	str += '</div>';
	str += '<div>';
	str += '<h4>Tithes</h4>';
	str += '<ul>';
	str += '<li><%= link(action: \'create\', controller: \'tithe\'){\'Member Tithe\'} %></li>';
	str += '<li><%= link(action:'create',controller:'tithePayment') { 'Tithe Payments' }%></li>';
	str += '<li><%= link(action:'create',controller:'tithePayment') { 'Tithe Payments' }%></li>';
	str += '<li><%= link(action: 'searchPayments', controller: 'tithePayment') {'Search Payment'} %></li>';
	str += '</ul>';
	str += '</div>';
	str += '</div>';
	str += '</div>';
	str += '</li>';
	str += '<li>';
	str += '<a href="#">Pledges</a>';
	str += '<div class="cbp-hrsub">';
	str += '<div class="cbp-hrsub-inner"> ';
	str += '<div>';
	str += '<h4>Pledge</h4>';
	str += '<li><%= link(action: 'create', controller: 'pledge'){'Create New Pledge'} %></li>';
	str += '<li><%= link(action:'list',controller:'pledge') { 'List Pledge\'s' }%></li>';
	str += '</ul>';
	str += '</div>';
	str += '<li>';
	str += '<a href="#">Tools</a>';
	str += '<div class="cbp-hrsub">';
	str += '<div class="cbp-hrsub-inner"> ';
	str += '<div>';
	str += '<h4>Attendance</h4>';
	str += '<ul>';
	str += '<li><%= link(action: 'create',controller: 'attendance') {'Add Attendance'}%></li>';
	str += '<li><%= link(action: 'index',controller: 'attendance') {'List Attendance'}%></li>';
	str += '<li><%= link(action: 'search',controller: 'attendance') {'Search Attendance'}%></li>';
	str += '</ul>';
	str += '</div>';
	str += '<div>';
	str += '<h4>Guest</h4><ul>';
	str += '<li><%= link(action: 'create',controller: 'guest') {'Add New Guest'}%></li>';
	str += '<li><%= link(action: 'index',controller: 'guest') {'List Guest'}%></li>';
	str += '<li><%= link(action: 'search',controller: 'guest') {'Search Guest'}%></li>';
	str += '</ul>';
	str += '</div>	';
	str += '</div>';
	str += '</div>';
	str += '</li>';
	str += '<sec:ifLoggedIn>';
	str += '<li>';
	str += '<a href="#">Administrator</a>';
	str += '<div class="cbp-hrsub">';
	str += '<div class="cbp-hrsub-inner">';
	str += '<div>';
	str += '</div>';
	str += '</div>';
	str += '</li>';
	str += '</sec:ifLoggedIn>';
	str += '</ul>';
	str += '</nav>';	

	document.write(str);
}