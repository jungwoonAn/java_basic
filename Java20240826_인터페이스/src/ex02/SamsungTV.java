package ex02;

public class SamsungTV implements TV {

	boolean power;
	int sound;
	
	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원을 켰습니다.");
	}
	
	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원을 껐습니다.");
	}
	
	@Override
	public void soundUp() {
		if(sound < 100)
			sound++;
		else
			sound = 100;	
		System.out.println("볼륨을 올렸습니다 : " + sound);
	}
	
	@Override
	public void soundDown() {
		if(sound > 0)
			sound--;
		else
			sound = 0;
		System.out.println("볼륨을 내렸습니다 : " + sound);
	}
}
