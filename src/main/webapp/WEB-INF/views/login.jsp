<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="member" method="get">
	<label id="id">아이디</label></label><input type="text" name="id" />
	<label id="passwd">비밀번호</label><input type="text" name="passwd"/>
	<label id="name">이름</label><input type="text" name="name"/>
	<button class="button">입력</button>
</form>


<script>
/* $(".button").on("click",function(){
	$.ajax({
		url:"member",
		data : JSON.stringify(job), 
		 type : "post", 
		 contentType : "application/json; charset=utf-8",  
		 success : function(data){ 
			console.log("성공입니다")
		 }
		,
		 error : function(request, status, errorData){ 
			 alert("error code : " + request.status + "\n" 
					 + "message : " + request.responseText + "\n" 
					 + "error : " + errorData); 
		 } 
	})
}) */
</script>
</body>
</html>