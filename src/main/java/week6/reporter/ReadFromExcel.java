package week6.reporter;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ReadFromExcel {



	@Test
	public Object[][] readexcel(String filename) throws IOException {
		//Path of the excel
		XSSFWorkbook wBook= new XSSFWorkbook("./datafile/"+filename+".xls");
		//Go to the specified sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		//Get the row number excluding header
		int rowNum = sheet.getLastRowNum();

		/*//to get total number of rows

		int rowwithheader = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows including header is " + rowwithheader);
		 */
		//get the Column number
		int Columncount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowNum][Columncount];

		for (int i = 1; i <= rowNum; i++) {
			//Moving to expected row
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < Columncount ; j++) {
				//Moving to specified Cell
				try {
					XSSFCell cell = row.getCell(j);
					//reading the value from the cell
					data[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					data[i-1][j] = "";
				}


			}
		}

		//wBook.close();
		return data;
	}
}
