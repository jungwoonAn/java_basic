package ex01;

public class UserMain {

	public static void main(String[] args) {
		SamsungTV stv = new SamsungTV();
		stv.powerOn();		
		stv.soundUp();
		stv.soundUp();		
		stv.soundDown();
		stv.soundDown();
		stv.soundDown();		
		stv.powerOn();
		
		LgTV lgtv = new LgTV();
		lgtv.power_On();
		System.out.println(lgtv.power);
		lgtv.sound_up();
		lgtv.sound_up();
		System.out.println(lgtv.sound);
		lgtv.sound_down();
		lgtv.sound_down();
		lgtv.sound_down();
		System.out.println(lgtv.sound);
		lgtv.power_Off();
		System.out.println(lgtv.power);
	}

}
