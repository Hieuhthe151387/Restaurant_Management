<%-- 
    Document   : order
    Created on : 20-Mar-2022, 22:37:50
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Order</title>
        <link href="css/order.css" rel="stylesheet" type="text/css"/>
	<!--<link rel="stylesheet" type="text/css" href="css/order.css">-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <c:set var="orderview" scope="request" value="${sessionScope.orderview}"/>
        <c:set var="custorder" scope="request" value="${sessionScope.custorder}"/>
        <c:set var="listcust" scope="session" value="${sessionScope.listcust}"/>
        <c:set var="listorder" scope="session" value="${sessionScope.listorder}"/>
        <c:set var="newid" scope="session" value="${sessionScope.newid}"/>
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
    <form name="orderform" hidden></form>
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
			<div class="details">
				<div class="leftCard">
					<div class="cardHeader">
						<h2>Danh sách đơn hàng</h2>
						<div class="btn" onclick="addorder()">Thêm</div>
					</div>
                                        <c:if test="${listorder.size()>0}">
					<table>
						<thead>
							<tr>
								<td>STT</td>
								<td>Khách hàng</td>
								<td>Nhân viên</td>
								<td>Ngày</td>
								<td>Trạng thái</td>
							</tr>
						</thead>
						<tbody>
                                                    <c:forEach var="i" begin="0" end="${listorder.size()-1}">
                                                        <tr class="orderdata" id="${listorder.get(i).id}">
								<td>${i+1}</td>
								<td>${listorder.get(i).getCustName()}</td>
								<td>${listorder.get(i).getEmName()}</td>
								<td>${listorder.get(i).date}</td>
								<td><span class="status ${listorder.get(i).getClassStatus()}">${listorder.get(i).getstatus()}</span></td>
							</tr>
                                                    </c:forEach>
						</tbody>
					</table>
                                        </c:if>
				</div>
				<div class="rightCard">
					<div class="cardHeader">
						<h2>Thông tin hoá đơn</h2>
						<span class="close <c:if test="${orderview==null}">hidden</c:if>" onclick="closeCard()"><i class="fa fa-times" aria-hidden="true"></i></span>
					</div>
					<div class="empty <c:if test="${orderview!=null}">hidden</c:if>"">
						<div class="icon"><i class="fa fa-archive" aria-hidden="true"></i></div>
						<div class="h2">Chọn một Hoá đơn để xem chi tiết</div>
					</div>
                                    <div class="session <c:if test="${orderview==null}">hidden</c:if>">
                                        <c:if test="${orderview!=null}">
						<form method="post" action="order" name="orderdetails">
