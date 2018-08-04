package week6.reporter;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Annotations extends SeMethods{
	public String excelFileName,testName,testDesc,category,author,moduleName;
	@BeforeSuite
	public void startSuite() throws FileNotFoundException, IOException {
		beginResult();
		loadObject();
	}
	
	@BeforeClass
	public void startTest() {
		startTest(testName, testDesc);
	}

	@Parameters({"url","pwd","uName"})
	@BeforeMethod(groups= {"sanity"})
	public void login(String url, String pwd, String uName) {
		startTestIteration(moduleName,author,category);
		startApp("chrome", url);
		type(locateElement("id", "username"), uName);
		type(locateElement("id", "password"), pwd);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}
	
	@AfterMethod(groups= {"sanity"})
	public void closeApp() {
		closeBrowser();
	}
	
	@AfterSuite
	public void stopSuite() {
		endResult();
	}
	
	@DataProvider(name = "fetchData"/*, indices = {1}*/)
	public Object[][] getData() throws IOException {		
		
		ReadFromExcel excel = new ReadFromExcel();
		return excel.readexcel(excelFileName);		
	}
	
	
	
}
