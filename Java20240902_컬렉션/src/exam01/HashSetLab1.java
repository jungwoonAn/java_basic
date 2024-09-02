package exam01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetLab1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(true) {			
			lotto.add(random.nextInt(21)+10);
			if(lotto.size() == 10)
				break;
		}
		
		for(Integer i : lotto)
			System.out.print(i + ", ");
		
	}

}
