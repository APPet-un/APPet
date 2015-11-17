<%@ page import="appet.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="user.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" required="" value="${userInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="user.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${userInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'telephone', 'error')} required">
	<label for="telephone">
		<g:message code="user.telephone.label" default="Telephone" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="telephone" type="number" value="${userInstance.telephone}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'mobilPhone', 'error')} required">
	<label for="mobilPhone">
		<g:message code="user.mobilPhone.label" default="Mobil Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="mobilPhone" type="number" value="${userInstance.mobilPhone}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="user.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${userInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'emailUser', 'error')} required">
	<label for="emailUser">
		<g:message code="user.emailUser.label" default="Email User" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="emailUser" required="" value="${userInstance?.emailUser}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" required="" value="${userInstance?.password}"/>

</div>

