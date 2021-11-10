package shape;

public class Triangle implements Shape {
	
	private double height = 0.0;
	private double base = 0.0;
	public Triangle(double height,double base) {
		this.height = height;
		this.base = base;
	}
	@Override public void draw() {
		System.out.println("Drawing Triangle");
	}
	@Override public void draw(String shapeName) {
		System.out.println("Drawing" +shapeName);
	}
     @Override public double calculateArea()
	{
		double area = (this.height*this.base)/2;
		return area;
	

	}

}
