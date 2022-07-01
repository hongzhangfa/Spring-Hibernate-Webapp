<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./common_style.jsp"%>
</head>
<body>

	<div class="container mt-3">

		<h1>添加手机</h1>
		<form:form action="addPhoneProcess" modelAttribute="phone" method="post">
		<!-- 判断是否存在同一id数据，更新 !重要 -->
		<form:hidden path="id"/>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="model">型号</label>
						<form:input type="text" class="form-control" id="model"
							path="modelNumber" placeholder="Enter modelNumber" />
					</div>
				</div>

				<div class="col">
					<div class="form-group">
						<label for="brand">品牌</label>
						<form:input type="text" class="form-control" id="brand"
							path="brand" placeholder="Enter brand" />
					</div>
				</div>
			</div>
			<hr>
			<h4>操作系统</h4>
			<div class="form-check">
				<form:radiobutton class="form-check-input me-1" path="opSys"
					value="Android" />
				<label class="form-check-label" for="opSys1"> Android </label>
			</div>

			<div class="form-check">
				<form:radiobutton class="form-check-input me-1" path="opSys"
					value="IOS" />
				<label class="form-check-label" for="opSys2"> IOS </label>
			</div>
			<hr>

	       <ul class="list-group">
				<li class="list-group-item">
				<!-- checked="checked" --> 
				<form:checkbox 
						class="form-check-input me-1" value="NFC" path="features"
						aria-label="..." /> NFC</li>
				<li class="list-group-item">
				<form:checkbox
						class="form-check-input me-1" value="人脸识别" path="features"
						aria-label="..." /> 人脸识别</li>
				<li class="list-group-item">
				<form:checkbox
						class="form-check-input me-1" value="无线充电" path="features"
						aria-label="..." /> 无线充电</li>
				<li class="list-group-item">
				<form:checkbox
						class="form-check-input me-1" value="曲面屏" path="features"
						aria-label="..." /> 曲面屏</li>
			</ul> 

			<br/>


			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>

	</div>

</body>
</html>