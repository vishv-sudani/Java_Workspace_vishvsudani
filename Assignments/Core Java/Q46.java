package Module_2;

class TestThreadTwice1 extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("Thread is running.....");
	}
}

public class Q46 
{
	public static void main(String[] args) 
    {
    	TestThreadTwice1 t1 = new TestThreadTwice1();
    	
    	t1.start();
    	t1.start();
	}
	
}
