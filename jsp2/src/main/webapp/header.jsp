<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <div id="header">
 	<div id="nav">
 		<div class="top left">
 			<ul class="menu-list">
 				<li class="menu">선샤인</li>
 				<li class="menu">러브가 무엇이오</li>
 				<li class="menu">합시다 러브</li>
 				<li class="menu">사랑이죄가아니잖아</li>
 				<li class="menu">특급칭찬이야</li>
 			</ul>
 		</div>
 		
 		<%
 			String user = (String)session.getAttribute("user");
 		
 		%>
 		<div class="top right">
 			<% if( user != null) {%>
 				<b> <%=user %></b>
 			<%} else { %>
 			<div class="login-wrap">
 				<a href="/jsp2/signin" class="login-bt">러브로그인</a>
 			</div>
 			<%}%>
 			
 			
 			
 		</div>
 	</div>
 </div>