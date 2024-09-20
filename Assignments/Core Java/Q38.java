package Module_2;

public class Q38 
{
	public static void main(String[] args) 
    {
		int[] a = new int[5];
    	try 
    	{
	    	try 
	       	 { 
	    		a[5]= 30/6;
	         }
	       	 catch (ArrayIndexOutOfBoundsException e1) 
	       	 {
	                System.out.println(e1);
	         } 
	    		a[2]=30/0;
    		 }	
	       	 catch (ArithmeticException e2) 
	       	 {
	                System.out.println(e2);
	         }
    	System.out.println("Executed Successful");
    		}
			
    	    }
	
	    	
    	
