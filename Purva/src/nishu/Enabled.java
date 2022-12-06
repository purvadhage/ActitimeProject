package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean enabled = driver.findElement(By.name("login")).isEnabled();       //isEnabled()
		
		if(enabled==true) {
			System.out.println("login button is enabled");
		}
		else {
			System.out.println("login is disabled");
		}

	}

}
