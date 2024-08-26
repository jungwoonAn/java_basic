package ex01;

public class SamsungTV {
	// power -> on, off -> boolean
	// sound -> 올리고, 내리고 -> int
	private boolean power;
	private int sound;
	
	public void powerOn() {
		power = !power;
		if(power == true)
			System.out.println("전원을 켰습니다.");
		else
			System.out.println("전원을 껐습니다.");		
	}
	
	public void soundUp() {
		if(sound < 100)
			sound++;
		else
			sound = 100;
		System.out.println("볼륨을 올렸습니다 : " + sound);
	}
	
	public void soundDown() {
		if(sound > 0)
			sound--;
		else
			sound = 0;
		System.out.println("볼륨을 내렸습니다 : " + sound);		
	}
}
