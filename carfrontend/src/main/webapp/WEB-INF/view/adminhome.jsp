<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet">
     <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet">
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
     background-image: url("resources/carrental/bg4.jpg");
   
      /* Full height */
    height: 400%; 

    /* Center and scale the image nicely */
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    
    }
</style>
</head>

<body>
<div style="margin-top:90px;"/>
<ul>
 <li><a href="Brand" ><span class="glyphicon glyphicon-log-in"></span><strong><h4> Brand</h4></strong></a></li>
 <br>
  <li><a href="Category"><span class="glyphicon glyphicon-log-in"></span><strong><h4>Category</h4></strong></a></li>
  <br>
 <li><a href="Product"><span class="glyphicon glyphicon-log-in"></span><strong><h4>Product</h4></strong></a></li>
</ul>

 
</body>
 <%@include file="Footer.jsp" %>
</html>