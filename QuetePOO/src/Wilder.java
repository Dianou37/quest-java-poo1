
public class Wilder 
{
	//Attributs
	private String firstname;
	private boolean aware;
	
	//Constructeurs
	public Wilder(String firstname, boolean aware) 
	{
		this.firstname = firstname;
		this.aware = aware;
	}
	//Getters
	public String getFirstname() 
	{
		return this.firstname;
	}
	public boolean getAware()
	{
		return this.aware;
	}
	//Seters
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public void setAware(boolean aware)
	{
		this.aware = aware;
	}
	public String whoAmI()
	{
		if (this.aware == true) 
		{
			return "Je m'appelle " + this.getFirstname() + 	" et je suis aware";
		}
	return "Je m'appelle " + this.getFirstname() + " et je suis pas aware";
	}
	

}
