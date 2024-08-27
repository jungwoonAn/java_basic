package interface2.diamond;

//다중 인터페이스 구현
public class DiamondMain {

	public static void main(String[] args) {
		InterfaceA a = new Child();
		a.methodA();
		a.methodCommon();
		
		InterfaceB b = new Child();
		b.methodB();
		b.methodCommon();
	}

}
