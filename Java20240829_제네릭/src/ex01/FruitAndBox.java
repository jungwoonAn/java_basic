package ex01;

// 제네릭 사용 전 코드
class Apple {
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class AppleBox {
	private Apple app;

	public Apple getApp() {
		return app;
	}

	public void setApp(Apple app) {
		this.app = app;
	}
	
}

class OrangeBox {
	private Orange org;

	public Orange getOrg() {
		return org;
	}

	public void setOrg(Orange org) {
		this.org = org;
	}
	
}

public class FruitAndBox {

	public static void main(String[] args) {
		AppleBox abox = new AppleBox();
		OrangeBox obox = new OrangeBox();
		
		abox.setApp(new Apple());
//		abox.setApp(new Orange());  // Apple타입만 매개변수로 입력 가능
		obox.setOrg(new Orange());
		
		Apple apple = abox.getApp();
		Orange orange = obox.getOrg();
		
		System.out.println(apple);
		System.out.println(orange);
		
	}

}
