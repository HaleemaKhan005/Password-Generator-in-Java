package passwordgenerator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		  Scanner cin = new Scanner (System .in );
		  // Get password criteria from user
	        System.out.print("Enter length of  password length: ");
	        int length = cin.nextInt();
	        System.out.print("do you want to Include uppercase letters? (true/false): ");
	        boolean includeUpper = cin.nextBoolean(); 
	        System.out.print("do you want to Include lowercase letters? (true/false): ");
	        boolean includeLower = cin.nextBoolean();
	        System.out.print("do you want to Include numbers? (true/false): ");
	        boolean includeNumbers = cin.nextBoolean();
	        System.out.print("do you want to Include special characters? (true/false): ");
	        boolean includeSpecial = cin.nextBoolean();
	        // Create PasswordCriteria object
	        PasswordCriteria pasobj = new PasswordCriteria(length, includeUpper, includeLower, includeNumbers, includeSpecial);
	        // Create PasswordGenerator object
	        PasswordGenerator genobj = new PasswordGenerator(pasobj);
	        // GENERATE PASSWORD 
	        String password = genobj.genPassword();
	        System.out.println("Generated Password is :: " + password);
	        CheckPassword chobj = new CheckPassword(password);
	        if(chobj.isStrong(password))
	        {
	        	  System.out.println("The password is strong.");
	        } 
	        else 
	        {
	        	  System.out.println("The password is weak.");
            }
	        cin.close();
	}
}
