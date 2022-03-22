<%-- 
    Document   : menu
    Created on : 17-Mar-2022, 19:29:19
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Admin Dashboard</title>
	<link rel="stylesheet" type="text/css" href="css/menu.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <c:set value="${requestScope.productview}" scope="request" var="productview"/>
        <c:set value="${sessionScope.listproduct}" scope="session" var="listproduct"/>
        <c:set value="${sessionScope.asidelist}" scope="request" var="asidelist"/>
        <c:set value="${newId}" scope="request" var="newId"/>
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
					<a href="#">
					<span class="icon"><i class="fa fa-sign-out" aria-hidden="true"></i></span>
					<span class="title">
						Logout
					</span>
					</a>
				</li>
			</ul>
		</div>
            <form name="formfood" method="post" hidden></form>
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
				<div class="menu">
					<div class="menuHeader">
						<h2>Menu</h2>
					</div>
                                        <c:if test="${listproduct!=null}">
					<table>
						<thead>
							<tr>
								<td>STT</td>
								<td>Food image</td>
								<td>Name</td>
								<td>Price</td>
								<td>Cost</td>
							</tr>
						</thead>
						<tbody>
                                                    <c:forEach var="i" begin="0" end="${listproduct.size()-1}">
							<tr class="viewdata" id="${listproduct.get(i).id}">
								<td>${i+1}</td>
								<td><div class="imageBx"><img src="images/foods.png" alt="foods"/></div></td>
								<td>${listproduct.get(i).name}</td>
								<td>${listproduct.get(i).price}</td>
								<td>${listproduct.get(i).cost}</td>
							</tr>
                                                    </c:forEach>									
						</tbody>
					</table>
								<div class="create" onclick="createfood()">New food +</div>
                                        </c:if>
				</div>
				<div class="rightCard">
					<div class="cardHeader">
						<h2>Top 10 most ordered items</h2>
                                                <p>This month</p>
					</div>
					<table>
						<tbody>
							<tr>
								<td><div class="imgBx"><img src="images/foods.png"></div></td>
								<td><h4>Lẩu cay</h4><span>250k VNĐ</span></td>
							</tr>
							<tr>
								<td><div class="imgBx"><img src="images/foods.png"></div></td>
								<td><h4>Xôi mẹt</h4><span>100k VNĐ</span></td>
							</tr>
							<tr>
								<td><div class="imgBx"><img src="images/foods.png"></div></td>
								<td><h4>Gà nướng</h4><span>250k VNĐ</span></td>
							</tr>
							<tr>
								<td><div class="imgBx"><img src="images/foods.png"></div></td>
								<td><h4>Canh cá</h4><span>30k VNĐ</span></td>
							</tr>
							<tr>
								<td><div class="imgBx"><img src="images/foods.png"></div></td>
								<td><h4>Canh chua</h4><span>30k VNĐ</span></td>
							</tr>
						</tbody>
					</table>
				</div>
                            <div class="tag createTag <c:if test="${newId!=null}">create</c:if>">
				<div class="cardHeader">
					<h2>Add new food</h2>
				</div>
				<div class="details">			
                                                <form method="post" action="menu">
						<div class="inputBx">
							<span class="title">ID</span>
							<input type="text" name="id" id="id" value="${newId}" readonly/>
						</div>
						<div class="inputBx">
							<span class="title">Name</span>
                                                        <input type="text" name="name" id="name" required/>
						</div>
						<div class="inputBx">
							<span class="title">Price</span>
							<input type="text" name="price" id="price" required/>
						</div>
						<div class="inputBx">
							<span class="title">Cost</span>
							<input type="text" name="cost" id="cost" required/>
						</div>
						<div class="inputBx">
							<span class="title">Quantity</span>
							<input type="number" name="quan" id="quan" required/>
						</div>
						<div class="footer">
                                                    <input type="hidden" name="req" value="s"/>
   							<button class="btn" id="create" >Create</button>
  							 <button class="btn" id="cancel" type="button" onclick="cancelcreate()">Cancel</button>
						</div>
					</form>
				</div>
   			</div>
                            <div class="tag update updateTag <c:if test="${productview==null}">hidden</c:if>">
				<div class="cardHeader">
					<h2>Food infomation</h2>
					<span class="close" onclick="closeCard()">X</span>
				</div>
				<div class="details">
                                    <form name="foodedit" action="updatemenu" method="post">
						<div class="inputBx">
							<span class="title">ID</span>
                                                        <input type="text" name="id" id="eid" value="${productview.id}" readonly/>
						</div>
						<div class="inputBx">
							<span class="title">Name</span>
							<input type="text" name="name" id="ename" value="${productview.name}"/>
							<label for="price" id="ename" class="icon">
							<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
							</label>
						</div>
						<div class="inputBx">
							<span class="title">Price</span>
							<input type="text" name="price" id="eprice" value="${productview.getprice()}"/>
							<label for="price" id="eprice" class="icon">
							<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
							</label>
						</div>
						<div class="inputBx">
							<span class="title">Cost</span>
							<input type="text" name="cost" id="ecost" value="${productview.getcost()}" />
							<label for="cost" id="ecost" class="icon">
							<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
							</label>
						</div>
                                                <div class="inputBx">
							<span class="title">Quantity</span>
							<input type="number" name="quan" id="equan" value="${productview.quantity}" />
							<label for="cost" id="equan" class="icon">
							<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
							</label>
						</div>        
						<div class="footer">
                                                    <input type="hidden" name="req" value="u"/>
