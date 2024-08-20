package ex03;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		// 배열 복사
		// 얕은 복사(shallow copy)
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		newIntArray = oldIntArray; // 주소값만 복사(같은 배열객체 참조)
		System.out.println(newIntArray + ", " + oldIntArray);
		
		System.out.println("--- newIntArray ---");
		for(int i=0; i<newIntArray.length; i++)
			System.out.println(newIntArray[i]);
		
		// oldIntArray[2]값 변경
		oldIntArray[2] = 300;  		
		System.out.println("oldIntArray[2] : " + oldIntArray[2]);
		// newIntArray[2]값도 변경됨
		System.out.println("newIntArray[2] : " + newIntArray[2]);  
		
		System.out.println("-------------------");
		
		// 깊은 복사(deep copy)
		int[] oldIntArray2 = {1,2,3};
		int[] newIntArray2 = new int[5];
		
		// 방법1 : for문으로
		// oldIntArray2에 있는 값을 newIntArray2로 복사	
		for(int i=0; i<oldIntArray2.length; i++)
			newIntArray2[i] = oldIntArray2[i];
		
		oldIntArray2[2] = 300;  // oldIntArray[2]값 변경
		
		System.out.println("--- oldIntArray2 ---");
		for(int i=0; i<oldIntArray2.length; i++)
			System.out.println(oldIntArray2[i]);
		
		System.out.println("--- newIntArray2 ---");
		for(int i=0; i<newIntArray2.length; i++)
			System.out.println(newIntArray2[i]);
		
		System.out.println("-------------------");
		
		int[] oldIntArray3 = {10,20,30,40,50};
		int[] newIntArray3 = new int[5];
		
		// 방법2 : System.arraycopy()사용
		System.arraycopy(oldIntArray3, 0, newIntArray3, 0, oldIntArray3.length);
		
		System.out.println("--- oldIntArray3 ---");
		for(int i=0; i<oldIntArray3.length; i++)
			System.out.println(oldIntArray3[i]);
		
		System.out.println("--- newIntArray3 ---");
//		for(int i=0; i<newIntArray3.length; i++)
//			System.out.println(newIntArray3[i]);
		
		// 향상된 for문
		for(int n : newIntArray3)
			System.out.println(n);
		
		System.out.println("-------------------");
		
		String[] str = {"java","spring","python","javascript"};
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]);
		
		System.out.println();
		
		for(String s : str)
			System.out.println(s);
		
	}

}
