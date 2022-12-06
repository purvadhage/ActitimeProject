//Method Overloading concept is used in selenium for handling the frames     29-10-22
// Write a script to enter mumbai in Parent and Bangalore in Child Frame 

package nishu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/ACER/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("Mumbai");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("Banglore");
		

	}

}
