package Task_27_7;

//Write a program of to find out the Area of Triangle, Rectangle and Circle using If Condition.(Must Be Menu Driven)

import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the choice of shape you want to get the area: \n Press 1 for Circle \n Press 2 for Rectangle \n Press 3 for Triangle:");
	int choice=sc.nextInt();
	
	if(choice==1);
	{
		System.out.println("Enter Radius of Circle:");
		int radius=sc.nextInt();
	
		float area=3.14F*radius*radius;
		
		System.out.println("Area of Circle is:"+area);
	}
	
	else if(choice==2);
	{
			System.out.println("Enter length of Rectangle:");
			int l=sc.nextInt();
			
			System.out.println("Enter width of Rectangle:");
			int w=sc.nextInt();
		
			float area=l*w;
			
			System.out.println("Area of Rectangle is:"+area);
	}
	
	else if(choice==3);
	{
		System.out.println("Enter height of Triangle:");
		int h=sc.nextInt();
		
		System.out.println("Enter base of Triangle:");
		int b=sc.nextInt();
	
		float area=0.5F*h*b;
		
		System.out.println("Area of Triangle is:"+area);
	}
}
}

