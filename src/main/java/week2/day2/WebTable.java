package week2.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		int number[];
		//to maximize
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/table.html");
		
		int size = driver.findElementsByXPath("//section[@class='innerblock']//tr").size();
		
		System.out.println("number of rows="+size);
		
		System.out.println("Number of columns" + driver.findElementsByXPath("//section[@class='innerblock']//td[1]").size());
		
		String percentage = driver.findElementByXPath("//tr[@class='even']/td[2]").getText();
		
		System.out.println("Percentage is " + percentage);
		
		List<WebElement> myList=driver.findElementsByXPath("//tr[@class='even']");
	    //To store all web elements into list
	    
	    for(int i=1;i<=myList.size();i++) {
	   String all_elements_text=  myList.get(i).getText();
	    
	    System.out.println(all_elements_text +"Value of I is " + i );
	    }

	}

}
