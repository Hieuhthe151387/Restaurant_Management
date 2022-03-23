<%-- 
    Document   : home
    Created on : 11-Mar-2022, 12:18:48
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Admin Dashboard</title>
<!--	<link rel="stylesheet" type="text/css" href="css/style.css">-->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
         <%--<c:if test="${sessionScope.user==null}">
             <%
                 request.setAttribute("error", "Access denied! Please login!");
                 response.sendRedirect(request.getContextPath()+"/login");
             %>
         </c:if>--%>
</head>
<body>
	<div class="container">
		<div class="navigation">
			<ul>
				<li>
                                    <a href="home">
					<span class="icon">
					<i class="fa fa-cutlery" aria-hidden="true"></i></span>
					<span class="title">
						<h2>Cây đa quán</h2>
					</span>
					</a>
				</li>
				<li>
					<a href="home">
					<span class="icon"><i class="fa fa-home" aria-hidden="true"></i></span>
					<span class="title">
						Dashboard
					</span>
					</a>
				</li>
				<li>
					<a href="menu">
					<span class="icon"><i class="fa fa-th-large" aria-hidden="true"></i></span>
					<span class="title">
						Menu
					</span>
					</a>
				</li>
				<li>
					<a href="order">
					<span class="icon"><i class="fa fa-book" aria-hidden="true"></i></span>
					<span class="title">
						Orders
					</span>
					</a>
				</li>
				<li>
                                    <a href="employee">
					<span class="icon"><i class="fa fa-users" aria-hidden="true"></i></span>
					<span class="title">
						Employee
					</span>
					</a>
				</li>
				<li>
					<a href="customer">
					<span class="icon"><i class="fa fa-address-book-o" aria-hidden="true"></i></span>
					<span class="title">
						Customer
					</span>
					</a>
				</li>
				<li>
                                    <a href="signin.jsp?logout=out">
					<span class="icon"><i class="fa fa-sign-out" aria-hidden="true"></i></span>
					<span class="title">
						Logout
					</span>
					</a>
				</li>
			</ul>
		</div>
   		<div class="main">
   			<div class="topbar">
   				<div class="toggle"onclick="toggleMenu();">
   				</div>
   				<div class="search">
   					<label>
   						<i class="fa fa-search" aria-hidden="true"></i>
   						<input type="text"
   						placeholder="Search here!" name="">
   					</lable>
   				</div>
   				<div class="user">
   					<img src="images/user.png" alt="user">
   				</div>
   			</div>
   			<div class="cardBox">
				<div class="card">
					<div>
						<div class="numbers">Hi</div>
						<div class="cardName">Quản lý</div>
					</div>
					<div class="iconBox">
						<i class="fa fa-male" aria-hidden="true"></i>
					</div>
				</div>
				<div class="card">
					<div>
						<div class="numbers">20</div>
						<div class="cardName">Order</div>
					</div>
					<div class="iconBox">
						<i class="fa fa-cart-plus" aria-hidden="true"></i>
					</div>
				</div>
				<div class="card">
					<div>
						<div class="numbers">15</div>
						<div class="cardName">Sales</div>
					</div>
					<div class="iconBox">
						<i class="fa fa-usd" aria-hidden="true"></i>
					</div>
				</div>
				
				<div class="card">
					<div>
						<div class="numbers">6.042</div>
						<div class="cardName">Earning</div>
					</div>
					<div class="iconBox">						
						<i class="fa fa-money" aria-hidden="true"></i>
					</div>
				</div>
			</div>
			<div class="details">
				<div class="recentOrders">
					<div class="cardHeader">
						<h2>Recent Orders</h2>
						<a href="order" class="btn">View all</a>
					</div>
					<table>
						<thead>
							<tr>
								<td>STT</td>
								<td>Cust</td>
								<td>Position</td>
								<td>Status</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>Khach le</td>
								<td><span class="position delivery">Delivery</span></td>
								<td><span class="status cancel">Cancel</span></td>
							</tr>
							<tr>
								<td>2</td>
								<td>Khach le</td>
								<td><span class="position delivery">Delivery</span></td>
								<td><span class="status pending">Pending</span></td>
							</tr>
							<tr>
								<td>3</td>
								<td>Khách Hoàng</td>
								<td><span class="position inplace">Tại quán</span></td>
								<td><span class="status complety">Complety</span></td>
							</tr>
							<tr>
								<td>4</td>
								<td>Anh Khang</td>
								<td><span class="position inplace">Tại quán</span></td>
								<td><span class="status inprogress">In Progress</span></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="recentEmployees">
					<div class="cardHeader">
						<h2>Recent Customers</h2>
						<!-- <a href="#" class="bth">View all</a> -->
					</div>
					<table>
						<tbody>
							<tr>
								<td with="60px"><div class="imgBx"><img src="images/user.png"></div></td>
								<td><h4>Bác K</h4><span>Bếp trưởng</span></td>
							</tr>
							<tr>
								<td with="60px"><div class="imgBx"><img src="images/user.png"></div></td>
								<td><h4>Chị H</h4><span>Quản lý</span></td>
							</tr>
							<tr>
								<td with="60px"><div class="imgBx"><img src="images/user.png"></div></td>
								<td><h4>Anh N</h4><span>Phụ bếp</span></td>
							</tr>
							<tr>
								<td with="60px"><div class="imgBx"><img src="images/user.png"></div></td>
								<td><h4>H phục vụ</h4><span>Phục vụ</span></td>
							</tr>
							<tr>
								<td with="60px"><div class="imgBx"><img src="images/user.png"></div></td>
								<td><h4>Bác T</h4><span>Nhân viên thu mua</span></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
   		</div>
	</div>
	
	<script>
		function toggleMenu(){
			let toggle = document.querySelector('.toggle');
			let navigation = document.querySelector('.navigation');
			let main = document.querySelector('.main');
			toggle.classList.toggle('active');
			navigation.classList.toggle('active');
			main.classList.toggle('active');
		}
	</script>
</body>
</html>
