//Write a program in Java to make such a pattern like right angle triangle with number increased by 1 The pattern//

package Module_2;

public class Q6 {
	public static void main(String[] args) {
		int i, j;
        int num = 1;
        for (i = 1; i <= 4; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
	}
	}
}
