package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\jdbc_path\\Purva\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/shoes?f=Brand%3AASICS");
		System.out.println(driver.findElement(By.xpath("(//h3[.='ASICS']) [1]/../../div[2]/div/span")).getText());
		
		

	}

}
