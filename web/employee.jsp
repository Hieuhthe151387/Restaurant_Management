<%-- 
    Document   : employee
    Created on : 11-Mar-2022, 12:44:56
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Employees</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/employee.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <c:set var="listemployee" scope="session" value="${sessionScope.listemployee}"/>
        <c:set var="employeeview" scope="request" value="${requestScope.employeeview}"/>
        <c:set var="employeecreate" scope="request" value="${requestScope.newId}"/>
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
					<a href="#">
					<span class="icon"><i class="fa fa-bar-chart" aria-hidden="true"></i></span>
					<span class="title">
						Analysis
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
                    <form method="post" name="femployee" hidden></form>
			<div class="details">
				<div class="recentOrders leftCard">
					<div class="cardHeader">
						<h2>Nhân Viên</h2>
                                                <c:if test="${listemployee!=null}"><div onclick="createemployee()" class="btn">Thêm</div></c:if>
					</div>
                                        <c:if test="${listemployee!=null&&listemployee.size()!=0}">                                        
					<table>
						<thead>
							<tr >
								<td>STT</td>
								<td>Họ và tên</td>
								<td>Biệt danh</td>
								<td>Chức danh</td>
							</tr>
						</thead>
						<tbody>
                                                    <c:forEach var="i" begin="1" end="${listemployee.size()}">
                                                        <tr class="emdata" id="${listemployee.get(i-1).getID()}">
								<td>${i}</td>
								<td>${listemployee.get(i-1).name}</td>
								<td>${listemployee.get(i-1).shortname}</td>
								<td>${listemployee.get(i-1).role}</td>
							</tr>
                                                    </c:forEach>
						</tbody>
					</table>
                                        </c:if>
				</div>
				<div class="rightCard">
					<div class="cardHeader">
						<h2>Employee Detail</h2>
						<span class="close <c:if test="${employeeview==null}">hidden</c:if>" onclick="closeCard()"><i class="fa fa-times" aria-hidden="true"></i></span>
					</div>
                                    <div class="empty <c:if test="${employeeview!=null}">hidden</c:if>">
						<div class="icon"><i class="fa fa-archive" aria-hidden="true"></i></div>
						<div class="h2">Choose one employee to see this one's info</div>
					</div>
					<div class="session <c:if test="${employeeview==null}">hidden</c:if>">
						<form method="post" action="employee" name="employeedetails">
            <div class="info">
		<div class="imgBx">
			<img src="images/user.png" alt="user"/>
		</div>
                <div class="header">
			<div class="inputBx short">
				<span>Id:</span>
				<input type="text" name="id" readonly value="${employeeview.getID()}"/>
			</div>
			<div class="inputBx">
				<span>Họ và tên:</span>
				<input type="text" id="name" name="name" readonly value="${employeeview.name}"/>
				<label for="name" id="name" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Biệt danh:</span>
				<input type="text" id="sname" name="sname" readonly value="${employeeview.shortname}"/>
				<label for="sname" id="sname" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx short">
				<span>Giới tính</span>
                                <select name="gender" id="genderu" required disabled>
                                        <option value="${employeeview.gender?"male":"female"}" hidden>${employeeview.gender?"Nam":"Nữ"}</option>
					<option value="male">Nam</option>
					<option value="female">Nữ</option>
				</select>
				<label for="gender" id="gender" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Chức vụ:</span>
				<input type="text" id="role" name="role" readonly value="${employeeview.role}"/>
				<label for="role" id="role" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Mức lương:</span>
				<input type="text" id="salary"  name="salary" readonly value="${employeeview.salary/1000000} triệu"/>
				<label for="salary" id="salary" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx ">
				<span>Ngày sinh</span>
				<input type="date" id="dob"  name="dob" readonly value="${employeeview.getDoB()}"/>
				<label for="dob" id="dob" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Số điện thoại</span>
				<input type="text" id="phonenum" name="phonenum" readonly value="${employeeview.phoneNumber}"/>
				<label for="phonenum" id="phonenum" class="icon">
				<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
		</div>
		<div class="session">
			<div class="addressBx">
				<div class="inputBx">
					<span>Thôn</span>
					<input type="text" id="address0" name="address0" readonly value="${employeeview.getAddress(0)}"/>
					<label for="address0" id="address0" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Xã, thị trấn</span>
					<input type="text" id="address1" name="address1" readonly value="${employeeview.getAddress(1)}"/>
					<label for="address1" id="address1" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Quận,huyện</span>
					<input type="text" id="address2" name="address2" readonly value="${employeeview.getAddress(2)}"/>
					<label for="address2" id="address2" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Tỉnh, thành phố</span>
					<input type="text" id="address3" name="address3" readonly value="${employeeview.getAddress(3)}"/>
					<label for="address0" id="address3" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
			</div>
		</div>					
	</div>	
	<div class="footer">
            <input type="hidden" name="req" id="req" value="u"/>
                <input type="submit" value="Update" class="btnf" disabled id="update"/>
                <button class="btnf" id="delete" type="button" onclick="deleteem('${requestScope.id}')">Delete<span class="icon"></span></button>
                <button class="btnf" id="cancel" type="button" onclick="cancelupdate()" disabled>Cancel<span class="icon"></span></button>
	</div>		
						</form>
                                        
					</div>
                                            <div class="newemployee <c:if test="${employeecreate!=null}">create</c:if>">
						<header>
							<h2>Create new employees</h2>
						</header>
                                                <form name="addemployee" action="employee" method="post">
	<div class="info">
		<div class="imgBx">
			<img src="images/user.png" alt="user"/>
		</div>
		<div class="header">
			<div class="inputBx short">
				<span>Id:</span>
                                <input type="text" name="id" readonly value="${requestScope.newId}"/>
			</div>
			<div class="inputBx">
				<span>Họ và tên:</span>
				<input type="text" id="nname" name="name" required placeholder="Tên đầy đủ" />
			</div>
			<div class="inputBx">
				<span>Biệt danh:</span>
				<input type="text" id="nsname" name="sname" required placeholder="Tên hay gọi" />
			</div>
			<div class="inputBx short">
				<span>Giới tính</span>
                                <select name="gender" required>
					<option value="male">Nam</option>
					<option value="female">Nữ</option>
				</select>
			</div>
			<div class="inputBx">
				<span>Chức vụ:</span>
				<input type="text" id="nrole" name="role" required placeholder="Chức vụ" />
			</div>
			<div class="inputBx">
				<span>Mức lương:</span>
				<input type="text" id="nsalary"  name="salary" required placeholder="10 triệu or 10 000 000" />
			</div>
			<div class="inputBx ">
				<span>Ngày sinh</span>
				<input type="date" id="ndob"  name="dob" required value="2000-01-20"/>
			</div>
			<div class="inputBx">
				<span>Số điện thoại</span>
				<input type="text" id="nphonenum" name="phonenum" required placeholder="Phone number..." />
			</div>
		</div>
		<div class="session">
			<div class="addressBx">
				<div class="inputBx">
					<span>Thôn</span>
					<input type="text" id="naddress0" name="address0" required placeholder="Thôn, làng (VD: Cống Khê)" />
				</div>
				<div class="inputBx">
					<span>Xã, thị trấn</span>
					<input type="text" id="naddress1" name="address1" required placeholder="Xã,thị trấn" />
				</div>
				<div class="inputBx">
					<span>Quận,huyện</span>
					<input type="text" id="naddress2" name="address2" required placeholder="Quận,huyện"/>
				</div>
				<div class="inputBx">
					<span>Tỉnh, thành phố</span>
					<input type="text" id="naddress3" name="address3" required placeholder="tỉnh, thành"/>
				</div>
			</div>
		</div>					
	</div>
	<div class="footer">
                <input type="hidden" value="s" name="req"/>
                <input type="submit" value="Create" class="btnf" id="create"/>
                <button class="btnf" id="cancel" type="button" onclick="cancelcreate()">Cancel<span class="icon"></span></button>
	</div>	
						</form>
					</div>
				</div>
			</div>
                        <script src="js/script.js" type="text/javascript"></script>
</body>
</html>
