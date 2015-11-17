
<%@ page import="appet.Pet" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pet.label', default: 'Pet')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-pet" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-pet" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'pet.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="bornDate" title="${message(code: 'pet.bornDate.label', default: 'Born Date')}" />
					
						<g:sortableColumn property="gender" title="${message(code: 'pet.gender.label', default: 'Gender')}" />
					
						<g:sortableColumn property="species" title="${message(code: 'pet.species.label', default: 'Species')}" />
					
						<g:sortableColumn property="breed" title="${message(code: 'pet.breed.label', default: 'Breed')}" />
					
						<g:sortableColumn property="color" title="${message(code: 'pet.color.label', default: 'Color')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${petInstanceList}" status="i" var="petInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${petInstance.id}">${fieldValue(bean: petInstance, field: "name")}</g:link></td>
					
						<td><g:formatDate date="${petInstance.bornDate}" /></td>
					
						<td>${fieldValue(bean: petInstance, field: "gender")}</td>
					
						<td>${fieldValue(bean: petInstance, field: "species")}</td>
					
						<td>${fieldValue(bean: petInstance, field: "breed")}</td>
					
						<td>${fieldValue(bean: petInstance, field: "color")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${petInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
