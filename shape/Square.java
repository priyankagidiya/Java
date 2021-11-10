package shape;

public class Square implements Shape {
	private double side = 0.0;
	public Square(double side) {
		this.side=side;
	}
	@Override public void draw() {
		System.out.println("Drawing Square");
	}
	@Override public void draw(String shapeName) {
		System.out.println("Drawing" +shapeName);
	}
	@Override public double calculateArea() {
		double area = this.side*this.side;
		return area;
	}

}
