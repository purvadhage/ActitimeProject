//Write a script to switch the control from parent to child by using value as an argument.   29-10-22

package nishu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/ACER/Desktop/page1.html");
		driver.findElement(By.id("t1")).sendKeys("Mumbai");
		driver.switchTo().frame("d2");
		driver.findElement(By.id("t2")).sendKeys("Banglore");
		

	}

}
