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
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/header.css">
   </style>
<title>Category</title>
</head>
<body>
<div class="container">
<sh:form action="${pageContext.request.contextPath}/addCategory" method="POST" modelAttribute="category">

<c:if test="${not empty category.catName}">
ID<sh:input path="catId" readOnly="true" disabled="true"/>
<sh:hidden path="catId"/>
</c:if>
 </div>
    <div class="form-group">
      <sh:label  path="catName"> Name:</sh:label>
      <sh:input class="form-control"  path="catName" placeholder="Enter your name" />
    </div>
    <div class="form-group">
      <sh:label  path="catAddress">Address:</sh:label>
      <sh:input class="form-control"  path="catAddress" placeholder="Enter your address" />
    </div>
    <div class="form-group">
      <sh:label  path="catPhone">Contact  details:</sh:label>
      <sh:input class="form-control"  path="catPhone" placeholder="Enter phone number" />
    </div>
    <div class="form-group">
      <sh:label  path="catEmail">Email Id:</sh:label>
      <sh:input class="form-control"  path="catEmail" placeholder="Enter your email id" />
    </div>
     <tr> 
         <td>
    <li class="dropdown">
                    <a class="dropdown-toggle"  data-toggle="dropdown" href="#">Car details <span class="caret"></span></a><p>choose your car type</p>
                    <ul class="dropdown-menu">
         </td>
      <ul>
			<li><a href="#" title="Hatchback">Hatchback</a>
				<ul>
					<li><a href="#" title="maruti">Maruti</a></li>
					<li><a href="#" title="datsun">Datsun</a></li>
					<li><a href="#" title="renault">Renault</a></li>
					<li><a href="#" title="tata">Tata</a></li>
					<li><a href="#" title="hyundai">Hyundai</a></li>
					<li><a href="#" title="other">Other</a></li>
				</ul>
                </ul>
			</li>
			
			 <ul>
			<li><a href="#" title="SUV">SUV</a>
				<ul>
					<li><a href="#" title="maruti">maruti</a></li>
					<li><a href="#" title="datsun">Datsun</a></li>
					<li><a href="#" title="renault">Renault</a></li>
					<li><a href="#" title="tata">Tata</a></li>
					<li><a href="#" title="hyundai">Hyundai</a></li>
					<li><a href="#" title="other">Other</a></li>
				</ul>
                </ul>
			</li>
			
			<ul>
			<li><a href="#" title="Sedan">SEDAN</a>
				<ul>
					<li><a href="#" title="maruti">maruti</a></li>
					<li><a href="#" title="datsun">Datsun</a></li>
					<li><a href="#" title="renault">Renault</a></li>
					<li><a href="#" title="tata">Tata</a></li>
					<li><a href="#" title="hyundai">Hyundai</a></li>
					<li><a href="#" title="other">Other</a></li>
				</ul>  
                </ul>
			</li>
		 <sh:button type="submit" class="btn btn-default">Submit</sh:button>
   </sh:form>
</div>
 

<div class="container">
   <p>table of category</p> 
  <c:if test="${not empty categoryList}">
<table border=1 class="table table-striped" >
<thead>
      <tr>
      <th>Name</th>
      <th>Contact Details</th>
      <th>Address</th>
      <th>Email Id</th>
      <th>Car Details</th>
      <th>edit</th>
      <th>delete</th>
      </tr>
</thead>
<tbody>
<c:forEach items="${categoryList}" var="cat">
<tr>
<td>${cat.catName}</td>
<td>${cat.catAddress}</td>
<td>${cat.catPhone}</td>
<td>${cat.catEmail}</td>
<td>${cat.catType }</td>

<td><a href="<c:url value='updateCategory/${cat.catId}'/>">Edit</a></td>
<td><a href="<c:url value='deleteCategory/${cat.catId}'/>">Delete</a></td>
</tr>
</c:forEach>

</tbody>
</table>
</c:if>
    
  
</div>
 


</body>
</html>