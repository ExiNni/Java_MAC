package chap18_Abstract;

public class Rectangle extends Shape{
	
	private double width;
	private double length;
	
	public Rectangle(String color, double width, double length) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double Area() {
		return width * length;
	}

}