<div class="content">
		<div class="header">
			<input type="text" id="emid" name="emid" readonly value="EM02" hidden />
			<div class="inputBx short">
				<span>Order Id:</span>
				<input type="text" name="orderid" id="orderid" readonly value="${orderview.id}"/>
			</div>
			<div class="inputBx">
				<span>Họ và tên:</span>
				<select name="name" id="custname" onchange="changecust()" disabled />
                                <option value="${custorder.ID}">${custorder.name}</option>
                                <c:forEach var="cust" items="${listcust}">
                                        <option value="${cust.ID}">${cust.name}</option>
					<option value="${cust.phoneNumber}, ${cust.address}" hidden></option>    
                                </c:forEach>
				</select>
				<!-- <input type="text" id="name" name="name" readonly value="Hoàng "/> -->
				<label for="name" id="name" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Số điện thoại</span>
				<input type="text" id="phonenum" name="phonenum" readonly value="${custorder.phoneNumber}"/>
			</div>
			<div class="inputBx short">
				<span>Đơn hàng</span>
				<select name="position" onchange="changepos()" id="position" disabled>
                                    <option value="${orderview.type}">${orderview.gettype()}</option>
					<option value="0">Tại quán</option>
					<option value="1">Ship</option>
				</select>
				<label for="position" id="position" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx ">
				<span>Ngày</span>
				<input type="date" id="dateorder"  name="dateorder" readonly value="${orderview.date}"/>
				<label for="dateorder" id="dateorder" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
					<span>Status</span>
					<select name="status" id="status" onchange="changestatus()">
					<option value="${orderview.getClassStatus()}">${orderview.getstatus()}</option>
					<option value="0">Chưa nhận</option>
					<option value="1">Đang xử lý</option>
					<option value="2">Hoàn thành</option>
					<option value="3">Đã thanh toán</option>
					<option value="4">Huỷ đơn</option>
					</select>
			</div>
                        <div class="addressBx show <c:if test="${orderview.getType()==0}">hidden</c:if>">
				<div class="before" onclick="showaddress()">+</div>
				<div class="inputBx">
					<span>Thôn</span>
					<input type="text" id="address0" name="address0" readonly value="${custorder.getAddress(0)}"/>
				</div>
				<div class="inputBx">
					<span>Xã, thị trấn</span>
					<input type="text" id="address1" name="address1" readonly value="${custorder.getAddress(1)}"/>
				</div>
				<div class="inputBx">
					<span>Quận,huyện</span>
					<input type="text" id="address2" name="address2" readonly value="${custorder.getAddress(2)}"/>
				</div>
				<div class="inputBx">
					<span>Tỉnh, thành phố</span>
					<input type="text" id="address3" name="address3" readonly value="${custorder.getAddress(3)}"/>
				</div>
			</div>				
	</div>
	<div class="infor <c:if test="${orderview.getType()==1}">hidden</c:if>">
                        <table>
                                <thead>
                                    <tr>
                                        <td>STT</td>
                                        <td>Tên món</td>
                                        <td>Số lượng</td>
                                        <td>Đơn giá</td>
                                    </tr>
                                </thead>
                        <c:if test="${orderview.orderdetail.size()>0 && orderview.orderdetail!=null}">
                            <tbody>
                                <c:forEach var="i" begin="0" end="${orderview.orderdetail.size()-1}">
                                        <tr>
                                                <td>${i+1}</td>
                                                <td>${orderview.orderdetail.get(i).name}</td>
                                                <td>${orderview.orderdetail.get(i).quantity}</td>
                                                <td>${orderview.orderdetail.get(i).getprice()}</td>
                                        </tr>    
                                </c:forEach>
                            </tbody>
                        </c:if>
                        </table>
	</div>
        <hr>
        <div class="total"><span>Tổng tiền:</span>${orderview.getTotal()} VNĐ</div>
        <div class="footer">
            <input type="text" name="req" value="u" hidden/>
            <button class="btnf" id="addf" type="button" onclick="addfood()">Add food</button>
            <button class="btnf" id="update" type="submit" disabled>Update</button>
            <button class="btnf" id="delete" type="button" onclick="deleteorder()">Delete</button>
            <button class="btnf" id="set" type="button" onclick="setstatus()" disabled>Set status</button>
            <button class="btnf" id="cancel" type="button" onclick="cancelupdate()" disabled>Cancel</button>
        </div>		
        </div>
                             </form>
                     </c:if>
                                    </div>
            </div>
	</div>
    </div>
</div>
	<script>
// 		intial global 
		let updatef = document.getElementById('update');
		let cancelf = document.getElementById('cancel');
		let setf = document.getElementById('set');
		let editspan = document.getElementsByClassName('icon');
		let remeber=[];
		let checkedit = false;
		let change = false;
		let changep=false;

		function toggleMenu(){
			let toggle = document.querySelector('.toggle');
			let navigation = document.querySelector('.navigation');
			let main = document.querySelector('.main');
			toggle.classList.toggle('active');
			navigation.classList.toggle('active');
			main.classList.toggle('active');
		}

