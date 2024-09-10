package Module_2;

public class Q21 
{
	public void method1(int n, char c) 
	{
	    System.out.println("Integer: " + n + ", Character: " + c);
	}

   
    public void method2(char c, int n) 
    {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args) 
    {
        Q21 printer = new Q21();
        
        printer.method1(100, 'A');

        printer.method2('B', 200);
    }
}
