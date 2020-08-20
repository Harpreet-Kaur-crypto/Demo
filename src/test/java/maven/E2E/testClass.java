package maven.E2E;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.FPPage;
import pageObject.landingPage;
import pageObject.logInPage;
import resources.BrowserInvokation;

public class testClass extends BrowserInvokation{
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(BrowserInvokation.class.getName());
	
	
@BeforeTest
public void intialisation() throws IOException
{
	driver=invokation();

}

@Test(dataProvider="getData")
public void HomePageNavigation(String Username,String Password) throws IOException 
{
	driver.get(prop.getProperty("url"));
	log.info("driver is initialised");
landingPage lp=new landingPage(driver);
 logInPage lop=lp.SignIn();
log.info("navigated to signin page");

lop.Username().sendKeys(Username);
lop.Password().sendKeys(Password);
log.info("username password incorrect");
lop.LoginButton().click();
FPPage fp=lop.ForgotPassword();
fp.Email().sendKeys("abc");
}
@AfterTest
public void teardown()
{
driver.close();	
}


@DataProvider
public Object[][] getData()
{
 Object[][] data=new Object[3][2];
  data[0][0]="hkaur";
  data[0][1]="12345";
  
  data[1][0]="harnidh";
  data[1][1]="hardit";
  
  data[2][0]="hapr";
  data[2][1]="3456";
 return data;
 
 
}

}
