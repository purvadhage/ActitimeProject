package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("email")).sendKeys("nishantkolhatkar");
	driver.findElement(By.name("pass")).sendKeys("123456789");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.linkText("Forgotten password?")).click();
	
	

	}

}
