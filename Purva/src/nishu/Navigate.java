package nishu;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("https://www.tinder.com/");
		Thread.sleep(50000);
		driver.quit();
		
	}

}
