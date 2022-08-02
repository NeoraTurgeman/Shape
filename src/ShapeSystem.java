import java.util.Scanner;
public class ShapeSystem {

	
	public static void main(String[] args) 
	{
	Scanner in = new Scanner (System.in);
	
	// Building a Shape-type array and inserting objects of Circle and Rectangle types into it,
	//in all possible ways of construction.
	
	
	Shape shapes[]	= new Shape[6];
	shapes[0] = new Circle();
	shapes[1] = new Circle(2.25);
	shapes[2] = new Circle(10, "blue", true);
	shapes[3] = new Rectangle();
	shapes[4] = new Rectangle(3,7);
	shapes[5] = new Rectangle(6.2, 4.78, "black", false);
	
	for (int i=0; i<shapes.length; i++)
	{
		System.out.println(shapes[i].toString());
		
		// Convert the objects of the Shape type to objects of the interface GeometricObject type 
		// to invoke the methods getArea() and getPerimeter() for all shapes uniformly.
		
		GeometricObject shape = (GeometricObject) shapes[i];
		System.out.println("The area of the shape is " + shape.getArea());
		System.out.println("The perimeter of the shape is " + shape.getPerimeter() + "\n");
	}
	
	// Using the override method of setLength() in the Rectangle class.
	System.out.println("We will make the rectangles in the array to have square geometry.");
	Rectangle rectangle;
	for (int i=0; i<shapes.length; i++)
	{
		if (shapes[i] instanceof Rectangle)
		{
			rectangle = (Rectangle) shapes[i];
			rectangle.setLength(i*3);
			System.out.println(rectangle.toString());
		}
	}
	}
}