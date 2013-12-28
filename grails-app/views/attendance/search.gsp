<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'guest.label', default: 'Guest')}" />
		<title>Search Guest</title>
		        <link rel="stylesheet" href="${resource(dir: 'css', file: 'classic.css')}" type="text/css">
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'classic.date.css')}" type="text/css">
	</head>
	<body>
		<div>
			<div>

			</div>			
                        <div class="lampstand-inner">
                            <g:form name="searchattendance" url="[controller: 'attendance', action:'searchAttendance']">
                            <label for="searchdate">Attendance Date:</label>
                            <g:datePicker name="serviceDate" precision="day"value="${attendanceInstance?.serviceDate}" relativeYears="[-2..7]"default="${new Date()}"/>
                            <input type="submit" value="Search Attendance">
                        </div>
                            </g:form>
                        <div id="attendance">
                            
                            <g:if test="${attendancesInstance}">
                                <h1>Search Results</h1>
                                <hr>
                                <table>
				<thead>
					<tr>
					
						<g:sortableColumn property="service" title="${message(code: 'attendance.adultsNumber.label', default: 'Service Name')}" />
					
						<g:sortableColumn property="serviceDate" title="${message(code: 'attendance.childrenNumber.label', default: 'Service Date')}" />
					
						<g:sortableColumn property="memberNumber" title="${message(code: 'attendance.memberNumber.label', default: 'Member Number')}"  />
					
						<g:sortableColumn property="guestNumber" title="${message(code: 'attendance.guestNumber.label', default: 'Guest Number')}" />
						<th>Show</th>
						<th>Edit</th>
						<th>Add Guest Info</th>
					</tr>
				</thead>
				<tbody>
				<g:each in="${attendancesInstance}" status="i" var="attendanceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td>${fieldValue(bean: attendanceInstance, field: "service")}</td>
					
						<td><g:formatDate format="E, MMMM dd yyyy" style="LONG" date="${attendanceInstance?.serviceDate}" /></td>
					
						<td>${fieldValue(bean: attendanceInstance, field: "memberNumber")}</td>
					
						<td>${fieldValue(bean: attendanceInstance, field: "guestNumber")}</td>
					
						<td><g:link action="show" id="${attendanceInstance.id}">Show</g:link></td>
						<td><g:link action="edit" id="${attendanceInstance.id}">Edit</g:link></td>
						<td><g:link action="addGuest" id="${attendanceInstance.id}">Add Guest</g:link></td>
					</tr>
				</g:each>
				</tbody>
			</table>
                        </g:if>
                        </div>
		</div>
         </body>
 </html>
               
