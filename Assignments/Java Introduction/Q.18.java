package Task_27_7;

//Write a Program of Addition, Subtraction ,Multiplication and Division using switch-case(Must Be Menu Driven)
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter First Number a:");
	int a=sc.nextInt();
		
	System.out.println("Enter Second number b:");
	int b=sc.nextInt();
	
	System.out.println("Enter your Choice \n 1 for Addition \n 2 for subtraction \n 3 for multiplication \n 4 for Division: ");
	int choice=sc.nextInt();
	
	switch(choice)
	
	{
	
	case 1 : System.out.println("Addition of a and b is:"+(a+b));
	break;
	
	case 2:System.out.println("Subtraction of a and b is:"+(a-b));
	break;
	
	case 3:System.out.println("Multiplication of a and b is:"+(a*b));
	break;
	
	case 4:System.out.println("Division of a and b is:"+(a/b));
	break;
	
	default:System.out.println("Error! Incorrect Choice");
	}

}
}

