// NullPointerException: We get this Exception whenever we try to write the data in the empty cell in the Excel Sheet
// Write the Script to write the Data in the Excel Sheet
//2-11-22
package nishu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDatatoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./Testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(1).getCell(3).setCellValue("pharma");
		FileOutputStream fos = new FileOutputStream("./Testdata/Testdata.xlsx");
		wb.write(fos);
		wb.close();
		
		
	}
	

}
