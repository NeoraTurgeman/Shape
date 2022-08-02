public class Circle extends Shape implements GeometricObject{
	// Subclass of Shape
	
protected double radius=1.0;	
	
	public Circle()
	{
	super();
	}
	
	public Circle(double radius) 
	{  
		super();
		this.radius=radius;
	}
	public Circle(double radius ,String color, boolean filled) 
	{  
		super(color, filled);
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea()		
	// The implementation of the abstract method that calculates and returns the area of the circle
	{
		return Math.PI*Math.pow(this.radius, 2);
	}

	public double getPerimeter()
	// The implementation of the abstract method that calculates and returns the perimeter of the circle
	{
		return 2*Math.PI*this.radius;
	}

	@Override	
	public String toString() 	// A toString() overloaded method
	{
		return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
	}
	
	
}
