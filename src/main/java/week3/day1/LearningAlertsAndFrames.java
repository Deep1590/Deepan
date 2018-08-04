package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningAlertsAndFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Automation Starts");
		ChromeOptions opt = new ChromeOptions();
		opt.setHeadless(false);
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		//switching in to frame
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		//Please note that alert is also inside the frame
		Alert obj = driver.switchTo().alert(); 
		System.out.println(obj.getText());
		obj.sendKeys("TOM MARVOLO RIDDLE");
		obj.accept();
		System.out.println(driver.findElementById("demo").getText());
		//the try home button is outside the frame, so just come out.
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		driver.close();
		System.out.println("Automation Over");
	}

}
