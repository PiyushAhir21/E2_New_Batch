package extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataFromExcelFile2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		create java representation object of the physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\testScriptDataE2.xlsx");
		
//		we'll open workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		
//		we'll get access of sheet
//		Sheet sh = wb.getSheet("leads");
		
//		we'll get access of row
//		Row row = wb.getSheet("leads").getRow(1);
		
//		we'll get the access of cell
		Cell cell = wb.getSheet("leads").getRow(1).getCell(0);
		
//		we'll read the data
		String data = cell.getStringCellValue();
		System.out.println(data);
		
//		double value = cell.getNumericCellValue();
//		boolean stauts = cell.getBooleanCellValue();
//		LocalDateTime time = cell.getLocalDateTimeCellValue();
		
	}
}
