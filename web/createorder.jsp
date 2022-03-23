<%-- 
    Document   : createorder
    Created on : 22-Mar-2022, 19:29:22
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Create Order</title>
        <link href="css/createorder.css" rel="stylesheet" type="text/css"/>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <c:set value="${sessionScope.listfood}"  scope="session" var="listfood"/>
        <c:set var="listcust" scope="session" value="${sessionScope.listcust}"/>
        <c:set var="cart" scope="session" value="${sessionScope.cart}"/>
        <c:set var="custorder" scope="session" value="${sessionScope.custorder}"/>
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
            <form name="foodform" method="post" hidden></form>
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
						<h2>Menu</h2>
					</div>
					<div class="session">
                                            
                                            <c:forEach var="food" items="${listfood}">
						<div class="product_tag">
							<img src="images/foods.png" alt="product">
							<div class="title">
								<p>${food.getName()}</p>
								<p>${food.getprice()}</p>
								<button onclick="Addtocard('${food.id}')">Add to cart</button>
							</div>
						</div>                                                
                                            </c:forEach>	
					</div>
				</div>
				<div class="rightCard">
					<div class="cardHeader">
						<h2>Thông tin hoá đơn</h2>
						<span class="close" onclick="closeCard()"><i class="fa fa-times" aria-hidden="true"></i></span>
					</div>
					<div class="empty hidden">
						<div class="icon"><i class="fa fa-archive" aria-hidden="true"></i></div>
						<div class="h2">Chọn một Hoá đơn để xem chi tiết</div>
					</div>
					<div class="session">
						<form method="post" name="orderform">
<div class="content">
		<div class="header">
			<input type="text" id="emid" name="emid" readonly value="EM02" hidden />
			<div class="inputBx short">
				<span>Order Id:</span>
				<input type="text" name="orderid" id="orderid" readonly value="${cart.id}"/>
			</div>
			<div class="inputBx">
				<span>Họ và tên:</span>
				<select name="name" id="custname" onchange="changecust()"/>
                                <option value="${custorder.ID}">${custorder.name}</option>
                                <c:forEach var="cust" items="${listcust}">
                                        <option value="${cust.ID}">${cust.name}</option>
					<option value="${cust.phoneNumber}, ${cust.address}" hidden></option>    
                                </c:forEach>
				</select>
			</div>
			<div class="inputBx">
				<span>Số điện thoại</span>
                                <input type="text" id="phonenum" name="phonenum" readonly value="${custorder.phoneNumber}"/>
			</div>
			<div class="inputBx short" onchange="changepos()">
				<span>Đơn hàng</span>
				<select name="position" id="position" disabled>
					<option value="0">Tại quán</option>
					<option value="1">Ship</option>
				</select>
				<label for="position" id="position" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx ">
				<span>Ngày</span>
				<input type="date" id="dateorder"  name="dateorder" value="${cart.date}"/>
				<label for="dateorder" id="dateorder" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
					<span>Status</span>
					<select name="status" id="status" onchange="changestatus()">
					<option value="${cart.status}">${cart.getstatus()}</option>
					<option value="0">Chưa nhận</option>
					<option value="1">Đang xử lý</option>
					<option value="2">Hoàn thành</option>
					<option value="3">Đã thanh toán</option>
					<option value="4">Huỷ đơn</option>
					</select>
			</div>
			<div class="addressBx show hidden">
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
	<div class="infor">
		<table>
			<thead>
				<tr>
					<td>Tên món</td>
					<td>Số lượng</td>
					<td>Đơn giá</td>
					<td>Thành tiền</td>
				</tr>
			</thead>
			<tbody>
                            <c:forEach var="fcart" items="${cart.orderdetail}" >
				<tr>
					<td>${fcart.name}</td>
                                        <td>
                                            <span class="btnf" onclick="desc('${fcart.id}')">-</span>
                                            <%--<input type="number" id="${fcart.id}" name="quantity" onchange="changequantity('${fcart.id}')" value="${fcart.quantity}"/>--%>
                                            <span class="btnf" onclick="increase('${fcart.id}')">+</span>
                                        </td>
                                        <td>${fcart.getprice()}</td>
					<td>${fcart.quantity*fcart.price}</td>
				</tr>
                            </c:forEach>
			</tbody>
		</table>
	</div>	
	<hr>
	<div class="total"><span>Tổng tiền:</span>${cart.getTotal()} VNĐ</div>
	<div class="footer">
                <input type="text" name="req" value="submit" hidden/>
		<button class="btnf" id="update" type="submit">Tạo đơn hàng</button>
		<button class="btnf" id="cancel" type="button" onclick="cancelupdate()">Cancel</button>
	</div>		
