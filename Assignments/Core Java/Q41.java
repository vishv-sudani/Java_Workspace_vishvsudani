package Module_2;

import java.util.Scanner;

public class Q41 
{
	private int tbal = 0;

    public int balance() 
    {
        return tbal;
    }

    public void deposit(int dAmount) 
    {
        tbal += dAmount;
        System.out.println("Deposited: " + dAmount + ". Updated balance: " + tbal);
    }

    
    public void withdraw(int wAmount) throws Insufficientfundexception 
    {
        if (wAmount > tbal) 
        {
            throw new Insufficientfundexception(String.format("Insufficient balance. You need " + (wAmount - tbal) + "rs more to perform this transaction."));
        } 
        else 
        {
            tbal -= wAmount;
            System.out.println("Withdrawn: " + wAmount + ". Remaining balance: " + tbal);
        }
    }

    public static void main(String[] args) 
    {
        Q41 ac = new Q41();
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.println("Enter amount you wish to deposite:");
            int dAmount = sc.nextInt();
            ac.deposit(dAmount);

            System.out.println("Enter amount you want to withdraw:");
            int wAmount = sc.nextInt();
            ac.withdraw(wAmount);

        } 
        catch (Insufficientfundexception e) 
        {
           System.out.println(e);
        } 
        
    }
}
