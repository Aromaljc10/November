package TestNGpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {
	
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	Extentreports extent;
	 
	@BeforeTest
	public void beftest()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreports1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new Extentreports();
		extent.attachReporter(reporter);
		
	
		        
		
	}

	
}
