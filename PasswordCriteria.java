package passwordgenerator;

public class PasswordCriteria 
{
  private int length ;
 private  boolean includeUpperCase , includeLowerCase , includeNumbers , inculdeSpecialChar ;
 public PasswordCriteria()
 {
	 
 }
 public PasswordCriteria(int length , boolean upper , boolean lower , boolean num , boolean special)
 {
	 this.length = length ;
	 includeUpperCase = upper;
	 includeLowerCase = lower;
	 includeNumbers = num ;
	 inculdeSpecialChar = special;
 }
 public int getlen()
 {
	 return length ;
 }
 public boolean getup ()
 {
	 return includeUpperCase;
 }
 public boolean getlow ()
 {
	 return includeLowerCase;
 }
 public boolean getnum ()
 {
	 return includeNumbers;
 }
 public boolean getchar ()
 {
	 return  inculdeSpecialChar;
 }
 
}
