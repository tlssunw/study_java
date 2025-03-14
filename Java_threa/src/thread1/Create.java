package thread1;

public class Create extends Thread{
	
	public static Dino egg=null;
	
	public static void hatch(Dino dino) {
		egg=dino;
	}
	
	@Override
	public void run() {
		Dino myEgg=null; //지역변수
		while(true) {
			try {
				Thread.sleep(50);
			}catch(Exception e) {}
			
			// egg에 값이 들어오고 myEgg에 null인 경우는 공룡알 부화 시작 안한 상태
			// egg에 값이 들어왔지만 myEgg변수가 밗을 가진 경우는 부화 시작한 상태
			if(egg != null && myEgg ==null) {
				myEgg=egg; //run메서드 내부 변수에 값 전달
				egg=null; //값 전달 했으니까 다시 null
				System.out.println(myEgg.getName()+"부화 시작!");
				try {
					Thread.sleep(myEgg.getTime());
				}catch(Exception e) {}
				System.out.println(myEgg.getName()+"공룡 태어남");
				myEgg=null; //공룡 태어났으니까 다음 알을 받기위해 null
			}
		}
	}

}
// 스레드에서 처음 실행되는 메서드가 run이다.
// 즉, run메서드가 종료되면 스레드 사라짐
