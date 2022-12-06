// write a script for AutoSuggestion of FlipKart


package nishu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lava");
		driver.findElement(By.name("q")).sendKeys("iphone 13");
		Thread.sleep(5000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[.='iphone 13']/.."));
		int count = autosugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = autosugg.get(i).getText();
			System.out.println(text);
		}
		driver.close();
		
		
		
	}

}
