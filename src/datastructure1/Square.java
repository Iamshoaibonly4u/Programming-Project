package datastructure1;

public class Square implements Shape 
{
	double side;
	

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		
		return side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side +"Area: "+getArea()+"]";
	}
	

}
