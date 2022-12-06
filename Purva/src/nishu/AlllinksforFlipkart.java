//07-10-2022          pg=1
// write a script to print all the links present in amazon.in
package nishu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlllinksforFlipkart {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
   	    List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
   	    int count = alllinks.size();
   	    System.out.println(count);
   	    for(int i=0; i<=alllinks.size(); i++)
   	    {
   	    	String links = alllinks.get(i).getText();
   	    	System.out.println(i+":"+alllinks.get(i).getText());
   	    }

	}

}
