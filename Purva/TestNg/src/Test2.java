//8-11-22    pg 1

package src;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeClass
	public void launchBrowser()
	{
		Reporter.log("browser launch",true);
	}
	
	@AfterClass
	public void browserClosed()
	{
		Reporter.log("browser closed",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("logged in successfully",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logged out successfully",true);
	}
	
	@Test
	public void createdCustomer()
	{
		Reporter.log("Customer Created Successfully",true);
	}
	
	@BeforeSuite
	public void databaseopened()
	{
		Reporter.log("database opened",true);
	}
	
	@AfterSuite
	public void databaseclosed()
	{
		Reporter.log("database closed",true);
	}
	
}


