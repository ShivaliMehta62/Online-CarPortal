<%--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
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
<title>Insert title here</title>
</head>
<body>
 <h2>Billing details</h2>
<div class="container">
<sh:form action="${pageContext.request.contextPath}/updatebillingAddress" method="POST" modelAttribute="BillingId">
<c:if test="${not empty billing.billingaddressId}">
<sh:input path="billingAddressId" readOnly="true" disabled="true"/>
<sh:hidden path="billingAddressId"/>
</c:if>
 <div class="form-group">
      <sh:label  path="bill.bstreetname">Street number:</sh:label>
      <sh:input class="form-control"  path="bstreetname" />
    </div>
      <div class="form-group">
      <sh:label  path="bill.bapartNo">Apart number</sh:label>
      <sh:input class="form-control"  path="apartNo"  />
    </div>
<div class="form-group">
      <sh:label  path="bill.bcity">City</sh:label>
      <sh:input class="form-control"  path="city"  />
    </div>
    <div class="form-group">
      <sh:label  path="bill.bstate">State</sh:label>
      <sh:input class="form-control"  path="state"  />
    </div>
 <div class="form-group">
      <sh:label  path="bill.bcountry">Country</sh:label>
      <sh:input class="form-control"  path="country"  />
    </div>
 <div class="form-group">
      <sh:label  path="bill.bzipcode">Zipcode</sh:label>
      <sh:input class="form-control"  path="zipcode"  />
    </div>
</sh:form>


<input type="hidden" name="_flowExecutionKey" />

 <sh:button type="submit" class="btn btn-default">Submit</sh:button>
</td>
</div>
</body>
</html>
 --%>