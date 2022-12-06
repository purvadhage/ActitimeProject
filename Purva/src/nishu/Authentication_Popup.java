//Authentication Popup
/*Charateristics:
	1]. We can not moved this popup
	2]. We cannot inspect this popup
	3]. This popup contains username and password
	4]. This popup will be present below the url and middle of the url*/

//Test Data = https://the-internet.herokuapp.com/basic_auth
//Username = admin 
//Password = admin

/*Syntax for handeling Authetication Popup:
https://admin:admin@the-internet.herokuapp.com/basic_auth*/

// Q]. Write a script to handle for Authentication Popup.
package nishu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Authentication_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		
	}
}