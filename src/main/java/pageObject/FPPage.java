package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FPPage {
	private WebDriver driver;

	public FPPage(WebDriver driver)
	{
		this.driver=driver;
	}
	


By email=By.cssSelector("#user_email");

public WebElement Email()
{
return driver.findElement(email);	

}
	
}
