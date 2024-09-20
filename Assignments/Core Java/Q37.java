package Module_2;

public class Q37 
{
	public static void main(String[] args) 
    {
		int[] a = new int[5];
    	 try 
    	 {
             a[5] = 30 / 6;           
         }
    	 catch (ArrayIndexOutOfBoundsException e) 
    	 {
             System.out.println(e);
         }
    	 
    	 try
    	 {
    		 a[2]= 10/0;
         }
    	 catch (ArithmeticException e) 
    	 {
             System.out.println(e);
         } 
    	 
     }
}
