<%@ page import="appet.Pet" %>



<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="pet.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${petInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'bornDate', 'error')} required">
	<label for="bornDate">
		<g:message code="pet.bornDate.label" default="Born Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="bornDate" precision="day"  value="${petInstance?.bornDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'gender', 'error')} required">
	<label for="gender">
		<g:message code="pet.gender.label" default="Gender" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="gender" from="${petInstance.constraints.gender.inList}" required="" value="${fieldValue(bean: petInstance, field: 'gender')}" valueMessagePrefix="pet.gender"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'species', 'error')} required">
	<label for="species">
		<g:message code="pet.species.label" default="Species" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="species" required="" value="${petInstance?.species}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'breed', 'error')} required">
	<label for="breed">
		<g:message code="pet.breed.label" default="Breed" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="breed" required="" value="${petInstance?.breed}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'color', 'error')} required">
	<label for="color">
		<g:message code="pet.color.label" default="Color" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="color" required="" value="${petInstance?.color}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'microchip', 'error')} ">
	<label for="microchip">
		<g:message code="pet.microchip.label" default="Microchip" />
		
	</label>
	<g:checkBox name="microchip" value="${petInstance?.microchip}" />

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'clinicHistory', 'error')} required">
	<label for="clinicHistory">
		<g:message code="pet.clinicHistory.label" default="Clinic History" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="clinicHistory" name="clinicHistory.id" from="${appet.ClinicHistory.list()}" optionKey="id" required="" value="${petInstance?.clinicHistory?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'owner', 'error')} required">
	<label for="owner">
		<g:message code="pet.owner.label" default="Owner" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="owner" name="owner.id" from="${appet.Client.list()}" optionKey="id" required="" value="${petInstance?.owner?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'photo', 'error')} required">
	<label for="photo">
		<g:message code="pet.photo.label" default="Photo" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="photo" name="photo.id" from="${appet.HistoryClinicFile.list()}" optionKey="id" required="" value="${petInstance?.photo?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'signals', 'error')} required">
	<label for="signals">
		<g:message code="pet.signals.label" default="Signals" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="signals" required="" value="${petInstance?.signals}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: petInstance, field: 'vaccionationRecord', 'error')} required">
	<label for="vaccionationRecord">
		<g:message code="pet.vaccionationRecord.label" default="Vaccionation Record" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="vaccionationRecord" name="vaccionationRecord.id" from="${appet.VaccinationRecord.list()}" optionKey="id" required="" value="${petInstance?.vaccionationRecord?.id}" class="many-to-one"/>

</div>

