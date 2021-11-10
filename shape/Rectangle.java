package shape;

public class Rectangle implements Shape {
	private double width = 0.0;
	private double length = 0.0;
	public Rectangle(double width,double length) {
		this.width = width;
		this.length = length;
	}
	@Override public void draw() {
		System.out.println("Drawing Rectangle");
	}
	@Override public void draw(String shapeName) {
		System.out.println("Drawing" +shapeName);
	}
	@Override public double calculateArea() {
		double area = this.width*this.length;
		return area;
	}

}
