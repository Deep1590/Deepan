package wdMethods;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports extends SeMethods {
	ExtentReports extent;
	ExtentTest suitetest;
	
	
	@BeforeSuite
	public void report()
	{
				ExtentHtmlReporter html= new ExtentHtmlReporter("./reprts/result.html");
		html.setAppendExisting(true);
		 extent =new ExtentReports();
		extent.attachReporter(html);
	}

	@BeforeTest
	
	public ExtentTest reporttest(String testname,String testdesc)
	
	{
		ExtentTest suitetest = extent.createTest(testname,testdesc);
		
		return suitetest;
	}



}
