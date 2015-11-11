
<%@ page import="appet.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'userCon.label', default: 'User')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-user" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="firstName" title="${message(code: 'userCon.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="lastName" title="${message(code: 'userCon.lastName.label', default: 'Last Name')}" />
					
						<g:sortableColumn property="telephone" title="${message(code: 'userCon.telephone.label', default: 'Telephone')}" />
					
						<g:sortableColumn property="mobilPhone" title="${message(code: 'userCon.mobilPhone.label', default: 'Mobil Phone')}" />
					
						<g:sortableColumn property="address" title="${message(code: 'userCon.address.label', default: 'Address')}" />
					
						<g:sortableColumn property="emailUser" title="${message(code: 'userCon.emailUser.label', default: 'Email User')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${userInstanceList}" status="i" var="userInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${userInstance.id}">${fieldValue(bean: userInstance, field: "firstName")}</g:link></td>
					
						<td>${fieldValue(bean: userInstance, field: "lastName")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "telephone")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "mobilPhone")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "address")}</td>
					
						<td>${fieldValue(bean: userInstance, field: "emailUser")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${userInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
