package movie;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {
	
	protected String menuText;  // 기본 메뉴
	protected Menu prevMenu;  // 메뉴 종료
	protected static final Scanner sc = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu prevMenu) {
		this.menuText = menuText;
		this.prevMenu = prevMenu;
	}
	
	public void setPrevMenu(Menu prevMenu) {  // 이전 메뉴 설정
		this.prevMenu = prevMenu;
	}

	@Override
	public void print() {
		System.out.print("\n" + menuText);  // 메인 메뉴 출력
	}
	
	@Override
	public abstract Menu next();
}