<button class="btn" id="updatef">Update</button>
<button class="btn" id="deletef" type="button" onclick="delfood('${requestScope.viewid}')" >Delete</button>
<button class="btn" id="cancelf" type="button" onclick="cancelupdate()" disabled>Cancel</button>
						</div>
					</form>
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
		// menu
		let viewdata=document.getElementsByClassName('viewdata');
		for(let i = 0; i<viewdata.length;i++){
			viewdata[i].addEventListener('click',viewdetail);
		}
		function viewdetail(){
//			closeCard();
                        console.log("non direct!"+this.id);
			let foodform = document.formfood;
			foodform.action="menu?req=v&id="+this.id;
                        foodform.submit();
		}
		function closeCard(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return;
			}
			let close = document.querySelector('.close');
			let session = document.querySelector('.updateTag');
			close.classList.toggle('hidden');
			session.classList.toggle('hidden');
		}
		// ?
		let updatef = document.getElementById('updatef');
		let cancelf = document.getElementById('cancelf');
		let editspan = document.getElementsByClassName('icon');
		for(let i = 0; i<editspan.length;i++){
			editspan[i].addEventListener('change',editlabel);
		}
		const remeber=[];
		let checkedit = false;
		function editlabel() {
			console.log('had click to edit!');
			let element = document.getElementById(this.id);
			element.removeAttribute('readonly');
			console.log('hadclick'+(remeber.length));
			remeber[remeber.length] = element;
			updatef.removeAttribute('disabled');
			cancelf.removeAttribute('disabled');
			checkedit=true;
		}
		function cancelupdate(){
			let updatef = document.getElementById('updatef');
			let cancelf = document.getElementById('cancelf');
			for(let i = 0; i<remeber.length;i++){
					remeber[i].setAttribute('readonly',true);
			}
			checkedit=false;
			document.foodedit.reset();
			updatef.setAttribute('disabled',true);
			cancelf.setAttribute('disabled',true);
		}
		function createfood(){
			if (checkedit) {
				if(!confirm("Some changed in updating form with be discard? You want to close this card!")) return;
			}
			let foodform = document.formfood;
			foodform.action = "menu?req=c";
			foodform.submit();
		}
		function cancelcreate(){
			let cancelf = document.getElementById('cancelc');
			let createTag = document.querySelector('.createTag');
			createTag.classList.toggle('create');
		}
		function delfood(id){
			if(!confirm("Thao tác này sẽ gây mất dữ liệu và không thể khôi phục lại. Bạn có muốn tiếp tục xoá bản ghi này?")) return;
			let foodform = document.formfood;
			foodform.action = "menu?req=r&id="+id;
			foodform.submit();
		}
	</script>
</body>
</html>
