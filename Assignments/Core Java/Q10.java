package Module_2;

import java.util.Scanner;

public class Q10 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter the value of number: ");
		 int num = sc.nextInt();
		 
		 String N = Integer.toString(num);
		 String NN = N + N;
		 String NNN = N + N + N;
		 
		 int nn =  Integer.parseInt(NN);
		 int nnn =  Integer.parseInt(NNN);
		 
		 System.out.println(num + " + " + nn + " + " + nnn);
	}   

}
