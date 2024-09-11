package Module_2;
class Shape1
{
	public void PShape()
	{
		System.out.println("This is shape");
	}
}

class Rectangle extends Shape1
{
	public void PRectangle()
	{
		System.out.println("This is rectangular shape");
	}
}

class Circle extends Shape1
{
	public void PCircle()
	{
		System.out.println("This is circular shape");
	}
}

class Square extends Rectangle
{
	public void PSquare()
	{
		System.out.println("Square is a Rectangle");
	}
}
public class Q34 
{
	public static void main(String[] args) 
    {
		Square s = new Square();
		s.PRectangle();
		s.PShape();
		s.PSquare();
	}
}
