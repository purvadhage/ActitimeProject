/* Generic Library    3-11-22
 * 
 * QUESTION]. Write a script to create Non-Static Method to read the data from the Excel Sheet.
 * 
 * Advantages of Data Driven Testing:
 * 1). Reusability of the code is achieved.
 * 2). Modification of data in Excel file or External Resource file is easier.
 * 3). Maintenance of data in Excel file or external resource file is easier.
 * 4). Test data can be created explicitly prior to test execution.
 * 5). We can test the application with huge volume of data
 */

package nishu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NonStaticMethodofExcel {

		String path = "./Testdata/Usernamepass.xlsx";
		
		public String readDataFromExcel(String SheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;	
		}

		
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
		NonStaticMethodofExcel ns = new NonStaticMethodofExcel();
		String data = ns.readDataFromExcel("Sheet1", 1, 0);
		System.out.println(data);
			
	
		}
	}

