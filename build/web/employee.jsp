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
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Employees</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/employee.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <c:set var="listemployee" scope="session" value="${sessionScope.listemployee}"/>
        <c:set var="employeeview" scope="request" value="${requestScope.employeeview}"/>
        <c:set var="employeecreate" scope="request" value="${requestScope.employeecreate}"/>
</head>
<body>
	<div class="container">
		<div class="navigation">
			<ul>
				<li>
					<a href="index.html">
					<span class="icon">
					<i class="fa fa-cutlery" aria-hidden="true"></i></span>
					<span class="title">
						<h2>Cây đa quán</h2>
					</span>
					</a>
				</li>
				<li>
					<a href="#">
					<span class="icon"><i class="fa fa-home" aria-hidden="true"></i></span>
					<span class="title">
						Dashboard
					</span>
					</a>
				</li>
				<li>
					<a href="#">
					<span class="icon"><i class="fa fa-th-large" aria-hidden="true"></i></span>
					<span class="title">
						Menu
					</span>
					</a>
				</li>
				<li>
					<a href="#">
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
					<a href="#">
					<span class="icon"><i class="fa fa-users" aria-hidden="true"></i></span>
					<span class="title">
						Employee
					</span>
					</a>
				</li>
				<li>
					<a href="#">
					<span class="icon"><i class="fa fa-address-book-o" aria-hidden="true"></i></span>
					<span class="title">
						Customer
					</span>
					</a>
				</li>
				<li>
					<a href="#">
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
						<div onclick="createemployee()" class="btn">Thêm</div>
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
                                                    <c:forEach var="employee" items="${listemployee}">
                                                        <tr class="emdata" id="${employee.getID()}">
								<td>1</td>
								<td>${employee.name}</td>
								<td>${employee.shortname}</td>
								<td>${employee.role}</td>
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
						<form method="post" name="employeedetails">
            <div class="info">
		<div class="imgBx">
			<img src="images/user.png" alt="user"/>
		</div>
		<div class="header">
			<div class="inputBx short">
				<span>Id:</span>
				<input type="text" name="id" readonly value="${employeeview.getId()}"/>
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
				<select name="gender" disabled>
                                        <option value="${employee.gender?"Nam":"Nữ"}" hidden>${employee.gender?"Nam":"Nữ"}</option>
					<option value="male">Nam</option>
					<option value="female">Nữ</option>
				</select>
				<label for="gender" id="gender" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Chức vụ:</span>
				<input type="text" id="role" name="role" readonly value="${employee.role}"/>
				<label for="role" id="role" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Mức lương:</span>
				<input type="text" id="salary"  name="salary" readonly value="${employee.salary/1000000} triệu"/>
				<label for="salary" id="salary" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx ">
				<span>Ngày sinh</span>
				<input type="date" id="dob"  name="dob" readonly value="${employee.getDoB()}"/>
				<label for="dob" id="dob" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Số điện thoại</span>
				<input type="text" id="phonenum" name="phonenum" readonly value="${employee.phonenumber}"/>
				<label for="phonenum" id="phonenum" class="icon">
				<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
		</div>
		<div class="session">
			<div class="addressBx">
				<div class="inputBx">
					<span>Thôn</span>
					<input type="text" id="address0" name="address0" readonly value="${employee.getAddress(0)}"/>
					<label for="address0" id="address0" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Xã, thị trấn</span>
					<input type="text" id="address1" name="address1" readonly value="${employee.getAddress(1)}"/>
					<label for="address1" id="address1" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Quận,huyện</span>
					<input type="text" id="address2" name="address2" readonly value="${employee.getAddress(2)}"/>
					<label for="address2" id="address2" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Tỉnh, thành phố</span>
					<input type="text" id="address3" name="address3" readonly value="${employee.getAddress(3)}"/>
					<label for="address0" id="address3" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
			</div>
		</div>					
	</div>	
	<div class="footer">
		<button class="btnf" id="update" type="submit" disabled>Update<span class="icon"></span></button>
		<button class="btnf" id="delete" type="submit">Delete<span class="icon"></span></button>
		<button class="btnf" id="cancel" onclick="cancelupdate()" disabled>Cancel<span class="icon"></span></button>
	</div>		
						</form>
                                        
					</div>
                                            <div class="newemployee <c:if test="${employeecreate!=null}">create</c:if>">
						<header>
							<h2>Create new employees</h2>
						</header>
                                                <form name="addemployee" method="post">
	<div class="info">
		<div class="imgBx">
			<img src="images/user.png" alt="user"/>
		</div>
		<div class="header">
			<div class="inputBx short">
				<span>Id:</span>
				<input type="text" name="nid" readonly value="EM02"/>
			</div>
			<div class="inputBx">
				<span>Họ và tên:</span>
				<input type="text" id="nname" name="nname" required placeholder="Tên đầy đủ" />
			</div>
			<div class="inputBx">
				<span>Biệt danh:</span>
				<input type="text" id="nsname" name="nsname" required placeholder="Tên hay gọi" />
			</div>
			<div class="inputBx short">
				<span>Giới tính</span>
				<select name="ngender">
					<option value="male">Nam</option>
					<option value="female">Nữ</option>
				</select>
			</div>
			<div class="inputBx">
				<span>Chức vụ:</span>
				<input type="text" id="nrole" name="nrole" required placeholder="Chức vụ" />
			</div>
			<div class="inputBx">
				<span>Mức lương:</span>
				<input type="text" id="nsalary"  name="nsalary" required placeholder="10 triệu or 10 000 000" />
			</div>
			<div class="inputBx ">
				<span>Ngày sinh</span>
				<input type="date" id="ndob"  name="ndob" required value="2000-01-20"/>
			</div>
			<div class="inputBx">
				<span>Số điện thoại</span>
				<input type="text" id="nphonenum" name="nphonenum" required placeholder="Phone number..." />
			</div>
		</div>
		<div class="session">
			<div class="addressBx">
				<div class="inputBx">
					<span>Thôn</span>
					<input type="text" id="naddress0" name="naddress0" required placeholder="Thôn, làng (VD: Cống Khê)" />
				</div>
				<div class="inputBx">
					<span>Xã, thị trấn</span>
					<input type="text" id="naddress1" name="naddress1" required placeholder="Xã,thị trấn" />
				</div>
				<div class="inputBx">
					<span>Quận,huyện</span>
					<input type="text" id="naddress2" name="naddress2" required placeholder="Quận,huyện"/>
				</div>
				<div class="inputBx">
					<span>Tỉnh, thành phố</span>
					<input type="text" id="naddress3" name="naddress3" required placeholder="tỉnh, thành"/>
				</div>
			</div>
		</div>					
	</div>
	<div class="footer">
		<button class="btnf" id="create" type="submit">Create<span class="icon"></span></button>
		<button class="btnf" id="cancel" onclick="cancelcreate()">Cancel<span class="icon"></span></button>
	</div>	
						</form>
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

		// --------------------------------------------------------------------------
		let emdata=document.getElementsByClassName('emdata');
		for(let i = 0; i<emdata.length;i++){
			emdata[i].addEventListener('click',viewdetail);
		}
		function viewdetail(){
			closeCard();
			f.action="employee?req=v";
                        f.submit();
		}
		function closeCard(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return;
			}
			let close = document.querySelector('.close');
			let session = document.querySelector('.session');
			let empty = document.querySelector('.empty');
			close.classList.toggle('hidden');
			session.classList.toggle('hidden');
			empty.classList.toggle('hidden');
		}
		// variable of employee page
		let updatef = document.getElementById('update');
		let cancelf = document.getElementById('cancel');
		let editspan = document.getElementsByClassName('icon');
		for(let i = 0; i<editspan.length;i++){
			editspan[i].addEventListener('click',editemployee);
		}
		const remeber=[];
		let checkedit = false;
		function editemployee() {
			let element = document.getElementById(this.id);
			if(this.id == 'gender'){
				element = document.getElementsByTagName('select')[0];
				element.removeAttribute('disabled');
			}
			else{
				element.removeAttribute('readonly');
			}
			console.log('hadclick'+(remeber.length));
			remeber[remeber.length] = element;
			updatef.removeAttribute('disabled');
			cancelf.removeAttribute('disabled');
			checkedit=true;
		}
		function cancelupdate(){
			let updatef = document.getElementById('update');
			let cancelf = document.getElementById('cancel');
			for(let i = 0; i<remeber.length;i++){
				if(remeber.id=='gender'){
					remeber.remoneAttribute('disabled');
				} else{
					remeber.remoneAttribute('readonly');
				}	
			}
			checkedit=false;
			document.employeedetails.reset();
			updatef.setAttribute('disabled',true);
			cancelf.setAttribute('disabled',true);
		}
		// --------------------------------- js for add form-------------
		function createemployee(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want redirect to create new employee")){return;}
				else cancelupdate();
			}
                        let f = document.femployee;
                        f.action="create?req=c";
                        f.submit();
//			let createpanel = document.querySelector('.newemployee');
//			createpanel.classList.toggle('create');
		}
		function cancelcreate(){
			document.addemployee.reset();
			let createpanel = document.querySelector('.newemployee');
			createpanel.classList.toggle('create');
			console.log('canceled create!');
		}
	</script>
</body>
</html>
