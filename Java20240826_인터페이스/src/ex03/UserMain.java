package ex03;

public class UserMain {

	public static void main(String[] args) {
		TV tv = new SamsungTV();
//		TV tv = new LgTV();
		tv.powerOn();
		
		tv.soundUp();
		tv.soundUp();
		
		tv.soundDown();
		tv.soundDown();
		tv.soundDown();
		
		tv.powerOff();
	}

}
