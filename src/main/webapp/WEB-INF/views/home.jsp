<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<c:if test="${!empty msg}">

		<script>
			alert("${msg}");
			console.log("진입")

			<c:remove var="msg"/>
		</script>

	</c:if>

	<h3>회원 가입</h3>

	<form action="signUp" method="post">

		<label> ID : </label> <input type="text" name="id"> <br>

		<label>PWD : </label> <input type="password" name="pwd">
		<br> <label>이름 : </label> <input type="text" name="name">
		<br>

		<button>회원가입</button>

		<button type="reset">리셋</button>

	</form>
	<div>
		${result}
	</div>

</body>

</html>
