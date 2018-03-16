<%@include file="header1.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="space"></div>
<div class="container">
	<h2 class="heading-one">Shipping Details</h2>

	<form:form modelAttribute="order">

		<h3>Shipping Address</h3>

		<div class="form-group">
			<label for="shippingStreet">Street Name</label>
			<form:input path="user.shipping.streetName"
				id="shippingStreet" class="form-control" />
		</div>

		<div class="form-group">
			<label for="shippingApartmentNumber">Apartment Number</label>
			<form:input path="user.shipping.apartNo"
				id="shippingApartmentNumber" class="form-control" />
		</div>

		<div class="form-group">
			<label for="shippingCity">City</label>
			<form:input path="user.shipping.city"
				id="shippingCity" class="form-control" />
		</div>

		<div class="form-group">
			<label for="shippingState">State</label>
			<form:input path="user.shipping.state"
				id="shippingState" class="form-control" />
		</div>

		<div class="form-group">
			<label for="shippingCountry">Country</label>
			<form:input path="user.shipping.country"
				id="shippingCountry" class="form-control" />
		</div>

		<div class="form-group">
			<label for="shippingZip">Zipcode</label>
			<form:input path="user.shipping.zipcode"
				id="shippingZip" class="form-control" />
		</div>

		<input type="hidden" name="_flowExecutionKey" />

		<br>
		<br>
		<button class="btn btn-outline-warning"
			name="_eventId_backToCollectCustomerInfo">Back</button>
		<input type="submit" value="Next" class="btn btn-outlint-primary"
			name="_eventId_shippingDetailCollected" />
		<button class="btn btn-default" name="_eventId_cancel">Cancel</button>
	</form:form>

</div>

