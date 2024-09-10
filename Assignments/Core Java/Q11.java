package Module_2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q11 
{
	public static void main(String[] args) 
	   {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
		   
		   LocalTime now = LocalTime.now();
		   
		   String systemtime = now.format(dtf);
		   System.out.println("Current system time: " + systemtime);
		   
		}
}
