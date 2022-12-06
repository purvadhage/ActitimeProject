/* Priority: 7-11-22
 * 1).Priority is one of the feature of @Test. If we used priority then the test script will be
 *    priorized the 
   2). The defalt value prioriTy is 0.
   3). If there are duplicate in priority then the order of execution will be alphabetical order
*/
package nishu;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority =1)
	public void deleteCustomer()
	{
		Reporter.log("customer deleted successfully",true);

	}
	@Test(priority = 3)
	public void createCustomer()
	{
		Reporter.log("customer created successfully",true);

	}
	@Test(priority = 2)
	public void editCustomer()
	{
		Reporter.log("customer edited successfully",true);

	}
		

}


