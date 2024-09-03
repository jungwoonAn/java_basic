package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPratice {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        
        // 1. 짝수만 필터링
        List<Integer> evenNumbers = filterEvenNumbers(numbers, num -> num%2==0 ? true : false);
        System.out.println(evenNumbers);
        // 2. 짝수의 제곱 구하기
        List<Integer> squaredNumbers = map(evenNumbers, x -> x*x);
        System.out.println(squaredNumbers);
        
        // 3. 결과 출력
        forEach(squaredNumbers, n -> System.out.print(n + " "));
    }

    // 짝수만 필터링하는 메소드
    public static List<Integer> filterEvenNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
    	List<Integer> list = new ArrayList<Integer>();
    	for(int num : numbers) {
    		if(predicate.test(num))
    			list.add(num);
    	}
		return list;
    }

    // 숫자를 제곱하는 메소드
    public static List<Integer> map(List<Integer> numbers, Function<Integer, Integer> function) {
    	List<Integer> list = new ArrayList<Integer>();
    	for(int x : numbers) {
    		list.add(function.apply(x));
    	}
		return list;
    }

    // 숫자를 출력하는 메소드
    public static void forEach(List<Integer> numbers, Consumer<Integer> consumer) {
    	for(int n : numbers) {
    		consumer.accept(n);
    	}
    }

}
