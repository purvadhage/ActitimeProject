//Write a Script to login to Actitime application by reading the common data from the Property File      1-11-22

package nishu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile_LoginActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("./Testdata/commondata.property");
		 Properties p = new Properties();
		 p.load(fis);
		 String Thane = p.getProperty("url");
		 String Andheri = p.getProperty("username");
		 String Vashi = p.getProperty("password");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(Thane);
		 driver.findElement(By.id("username")).sendKeys(Andheri);
		 driver.findElement(By.name("pwd")).sendKeys(Vashi);
		 driver.findElement(By.xpath("//div[.='Login ']")).click();
		 Thread.sleep(5000);
		 driver.close();
		 
	}

}
