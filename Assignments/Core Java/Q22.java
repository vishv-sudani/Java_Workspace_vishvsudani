package Module_2;

import java.util.Scanner;

public class Q22 
{
	int length,breadth;
	int side;
	
	public void Ar(int a,int b)
	{
		length = a;
		breadth = b;
		
		int recarea = length * breadth;
		System.out.println("Area of reactangle is: "+recarea);
		
	}
	
	public void Ar(int c) 
	{
		side = c;
		int squarear = side*side;
		System.out.println("Area of square is: "+squarear);
	}
	
	public static void main(String[] args) 
	{
            Scanner s1 = new Scanner(System.in);
        
			System.out.print("Enter the length of reactangle: ");
			int l = s1.nextInt();
			
			System.out.print("Enter the breadth of rectangle: ");
			int b = s1.nextInt();
			
			Q22 print = new Q22();
			
			print.Ar(l, b);
			
			System.out.print("Enter the Side of square: ");
			int s = s1.nextInt();
			
			print.Ar(s);
		
	}
}
