package resources;
import com.aventstack.extentreports.ExtentReports;



import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportsNG {
	  static ExtentReports extent;
	
	public  static ExtentReports reports()
	{
		String path=System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("tester", "harprit");
		 return extent;
	
		
		
	}

}
