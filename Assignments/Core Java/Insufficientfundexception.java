package Module_2;

public class Insufficientfundexception extends RuntimeException
{
	private String message;
	   
	   public Insufficientfundexception(String message) 
	   {
		   this.message = message;
	   }
	   
	   public Insufficientfundexception(Throwable cause, String message)
	   {
		   super(cause);
		   this.message = message;
	   }
	   public String getMessage()
	   {
		  return message;
	   }
}
