<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>  
<%@include file="Header.jsp"%>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="utf-8">
    <title>Register</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/register.css" rel="stylesheet">
     <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    
</head>
<body>

 <div class="container">
    <div class="col-md-10">
   		 <div id="logbox">
     		 <sp:form id="signup" method="post" action="${pageContext.request.contextPath }/save" modelAttribute="user">
        <h1>Create An Account</h1>
        <br>
        
        <h2>User Details</h2>
        <sp:input path="userName" type="text" placeholder="What's your username?" pattern="^[\w]{3,16}$" autofocus="autofocus"  class="input pass"/>
       	<sp:errors path="userName"/>
        <br>
        <br>
        <sp:input path="userPassword" type="password" placeholder="Choose a password" required="required" class="input pass"/>
        <br>
        <br>
        <sp:input path="userEmail" type="email" placeholder="Email address" required="required" class="input pass"/>
        <br>
        <br>
        <br>
         <h2>DropDown Address</h2>
        <sp:input path="shipping.streetName"  id="orangeForm-location" type="text" placeholder="Street" required="required"  class="input pass"/>
        <br>
        <br>
        <sp:input path="shipping.apartNo" id="orangeForm-location1" type="text" placeholder="Aprt no." required="required" class="input pass"/>
        <br>
        <br>
        <sp:input path="shipping.city" id="orangeForm-location2" type="text" placeholder="City" required="required" class="input pass"/>
        <br>
        <br>
         	 <sp:input path="shipping.state" id="orangeForm-location3" type="text" placeholder="State" required="required" class="input pass" /><br>
      	 <br>
      	 <sp:input path="shipping.country" id="orangeForm-location4" type="text" placeholder="Country" required="required" class="input pass"/>
      	 <br>
      	 <br>
      	 <sp:input path="shipping.zipcode" id="orangeForm-location5" type="text" placeholder="Pin Code" required="required" class="input pass"/>
      	 <br>
      	 <br>
      	 <input type="checkbox" id="name" onclick="copyValue(this)"  > Same Address?Just Click Me
      	     	     
      	<br>
      	<br>
      	<br>
      	<h2>Pick up Address</h2>
       <sp:input path="billing.bstreetName"  id="orangeForm-location6" type="text" placeholder="Street" required="required"  class="input pass"/>
        <br>
        <br>
        <sp:input path="billing.bapartNo" id="orangeForm-location7" type="text" placeholder="Aprt no." required="required" class="input pass"/>
        <br>
        <br>
        <sp:input path="billing.bcity" id="orangeForm-location8" type="text" placeholder="City" required="required" class="input pass"/>
      	<br>
      	<br>
      	 <sp:input path="billing.bstate" id="orangeForm-location9" type="text" placeholder="State" required="required" class="input pass"/>
      	 <br>
      	 <br>
      	 <sp:input path="billing.bcountry" id="orangeForm-location10" type="text" placeholder="Country" required="required" class="input pass"/>
      	 <br>
      	 <br>
      	 <sp:input path="billing.bzipcode" id="orangeForm-location11" type="text" placeholder="Pin Code" required="required" class="input pass"/>
       <br>
       <br>
       <br>
       <br>
        <sp:button type="submit" value="Sign up" class="inputButton">Register</sp:button>
        <br>
        <br>
        <div class="text-center">
            already have an account? <a href="${pageContext.request.contextPath }/login" id="login_id">login</a>
        </div>
      </sp:form>
    </div>
   </div>
   </div>
   
  <script>
 
  
  $(function(){
	    $('#name').change(function(){
	    var newVal=$("#orangeForm-location").val();
	    var newVall=$("#orangeForm-location1").val();
	    var newValll=$("#orangeForm-location2").val();
	    var newVallll=$("#orangeForm-location3").val();
	    var newValllll=$("#orangeForm-location4").val();
	    var newVallllll=$("#orangeForm-location5").val();
	    
	    if (this.checked) {
	        $("#orangeForm-location6").val(newVal);
	        $("#orangeForm-location7").val(newVall);
	        $("#orangeForm-location8").val(newValll);
	        $("#orangeForm-location9").val(newVallll);
	        $("#orangeForm-location10").val(newValllll);
	        $("#orangeForm-location11").val(newVallllll);
	        
	    }
	    });
	});
 </script>
   </body>
</html>