package passwordgenerator;
import java.security.SecureRandom;

public class PasswordGenerator 
{
	PasswordCriteria obj = new PasswordCriteria();
	PasswordGenerator (PasswordCriteria obj )
	{
		this.obj = obj;
	}
	public String genPassword () 
	{
		int length = obj.getlen();
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXVZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String special = "!@#$%^&*()_+={}[]|?><:;~,.";
		String number = "0123456789";
		 String ambiguous = "Il1O0";
		  String password = ""; // empty 
		 
		    if (obj.getup()) 
		    {
		        password += getRandomChar(upper);
		    }
		    if (obj.getlow()) 
		    {
		        password += getRandomChar(lower);
		    }
		    if (obj.getnum()) {
		        password += getRandomChar(number);
		    }
		    if (obj.getchar()) {
		        password += getRandomChar(special);
		    }
		    for (int i = password.length(); i < length; i++)
		    {
		        String charSet = "";
		        if (obj.getup())
		        	charSet += upper;
		        if (obj.getlow())
		        	charSet += lower; 
		        if (obj.getnum()) 
		        	charSet += number;
		        if (obj.getchar()) 
		        	charSet += special;
		        password += getRandomChar(charSet);
		    }
		    char[] passwordArray = password.toCharArray(); //array to String convertion
		    shuffleArray(passwordArray);
		    return new String(passwordArray); // then return 
	}
	 private String getRandomChar(String charSet)
	    {
	        SecureRandom obj = new SecureRandom();
	        
	        return String.valueOf(charSet.charAt(obj.nextInt(charSet.length())));
	      
	    }
	 private void shuffleArray(char[] array) 
	 {
		    SecureRandom ob = new SecureRandom();
		    for (int i = array.length - 1; i > 0; i--)
		    {
		        int index = ob.nextInt(i + 1); // will create random index which is equal or less than i 
		        char temp = array[index];
		        array[index] = array[i];
		        array[i] = temp;
		    }
	 }
	 
}
