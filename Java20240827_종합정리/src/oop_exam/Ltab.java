package oop_exam;

public class Ltab extends Mobile {
	
	public Ltab() {}
		
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public void operate(int time) {
		int battery = getBatterySize();
		battery -= (time*10);
		setBatterySize(battery);
	}

	@Override
	public void charge(int time) {
		int battery = getBatterySize();
		battery += (time*10);
		setBatterySize(battery);
	}

}
