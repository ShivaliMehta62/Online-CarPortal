<%@include file="Header.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
     
    <%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sh" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<title>Category</title>
</head>
<body>
<div class="container" style="margin-top:90px;">
<sh:form action="${pageContext.request.contextPath}/addCategory" method="POST" modelAttribute="category">
<c:if test="${not empty category.catName}">
ID<sh:input path="catId" readOnly="true" disabled="true"/>
<sh:hidden path="catId"/>
</c:if>
 
    <div class="form-group">
      <sh:label  path="catName">Car Name:</sh:label>
      <sh:input class="form-control"  path="catName" placeholder="Enter Car name" />
    </div>
      <div class="form-group">
      <sh:label  path="catDesc">Car category</sh:label>
      <sh:input class="form-control"  path="catDesc" placeholder="Enter car description" />
    </div>
<div>	
 <sh:label  path="brnds">Car Brands:</sh:label>	
 </br>

<sh:select path="brnds">
<sh:option value="select">----SELECT---</sh:option>
<c:forEach items ="${brandList}" var="c">

<sh:option value="${c.brandName}"></sh:option>

</c:forEach>
</sh:select>
</div> 
<br>
<br>
<br>
<br>

<td>
 <sh:button type="submit" class="btn btn-default">Submit</sh:button>
</td>
</sh:form>
</div>
<br>

<br>
<br>

<div class="container">
   
  <c:if test="${not empty categoryList}">
<table border=2 class="table table-striped" color="white-blue" >
<thead>
      <tr>
      <th>Car Name</th><th>Car Description</th><th>Action</th>
  		
  			
      
      </tr>
</thead>
<tbody>
<c:forEach items="${categoryList}" var="cat">
<tr>
<td>${cat.catName}</td>
<td>${cat.catDesc }</td>
<!--  <td>${cat.brnds}</td>-->
<td><a href="<c:url value='updateCategory/${cat.catId}'/>"><b>Edit/</b></a><a href="<c:url value='deleteCategory/${cat.catId}'/>"><b>Delete</b></a></td>
</tr>
</c:forEach>

</tbody>
</table>
</c:if>
    
  
</div>
 
<%@include file="Footer.jsp" %>

</body>
</html>