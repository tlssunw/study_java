package interface4;

public class MainMthod {

	public static void main(String[] args) {
	
		RemoteCon[] rcon = new RemoteCon[] {
			new Light(), new Tv(), new Aircon()	
		};

		for(RemoteCon con : rcon) {
			con.operOn();
			con.operOff();
		}
	}

}
