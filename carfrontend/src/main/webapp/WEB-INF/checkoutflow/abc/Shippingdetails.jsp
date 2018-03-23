<!DOCTYPE html>
<html lang="en">
<head>
  <title>carzoo</title>
  <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
body {
    background-image: url("resources/carrental/bg1.jpg");
   
      /* Full height */
    height: 100%; 

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    }

</style>
</head>
<body>
<div class="container">
  <div class="jumbotron">
    

	<form:form modelAttribute="order">

		<h3>DropDown Address</h3>

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
</div>
</body>
</html>