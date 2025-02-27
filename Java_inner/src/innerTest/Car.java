package innerTest;

public class Car {
	private Tire tire;
	
	public Car(Tire tire) {
		this.setTire(tire);
	}
	// 포함관계에서 클래스객체 생성 시기

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

}
