package libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class genericHandlingExcel 
{
	// Script to get the data from Excel
	public static String getdata(String filepath,String sheetname,int rowvalue, int cellvalue) 	
	{
		FileInputStream fis = null;
		Workbook wb = null;
		try {
			fis = new FileInputStream(filepath);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String cellValue=wb.getSheet(sheetname).getRow(rowvalue).getCell(cellvalue).getStringCellValue();
		return cellValue;
		
		/*String sheetname;
		Object rowvalue;
		Object cellvalue;
		//String cellstring = wb.getSheet(sheetname).getRow((int) rowvalue).getCell((int) cellvalue).getStringCellValue();
		*/
	}
	
	// Script to get the total Number of Row.
	public static int getTotalNoOfRow(String filepath,String sheetname) 
	{
		FileInputStream fis = null;
		Workbook wb = null;
		try
		{
			fis=new FileInputStream(filepath);
			wb = WorkbookFactory.create(fis);
		}catch(Exception e) {}
		
		int totalrows=wb.getSheet(sheetname).getLastRowNum();
		return totalrows;		
	}

}
