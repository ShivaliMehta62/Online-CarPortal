<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cat" %>
     <%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>uponrent</title>

</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">CAR RENTALS</a>
        </div>
        
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#"></a></li>
                
                <ul class="dropdown-menu"></ul>
                 <c:forEach items="${categoryList}" var="c">
                    <li><a class ="dropdown-toggle" data-toggle="dropdown" href=" ${pageContext.request.contextPath}/CategoryByID/${c.catType }">${c.catType }</a></li>
                          </c:forEach>
                        
          <c:forEach items="${brandList}" var="cat">
                    <li><a class ="dropdown-toggle" data-toggle="dropdown" href=" ${pageContext.request.contextPath}/BrandByID/${cat.brandId}">${cat.brandId}</a></li>
                        <ul class="dropdown-menu"></ul>
                        </c:forEach>
                    </ul>
                </li>
                
                <li class="dropdown">
                    <a class="dropdown-toggle"  data-toggle="dropdown" href="#">Rental <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                                             <li><a href="#">contact us</a></li>
                       </ul> 
                </li>
            <ul class="nav navbar-nav navbar-right">
                   <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Admin <span class="caret"></span></a>
                   <ul class="dropdown-menu">
                    <li><a href="category"><span class="glyphicon glyphicon-log-in"></span>Category</a></li>
                         <li><a href="product"><span class="glyphicon glyphicon-log-in"></span> Product</a></li>
                         <li><a href="Brand"><span class="glyphicon glyphicon-log-in"></span> Brand</a></li>
                
                    </ul>
                     
                        
                
                   </ul>
                   
                   </li>
                
                <li><a href="register"><span class="glyphicon glyphicon-user"></span> Register</a></li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>