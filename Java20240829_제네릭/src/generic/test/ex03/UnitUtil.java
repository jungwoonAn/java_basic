package generic.test.ex03;

import generic.test.ex03.unit.BioUnit;

public class UnitUtil {
	public static <T extends BioUnit> T maxHp(T unit1, T unit2) {
		if(unit1.getHp() >= unit2.getHp()) {
			return unit1;
		}else {
			return unit2;
		}
		
	}
}
