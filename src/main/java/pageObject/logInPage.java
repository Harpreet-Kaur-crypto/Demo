package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logInPage {
	
	
		private WebDriver driver;

		public logInPage(WebDriver driver)
		{
			this.driver=driver;
		}
		By username=By.cssSelector("#user_email");
By password=By.cssSelector("#user_password");
By loginButton=By.xpath("//input[@value='Log In']");
By forgotPassword=By.cssSelector(".link-below-button");
public WebElement Username()
{
	return driver.findElement(username);
	
}
public WebElement Password()
{
	return driver.findElement(password);
}
public WebElement LoginButton()
{
	return driver.findElement(loginButton);
}
public FPPage ForgotPassword()
{
 driver.findElement(forgotPassword).click();
FPPage fp= new FPPage(driver);
return fp;

}
}
