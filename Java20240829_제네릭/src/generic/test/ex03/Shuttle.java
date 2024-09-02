package generic.test.ex03;

import generic.test.ex03.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
	private T unit;
	
	public void in(T t) {
		unit = t;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + unit.getName() +", HP : " + unit.getHp() );
	}
}
