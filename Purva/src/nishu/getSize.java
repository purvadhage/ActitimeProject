package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		int a = driver.findElement(By.name("username")).getSize().getWidth();
		int b = driver.findElement(By.name("username")).getSize().getHeight();
		System.out.println(a);
		System.out.println(b);
	}

}
