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
<form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
 <table align="center">
 <p>User Details</p>
  <tr>
   <td>
   <p>User Details</p>
    <form:label path="username">Name</form:label>
     </td> 
     <td> 
     <form:input path="username" name="username" id="username" /> 
    </td>
    </tr>
     
       <tr> 
     <td>
  <form:label path="phone">Phone</form:label>
     </td>
   <td>
 <form:input path="phone" name="phone" id="phone" />
   </td>
   </tr>
  
    
       <tr> 
         <td>
     <form:label path="email">Email</form:label>
         </td>
          <td>
      <form:input path="email" name="email" id="email" />
        </td>
       </tr>
    <p>Pickup Address</p>
    <tr>
    <td>
    <form:label path="apartNo">Apartment No.</form:label>
    </td>
    <td>
    <form:input path="apartNo" name="bill.apartno" id="apartNo"  />
    </td>
    </tr>
    
    <tr>
    <td>
    <form:label path="address">Street Name</form:label>
    </td>
    <td>
    <form:input path="streetName" name="bill.streetName" id="streetName" placeholder="W 123 Street" />
    </td>
    </tr>
    <tr>
    <td>
    <form:label path="zipcode">Zipcode</form:label>
    </td>
    <td>
    <form:input path="zipcode" name="bill.zipcode" id="zipcode" />
    </td>
    </tr>
     <tr>
    <td>
    <form:label path="city">City</form:label>
    </td>
    <td>
    <form:input path="city" name="bill.city" id="city" />
    </td>
    </tr>
    <tr>
    <td>
    <form:label path="country">Country</form:label>
    </td>
    <td>
    <form:input path="country" name="bill.country" id="country" />
    </td>
    </tr>
    
    <p>Drop-down Address</p>
     <tr>
    <td>
    <form:label path="apartNo">Apartment No.</form:label>
    </td>
    <td>
    <form:input path="apartNo" name="bill.apartno" id="apartNo"  />
    </td>
    </tr>
    
    <tr>
    <td>
    <form:label path="address">Street Name</form:label>
    </td>
    <td>
    <form:input path="streetName" name="bill.streetName" id="streetName" placeholder="W 123 Street" />
    </td>
    </tr>
    <tr>
    <td>
    <form:label path="zipcode">Zipcode</form:label>
    </td>
    <td>
    <form:input path="zipcode" name="bill.zipcode" id="zipcode" />
    </td>
    </tr>
     <tr>
    <td>
    <form:label path="city">City</form:label>
    </td>
    <td>
    <form:input path="city" name="bill.city" id="city" />
    </td>
    </tr>
    <tr>
    <td>
    <form:label path="country">Country</form:label>
    </td>
    <td>
    <form:input path="country" name="bill.country" id="country" />
    </td>
    </tr>
    
    <tr>
   <td>
   </td>
  <td> 
    <form:button id="register" name="register">Register</form:button>
    </td>
   </tr>
   <tr>
    </tr> 
      <tr>
     <td>
     </td> 
      <td>
    
       </td>
       </tr>
        </table>
      </form:form>
</body>
</html>