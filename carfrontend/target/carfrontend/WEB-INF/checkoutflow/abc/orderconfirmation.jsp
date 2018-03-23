
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false" %>
 <%-- <jsp:useBean id="date" class="java.util.Date" />--%>

<div class="space"></div>
<div class="container">
	<h2 class="heading-one">Order Confirmation</h2>
	<div class="space"></div>
	<form:form modelAttribute="order">

		<div
			class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 co-md-offset-3">

			<div class="text-center">
				<h1>Receipt</h1>
			</div>
			<hr>
			<div class="row">
				<div class="col-xs-8 col-sm-8 col-md-8">
					<b>Name: </b>${order.user.userName }
					<br>
					<b>Email: </b>${order.user.userEmail }
					<br>
					
				</div>
				<div class="col-xs-4 col-sm-4 col-md-4 ">
					<p>
						<b>Shipping Date:</b>
						  <fmt:formatDate pattern="yyyy-MM-dd" value="${date}"/>
					</p>
				</div>
			</div>
<hr>
			<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6">
					<address>
						<strong>PickUp Address</strong><br>
						${order.user.billing.bapartNo}, ${order.user.billing.bstreetName} <br>						
						${order.user.billing.bcity},
						${order.user.billing.bstate} <br>
						${order.user.billing.bcountry},
						${order.user.billing.bzipcode} <br>
					</address>
				</div>
				<div class="col-xs-6 col-sm-6">
					<address>
						<strong>DropDown Address</strong><br>
						${order.user.shipping.apartNo}, ${order.user.shipping.streetName} <br>						
						${order.user.shipping.city},
						${order.user.shipping.state} <br>
						${order.user.shipping.country},
						${order.user.shipping.zipcode} <br>
					</address>
				</div>
			</div>
			<div class="row">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Product</th>
							<th class="text-center">Quantity</th><br>
							<th class="text-center">Price/Unit</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="order" items="${user.productName}">
							<tr>
								<td class="col-md-9"><em>${order.productName}</em></td>
								<td class="col-md-1" style="text-align: center">${order.quantity}</td>
								<td class="col-md-1" style="text-align: center">${order.price}</td>
							</tr>
						</c:forEach>

						<tr>
							<td class="text-right">
								<h4>
									<strong>Grand Total: </strong>
								</h4>
							</td>
							<td class="text-center text-danger" colspan="2">
								<h4>
									<strong>Rs ${totalAmount } </strong>
								</h4>
							</td>
						</tr>
					</tbody>
				</table>
			</div>

			<input type="hidden" name="_flowExecutionKey" /> <br> <br>
			<button class="btn btn-outline-warning"
				name="_eventId_backToCollectShippingDetail">Back</button>
			<input type="submit" value="Submit Order"
				class="btn btn-outline-primary" name="_eventId_orderconfirmed" />
			<button class="btn btn-default" name="_eventId_cancel">Cancel</button>
		</div>
	</form:form>
</div>
<%@include file="header1.jsp"%>