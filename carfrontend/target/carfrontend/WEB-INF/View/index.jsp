<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Car Rental Zoo</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 175%;
     max-height: 200%;
  }
  body
  {
  background-color: #f44250; }
  </style>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<br>
<sec:authorize access="hasRole('ROLE_ADMIN')" >
<jsp:forward page="/adminHome"></jsp:forward>
</sec:authorize>
<div class="container">

  <div id="myCarousel" class="carousel slide">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li class="item1 active"></li>
      <li class="item2"></li>
      <li class="item3"></li>
      <li class="item4"></li>
      <li class="item5"></li>
    </ol>

    <!-- Wrapper for slides -->
  - <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="resources/carrental/car1.jpg" alt="" width="500" height="465">
          </div>

      <div class="item">
        <img src="resources/carrental/car2.jpg" alt="" width="500" height="465">
           </div>
    
      <div class="item">
        <img src="resources/carrental/car3.jpg" alt="" width="500" height="465">
         </div>

      <div class="item">
        <img src="resources/carrental/car4.jpg" alt="" width="500" height="465">
       </div>
  
   <div class="item">
        <img src="resources/carrental/car5.jpg" alt="" width="500" height="465">
            </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only"></span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only"></span>
    </a>
  </div>
</div>

<script>
$(document).ready(function(){
    // Activate Carousel
    $("#myCarousel").carousel();
    
    // Enable Carousel Indicators
    $(".item1").click(function(){
        $("#myCarousel").carousel(0);
    });
    $(".item2").click(function(){
        $("#myCarousel").carousel(1);
    });
    $(".item3").click(function(){
        $("#myCarousel").carousel(2);
    });
    $(".item4").click(function(){
        $("#myCarousel").carousel(3);
    });
    
    $(".item5").click(function(){
        $("#myCarousel").carousel(4);
    });
    
    // Enable Carousel Controls
    $(".left").click(function(){
        $("#myCarousel").carousel("prev");
    });
    $(".right").click(function(){
        $("#myCarousel").carousel("next");
    });
});
</script>


<br>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
