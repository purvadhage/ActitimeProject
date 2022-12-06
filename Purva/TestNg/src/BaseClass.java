//8-11-22  pg 2

package src;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	
	@BeforeSuite
	public void databaseconnection()
	{
		Reporter.log("database connected",true);
	}
	
	@AfterSuite
	public void databaseconnectionclosed()
	{
		Reporter.log("database disconnected",true);
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void login()
	{
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
	}
	
	@Test
	public void clickontask()
	{
		driver.findElement(By.xpath("//div[.='Tasks']")).click();
	}
	
	
	
	 

	}


