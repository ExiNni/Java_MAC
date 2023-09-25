package chap18_Abstract;

public class Main {

	public static void main(String[] args) {
		Circle circle1 = new Circle("Red", 5.0);
		Rectangle rec1 = new Rectangle("Blue", 5.4, 5.4);
		
		System.out.println("원의 넓이 : " + circle1.Area());
		System.out.println("원의 색깔 : " + circle1.color);
		
		System.out.println("네모의 넓이 : " + rec1.Area());
		System.out.println("네모의 색깔 : " + rec1.color);
		
	}
}
