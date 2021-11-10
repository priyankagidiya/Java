package shape;

public class ShapeMain {

	public static void main(String[] args)
	{
		Shape triangle = new Triangle(3,3);
		triangle.draw();
		System.out.println("Area of the Triangle is: " +triangle.calculateArea());
		
		Shape rectangle = new Rectangle(5,7);
		rectangle.draw();
		System.out.println("Area of the Rectangle is: " +rectangle.calculateArea());
		
		Shape square = new Square(8);
		square.draw();
		System.out.println("Area of the Square is: " +square.calculateArea());
	}

}
