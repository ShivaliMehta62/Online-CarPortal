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
    <h1>Billing details</h1>      
    
 
      

	<form:form modelAttribute="order">

		<h3>Personal Info</h3>

		<div class="col-xs-3">
			<label for="name">Name</label>
			<form:input path="user.userName" id="username" class="form-control" rows="4" />
		</div>
<br>
<br>
<br>
<br>
		<div class="col-xs-3">
			<label for="email">Email</label>
			<form:input path="user.userEmail" id="email" class="form-control" />
		</div>

		<br>
		<br>
		<br><br>

		<h3>Billing Address</h3>

<br>
		<div class="col-xs-4">
			<label for="billingstreetName">Street Name</label>
			<form:input path="user.billing.bstreetName"
				id="bStreetname" class="form-control" />
		</div>
<br>
<br>
<br>
<br>
		<div class="col-xs-4">
			<label for="billingApartmentNumber">Apartment Number</label>
			<form:input path="user.billing.bapartNo"
				id="bapartNo" class="form-control" />
		</div>
<br>
<br>
<br>
<br>
		<div class="col-xs-4">
			<label for="billingcity">City</label>
			<form:input path="user.billing.bcity" id="bcity"
				class="form-control" />
		</div>
<br>
<br>
<br>
<br>
		<div class="col-xs-4">
			<label for="billingstate">State</label>
			<form:input path="user.billing.bstate" id="bstate"
				class="form-control" />
		</div>
<br>
<br>
<br>
<br>
		<div class="col-xs-4">
			<label for="billingcountry">Country</label>
			<form:input path="user.billing.bcountry"
				id="bcountry" class="form-control" />
		</div>
<br>
<br>
<br>
<br>
		<div class="col-xs-4">
			<label for="billingzipcode">Zipcode</label>
			<form:input path="user.billing.bzipcode" id="bzipcode"
				class="form-control" />
		</div>

		<input type="hidden" name="_flowExecutionKey" />

		<br>
		<br>
		<br><br><br>
		<input type="submit" value="Next" align="center" class="btn btn-outline-primary"
			name="_eventId_customerInfoCollected" />
		<button class="btn btn-default" align="center" name="_eventId_cancel">Cancel</button>
	</form:form>
</div>
</div>
 </body>