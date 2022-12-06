package nishu;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ACER/Desktop/demo.html");
	driver.findElement(By.tagName("a")).click();
	driver.navigate().to("file:///C:/Users/ACER/Desktop/demo.html");
	driver.findElement(By.linkText("2.FaceBook")).click();
	//driver.findElement(By.id("d2")).click();
	

	}

}
