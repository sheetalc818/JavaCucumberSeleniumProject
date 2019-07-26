
//Getters and setters method
package TestRunners;

import org.apache.commons.lang3.StringUtils;

public class TestDefaultValues 
{
	//Default parameteres that are Required for the TestRunnerFacebook class
	public static final String DEFAULT_OPERATING_SYSTEM = "Linux";
	public static final String DEFAULT_BROWSER = "Chrome";

	public static final String DEFAULT_link = "https://www.facebook.com/";

	public static final String DEFAULT_USER = "sheetalc818@gmail.com";

	public static final String DEFAULT_PASSWORD = "Premanshu8";

	//Static variables
	private static String operatingSystem;
	private static String browser;
	private static String link;
	private static String user;
	private static String password;
	
	//Get and Set Opearting System
	public static String getOperatingSystem() 
	{
		return StringUtils.isEmpty(operatingSystem) ? DEFAULT_OPERATING_SYSTEM : operatingSystem ;
	}
	
	public static void setOperatingSystem(String operatingSystem) 
	{
		TestDefaultValues.operatingSystem = operatingSystem ;
	}
	
    //Get and Set Browser
	public static String getBrowser() 
	{
		return StringUtils.isEmpty(browser) ? DEFAULT_OPERATING_SYSTEM : browser ;
	}
	
	public static void setBrowser(String browser) 
	{
		TestDefaultValues.browser = browser ;
	}

	//Get and Set Link
	public static String getLink() 
	{
		return StringUtils.isEmpty(link) ? DEFAULT_link :  link ;
	}

	public static void setLink(String link) 
	{
		TestDefaultValues.link = link ;
	}
	
	
	// Get and Set User
	public static String getUser() 
	{
		return StringUtils.isEmpty(link) ? DEFAULT_USER :  user ;
	}
	public static void setUser(String user)
	{
		TestDefaultValues.user=user;
	}
	
	//Get and Set Password
	public static String getPassword() 
	{
		return StringUtils.isEmpty(password) ? DEFAULT_PASSWORD :  password ;
	}
	public static void setPassword(String password)
	{
		TestDefaultValues.password=password;
	}

}
