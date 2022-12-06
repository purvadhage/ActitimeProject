//Hard Assert:                         9-11-22   pg 2
//was to verify title of google by using hard assert
//Methods of Hard Assert
// 1).assertEquals();
// 2).assertNotEquals();
package src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

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
		//Assert.assertEquals(actualtitle, expectedtitle);
		Assert.assertNotEquals(actualtitle, expectedtitle);
		driver.close();
	

	}
}


