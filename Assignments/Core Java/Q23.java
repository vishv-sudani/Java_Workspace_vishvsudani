package Module_2;

class Parent
{
	void parent()
     {
    	 System.out.println("This is parent class..");
     }
}
 
class Child extends Parent
{
	void child()
     {
    	 System.out.println("This is child class..");
     }
}
 
public class Q23
{
  public static void main(String[] args) 
 {
	 Parent p = new Parent();
	 p.parent();
	 
	 Child c = new Child();
	 c.child();
	 c.parent();		 
 }
}
