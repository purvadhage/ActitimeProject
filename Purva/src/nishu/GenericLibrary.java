/* Generic Library     4-11-22
 * 1). Generic Library is one of the components of automation Framework. It contains common classes 
 *     which can be reusable for all the test Scripts and any project as well.
 * 2). Generic Library class contains reusable methods which are created by framework developer & 
 *     it is the shared to the team members via GitHub.
 * 3). All the Generic Classes available in separate package & the name of the Package should be
 *     com.projectName.Generic
 *     
 *     # Coding Standards:
 *     To get the below lines type /** above the class name & click on enter.
 * 
 */
package nishu;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericLibrary {
	String path="./Testdata/Testdata.xlsx";
	
	public void readDataFroString Sheetname,int row,int cell)
	FileInputStream fis = new FileInputStream(path);
	WorkbookFactory wb = WorkbookFactory.create(fis);
	
	
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
