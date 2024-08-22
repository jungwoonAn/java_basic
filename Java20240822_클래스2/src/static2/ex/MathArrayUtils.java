package static2.ex;

public class MathArrayUtils {
	// 인스턴스를 생성하지 못하게 한다.
	private MathArrayUtils() {}
	
	static int sum(int[] vals) {
		int sum = 0;
		for(int i : vals) {
			sum += i;
		}
		return sum;
	}
	
	static double average(int[] vals) {
		double avg = sum(vals) / (double)vals.length;
		return avg;
	}
	
	static int min(int[] vals) {
		int min = vals[0];
		for(int i : vals) {
			if(min > i) {
				min = i;
			}
		}
		return min;
	}
	
	static int max(int[] vals) {
		int max = vals[0];
		for(int i : vals) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}
	
}
