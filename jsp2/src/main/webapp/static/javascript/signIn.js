/**
 * signIn.js
 * 
 * 로그인하기 위해 아이디 비밀번호를 입력해야지만 로그인 버튼 클릭 된다.
 */

window.onload=function(){
	 // 현재 페이지 로그인 완료 되면 (html내용이 브라우저에 모두 표시됨)
	 let bt = document.getElementsByClassName("signIn-bt")[0];
	 bt.disabled=true; //로그인버튼 비활성화
	 
	 let inputId = document.getElementById("userId");
	 let inputPw = document.getElementById("userPw");
	 
	 inputId.addEventListener("keyup", function(){
		 if(inputId.value != '' &&inputPw.value != ''){
			 bt.disabled=false; // 로그인 버튼 활성화
		 }else{
			 bt.disabled=true; // 로그인 버튼 비활성화
		 }
	 });
	 
	 inputPw.addEventListener("keyup",function(){
			 if(inputId.value != '' &&inputPw.value != ''){
			 bt.disabled=false; // 로그인 버튼 활성화
		 }else{
			 bt.disabled=true; // 로그인 버튼 비활성화
		 }	 
	 });
	 
	 //a태그 없이 페이지 이동
	 document.getElementsByClassName("join")[0].addEventListener("click",function(){
		 location.href="signUp.jsp";
	 })
 };