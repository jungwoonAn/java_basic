package oop_exam;

public class Otab extends Mobile {
	
	public Otab() {}	

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public void operate(int time) {
		int battery = getBatterySize();
		battery -= (time*12);
		setBatterySize(battery);
	}

	@Override
	public void charge(int time) {
		int battery = getBatterySize();
		battery += (time*8);
		setBatterySize(battery);
	}

}
