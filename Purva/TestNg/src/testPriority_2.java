/* BatchExecution: collection of multiple test Scripts are called as batch.
 * batch it is also called as suite.
 * Executing all of them together is called as batch execution.
 * 
 * how to created suite file for BatchExecution:
 * 1). Select the classes which are required for execution 
 * 2). Right click on all the selected test scripts
 * 3). Go to testNG.
 * 4). Select convert to testNG.
 * 5). After converting one popup nd change the BatchExecution.xml
 * 6). Click on finish.
 * 7). Suite File will be created.
 * 8). If we want to run suite file.: Right click--> Go to run as--> Run as TestNG suite.
 * 
 */





package src;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testPriority_2 {

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
	@Test(dependsOnMethods = "createCustomer",priority = 2)
	public void deleteCustomer()
	{
		Reporter.log("customer deleted successfully",true);

	}
	}


