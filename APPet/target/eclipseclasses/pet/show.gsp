
<%@ page import="appet.Pet" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pet.label', default: 'Pet')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-pet" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-pet" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list pet">
			
				<g:if test="${petInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="pet.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${petInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.bornDate}">
				<li class="fieldcontain">
					<span id="bornDate-label" class="property-label"><g:message code="pet.bornDate.label" default="Born Date" /></span>
					
						<span class="property-value" aria-labelledby="bornDate-label"><g:formatDate date="${petInstance?.bornDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="pet.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:fieldValue bean="${petInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.species}">
				<li class="fieldcontain">
					<span id="species-label" class="property-label"><g:message code="pet.species.label" default="Species" /></span>
					
						<span class="property-value" aria-labelledby="species-label"><g:fieldValue bean="${petInstance}" field="species"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.breed}">
				<li class="fieldcontain">
					<span id="breed-label" class="property-label"><g:message code="pet.breed.label" default="Breed" /></span>
					
						<span class="property-value" aria-labelledby="breed-label"><g:fieldValue bean="${petInstance}" field="breed"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.color}">
				<li class="fieldcontain">
					<span id="color-label" class="property-label"><g:message code="pet.color.label" default="Color" /></span>
					
						<span class="property-value" aria-labelledby="color-label"><g:fieldValue bean="${petInstance}" field="color"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.microchip}">
				<li class="fieldcontain">
					<span id="microchip-label" class="property-label"><g:message code="pet.microchip.label" default="Microchip" /></span>
					
						<span class="property-value" aria-labelledby="microchip-label"><g:formatBoolean boolean="${petInstance?.microchip}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.clinicHistory}">
				<li class="fieldcontain">
					<span id="clinicHistory-label" class="property-label"><g:message code="pet.clinicHistory.label" default="Clinic History" /></span>
					
						<span class="property-value" aria-labelledby="clinicHistory-label"><g:link controller="clinicHistory" action="show" id="${petInstance?.clinicHistory?.id}">${petInstance?.clinicHistory?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.owner}">
				<li class="fieldcontain">
					<span id="owner-label" class="property-label"><g:message code="pet.owner.label" default="Owner" /></span>
					
						<span class="property-value" aria-labelledby="owner-label"><g:link controller="client" action="show" id="${petInstance?.owner?.id}">${petInstance?.owner?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.photo}">
				<li class="fieldcontain">
					<span id="photo-label" class="property-label"><g:message code="pet.photo.label" default="Photo" /></span>
					
						<span class="property-value" aria-labelledby="photo-label"><g:link controller="historyClinicFile" action="show" id="${petInstance?.photo?.id}">${petInstance?.photo?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.signals}">
				<li class="fieldcontain">
					<span id="signals-label" class="property-label"><g:message code="pet.signals.label" default="Signals" /></span>
					
						<span class="property-value" aria-labelledby="signals-label"><g:fieldValue bean="${petInstance}" field="signals"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${petInstance?.vaccionationRecord}">
				<li class="fieldcontain">
					<span id="vaccionationRecord-label" class="property-label"><g:message code="pet.vaccionationRecord.label" default="Vaccionation Record" /></span>
					
						<span class="property-value" aria-labelledby="vaccionationRecord-label"><g:link controller="vaccinationRecord" action="show" id="${petInstance?.vaccionationRecord?.id}">${petInstance?.vaccionationRecord?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:petInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${petInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
