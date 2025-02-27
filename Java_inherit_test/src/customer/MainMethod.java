package customer; 

import java.sql.*;
import java.util.Scanner;
import java.util.Date;

import store.*;

public class MainMethod {

	public static void main(String[] args) {
	
		Banana.banana = new Banana(6000,100);
		Grape.grape = new Grape(5000,100);
		Orange.orange = new Orange(4000,500);
		
		
//		// 바나나와 포도, 오렌지 갯수가 많이 필요하다면?
//		// 바나나 15개, 포도 6개, 오렌지 54개
//		

		
		
		// 다형성 - 하나의 타입으로 여러 타입을 나눌 수 있다.
		// 상속 관계, implements,  
		
//		Fruit f = new Banana(2500,500); // f에 바나나 객체를 담음
//		f.makeJuice();
//		Fruit g = new Grape(3500,400);
//		f.makeJuice();
		
		
		Fruit[] menu = new Fruit[10];
		// 데이터베이스 연결하기(드라이버로드)
		// com.mysql.cj.jdbc.Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
		// 계정 로그인
		String user = "ssw";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/ssw";
		
		// 데이터베이스와 연결한 객체를 저장 해둬야 한다.
		Connection conn = null; // 데이터베이스 연결 객체 저장할 곳
		
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}
		
		// 쿼리문 작성하여 보내고 받기
		// select * from store_menu1;
		String sql = "select * from store_menu1"; // 조회쿼리문
		// 작성한 쿼리문을 데이터베이스에 보내려면
		// Statement, PreparedStatement
		
		Statement st = null; // 쿼리문 보낼 때 필요
		ResultSet rs = null; // 조회결과 받을 때 필요
		
		try {
			st=conn.createStatement(); //쿼리문 전송하기 위한 준비
			rs=st.executeQuery(sql); //쿼리문 보내고 결과 받기
			
			// 데이터베이스에서 조회한 데이터들을
			// 바나나, 포도, 오렌지 객체로 저장될 수 있게 하기
			
			// rs.next()를 통해서 조회된 결과값이 존재하는지 확인
			for (int i=0; rs.next(); i++) {

				int cost = rs.getInt("cost");//컬럼명이 cost인 데이터 가져옴
				int cap = rs.getInt("capacity"); //용량
				String type = rs.getString("fruit_type"); //과일종류
				
				if( type.equals("Banana"))
					menu[i] = new Banana(cost,cap);
				if( type.equals("Grape"))
					menu[i] = new Grape(cost,cap);
				if( type.equals("Orange"))
					menu[i] = new Orange(cost,cap);
				
				
			}
			
		} catch (SQLException e) {
			System.out.println("쿼리문 조회 실패");
			e.printStackTrace();
		}
		

		
		
		
//		menu[0] = new Banana(2500,350);
//		menu[1] = new Banana(3000,400);
//		menu[2] = new Orange(3500,400);
//		menu[3] = new Banana(3500,500);
//		menu[4] = new Grape(4500,350);
//		menu[5] = new Banana(4500,550);
//		menu[6] = new Grape(5000,450);
//		menu[7] = new Orange(4000,350);
//		menu[8] = new Orange(5000,550);
//		menu[9] = new Grape(6000,600);
		//import 해야 빨간줄 나오지 않음 
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctml = new Buyer(10000); //구매자
		
		for(int i=0; i<menu.length; i++) {
			System.out.println( (i+1)+". "+menu[i] );
		}
		
		// 어떤 주스를 사먹을거냐!
		Scanner sc = new Scanner(System.in);
		System.out.print("구매번호: ");
		int num = sc.nextInt();
		
		// 결제 진행하고 언제 주스를 사먹었는지 어떤 주스인지 기록
		ctml.setMoney(ctml.getMoney() - menu[num-1].getCost());
		// 내가 만약 5번 선택했다면, num-1은 4니까
		// 4번 메뉴배열에 4번 인덱스의 객체를 선택한 것이고
		// 해당 객체의 getCost니까 Cost 변수의 값 가지고 온다.
		// ctml.getMoney는 get으로 시작하는 메서드 변수의 값 출력이니까
		// 10000원을 가지고 온다.
		// 그러니까 10000-3500 된다. 이것의 결과 6500을 setMoney를 통해
		// money 변수에 저장하게 되니 money변수는 6500을 가진다.
		
		ctml.setBuyDate(new Date());
		ctml.setItem(menu[num-1]);
		
		//부모클래스에 getset메소드 만들기(Fruit)
		
		System.out.println( ctml );
		
//		System.out.println("보유머니 :"+ctml.getMoney());

		
		
	}

}
