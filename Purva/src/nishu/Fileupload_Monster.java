//Write a script to navigate to Monster application and upload your resume

package nishu;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload_Monster {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[.='Upload Resume']")).click();
		Thread.sleep(3000);
		File f = new File("./Testdata/Leaving Certificate.pdf");
		String path = f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload")).sendKeys(path);
		Thread.sleep(3000);
	
	}

}
