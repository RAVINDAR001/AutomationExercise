package GenericFileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileutility {
	
	public String toReadDataFromExcelFile(String sheetname, int row, int cell)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelData.xlsx");
	//	/AutomationFramework11/src/test/resources/DemeoWebShop1.xlsx
		Workbook wb = WorkbookFactory.create(fis);

		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return value;
}}
