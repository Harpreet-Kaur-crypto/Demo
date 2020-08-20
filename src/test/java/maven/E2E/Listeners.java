package maven.E2E;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.BrowserInvokation;
import resources.ExtentReportsNG;


public class Listeners extends BrowserInvokation  implements ITestListener {
	ExtentTest test;
	 ExtentReports extent=ExtentReportsNG.reports();
ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();


	
	@Override
	public void onTestStart(ITestResult result) {
		
		// TODO Auto-generated method stub
		 test=extent.createTest(result.getMethod().getMethodName());
		 extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "test is passed");
		
		


	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
	
		String testMethodName=result.getMethod().getMethodName();
		try {
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		}
		catch(Exception e)
		{
		
		}
		try 
		{
			extentTest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName,driver), result.getMethod().getMethodName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
