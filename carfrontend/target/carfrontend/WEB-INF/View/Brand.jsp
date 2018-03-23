<%@include file="Header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sh" %> 
<html>
<head>
    <meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>Bootstrap Navbar and Slider Overlay Text - Bootsnipp.com</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    <style type="text/css">
body {
    background-color: #C0C0C0;
}
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
   </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
<br>
<br>
<sp:form action="${pageContext.request.contextPath}/Brandadd" method="POST" modelAttribute="brand">
<c:if test="${not empty brand.brandName}">
Brand ID    <sp:input path="brandId" readOnly="true" disabled="true"/>
<sp:hidden path="brandId"/>
</c:if>
 <div class="form-group">
      <sh:label  path="brandName"><b>Brand Name:</b></sh:label>
      <sh:input class="form-control"  path="brandName" placeholder="Enter brand name" />
    </div>
     <div class="form-group">
      <sh:label  path="brandType"><b>Brand Desription:</b></sh:label>
      <sh:input class="form-control"  path="brandType" placeholder="Enter brand Type" />
    </div>





 <c:if test="${empty brand.brandName}">
        <sp:button class="btn btn-success" value="submit">Register</sp:button>
    </c:if>
    <c:if test="${not empty brand.brandName}">
        <sp:button class="btn btn-success" value="submit">Update</sp:button>
    </c:if>
  
</sp:form>
<br>
<br>
<br>

<c:if test="${not empty brandList}">
<table width="50%" border="1">
<tr>
<th>Brand ID</th><th>Brand Name</th><th>Brand Description</th><th>Action</th>
</tr>
<tr>
<c:forEach items="${brandList}" var="c">
<tr>
<td>${c.brandId}</td>
<td>${c.brandName}</td>
<td>${c.brandType}</td>


<td><a href="<c:url value='updateBrand/${c.brandId}'/>"><b>Edit/</b></a><a href="<c:url value='deleteBrand/${c.brandId}'/>"><b>Delete</b></a>
</tr>

</c:forEach>
</tr>
</table>
</c:if>

</body>
</html>

