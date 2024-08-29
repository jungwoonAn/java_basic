package exam02;

public class Util {
	// 제네릭 메서드
//	public static <K, V> V getVaule(Pair<K, V> pair, K key) {
//		if(pair.getKey() == key) {
//			return pair.getValue();
//		}else {
//			return null;
//		}
//	}
	
	public static <P extends Pair<K, V>, K, V> V getVaule(P pair, K key) {
		if(pair.getKey() == key) {
			return pair.getValue();
		}else {
			return null;
		}
	}
}
