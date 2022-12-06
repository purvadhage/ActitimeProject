//19-10-22
//Note:= UnhandleAlertException= we get this exception whenever we try to perform action on the browser without handling Alert Popup
//Popup = in selenium depending on the popup we write different types of code to perform action on the perform
// Popups are generally characterize are:
// 1. Alert popup / javascript popup
// 2. hidden division / calender popup
// 3. Print popup
// 4. File Upload popup
// 5. File Download popup
// 6. Child window popup
// 7. Notification popup 
// 8. Auntentication popup

// Q] write a script to handle Alert popup

/*assigenment= write a script to login to actitime application after login go to task bar go to create ,
go to add new select new customer enter name in the enter customer text filed after that 
cancel and you will get the popup*/
package nishu;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlertJavascript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("nishu");
		driver.findElement(By.name("submit")).click();
		Alert a = driver.switchTo().alert();
		String popuptext = a.getText();
		System.out.println(popuptext);
	//	a.accept();
	//	a.accept();
		driver.close();

	}

}
