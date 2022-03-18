<%-- 
    Document   : customer
    Created on : 16-Mar-2022, 00:04:55
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Customer</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/employee.css">
	<link rel="stylesheet" type="text/css" href="css/customer.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <c:set var="custview" scope="request" value="${requestScope.custview}"/>
        <c:set var="newId" scope="request" value="${requestScope.newId}"/>
        <c:set var="listcust" scope="request" value="${requestScope.listcust}"/>
</head>
<body>
	<div class="container">
		<div class="navigation active">
			<ul>
				<li>
					<a href="home.jsp">
					<span class="icon">
					<i class="fa fa-cutlery" aria-hidden="true"></i></span>
					<span class="title">
						<h2>Cây đa quán</h2>
					</span>
					</a>
				</li>
				<li>
					<a href="Home.jsp">
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
   		<div class="main active">
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
                    <form method="post" name="fcust" hidden></form>
			<div class="details">
				<div class="recentOrders leftCard">
					<div class="cardHeader">
						<h2>Khách hàng</h2>
                                                 <c:if test="${listcust!=null}"><div onclick="createcust()" class="btn">Thêm</div></c:if>
					</div>
					<c:if test="${listcust!=null&&listcust.size()!=0}">
                                        <table>
						<thead>
							<tr>
								<td>STT</td>
								<td>Họ và tên</td>
								<!--<td>Giới tính</td>-->
								<td>Số điện thoại</td>
								<td>Địa chỉ</br>(thôn,làng)</td>
							</tr>
						</thead>
						<tbody>
                                                        <c:forEach var="i" begin="1" end="${listcust.size()}">
                                                            <tr class="viewdata" id="${listcust.get(i-1).ID}">
								<td>${i}</td>
								<td>${listcust.get(i-1).name}</td>
                                                                <%--<c:if test="${listcust.get(i-1).isGender()}">
                                                                    <td><i class="fa fa-mars" aria-hidden="true"></i></td>                                    
                                                                </c:if>
                                                                <c:if test="${!listcust.get(i-1).isGender()}">
                                                                    <td><i class="fa fa-mars" aria-hidden="true"></i></td>                                    
                                                                </c:if>--%>
                                                                <td>${listcust.get(i-1).phoneNumber}</td>
								<td>${listcust.get(i-1).getAddress(0)}</td>
							</tr>
                                                        </c:forEach>
						</tbody>
					</table>
                                        </c:if>
				</div>
				<div class="rightCard">
					<div class="cardHeader">
						<h2>Thông tin khách hàng</h2>
						<span class="close <c:if test="${custview==null}">hidden</c:if>" onclick="closeCard()"><i class="fa fa-times" aria-hidden="true"></i></span>
					</div>
					<div class="empty <c:if test="${custview!=null}">hidden</c:if>">
						<div class="icon"><i class="fa fa-archive" aria-hidden="true"></i></div>
						<div class="h2">Chọn một khách hàng để xem chi tiết</div>
					</div>
					<div class="session <c:if test="${custview==null}">hidden</c:if>">
                                                     <form method="post" action="customer" name="custdetails">
	<div class="info">
		<div class="imgBx">
			<img src="images/user.png" alt="user"/>
		</div>
		<div class="header">
			<div class="inputBx short">
				<span>Id:</span>
				<input type="text" name="id" readonly value="${custview.ID}"/>
			</div>
			<div class="inputBx">
				<span>Họ và tên:</span>
				<input type="text" id="name" name="name" readonly value="${custview.name} "/>
				<label for="name" id="name" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx short">
				<span>Giới tính</span>
				<select name="gender" disabled>
                                    <option hidden value="${custview.gender?"male":"female"}">${custview.gender?"Nam":"Nữ"}</option>
					<option value="male">Nam</option>
					<option value="female">Nữ</option>
				</select>
				<label for="gender" id="gender" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Số đơn đặt hàng</span>
				<input type="number" id="ordernum"  name="ordernum" readonly value="10"/>
                                <label for="ordernum" id="gender" class="addorder" onclick="console.log('you have direct!')">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx ">
				<span>Tuổi</span>
				<input type="number" id="age"  name="age" readonly value="${custview.getAge()}"/>
				<label for="age" id="age" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
			<div class="inputBx">
				<span>Số điện thoại</span>
				<input type="text" id="phonenum" name="phonenum" readonly value="${custview.phoneNumber}"/>
				<label for="phonenum" id="phonenum" class="icon">
				<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
				</label>
			</div>
		</div>
		<div class="session">
			<div class="addressBx">
				<div class="inputBx">
					<span>Thôn</span>
					<input type="text" id="address0" name="address0" readonly value="${custview.getAddress(0)}"/>
					<label for="address0" id="address0" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Xã, thị trấn</span>
					<input type="text" id="address1" name="address1" readonly value="${custview.getAddress(1)}"/>
					<label for="address1" id="address1" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Quận,huyện</span>
					<input type="text" id="address2" name="address2" readonly value="${custview.getAddress(2)}"/>
					<label for="address2" id="address2" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
				<div class="inputBx">
					<span>Tỉnh, thành phố</span>
					<input type="text" id="address3" name="address3" readonly value="${custview.getAddress(3)}"/>
					<label for="address3" id="address3" class="icon">
					<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
					</label>
				</div>
			</div>
		</div>					
	</div>	
	<div class="footer">
                <input type="hidden" name="req" id="req" value="u"/>
                <input type="submit" value="Update" class="btnf" disabled id="updatec"/>
                <button class="btnf" id="delete" type="button" onclick="deletecust('${requestScope.id}')">Delete</button>
                <button class="btnf" id="cancelc" type="button" onclick="cancelupdate()" disabled>Cancel</button>
	</div>		
						</form>
					</div>
					<div class="newcust <c:if test="${newId!=null}">create</c:if>">
						<header>
							<h2>Thêm khách hàng</h2>
						</header>
                                                <form name="addcust" action="customer" method="post">
	<div class="info">
		<div class="imgBx">
			<img src="images/user.png" alt="user"/>
		</div>
		<div class="header">
			<div class="inputBx short">
				<span>Id:</span>
				<input type="text" name=id" readonly value="${newId}"/>
			</div>
			<div class="inputBx">
				<span>Họ và tên:</span>
				<input type="text" id="name" name="name" required placeholder="Tên đầy đủ" />
			</div>
			<div class="inputBx short">
				<span>Giới tính</span>
				<select name="gender">
					<option value="male">Nam</option>
					<option value="female">Nữ</option>
				</select>
			</div>
			<div class="inputBx">
				<span>Tuổi</span>
				<input type="number" id="age" name="age" required placeholder="18,19,.." />
			</div>
			<div class="inputBx">
				<span>Số điện thoại</span>
				<input type="text" id="phonenum" name="phonenum" required placeholder="Phone number..." />
			</div>
		</div>
		<!--<div class="session">-->
			<div class="addressBx">
				<div class="inputBx">
					<span>Thôn</span>
					<input type="text" id="address0" name="address0" required placeholder="Thôn, làng (VD: Cống Khê)" />
				</div>
				<div class="inputBx">
					<span>Xã, thị trấn</span>
					<input type="text" id="address1" name="address1" required placeholder="Xã,thị trấn" />
				</div>
				<div class="inputBx">
					<span>Quận,huyện</span>
					<input type="text" id="address2" ame="address2" required placeholder="Quận,huyện"/>
				</div>
				<div class="inputBx">
					<span>Tỉnh, thành phố</span>
					<input type="text" id="address3" name="address3" required placeholder="tỉnh, thành"/>
				</div>
			</div>
		<!--</div>-->					
	</div>
	<div class="footer">
                <input type="hidden" name="req" value="s"/>
		<button class="btnf" id="create" type="submit">Create</button>
		<button class="btnf" id="cancel" onclick="cancelcreate()">Cancel<span class="icon"></span></button>
	</div>	
						</form>
					</div>
				</div>
			</div>
	</div>
