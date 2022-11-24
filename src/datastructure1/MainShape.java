package datastructure1;
import java.util.ArrayList;
import java.util.List;
public class MainShape 
{
	
	static Shape getBiggestAreaShape(List<Shape>shapes) 
	{	
		Shape sh=shapes.get(0);
		for(int i=1; i<shapes.size(); i++)
		{
			Shape temp=shapes.get(i);
			if(sh.getArea()<temp.getArea())
				sh=temp;
		}
			return sh;		
	}
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(1.6));
		shapes.add(new Circle(2.7));
		shapes.add(new Square(6.3));
		shapes.add(new Circle(2.1));
		shapes.add(new Rectangle(9.4,3.6));

		Shape bs=getBiggestAreaShape(shapes);
		System.out.println("biggest area is "+bs);
	}

}