// --------------------------------------------------------------------------
		let orderdata=document.getElementsByClassName('orderdata');
		for(let i = 0; i<orderdata.length;i++){
			orderdata[i].addEventListener('click',viewdetail);
		}

		function viewdetail(){
			let oform = document.orderform;
			oform.action="order?req=v&&oid="+this.id;
			oform.method = "post";
                        oform.submit();
		}
                function changestatus(){
			change=true;
			cancelf.removeAttribute('disabled');
			setf.removeAttribute('disabled');
		}
		function addfood(){
			let oform = document.orderform;
			if (checkedit||change) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return;
			}
			oform.action = "createorder.jsp?req=addf";
                        oform.method="get";
			// orderform.submit();
			console.log('you have been clicked off from this page2!');
		}
		function addorder(){
			let oform = document.orderform;
			if (checkedit||change) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return;
			}
                        oform.action = "createorder?req=addo";
                        oform.method="get";
			orderform.submit();
			console.log('you have been clicked off from this page1!');
		}
		function closeCard(){
			if (checkedit||change) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return;
			}
			let close = document.querySelector('.close');
			let session = document.querySelector('.session');
			let empty = document.querySelector('.empty');
			change=checkedit=false;
			close.classList.toggle('hidden');
			session.classList.toggle('hidden');
			empty.classList.toggle('hidden');
		}
		// change cust
		function changecust(){
			let name = document.getElementById('custname');
			console.log(name.options[name.selectedIndex+1].value);
			let phonenum = document.getElementById('phonenum');
			let a=[];
			for(let j =0;j<4;j++){
				a[j]=document.getElementById('address'+j);
			}
			let s = name.options[name.selectedIndex+1].value.split(',');
			phonenum.value = s[0];
			for(let z = 1; z<s.length;z++){
				a[z-1].value=s[z].trim();
			}
		}

		function setstatus(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return;
			}
			let status = document.getElementById('status');
			let oform = document.orderform;// get hidden form
			let oid = document.getElementById('orderid').value;
			oform.action ="order?req=st&oid="+oid+"&st="+status.value;
                        oform.method="post";
			console.log('you have setstatus');
			console.log(oform.action);
			oform.submit();
		}
		function deleteorder(){
			if(!confirm('Thao tác này sẽ gây mât dữ liệu! Bạn muốn tiếp tục xoá bản ghi này không ?')) return;
			let oform = document.orderform;// get hidden form
			let oid = document.getElementById('orderid').value;
			oform.action="order?req=r&&oid="+oid;
                        oform.method="post";
			oform.submit();
		}
		for(let i = 0; i<editspan.length;i++){
			editspan[i].addEventListener('click',editorder);
		}
		function editorder() {
			let element = document.getElementById(this.id);
			let select = document.getElementsByTagName('select');
			for(let i = 0 ;i<select.length;i++){
				select[i].removeAttribute('disabled');
			}
			element.removeAttribute('readonly');
			console.log('hadclick'+(remeber.length));
			remeber[remeber.length] = element;
			updatef.removeAttribute('disabled');
			cancelf.removeAttribute('disabled');
			checkedit=true;
		}

		function changepos(){
			changep=true;
			let pos = document.getElementById('position');
			let btn = document.querySelector('.before');
			let abox = document.querySelector('.addressBx');
			let ibox = document.querySelector('.infor');
//			console.log(pos.value+change+(pos.value==1)+(pos.value===1));
			// ibox.classList.toggle('hidden');	
			if(pos.value==1){
				ibox.classList.add('hidden');
				abox.classList.remove('hidden');
				abox.classList.add('show');
			}
			if(pos.value!=1){
				abox.classList.remove('show');
				abox.classList.add('hidden');
				ibox.classList.remove('hidden');
			}
		}

		function showaddress(){
			let btn = document.querySelector('.before');
			let abox = document.querySelector('.addressBx');
			let ibox = document.querySelector('.infor');
			abox.classList.toggle('show');
			ibox.classList.toggle('hidden');
		}

		function updateorder(){
			let updateform = document.orderdetails;
			console.log("you\'re done.");
		}

		function cancelupdate(){
			console.log('here');
			let updatef = document.getElementById('update');
			let cancelf = document.getElementById('cancel');
			let select = document.getElementsByTagName('select');
			for(let i = 0 ;i<select.length;i++){
				select[i].removeAttribute('disabled');
			}
			for(let i = 0; i<remeber.length;i++){
					remeber[i].setAttribute('readonly',true);
			}
			document.orderdetails.reset();
			if(changep===true) changepos();//rest class address and infor of rtag
			changep = false;
			checkedit=false;
			updatef.setAttribute('disabled',true);
			cancelf.setAttribute('disabled',true);
			setf.setAttribute('disabled',true);
		}
	</script>
</body>
</html>
