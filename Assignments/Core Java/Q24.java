package Module_2;

import java.util.Scanner;

	public class Q24
	{
		static String nm;
		static String ad;
		static int mno;
		static int age;
		static int sal;
		
	    Q24(String nm,String ad,int mno,int age,int sal)
	    {
	    	 this.nm = nm;
	    	 this.ad = ad;
	    	 this.mno = mno;
	    	 this.age = age;
	    	 this.sal = sal;
	    }
	     
	    public void printSalary() 
	    {
	        System.out.print("Your Salary is: " + sal);
	    }
	    
	     public static void main(String[] args) 
	    {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Your Name: ");
			nm = sc.next();
			
			System.out.print("Enter Your Age: ");
			age = sc.nextInt();
			
			System.out.print("Enter Your phone number: ");
			mno = sc.nextInt();
			
			System.out.print("Enter Your Address: ");
			ad = sc.next();
			
			System.out.print("Enter Your Salary: ");
			sal = sc.nextInt();
			
			Q24 member = new Q24(nm, ad, mno, age, sal);
		    member.printSalary();
			
		}
}
