//Write a script to enter mumbai in Child and Bangalore in Parent Frame    29-10-22

package nishu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/ACER/Desktop/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("Mumbai");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("Banglore");
		

	}

}
