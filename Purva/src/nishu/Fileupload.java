//21-10-22
/* File Upload Popup
 * Charateristics=
 * 1]. We can moved this popup
 * 2]. We cannot inspect this popup
 * 3]. This popup will be having Open and Cancel button.
 * 4]. The title of thes popup will be Open or Fileupload
 * Solution to handle fileupload popup we should specify absolute path of the file as an argument for sendkeys() method.
 *  Example html code for fileupload popup:=
 *  <input type="File" id="cv"></input>   
 */

// Write a script to upload the file. 

package nishu;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ACER/Desktop/file.html");
		Thread.sleep(3000);
		File f = new File("./Testdata/Leaving Certificate.pdf");
		String path = f.getAbsolutePath();
		Thread.sleep(3000);
		driver.findElement(By.id("cv")).sendKeys(path);
		Thread.sleep(3000);
		
		
	}

}
