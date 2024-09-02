package ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet05 {
	public static void main(String[] args) {
		Set<Car> set = new HashSet<Car>();
		
		set.add(new Car("소나타","흰색"));
		set.add(new Car("K8","흰색"));
		set.add(new Car("K8","검정색"));
		set.add(new Car("그랜저","회색"));
		set.add(new Car("K8","검정색"));
		set.add(new Car("그랜저","회색"));
		
		Iterator<Car> itr = set.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("-------------------------");
		
	}
}
