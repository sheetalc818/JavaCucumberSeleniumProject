
/**
 * Description  : All Scenarios description is written into the FacebookDefinitions.java file
 * Author       : Sheetal Chaudhari
 * Created date : 20/07/2019
 */

package GlueCode;

import org.openqa.selenium.WebDriver;
import Pages.FacebookLoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.FacebookWelcomePage;
import TestRunners.TestDefaultValues;


public class FacebookDefinitions 
{
	private String email = TestDefaultValues.getUser();
	private String password = TestDefaultValues.getPassword();
	
	private WebDriver driver =GenerateDefinitions.getDriver();
	private FacebookLoginPage facebookloginpage;
	private FacebookWelcomePage facebookWelcomePage;
	
	
	@When("Successfully Loggedin to Facebook using Valid mail id {string} and Password {string}")
	public void successfulLoginToFacebookWithSpecifiedCredentials(String email, String password) 
	{
		facebookloginpage = new FacebookLoginPage(driver);
		facebookWelcomePage = facebookloginpage.successfulLogin(email, password);
	}
	
	@When("Successfully Logged in to Facebook with default Credentials")
	public void successfulLoginToFacebookWithDefaultCredentials() 
	{
		facebookloginpage = new FacebookLoginPage(driver);
		facebookWelcomePage = facebookloginpage.successfulLogin(email, password);
	}
	
	@Then("Facebook Welcome page is successfully displayed")
	public void validateFacebookWelcomePage() 
	{
		facebookWelcomePage.validateFacebookWelcomePage();
	}
	
}
