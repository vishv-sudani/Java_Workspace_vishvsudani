package Module_2;

import java.util.Scanner;

public class Q42 
{
	private int rollNo;
    private String nm;
    private int age;
    private String course;

    
    public Q42(int rollNo, String nm, int age, String course) throws Agenotwithinrange, Namenotvalidexception 
    {
        this.rollNo = rollNo;
        setName(nm); 
        setAge(age);   
        this.course = course;
    }

    private void setAge(int age) throws Agenotwithinrange // derived from class Agenotwithinrange
    {
        if (age < 15 || age > 21) 
        {
            throw new Agenotwithinrange("Age is not within the allowed range (15-21).");
        }
        this.age = age;
    }

    private void setName(String nm) throws Namenotvalidexception //derived from class Namenotvalidexception
    {
        if (nm == null || !nm.matches("[a-zA-Z]")) 
        { 
            throw new Namenotvalidexception("name not valid. only alphabets allowed.");
        }
        this.nm = nm;
    }

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.println("Enter roll number: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter name: ");
            String nm = sc.nextLine();

            System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Enter course: ");
            String course = sc.nextLine();

            
            Q42 student = new Q42(rollNo, nm, age, course);
            System.out.println("Student Added successfully!");

        } 
        catch (Agenotwithinrange | Namenotvalidexception e)  //multicatch exception
        {
            System.out.println(e.getMessage());
        }
    }
}
