package Modifier;

import inherit.Product; // 패키지가 다르면 임포트 해야함

public class Microwave extends Product { // 전자레인지
	
	public Microwave() {
		System.out.println(super.brand);
	}
	
	@Override
	public void power() {
	System.out.println("전자레인지 전원");
}
	
	
	
}
