package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\jdbc_path\\Purva\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("__purva19__");
		driver.findElement(By.className("_2hvTZ pexuQ zyHYP")).sendKeys("iampurva");

	}
	}