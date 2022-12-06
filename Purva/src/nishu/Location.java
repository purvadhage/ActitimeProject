//write a script to verify the x-axis and y-axis are properly align in netflix application search box

package nishu;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		int x1 = driver.findElement(By.name("email")).getLocation().getX();         //getLocation().getX()
		int y1 = driver.findElement(By.name("email")).getLocation().getY();  		//getLocation().getY()
		if(x1==y1) {
			System.out.println("x-axis and y-axis are aligned properly");
		}
		else {
			System.out.println("x-axis and y-axis are not aligned properly");
		}
		
		
		
		//System.out.println(x1);
		//System.out.println(y1);

	}

}