</div>
                                                </form>
				</div>
			</div>
	</div>
</div>
	<script>
// 		intial global 
		let updatef = document.getElementById('update');
		let cancelf = document.getElementById('cancel');
		let checkedit = false;
		let change = false;
		let remeber = [];
		let editspan = document.getElementsByClassName('icon');
		let oid = document.getElementById('orderid').value;
		function toggleMenu(){
			let toggle = document.querySelector('.toggle');
			let navigation = document.querySelector('.navigation');
			let main = document.querySelector('.main');
			toggle.classList.toggle('active');
			navigation.classList.toggle('active');
			main.classList.toggle('active');
		}

		// --------------------------------------------------------------------------
		// let orderdata=document.getElementsByClassName('orderdata');
		// for(let i = 0; i<orderdata.length;i++){
		// 	orderdata[i].addEventListener('click',viewdetail);
		// }
		// function viewdetail(){
		// 	closeCard();
		// 	let oform = document.orderform;
		// 	console.log(this.id);
		// 	oform.action=""
		// 	// oform.submit();
		// }
                function desc(fid){
			let quan = document.getElementById(fid);
			quan.value=quan.value-1;
			changequantity(fid);
		}
		function increase(fid){
			let quan = document.getElementById(fid);
			let quantity = Number(quan.value);
			quan.value=(1+quantity);
			changequantity(fid);
		}
		function changequantity(fid){
			let orderform = document.foodform;
			let quan = document.getElementById(fid).value;
			orderform.action = "createorder?req=update&quantity="+quan+"&fid="+fid;
			orderform.submit();
		}
		function Addtocard(fid){
			let orderform = document.foodform;
			orderform.action="createorder?req=add&fid="+fid;
//                        console.log(orderform.action);
			orderform.submit();
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
				a[j]=document.getElementById('address'+j)
			}
			let s = name.options[name.selectedIndex+1].value.split(',');
			phonenum.value = s[0]
			for(let z = 1; z<s.length;z++){
				a[z-1].value=s[z].trim();
			}
		}


		function deleteorder(){
			if(!confirm('Thao tác này sẽ gây mât dữ liệu! Bạn muốn tiếp tục xoá bản ghi này không ?')) return;
			let oform = document.orderform;// get hidden form
			let oid = document.getElementById('orderid').value;
			oform.action="?req=r&&id="+oid;
			console.log(oform.action);
			// oform.submit();
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


		function changestatus(){
			change=true;
			cancelf.removeAttribute('disabled');
			setf.removeAttribute('disabled');
		}

		function changepos(){
			changep=true;
			let pos = document.getElementById('position');
			let btn = document.querySelector('.before');
			let abox = document.querySelector('.addressBx');
			let ibox = document.querySelector('.infor');
			console.log(pos.value+change);
			// ibox.classList.toggle('hidden');	
			if(pos.value=='ship'){
				ibox.classList.add('hidden');
				abox.classList.remove('hidden')
				abox.classList.add('show');
			}
			if(pos.value!='ship'){
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
			if(changep==true) changepos();//rest class address and infor of rtag
			changep = false;
			checkedit=false;
			updatef.setAttribute('disabled',true);
			cancelf.setAttribute('disabled',true);
			setf.setAttribute('disabled',true);
		}
	</script>
</body>
</html>
