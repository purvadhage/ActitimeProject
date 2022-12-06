//Write a script on AutoSuggestion of Amazon 

package nishu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.get(url);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='s-suggestion']"));
		int count = autosuggestion.size();		
		System.out.println("no of suggestion"+count);
		for(int i=0;i<count;i++);
		{
			int i = 0;
			String text=autosuggestion.get(i).getText();
			System.out.println(text);
		}
		driver.close();
		
		
		//driver.manage().window().maximize();
		///driver.get("https://www.amazon.in/");
	    //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
	    //Thread.sleep(5000);
	    //List<WebElement> autosugg = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	    //int count = autosugg.size();
	    //System.out.println(count);
	    //for(int i=0;i<count;i++)
	    //{
	    	//String text = autosugg.get(i).getText();
	    	//System.out.println(text);
	    //}
	    //driver.close();
		
		
			
		
	}

}
