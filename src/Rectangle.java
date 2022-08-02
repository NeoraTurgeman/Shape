public class Rectangle extends Shape implements GeometricObject{	
	//Subclass of Shape

	protected double width=1.0;				
	protected double length=1.0;		
	
	public Rectangle()
	{
	super();
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) 
	// Override the setWidth() to change both the width and length, so as to maintain the square geometry.
	{
		this.width = width;
		this.length = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) 
	// Override the setLength() to change both the width and length, so as to maintain the square geometry.
	{
		this.length = length;
		this.width = length;
	}
	
	public double getArea()	
	// The implementation of the abstract method that calculates and returns the area of the rectangle
	{
		return (this.width*this.length);
	}
	
	public double getPerimeter()	
	// The implementation of the abstract method that calculates and returns the perimeter of the rectangle
	{
		return ((2*this.width)+(2*this.length));
	}
	

	@Override
	public String toString() // A toString() overloaded method
	{
		return "A Rectangle with width = " + this.width + ", and length = " + this.length
				+ ", which is a subclass of " + super.toString();
	}

}
