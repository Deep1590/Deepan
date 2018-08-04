package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week6.day1.CreateLeadInput;

public class Annotations extends SeMethods{
	
	
	
	@BeforeMethod()
	@Parameters({"url","user","pwd"})
	public void login(String url,String user,String pwd) {
		startApp("chrome", url);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, user);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
	}
	
	
		
	
	
	@AfterMethod(groups= {"smoke","sanity","regression"})
	public void closeapp()
	{
		closeBrowser();
	}
	

	
	@AfterSuite
	
	public void endsuite()
	{
		endResult();
		
	}
	
	

}