package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
	
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			boolean Purva = driver.findElement(By.name("remember")).isSelected();
			if(Purva==true)
			{
				System.out.println("checkbox is there");
			}
			else {
				System.out.println("checkbox is not there");
			}

	}

}
