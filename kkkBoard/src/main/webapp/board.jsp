<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제목</title>
</head>
<body>

	<form method="post" action="save.jsp">
		제목 : <input type="text" name="title"><br>
		작성자 : <input type="text" name="user"><br>
		작성일 : <input type="date" name="date"> <br>
		내용 : <input type="text" name="content">
		<button>업로드</button> 
	</form>
	
	
</body>
</html>