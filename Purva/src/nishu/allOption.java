//getOption using for each loop

//for each loop  19-10-22
// write a script to get all the option present in taj hotel by using foe-each loop 

package nishu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allOption {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/hotel%20menu.html");
		WebElement taj = driver.findElement(By.id("Taj Hotel"));
		Select s = new Select(taj);
		List<WebElement> alloptions = s.getOptions();
		for(WebElement option:alloptions)
		{
			String text = option.getText();
			System.out.println(text);
		}
		
		//driver.close();
		

	}

}
