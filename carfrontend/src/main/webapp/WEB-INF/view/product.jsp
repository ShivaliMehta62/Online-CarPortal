<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"  %>
      <%@page isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="si" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<si:form action="${pageContext.request.contextPath }addProduct" method="post" modelAttribute="product" enctype="Multipart/form-data">
<d:if test="${not empty product.proNm }">
ID<si:input path="proRn" readOnly="true" disabled="true"/>
<si:hidden path="proRn"/>
</d:if>
Name<si:input path="proNm"/>
Type<si:input path="proDesc"/>
<si:input type="file" path="image"/>
<c:if test="${empty product.proNm}">
        <sh:button class="btn btn-success" value="submit">add</sh:button>
    </c:if>
    <c:if test="${not empty product.proNm}">
        <sh:button class="btn btn-success" value="submit">Update</sh:button>
    </c:if>
</si:form>

<d:if test="${not empty productList}">
<table border="1">
<tr><td>name</td><td>edit</td><td>delete</td></tr>

<d:forEach items="${productList}" var="pro">
<td>${pro.proNm}</td>
<td><a href="editProduct/${pro.proRn}">Edit</a></td>
<td><a href="deleteProduct/${pro.proRn}">delete</a></td>
</d:forEach>
</table>
</d:if>




</body>
</html>