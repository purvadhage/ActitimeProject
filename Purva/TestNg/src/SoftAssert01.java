//Soft Assert:   pg 3
//Write a Script to verify title of google by using Soft Assert method

package src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert01 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void assertion() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		String expectedtitle = "soogle";
		String actualtitle = driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(expectedtitle, actualtitle);
		driver.close();
		s.assertAll();
	}

}
