package passwordgenerator;

public class CheckPassword
{
 private String password;
 public CheckPassword ( String password)
 {
	 this.password = password ;
 }
 public String getpass()
 {
	 return password;
 }
public boolean hasdigit ()
{
	for (int i=0;i<this.password.length() ; i++)
	{
		if (Character.isDigit(this.password.charAt(i))) // built in function //charAt means on each index 
		{
			return true ;
		}
	}
	return false;
}
public boolean hasUpper ()
{
	for (int i=0;i<this.password.length() ; i++)
	{
		if (Character.isUpperCase(this.password.charAt(i))) // built in function 
		{
			return true ;
		}
	}
	return false;
}
public boolean hasLower ()
{
	for (int i=0;i<this.password.length() ; i++)
	{
		if (Character.isLowerCase(this.password.charAt(i))) // built in function 
		{
			return true ;
		}
	}
	return false;
}
public boolean hasSpecial ()
{
	for (int i=0;i<this.password.length() ; i++)
	{
		if (!Character.isLetterOrDigit(this.password.charAt(i))) // built in function 
		{
			return true ;
		}
	}
	return false;
}
 public boolean isStrong (String pass)
 {
   if (!hasdigit() || !hasUpper() ||!hasLower()|| !hasSpecial())
   {
	   return false;
   }
   else
	   return true;
 }
}
