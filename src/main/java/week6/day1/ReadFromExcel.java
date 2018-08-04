package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ReadFromExcel {

	@Test
	public void readexcel() throws IOException {
		//Path of the excel
		XSSFWorkbook wBook= new XSSFWorkbook("./datafile/login.xls");
		//Go to the specified sheet
		XSSFSheet sheet = wBook.getSheet("details");
		//Get the row number excluding header
		int rowNum = sheet.getLastRowNum();
		
		//to get total number of rows
		
		int rowwithheader = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows including header is " + rowwithheader);
		
		//get the Column number
		int Columncount = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <= rowNum; i++) {
			//Moving to expected row
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < Columncount ; j++) {
				//Moving to specified Cell
				XSSFCell cell = row.getCell(j);
				//reading the value from the cell
				String stringCellValue = cell.getStringCellValue();

				System.out.println(stringCellValue);
			}
		}

		wBook.close();
	}
}
