package movie;

public class MainMenu extends AbstractMenu {
	
	// 싱글톤 패턴 - 객체 하나만 생성
	private static final MainMenu instance = new MainMenu(null);

	private static final String MAIN_MENU_TEXT = // 메뉴 기본 문구
			"1: 영화 예매하기 \n" +
			"2: 영화 확인하기 \n" +
			"3: 영화 취소하기 \n" +
			"4: 관리자 메뉴로 이동 \n" +
			"q: 종료 \n" +
			"메뉴를 선택하세요 : ";			
	
	private MainMenu(Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu);  // 부모 생성자 호출
	}
	
	public static MainMenu getInstance() {
		return instance;  // MainMenu 객체 생성 주소반환(싱글톤 패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
			case "4" :
				if(!checkAdminPassword()) {
					System.out.println(">> 잘못된 비밀번호 입니다.");
					System.out.println(">> 다시 확인하고 입력하세요.");					
					return this;
				}else {
					AdminMenu adminmenu = AdminMenu.getInstance();
					adminmenu.setPrevMenu(this);
					return adminmenu;
				}				
			case "q":
				return prevMenu;	
			default:
				return this;
		}
	}
	
	// 관리자 비밀번호 확인
	private boolean checkAdminPassword() {
		System.out.print("관리자 비밀번호를 입력하세요 : ");
		return "1234".equals(sc.nextLine());
	}

}
