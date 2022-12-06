package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.get("https://demo.opensourcebilling.org/");
	
	//driver.findElement(By.linkText("Keep me signed in")).click();
	//driver.findElement(By.linkText("Submit")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='filled-in-box']")).click();
	//driver.findElement(By.xpath("//label[@for='filled-in-box']")).click();
	driver.findElement(By.name("btn_login")).click();
	driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[5]/a[1]")).click();
	}

}
