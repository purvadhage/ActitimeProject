//17-10-22
//multiSelect Listbox:=
//we go for multiSelect listbox whenever we need to select multiple options.
//Q). Write a script to Select multiple options and deSelect the selected options.

package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ACER/Desktop/hotel%20menu.html");
		WebElement itcmata = driver.findElement(By.id("itcmaratha"));
		Select sel = new Select(itcmata);
		Thread.sleep(3000);
		sel.selectByValue("pav");
		Thread.sleep(3000);
		sel.selectByIndex(7);
		Thread.sleep(3000);
		sel.selectByVisibleText("Chapati Bhaji");
		Thread.sleep(3000);
		//sel.deselectAll();
		sel.deselectByIndex(7);
		Thread.sleep(3000);
		sel.deselectByVisibleText("Vadapav");
		Thread.sleep(3000);
		sel.deselectByValue("cb");
	}

}
