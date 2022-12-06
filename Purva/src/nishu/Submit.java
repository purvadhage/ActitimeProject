//Submit= Submit button is like click button but it only works on submit input type

package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.opensourcebilling.org/");
		Thread.sleep(5000);
		driver.findElement(By.id("btn_login")).submit();

	}

}
