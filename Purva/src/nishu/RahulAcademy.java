package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulAcademy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\jdbc_path\\Purva\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("purvadhage");
		driver.findElement(By.name("inputPassword")).sendKeys("purva");
		driver.findElement(By.className("signInBtn")).click();
		//driver.close();

	}

}



