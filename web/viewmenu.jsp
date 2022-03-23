<%-- 
    Document   : viewmenu
    Created on : 23-Mar-2022, 08:24:31
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
        body{
        	display: flex;
        	height: 100vh;
        }	

.details {
	position: absolute;
	top: 0;
	left: 50%;
	transform: translate(-50%,0%);
	border-radius: 8px;
	padding: 5px 50px;
	background: white;
	border: 1px solid rgba(0, 0, 0, 0.1);
	overflow: hidden;
	z-index: 2;
	transition: 1s;
}

.details .cardHeader .close{
	width: 33px;
	height: 33px;
	padding-top: 6px;
	text-align: center;
	border-radius: 50%;
}
.details .cardHeader .close:hover{
	background: #f00;
	color: #fff;
}

.details .details{
	display: flex;
	justify-content: center;
}
.details .inputBx{
	position: relative;
	width: 200px;
	height: 30px;
	margin-bottom: 25px;
	padding: 5px;
}

.details .inputBx{
	border-radius: none;
}
.details .inputBx input{
   		width: 100%;
   		height: 100%;
   		border: none;
   		font-size: 16px;
   		transition: 1s;
   		transition-timing-function: ease-in-out;
   		border-bottom: 1px solid rgba(0, 0, 0, 0.1);
}

.details .inputBx input:focus{
   		outline: none;
   		border-color: rgba(94, 255, 148, 1.0);
}

.details .inputBx span{
		font-size: 14px;
		top: -20px;
		left: 0;
		padding: 5px;
}

.details .inputBx label{
		position: absolute;
		right:0;
		top: 20px;
		padding: 5px;
		opacity: 0.3;
}

.details .footer{
	display: flex;
	justify-content: safe flex-end;
}

.btn{
	padding: 5px 8px;
	margin: 20px 5px;
	border: 1px solid rgba(0, 0, 0, 0.1);
	border-radius: 5px;
	cursor: pointer;
}
#delete{
	background: #ff0000b3;
	color: #fff;
}
#delete:hover{
	color: #ff0000b3;
	background: #fff;
	border-color: #f00;
}
#cancel{
	margin: 20px 0 20px 5px;
}
#cancel:hover{
	background: red;
	color: white;
}
#create:hover{
	background: rgba(94, 255, 148, 1.0);
	color:#fff;
}
#update:hover{
	background: #c7c138c2;
	color: #fff;
}
        </style>
         <c:set value="${requestScope.productview}" scope="request" var="productview"/>
    </head>
    <body>
        <form name="formfood" method="post" hidden/></form>
    <div class="details">
        <form name="foodedit" action="menu" method="post">
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
<a href="menu" onclick="if(!confirm('Bạn có muốn dừng viêc chỉnh sửa ?'))return false"><button class="btn" id="cancelf" type="button">Cancel</button></a>
						</div>
					</form>
				</div>
			</div>
                        <script>
                            function delfood(id){
                            if(!confirm("Thao tác này sẽ gây mất dữ liệu và không thể khôi phục lại. Bạn có muốn tiếp tục xoá bản ghi này?")) return;
			let foodform = document.formfood;
			foodform.action = "menu?req=r&id="+id;
			foodform.submit();
                        }
                        </script>
    </body>
</html>
