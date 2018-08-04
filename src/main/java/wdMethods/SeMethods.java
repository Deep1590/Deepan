package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SeMethods extends Reporter implements WdMethods{
 RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				setDriver(new ChromeDriver());			
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckoriver.exe");
				setDriver(new FirefoxDriver());		
			}

			getDriver().manage().window().maximize();
			getDriver().get(url);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} 

		catch (WebDriverException e) {
			System.err.println("Webdriver Exception has occured");
			throw new RuntimeException();
		}

		catch (Exception e)
		{
			System.err.println("Exception has occured");

			throw new RuntimeException();
		}
		finally {
			//System.out.println("The Browser "+browser+" is Launched Successfully");

			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue)  {
		try {
			switch (locator) {
			case "id": 	  return getDriver().findElementById(locValue);
			case "class": return getDriver().findElementByClassName(locValue);
			case "xpath": return getDriver().findElementByXPath(locValue);	
			case "name": return getDriver().findElementByName(locValue);
			case "linktext": return getDriver().findElementByLinkText(locValue);

			}
		} 
		catch (NoSuchElementException e) 
		{
			System.err.println("NoSuchElementException occured");
			throw new RuntimeException();
		}

		finally { 
			takeSnap();
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return getDriver().findElementById(locValue);
	}

	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data "+data+" is Entered Successfully");
		
		reportStep("The Data is Entered Successfully","pass");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		reportStep("The Element is clicked Successfully","pass");
		takeSnap();		
	}

	public String getText(WebElement ele) {
		String text = ele.getText();
		System.out.println("The text displayed is " + text);
		reportStep("The text is displayed Successfully","pass");
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub

		try {
			Select dropdownValueText = new Select(ele);
			dropdownValueText.selectByVisibleText(value);
			System.out.println("Value is selected");
		} catch (NoSuchElementException e) {

			System.err.println("No such element");
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}

		catch (Exception e)
		{
			System.err.println("Exception has occured");

			throw new RuntimeException();
		}

		finally{
			takeSnap();
		}


	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

		Select dropdownvalueindex = new Select(ele);
		dropdownvalueindex.selectByIndex(index);

		System.out.println("Value is selected");
		takeSnap();

	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub

		String title = getDriver().getTitle();


		if(title.equals(expectedTitle))
		{
			System.out.println("The Title is "+'"'+title+'"'+" and it matches");

			return true;
		}
		else
		{
			System.out.println("The Title is "+'"'+title+'"'+" and it does not Matches");
			return false;
		}


	}

	public void verifyExactText(WebElement ele, String expectedText) {

		String text = ele.getText();
		if(text.equals(expectedText))
		{

			System.out.println("Text Matches");

		}
		else
		{
			System.out.println("Text does not Matches");

		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {

		String text = ele.getText();
		if(text.contains(expectedText))
		{
			System.out.println("Text Matches");
		}
		else
		{
			System.out.println("Text does not Matches");

		}


	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		if( ele.getAttribute(attribute).equals(value))
		{
			System.out.println("verifyExactAttribute: Success");
		}
		else System.out.println("verifyExactAttribute: Failure");

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

		if( ele.getAttribute(attribute).contains(value))
		{
			System.out.println("verifyPartialAttribute: Success");
		}
		else System.out.println("verifyPartialAttribute: Failure");


	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

		boolean selected=ele.isSelected();
		System.out.println(selected);

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

		boolean displayed=ele.isDisplayed();
		System.out.println(displayed);

	}

	public void switchToWindow(int index) {

		Set <String> allWindowHandles= getDriver().getWindowHandles();
		List <String> listOfAllWindowHandles= new ArrayList<String>();
		listOfAllWindowHandles.addAll(allWindowHandles);
		int size = listOfAllWindowHandles.size();

		System.out.println("The size is " + size);
		//verification is not required, but added something to capture failure
		if (index <= size)
		{
			getDriver().switchTo().window(listOfAllWindowHandles.get(index));
			System.out.println("switchToWindow: Success");
		}
		else System.out.println("switchToWindow: Failure");


	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

		getDriver().switchTo().frame(ele);
		System.out.println("switchToFrame: Success");

	}

	public void acceptAlert() {

		getDriver().switchTo().alert().accept(); 
		System.out.println("acceptAlert: Success");
	}

	public void dismissAlert() {


		getDriver().switchTo().alert().dismiss();
		System.out.println("dismissAlert: Success");
	}

	public String getAlertText() {

		Alert obj = getDriver().switchTo().alert(); 
		String text=obj.getText();
		System.out.println("The text is "+ text);
		return text;
	}

	public void takeSnap() {
		File src = getDriver().getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {

		getDriver().close();

	}

	public void closeAllBrowsers() {

		getDriver().quit();

	}

	public RemoteWebDriver getDriver() {
		return driver;
	}

	public void setDriver(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public void mousehover(WebElement source,WebElement destination)
	{
		Actions builder = new Actions(driver);

		builder.moveToElement(source).pause(3000).click(destination).perform();
		
	}
	
	public void draganddrag(WebElement source,WebElement destination)
	{
		Actions builder = new Actions(driver);

		builder.dragAndDrop(source, destination).perform();
		
	}
	
	public void holddraganddrop(WebElement source,WebElement destination)
	{
		Actions builder = new Actions(driver);

		builder.clickAndHold(source).release(destination).perform();
		
	}
	
	public void draganddrop(WebElement source,WebElement destination)
	{
		Actions builder = new Actions(driver);

		builder.dragAndDrop(source, destination).perform();
		
	}
	
	public void htmlreport()
	{
		ExtentHtmlReporter html= new ExtentHtmlReporter("./reprts/result.html");
		html.setAppendExisting(true);
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(html);
	}
	}


