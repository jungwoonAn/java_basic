package oop.ex;

public class Rectangle {
	private int width;
	private int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int calculateArea() {
		return width * height;
	}
	
	int calculatePerimeter() {
		return 2 * (width + height);
	}
	
	boolean isSquare() {
		return width == height;
	}

}
