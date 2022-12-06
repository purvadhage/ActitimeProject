//20-10-22
//Notification Popup
//Charateristics:
/* 1]. We cannot inspect this popup
   2]. We cannot moved this popup
   3]. This popup contains allow and block button
   4]. This popup will be present below the url and at the beging
   solution= if we want to handle this popup:
   >ChromeOptions option = new ChromeOptions();
    option.addArguments("--disable-notification");
    WebDriver driver = new ChromeDriver(option);*/

// Q]. Write a script to handle Notification Popup 

// https://www.myntra.com
package nishu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.yatra.com/");
		
	}

}
