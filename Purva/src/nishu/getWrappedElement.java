//write a script to get all the options present in taj hotel by using getWrappedElement
//19-10-22

package nishu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/hotel%20menu.html");
		WebElement taj = driver.findElement(By.id("Taj Hotel"));
		Select s = new Select(taj);
	    WebElement option = s.getWrappedElement();
	    System.out.println(option.getText());
	  //  driver.close();
		
	}

}
