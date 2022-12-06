//17-10-22
//getFirstSelectedOption();
// write a script to select 1st option from taj hotel and print it on the console.
package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstSelectedOption {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/hotel.html");
		WebElement tajhotel = driver.findElement(By.id("Taj Hotel"));
		Select sel = new Select(tajhotel);
		WebElement firstoption = sel.getFirstSelectedOption();
		String text = firstoption.getText();
		System.out.println(text);
		driver.close();

	}

}
