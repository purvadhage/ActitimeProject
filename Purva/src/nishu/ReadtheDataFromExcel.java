//2-11-22  Handling Excel File

/* Whenever we want to handle the excel sheet we need to used Apache Poi plugging or 3rd party tool in order to 
 * read the data and write the data from the Excel sheet.
 * 
 * Exception:
 * 1) FileNotFoundException: We get this Exception whenever we used FileInputStream Class.
 * 2) IOException: We get this Exception whenever we used load() Method.
 * 3) DocumentEncryptedException: We get this Exception whenever we used Apahe Poi to Read the Data from Excel Sheet
 * 
 * QUESTION]: Write a Script to Read the Data From the Excel Sheet.
 * 
 */
package nishu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadtheDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream Purva = new FileInputStream("./Testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(Purva);
		//String value = wb.getSheet("sheet1").getRow(1).getCell(2).toString();
		//System.out.println(value);
		
		//System.out.println(wb.getSheet("sheet1").getRow(1).getCell(2).toString());
		Sheet sh = wb.getSheet("sheet1");
		Row ro = sh.getRow(1);
		Cell ce = ro.getCell(2);
		String value = ce.getStringCellValue();
		System.out.println(value);


	}

}
