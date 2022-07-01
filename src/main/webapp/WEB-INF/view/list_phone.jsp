<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./common_style.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<!-- <h1>添加手机</h1> -->
		<a href="addPhone" class="btn btn-primary">添加手机</a>
		<br>
		<hr>
		<div class="row">

			<table class="table table-hover">
			<caption>List of phones</caption>
				<thead class="table-light">
					<tr>
						<th scope="col">序号</th>
						<th scope="col">型号</th>
						<th scope="col">品牌</th>
						<th scope="col">操作系统</th>
						<th scope="col">特征</th>
						<th scope="col">操作</th>
			   			<th scope="col"></th>
					<!-- 	<th scope="col">Delete</th>  -->
					</tr>
				</thead>
				<tbody>
					<c:forEach var="phone" items="${phoneList}">
						<tr>
							<td class="table-plus">${phone.id}</td>
							<td>${phone.modelNumber}</td>
							<td>${phone.brand}</td>			
							<td>${phone.opSys}</td>
							<td>${phone.features}</td>							
							
							
							<td><a href="editPhone?phoneid=${phone.id}"
							 class="btn btn-warning">编辑</a></td>
							<td><a href="deletePhone?phoneid=${phone.id}"
								class="btn btn-danger"> 删除 </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>