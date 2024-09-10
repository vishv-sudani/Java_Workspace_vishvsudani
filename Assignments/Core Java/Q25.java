package Module_2;

import java.util.Scanner;

public class Q25 
{
	double length;
    double width;

    public Q25(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    
    public void Area() 
    {
        double area = length * width;
        System.out.println("Area  is: " + area);
    }

    
    public void Perimeter() 
    {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter is: " + perimeter);
    }

    
    public static class Square extends Q25 
    {
        
        public Square(double side) 
        {
            super(side, side);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of rectangle: ");
        double width = sc.nextDouble();

        Q25 rec = new Q25(length, width);
        rec.Area();
        rec.Perimeter();

       
        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();

        Square sq = new Square(side);
        sq.Area();
        sq.Perimeter();

        
    }
}
