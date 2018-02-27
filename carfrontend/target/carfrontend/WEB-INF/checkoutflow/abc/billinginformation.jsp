<%@include file="/WEB-INF/View/Header.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<div class="space"></div>
<div class="container">
	<h2 class="heading-one">Billing Details</h2>

	<form:form modelAttribute="order">

		<h3>Personal Info</h3>

		<div class="form-group">
			<label for="name">Name</label>
			<form:input path="user.userName" id="username" class="form-control" />
		</div>

		<div class="form-group">
			<label for="email">Email</label>
			<form:input path="user.userEmail" id="email" class="form-control" />
		</div>

		

		<h3>Billing Address</h3>

		<div class="form-group">
			<label for="billingstreetName">Street Name</label>
			<form:input path="user.billing.bstreetName"
				id="bStreetname" class="form-control" />
		</div>

		<div class="form-group">
			<label for="billingApartmentNumber">Apartment Number</label>
			<form:input path="user.billing.bapartNo"
				id="bapartNo" class="form-control" />
		</div>

		<div class="form-group">
			<label for="billingcity">City</label>
			<form:input path="user.billing.bcity" id="bcity"
				class="form-control" />
		</div>

		<div class="form-group">
			<label for="billingstate">State</label>
			<form:input path="user.billing.bstate" id="bstate"
				class="form-control" />
		</div>

		<div class="form-group">
			<label for="billingcountry">Country</label>
			<form:input path="user.billing.bcountry"
				id="bcountry" class="form-control" />
		</div>

		<div class="form-group">
			<label for="billingzipcode">Zipcode</label>
			<form:input path="user.billing.bzipcode" id="bzipcode"
				class="form-control" />
		</div>

		<input type="hidden" name="_flowExecutionKey" />

		<br>
		<br>
		<input type="submit" value="Next" class="btn btn-outline-primary"
			name="_eventId_customerInfoCollected" />
		<button class="btn btn-default" name="_eventId_cancel">Cancel</button>
	</form:form>

</div>
