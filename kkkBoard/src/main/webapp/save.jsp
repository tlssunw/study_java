<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.PreparedStatement" %>
    
<%

String myT = request.getParameter("title");
String myU = request.getParameter("user");
String myD = request.getParameter("date");
String myC = request.getParameter("content");

Connection conn=null;
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String user = "ssw";
	String pass = "1234";
	String url = "jdbc:mysql://localhost:3306/ssw";
	conn = DriverManager.getConnection(url, user,pass);
	
}catch(Exception e){
	System.out.println("드라이버 로드 실패 및 접속 실패");
	e.printStackTrace();
}

PreparedStatement pt = null;

String sql = "insert into kkkBoard(title, user, date, content)"+"values(?,?,?,?)";

try {
	
	pt=conn.prepareStatement(sql);
	pt.setString(1, myT);
	pt.setString(2, myU);
	pt.setString(3, myD);
	pt.setString(4, myC);
	pt.executeUpdate();
	System.out.println("작성완료");
	
}catch(Exception e){
	System.out.println("작성실패");
	e.printStackTrace();
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>