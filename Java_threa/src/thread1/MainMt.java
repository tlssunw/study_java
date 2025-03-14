package thread1;

import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		
//		MyThread th1 = new MyThread("장은호");
//		th1.start();
//		
//		MyThread th2 = new MyThread("김명준");
//		th2.start();
//		
//		
////		Test t = new Test();
////		t.testfor();
//		
//		for(int i=1; i<=1000; i++) {
//			System.out.println("main 메서드");
//			try {Thread.sleep(1000);}
//			catch(Exception e) {}
		
		Dino[] 알= new Dino[] {
				new Dino("티라노사우르스",10),
				new Dino("밸로시랩터",4),
				new Dino("프레나노콘",6),
				new Dino("스테고사우루스",7)
		};
	
//	Dino 티라노 = new Dino("티라노사우르스",10);
//	Dino 랩터 = new Dino("밸로시랩터",4);
//	Dino 익룡 = new Dino("프레나노콘",6);
//	Dino 스테고 = new Dino("스테고사우루스",7);
		
	Create[] device = new Create[알.length];
	for(int i=0; i<알.length; i++) {
		device[i] = new Create();
	}
	device[0].start(); device[1].start();
	device[2].start(); device[3].start();
	// 알 갯수만큼 스레드를 만들었다. 왜? 알 최대치만큼 스레드 있으면 좋을것 같다는 개인적생각	
	// 부화 시킬 공룡을 선택하여 부화 진행할 것이다.
	// 스레드를 통해 각 공룡별 시간만큼 동작하도록 할 것이다.
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<알.length; i++) {
		System.out.println("1~4중 알 하나 선택 : ");
		int select = sc.nextInt();
		
		Create.hatch(알[select-1]);
		System.out.println((i+1)+"번 부화장치 가동");
		
		System.out.print("계속 해?(1-계속): ");
		if(sc.nextInt() != 1) {
			break;
		}
	}
	
	}	

	}


