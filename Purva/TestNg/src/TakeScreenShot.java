//Write a Script to Take the ScreenShot for the application.    		10-11-22

package src;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TakeScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void screenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/ss.png");
		File purva = new File("./ScreenShot/nn.png");
		Files.copy(src, dest);
		
		driver.navigate().to("https://www.google.com/");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./ScreenShot/gg.png");
		Files.copy(src1, dest1);
		driver.close();
		
	}

	
}
