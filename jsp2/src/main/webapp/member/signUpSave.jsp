<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- signUpSave.jsp 데이터 저장용 --%>
    
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.PreparedStatement" %>

<%


Connection conn=null;
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	String user = "tlssunw";
	String pass = "1234";
	String url = "jdbc:mysql://210.219.170.244:3306/tlssunw";
	conn = DriverManager.getConnection(url, user, pass);
	
}catch(Exception e){
	System.out.println("드라이버 로드 실패 및 접속 실패");
	e.printStackTrace();
}

String myEmail = request.getParameter("email");
String myPw = request.getParameter("password");
String myName = request.getParameter("name");
String myTel = request.getParameter("tel");
String myBirthY = request.getParameter("birthYear");
String myBirthM = request.getParameter("birthMonth");
int year = Integer.parseInt(myBirthY);
int month = Integer.parseInt(myBirthM);

PreparedStatement pt = null;

String sql = "insert into test_member(email, password, name, tel, birth_year, birth_month)"+"values(?,?,?,?,?,?)";


try {
	
	pt=conn.prepareStatement(sql);
	pt.setString(1, myEmail);
	pt.setString(2, myPw);
	pt.setString(3, myName);
	pt.setString(4, myTel);
	pt.setInt(5, year);
	pt.setInt(6, month);
	pt.executeUpdate();
	System.out.println("작성완료");
	
}catch(Exception e){
	System.out.println("작성실패");
	e.printStackTrace();
}
%>
