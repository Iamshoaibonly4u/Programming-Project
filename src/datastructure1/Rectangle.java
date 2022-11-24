package datastructure1;

public class Rectangle implements Shape 
{
	double length;
	double bredth;

	public Rectangle(double length, double bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	@Override
	public double getArea() {
		
		return length*bredth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", bredth=" + bredth +"Area: "+getArea()+ "]";
	}
	
}
