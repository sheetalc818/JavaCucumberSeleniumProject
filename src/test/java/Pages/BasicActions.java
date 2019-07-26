
/**
 * Description  : BasicActions.java file contain methods required for FacebookLoginPage.java file
 * Author       : Sheetal Chaudhari
 * Created date : 20/07/2019
 */

package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicActions 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public static final int TIME_OUT = 12;
	
	//Initializing PageFactory Web Elements by creating Constructor
	public BasicActions(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIME_OUT), this);
		wait = new WebDriverWait(driver, TIME_OUT);
	}
	
	//Method to fill Email id and Password
	public void sendKeys(WebElement element, String fillWith) 
	{
		element.sendKeys(fillWith);
	}
	
	//Method to Click "Login" button
	public void click(WebElement element) 
	{
		element.click();
	}
	
	//Method to check Visibility of WebElements
	public void checkElementPresent(WebElement element) 
	{
	    wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void takeScreenshot() 
	{
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
		 // now copy the  screenshot to desired location using copyFile //method
		 FileUtils.copyFile(src, new File("Screenshot/screenshot.png"));
		}
		catch (IOException e)
		{
		  System.out.println(e.getMessage());
		}
	}
	
	//Method for getDriver()
	public WebDriver getDriver() 
	{
		return driver;
	}


}
