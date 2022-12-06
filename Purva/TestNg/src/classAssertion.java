/* Assertion:     9-11-22
1). Assertion is one of the feature of testNG. Which is used to compared expected result and actual result.
2). As per the rule of Automation every expected result should be verify with Assert Statement instead of java assert 
	statement.
3). Because if else statement doesn't have capacity to fail the test script.
  
  Example: Write a script to verify title of google by using if else statement.
 */

package src;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classAssertion {
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
		if (expectedtitle.equals(actualtitle))
		{ 
			System.out.println("title is matching"); 
		}
		else
		{
			System.out.println("title is not matching");
		}
		driver.close();
	}
	
	}


