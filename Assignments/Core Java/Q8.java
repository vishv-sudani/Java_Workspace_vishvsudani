package Module_2;

public class Q8 {
	public static void main(String[] args) 
	{
        
        String test = "Hello Java, can you input 455 Characters?? ";
        
        count(test);
    }

    public static void count(String x) 
    {
        
        char[] ch = x.toCharArray();
        
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        
            for (int i = 0; i < x.length(); i++) 
            {
    
            if (Character.isLetter(ch[i])) 
            {
                letter++;
            }
    
            else if (Character.isDigit(ch[i])) 
            {
                num++;
            }
    
            else if (Character.isSpaceChar(ch[i])) 
            {
                space++;
            }
    
            else 
            {
                other++;
            }
        }
        
    
        System.out.println(x);
        
    
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
} 

