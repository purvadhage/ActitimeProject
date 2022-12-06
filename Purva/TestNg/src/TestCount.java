package src;   //7-11-22

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCount {
	
	@Test(invocationCount = 5, priority = 3)
	public void deleteCustomer()
	{
		Reporter.log("customer deleted successfully",true);

	}
	@Test
	public void createCustomer()
	{
		Reporter.log("customer created successfully",true);

	}
	@Test
	public void editCustomer()
	{
		Reporter.log("customer edited successfully",true);

	}

}
