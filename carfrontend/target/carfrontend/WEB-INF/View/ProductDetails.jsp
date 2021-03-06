<%@include file="Header.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>eCommerce Product Detail </title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/productdetail.css">

   <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

  
   <!--   <title>eCommerce Product Detail</title>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
-->
  </head>

  <body>
	
	<div class="container">
		<div class="card">
		
			<div class="container-fliud">
							<img src="${pageContext.request.contextPath }/resources/image/${productList.proRn}.jpg" style="width:500px;height:500px"/>
					<div class="details col-md-6">
						<h3 class="product-title">${productList.categoryId}</h3>
						<div class="rating">
							<div class="stars">
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star checked"></span>
								<span class="fa fa-star"></span>
								<span class="fa fa-star"></span>
							</div>
							<span class="review-no">56 reviews</span>
						</div>
						<p class="description">${productList.proType }</p>
						<p class="quantity">${productList.quantity}</p>
						
						<h4 class="price">Our price: <span>&#8377; ${productList.proCost }</span></h4>
						<p class="vote"><strong>96%</strong> of buyers enjoyed this product! <strong>(90 votes)</strong></p>
						
						
						<div class="action">
							<a class="add-to-cart btn btn-default" href="${pageContext.request.contextPath}/Cart/addToCart/${productList.proRn}">add to cart</a>
							
						</div>
					</div>
				</div>
				
			</div>
			
		</div>
		
  </body>
</html>
