package ex02;

public class StringEx01 {

	public static void main(String[] args) {
		String str1 = "korea";
		String str2 = new String("801020-1079145");
		
		// 문자 추출 : charAt(index)
		char ch = str1.charAt(2);
		System.out.println(ch);
		
		char ch2 = str2.charAt(7);
		String gender = ch2 == '1' ? "남자" : "여자";
		System.out.println(gender);
		
		// 문자열 길이 : length()
		int len = str1.length();
		System.out.println("len : " + len);
		
		// 문자열 대체 : replace(oldStr, newStr)
		String oldStr = "java programming";   // String은 immutable객체라서 원본 변경 불가
		// 문자열을 변경하려면 새로운 변수에 담아서 사용
		String newStr = oldStr.replace("java", "python");   
		
		System.out.println(oldStr);  
		System.out.println(newStr);  
		
		// 문자열 잘라내기 : substring(beginIndex),
		// substring(beginIndex, endIndex) -> 오버로딩된 함수임
		String sub1 = oldStr.substring(5);
		System.out.println(sub1);  // index 5~ 끝까지
		
		String sub2 = oldStr.substring(5,9); // index 5~ 9이전까지(5<=index<9)
		System.out.println(sub2);
		
		// 문자열 찾기 : indexOf()
		int idx1 = oldStr.indexOf("prog");  // 문자열이 시작되는 index반환
		System.out.println(idx1);
		
		// 문자열 분리 : split()
		String subject = "국어,영어,수학,컴퓨터";
		String[] subjects = subject.split(",");
		for(int i=0; i<subjects.length; i++) {
			System.out.println(subjects[i]);
		}
		
		String phone = "010-1234-5678";
		String[] phones = phone.split("-");
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i]);
		}
				
	}

}
