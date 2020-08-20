package maven.E2E;

import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.testng.AssertJUnit;
import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import pageObject.landingPage;
import resources.BrowserInvokation;

public class Validation1 extends BrowserInvokation {
	public WebDriver driver;
public static Logger log= LogManager.getLogger(BrowserInvokation.class.getName());
	@BeforeTest
	public void intialisation() throws IOException
	{
		driver=invokation();
		driver.get(prop.getProperty("url"));
	}

	
	@Test
	public void testClassE2E() throws IOException
	{
	
	landingPage lp=new landingPage(driver);
	//lp.SignIn().click();
	AssertJUnit.assertTrue(lp.Tab().isDisplayed());
	log.info("validation is passed");


	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
