package passwordgenerator;

public class AdvancedPasswordCriteria  extends PasswordCriteria
{
  private boolean includeAmb;
  public AdvancedPasswordCriteria(int len , boolean up , boolean low , boolean num , boolean sp, boolean amb)
  {
	  super(len,up,low,num,sp);
	  includeAmb = amb ;
  }
  public boolean getamb()
  {
	  return  includeAmb;
  }
}
