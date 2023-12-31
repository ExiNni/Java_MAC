package chap18_Abstract;

public class Circle extends Shape{

	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double Area() {
		return Math.PI * radius * radius;
	}
}