</div>
    <script type="text/javascript">
        function toggleMenu(){
			let toggle = document.querySelector('.toggle');
			let navigation = document.querySelector('.navigation');
			let main = document.querySelector('.main');
			toggle.classList.toggle('active');
			navigation.classList.toggle('active');
			main.classList.toggle('active');
		}
        
        let viewdata=document.getElementsByClassName('viewdata');
		for(let i = 0; i<viewdata.length;i++){
			viewdata[i].addEventListener('click',viewdetail);
		}
		function viewdetail(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return false;
			}
                        let f = document.fcust;
			f.action="customer?req=v&id="+this.id;
                        f.submit();
		}
		function closeCard(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return false;
			}
			let close = document.querySelector('.close');
			let session = document.querySelector('.session');
			let empty = document.querySelector('.empty');
			close.classList.toggle('hidden');
			session.classList.toggle('hidden');
			empty.classList.toggle('hidden');
		}
		// variable of employee page
		let updatef = document.getElementById('updatec');
		let cancelf = document.getElementById('cancelc');
		let editspan = document.getElementsByClassName('icon');
		for(let i = 0; i<editspan.length;i++){
			editspan[i].addEventListener('click',editdata);
		}
		const remeber=[];
		let checkedit = false;
		function editdata() {
			let element = document.getElementById(this.id);
			e = document.getElementsByTagName('select')[0];
                        e.removeAttribute('disabled');
			element.removeAttribute('readonly');
			console.log('hadclick'+(remeber.length));
			remeber[remeber.length] = element;
			updatef.removeAttribute('disabled');
			cancelf.removeAttribute('disabled');
			checkedit=true;
		};
        
        
        function deletecust(id){
                    if(confirm("Bạn muốn tiếp tục xoá bản ghi này? Thao tác này có thế gây mất dữ liệu!")){
                    let f = document.fcust;
                    f.action="customer?req=r&id="+id;
                    f.submit();
                }
                };
	function cancelupdate(){
            let updatef = document.getElementById('updatec');
            let cancelf = document.getElementById('cancelc');
            for(let i = 0; i<remeber.length;i++){
            if(remeber[i].id==='gender'){
		remeber[i].setAttribute('disabled',true);
            } else{
		remeber[i].setAttribute('readonly',true);
            }	
            }
            document.custdetails.reset();
            updatef.setAttribute('disabled',true);
            cancelf.setAttribute('disabled',true);
	}
        function cancelcreate(){
            document.addcust.reset();
            let createpanel = document.querySelector('.newcust');
            createpanel.classList.toggle('create');
            console.log('canceled create!');
	}
        function createcust(){
        if (checkedit) {
		if(!confirm("Some changed in updating form with be discard? You want redirect to create new employee")){return;}
		else cancelupdate();
	}
        console.log('click here');
        let fcust = document.fcust;
        fcust.action="customer?req=c";
        fcust.submit();
    }
    </script>
</body>
</html>
