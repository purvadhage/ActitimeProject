//Question= Where we have used collection in selenium (06-10-2022)
//ans = whenever we have to handle multiple elements at the time we have used findElements() method,
      //the return type of findElements is List<WebElements>

//go to demo
//get all the links
//count hoe many links
//click on 2nd link
//print that on console=text
//close the browser

// Handling Multiple Elements
// 1.in order to handled multiple elements we go for findElements() Method
// 2.return type of findElements is List<WebElements>
// 3.List should be imported from java.util package
// 4.if the locators are matching with multiple elements it will return address of all the matching elements
// 5.if the locators are not matching with any of the element it will throw EmptyList

// Question= write a script to navigate to demo application and click on 4th link present in demo application.
package nishu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/demo.html");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	    int Purva = alllinks.size();
	    System.out.println("Total no of links:" +Purva);
	    alllinks.get(3).click();
	    Thread.sleep(5000);
	    driver.close();

	}

}
