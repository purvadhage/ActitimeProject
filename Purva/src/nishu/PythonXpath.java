package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PythonXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.xpath("(//p[contains(text(),'Stable:')]) [4]/../p[2]")).click();

	}

}
