<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form class="form-horizontal" action='' method="POST">
  <fieldset>
    <div id="legend">
      <legend class="">Register</legend>
    </div>
    <div class="control-group">
      <!-- Username -->
      <label class="control-label"  for="username">Username</label>
      <div class="controls">
        <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
        <p class="help-block">Username can contain any letters or numbers, without spaces</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="email">E-mail</label>
      <div class="controls">
        <input type="text" id="email" name="email" placeholder="" class="input-xlarge">
        <p class="help-block">Please provide your E-mail</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password-->
      <label class="control-label" for="password">Password</label>
      <div class="controls">
        <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
        <p class="help-block">Password should be at least 4 characters</p>
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="password_confirm">Password (Confirm)</label>
      <div class="controls">
        <input type="password" id="password_confirm" name="password_confirm" placeholder="" class="input-xlarge">
        <p class="help-block">Please confirm password</p>
      </div>
    </div>
    
    <legend class="">Pick-up Address</legend>
    </div>
    <div class="control-group">
      <!-- Username -->
      <label class="control-label"  for="bill.streetName">Street Name</label>
      <div class="controls">
        <input type="text" id="bill.streetName" name="bill.streetName" placeholder="" class="input-xlarge">
       
      </div>
    </div>
 
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="bill.apartNo">Apartment No.</label>
      <div class="controls">
        <input type="text" id="bill.apartNo" name="bill.apartNo" placeholder="" class="input-xlarge">
       
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password-->
      <label class="control-label" for="bill.city">City</label>
      <div class="controls">
        <input type="text" id="bill.city" name="bill.city" placeholder="" class="input-xlarge">
       
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="bill.state">State</label>
      <div class="controls">
        <input type="text" id="bill.state" name="bill.state" placeholder="" class="input-xlarge">
       
      </div>
    </div>
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="bill.country">Country</label>
      <div class="controls">
        <input type="text" id="bill.country" name="bill.country" placeholder="" class="input-xlarge">
       
      </div>
    </div>
    
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="bill.zipcode">Zipcode</label>
      <div class="controls">
        <input type="text" id="bill.zipcode" name="bill.zipcode" placeholder="" class="input-xlarge">
       
      </div>
    </div>
    
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="bill.zipcode">Zipcode</label>
      <div class="controls">
        <input type="text" id="bill.zipcode" name="bill.zipcode" placeholder="" class="input-xlarge">
             </div>
    </div>
 
 
 
 <legend class="">Pick-up Address</legend>
    </div>
    <div class="control-group">
      <!-- Username -->
      <label class="control-label"  for="bill.streetName">Street Name</label>
      <div class="controls">
        <input type="text" id="bill.streetName" name="bill.streetName" placeholder="" class="input-xlarge">
       
      </div>
    </div>
 
    <div class="control-group">
      <!-- E-mail -->
      <label class="control-label" for="bill.apartNo">Apartment No.</label>
      <div class="controls">
        <input type="text" id="bill.apartNo" name="bill.apartNo" placeholder="" class="input-xlarge">
       
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password-->
      <label class="control-label" for="bill.city">City</label>
      <div class="controls">
        <input type="text" id="bill.city" name="bill.city" placeholder="" class="input-xlarge">
       
      </div>
    </div>
 
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="bill.state">State</label>
      <div class="controls">
        <input type="text" id="bill.state" name="bill.state" placeholder="" class="input-xlarge">
       
      </div>
    </div>
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="bill.country">Country</label>
      <div class="controls">
        <input type="text" id="bill.country" name="bill.country" placeholder="" class="input-xlarge">
       
      </div>
    </div>
    
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="bill.zipcode">Zipcode</label>
      <div class="controls">
        <input type="text" id="bill.zipcode" name="bill.zipcode" placeholder="" class="input-xlarge">
       
      </div>
    </div>
    
    <div class="control-group">
      <!-- Password -->
      <label class="control-label"  for="bill.zipcode">Zipcode</label>
      <div class="controls">
        <input type="text" id="bill.zipcode" name="bill.zipcode" placeholder="" class="input-xlarge">
       
      </div>
    </div>
 
 
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
        <button class="btn btn-success">Register</button>
      </div>
    </div>
  </fieldset>
</form>
</body>
</html>