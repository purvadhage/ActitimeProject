//20-10-22
/* Hidden Division / Calender Popup
 1]. We can not inspect this popup
 2]. We can not move this popup
 if we want to handel this popup we have to used find element method*/
 
 //Q] write a script to handle Hidden Division Popup

// https://www.careinsuranle.com/rhicl/proposalcp/renew/index-care
package nishu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision_CalenderPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    //driver.close();

	}
}
