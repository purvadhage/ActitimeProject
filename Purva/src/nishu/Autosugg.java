package nishu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		int count = autosuggestion.size();		
		
		for(int i =0;i<count;i++);
		{
			System.out.println("no of suggestion"+count);
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
