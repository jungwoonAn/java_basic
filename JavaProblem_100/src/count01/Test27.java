package count01;

public class Test27 {

	public static void main(String[] args) {
		// 타입변환과 배열
		double[] doubles = {1.1, 2.2, 3.3};
		int[] ints = new int[doubles.length];
		
		for(int i=0; i<doubles.length; i++) {
			ints[i] = (int)doubles[i];
		}
		
		for(int i: ints) {
			System.out.println(i);
		}
	}

}
