package chap18_Abstract;

abstract class Shape {
	String color;
	
	abstract double Area();

	public Shape(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
