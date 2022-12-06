package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceP {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		
		driver.findElement(By.xpath("//label[@for='filled-in-box']")).click();
		driver.findElement(By.name("btn_login")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[5]/a[1]")).click();
		
		

	}

}
