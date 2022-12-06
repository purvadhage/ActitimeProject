//Write a script to read multiple data from the Excel sheet.   3-11-22
//write a script to read multiple data from the Excel sheet (un & pw).
package nishu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./Testdata/Usernamepass.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Sheet1").getLastRowNum();
		for(int i=1; i<=rowcount; i++) {
		String un = wb.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
		String pw = wb.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
		System.out.println(un+"----->"+pw);
		}
		
		
		}

}
