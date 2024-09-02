package ex03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num {
	private int num;

	public Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		return num % 5;
	}
		
	@Override
	public boolean equals(Object obj) {
//		Num n = (Num)obj;
//		if(this.num == n.num)
//			return true;
//		else
//			return false;
		return this.num == ((Num)obj).num ? true : false;
	}

}

public class HashSet04 {

	public static void main(String[] args) {
		// Set 컬렉션 - 중복 안됨, 순서 없음
		Set<Num> set = new HashSet<Num>();
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(30));
		set.add(new Num(10));  // 주소값이 달라서 다른 것으로 인식(중복됨)
				
		for(Num i : set)
			System.out.print(i + " ");
		
		System.out.println("\n----------------");
				
		// 반복자 획득
		Iterator<Num> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
					
	}

}
