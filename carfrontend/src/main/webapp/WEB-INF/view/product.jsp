<%@include file="Header.jsp"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>  
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sh" %>  
<html>
<head>
    <meta charset="utf-8">
    <title>Bootstrap Navbar and Slider Overlay Text - Bootsnipp.com</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
   </style>
</head>
<body>
<br>
<br>
<br>
<sp:form action="${pageContext.request.contextPath }/addProduct" method="POST" modelAttribute="product" enctype="Multipart/form-data">
<c:if test="${not empty product.proNm}">
Product ID    <sp:input path="proRn" readOnly="true" disabled="true"/>
<sp:hidden path="proRn"/>
</c:if>

 <t>Product Name  <sp:input path="proNm"/><t>
 <br>
 <br>
<t>Product Description  <sp:input path="proType"/><t>
<br>
<br>
<t>Product Cost <sp:input path="proCost"/><t><t><t><t>
<br>
<br>
<t>Quantity<sp:input path="quantity"/><t>
<br>
<br>
Choose Image <sp:input type="file" path="image" /><t><t><t><t>

<sh:select path="brandId">
<sh:option value="select">choose car brand</sh:option>
<c:forEach items ="${brandList}" var="c">
<sh:option value="${c.brandId}"></sh:option>
</c:forEach>
</sh:select>

<sh:select path="categoryId">
<sh:option value="select">choose car category</sh:option>
<c:forEach items ="${categoryList}" var="b">
<sh:option value="${b.catId}"></sh:option>
</c:forEach>
</sh:select> 


 <c:if test="${empty product.proNm}">
        <sp:button class="btn btn-success" value="submit">Register</sp:button>
    </c:if>
    <c:if test="${not empty product.proNm}">
        <sp:button class="btn btn-success" value="submit">Update</sp:button>
    </c:if>
  
</sp:form>
<br>
<br>
<br>

<c:if test="${not empty productList}">
<table width="50%" border="1">
<tr>
<th>Category ID</th><th>Car Name</th><th>Product Description</th><th>Product Cost</th><th>Image</th><th>Action</th>
</tr>
<tr>
<c:forEach items="${productList}" var="c">
<tr>
<td>${c.brandId}</td>
<td>${c.categoryId}</td>
<td>${c.proType}</td>
<td>${c.proCost}</td>

<td><img src="${pageContext.request.contextPath }/Resources/carrental/${c.proRn}.jpg" style="height:120px;width:150px;"/></td>
<td><a href="<c:url value='updateProduct/${c.proRn}'/>">Edit/<a href="<c:url value='deleteProduct/${c.proRn}'/>">Delete</a></a>
</tr>
</c:forEach>
</tr>
</table>
</c:if>
</body>
</html>