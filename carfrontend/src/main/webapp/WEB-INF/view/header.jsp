<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cat" %>
     <%@page isELIgnored="false"%>
     <%@taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Rental Zoo</title>

</head>
<body>
<nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">CarZoo</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="#contact">Contact</a></li>
             <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="${pageContext.request.contextPath }/showbrandcard/${cat.brandId}">Brands<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <c:forEach items="${brandList}" var="cat">
            <li><a href="${pageContext.request.contextPath}/showbrandcard/${cat.brandId}">${cat.brandId}</a></li>
          </c:forEach>
        </ul>
      </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <sec:authorize access="isAuthenticated()">
    <li class="nav-item" style="color:powderblue"> <br>Welcome <i>${pageContext.request.userPrincipal.name}</i></li>
       </sec:authorize>
        <sec:authorize access="hasRole('ROLE_ADMIN')" >
		<li><a href="adminHome">Admin</a></li>   
		</sec:authorize>    
        <sec:authorize access="hasRole('ROLE_USER')" >
                    <li class="nav-item"> <a href="${pageContext.request.contextPath}/Cart/all"><span class="glyphicon glyphicon-shopping-cart"></span><span class="badge badge-pill badge-primary">${numberProducts}</span></a></li>
                </sec:authorize>
                
                 <sec:authorize access="isAuthenticated()" >
                    <li class="nav-item"> <a href="${pageContext.request.contextPath}/Logout">Logout</a></li>
                </sec:authorize>
               
                <sec:authorize access="isAnonymous()">
                         <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li> 
                   		<li><a href="${pageContext.request.contextPath}/Register"><span class="glyphicon glyphicon-user"></span> Register</a></li>
         </sec:authorize>   
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    
    
    

                <!--  
                <li class="dropdown">
              <a href="${pageContext.request.contextPath }/showbrandcard/${cat.brandId}" class="dropdown-toggle" data-toggle="dropdown">CARS<b class="caret"></b></a>
                   
              <ul class="dropdown-menu w3-hoverable">
               <c:forEach items="${brandList}" var="cat">
                    <li><a class ="dropdown-toggle" data-toggle="dropdown" href=" ${pageContext.request.contextPath}/showbrandcard/${cat.brandId}">${cat.brandId}</a></li>
 
                        </c:forEach>
              </ul>
              -->
        
               <!--  <ul class="dropdown-menu"></ul>
                 <c:forEach items="${categoryList}" var="c">
                    <li><a class ="dropdown-toggle" data-toggle="dropdown" href=" ${pageContext.request.contextPath}/CategoryByID/${c.catDesc }">${c.catDesc }</a></li>
                          </c:forEach>
                           -->
                        
         <!--  <c:forEach items="${brandList}" var="cat">
                    <li><a class ="dropdown-toggle" data-toggle="dropdown" href=" ${pageContext.request.contextPath}/BrandByID/${cat.brandId}">${cat.brandId}</a></li>
                        <ul class="dropdown-menu"></ul>
                        </c:forEach> -->

                
                     
               <!--      <sec:authorize access="hasRole('ROLE_ADMIN')" >
               <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Admin <span class="caret"></span></a>
                   <ul class="dropdown-menu">
                    
                    <li><a href="Brand"><span class="glyphicon glyphicon-log-in"></span> Brand</a></li>
                    <li><a href="Category"><span class="glyphicon glyphicon-log-in"></span>Category</a></li>
                         <li><a href="Product"><span class="glyphicon glyphicon-log-in"></span> Product</a></li>
                    </ul>
                    
                   </li>
                   </sec:authorize>-->
                   
<!--                 <li><a href="AdminCard">Admin</a></li> -->
        

</body>



<script type="text/javascript">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</script>



</html>
