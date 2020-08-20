package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
public WebDriver driver;

public landingPage(WebDriver driver)
{
	this.driver=driver;
}
private  By signIn=By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a/span");
private  By tab =By.xpath("//*[@id='homepage']/header/div[2]/div");
 private By title=By.xpath("//*[@id='content']/div/div/h2");
 By logInValidation=By.cssSelector(".main-hero");

public logInPage SignIn()
{
	
 driver.findElement(signIn).click();
 logInPage lop=new logInPage(driver);
 return lop;
 
}
public WebElement Tab()
{
	return driver.findElement(tab);
}
public WebElement Title()
{
	return driver.findElement(title);
}
public WebElement getLogInValidation()
{
return driver.findElement(logInValidation)	;
}
}
