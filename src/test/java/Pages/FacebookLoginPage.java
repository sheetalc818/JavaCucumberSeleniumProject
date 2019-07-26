
/**
 * Description  : This file contain web elements and Method for Successful Loggedin to Facebook
 * Author       : Sheetal Chaudhari
 * Created date : 20/07/2019
 */

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginPage extends BasicActions
{
	//Email
	@FindBy(name = "email")
	private WebElement email;
	
	//Password
	@FindBy(name = "pass")
	private WebElement password;
	
	//Login button
	@FindBy(xpath = "//input[@data-testid='royal_login_button']")
	private WebElement loginButton;
	
	//Driver passed as Argument to the Constructor
	public FacebookLoginPage(WebDriver driver) 
	{
		super(driver);	
	}
	
	//Login using Valid Email and Valid Password
	public FacebookWelcomePage successfulLogin(String email, String password) 
	{
		sendKeys(this.email, email);
		sendKeys(this.password, password);
		takeScreenshot(); 
		click (loginButton);
		return new FacebookWelcomePage(getDriver());
	}
}