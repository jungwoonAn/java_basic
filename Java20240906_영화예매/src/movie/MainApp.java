package movie;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("프로그램을 시작합니다!");
		
		Menu menu = MainMenu.getInstance();  // 메뉴를 가져옴
		// .getInstance() : 싱글톤 패턴으로 생성된 객체의 주소값을 menu에 저장
		
		while(menu != null) {  // 메뉴가 있으면 반복
			menu.print();  // 현재 메뉴 출력
			menu = menu.next();  // 사용자 입력 후, 메뉴로 이동
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}

}