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
 <table align="center">
 <p>login</p>
  <tr>
   <td>
   <form:label path="username">Username</form:label>
     </td> 
     <td> 
     <form:input path="username" name="username" id="username" /> 
    </td>
    </tr>
     <tr>
   <td>
   <form:label path="password">Password</form:label>
     </td> 
     <td> 
     <form:input path="password" name="password" id="password" /> 
    </td>
    </tr>
    <tr>
    <td>
    <form:checkbox path="remember" value="remember"/>Remember me
    </td>
    </tr>
    
     
 
</body>
</html>