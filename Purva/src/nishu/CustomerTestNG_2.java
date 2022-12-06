//5-11-22

package nishu;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerTestNG_2 {
	
	
	@Test
	public void modifyCustomer()
	{
		Reporter.log("customer modified successfully",true);

	}
	@Test
	public void createdCustomer()
	{
		Reporter.log("customer created successfully",true);

	}
	@Test
	public void editCustomer()
	{
		Reporter.log("customer edited successfully",true);

	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("customer deleted successfully",true);

	}
	

}
