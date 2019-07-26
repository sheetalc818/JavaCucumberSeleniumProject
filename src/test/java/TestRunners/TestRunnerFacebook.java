
package TestRunners;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
		features = "src/test/resources/FeturesFiles",
		glue = {"GlueCode"},
		monochrome = true,
		plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"} 
)
public class TestRunnerFacebook extends AbstractTestNGCucumberTests
{
	@Parameters({"operatingSystem","browser","link","user","password"})
	@BeforeClass
	public void beforeClass(String operatingSystem, String browser,String link, String user,String password)
	{
		TestDefaultValues.setOperatingSystem(operatingSystem);
		TestDefaultValues.setBrowser(browser);
		TestDefaultValues.setLink(link);
		TestDefaultValues.setUser(user);
		TestDefaultValues.setPassword(password);
	}
	
}

