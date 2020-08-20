package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObject.landingPage;
import pageObject.logInPage;
import resources.BrowserInvokation;

import org.junit.runner.RunWith;
import org.testng.AssertJUnit;

@RunWith(Cucumber.class)
public class StepDef extends BrowserInvokation{

    @Given("^Initialise the browser with chrome$")
    public void initialise_the_browser_with_chrome() throws Throwable {
    	driver=invokation();
    }

    
    
    @When("^user enter (.+) and (.+) and click log in$")
    public void user_enter_and_and_click_log_in(String username, String password) throws Throwable {
    	logInPage lop=new logInPage(driver);
    	lop.Username().sendKeys(username);
    	lop.Password().sendKeys(password);
    	lop.LoginButton().click();
    }

    @Then("^verify whether the user successfully logged in$")
    public void verify_whether_the_user_successfully_logged_in() throws Throwable {
    	landingPage lp=new landingPage(driver);
    	AssertJUnit.assertTrue(lp.getLogInValidation().isDisplayed());
    }

    @And("^navigate to \"([^\"]*)\" website$")
    public void navigate_to_something_website(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }

    @And("^Click on sign$")
    public void click_on_sign() throws Throwable {
    	landingPage lp=new landingPage(driver);
    	 logInPage lop=lp.SignIn();
    }
    @And("^close all the browsers$")
    public void close_all_the_browsers() throws Throwable {
        driver.quit();
    }

}