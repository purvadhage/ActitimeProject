package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class opensourcebilling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.get("https://demo.opensourcebilling.org/");
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("password")).clear();	
	driver.findElement(By.id("email")).sendKeys("nishant");
	driver.findElement(By.id("password")).sendKeys("kolhatkar");
	driver.findElement(By.name("btn_login")).click();
	driver.findElement(By.linkText("Forgot Password?")).click();
	driver.findElement(By.linkText("close")).click();
	driver.findElement(By.linkText("Sign In as a Client")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("demo@opensourcebilling.org");
	driver.findElement(By.id("password")).sendKeys("");
	driver.findElement(By.name("btn_login")).click();
	//driver.close();

	}

}
