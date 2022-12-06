//getCssValue (06-10-2022)

package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcssvalue {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String value = driver.findElement(By.name("q")).getCssValue("color");
	    String value1 = driver.findElement(By.name("q")).getCssValue("background-color");
		System.out.println("color:" +value);
		System.out.println("background colour:" +value1);
		

	}

}
