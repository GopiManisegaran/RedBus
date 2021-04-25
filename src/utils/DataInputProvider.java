package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {
	public static String [][] getAllData (String sheetname) throws IOException{
		String [][] data =null;
		FileInputStream fis = new FileInputStream(new File(sheetname));
		/*File file = new File(sheetname);
		FileInputStream fis = new FileInputStream(file);*/
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		data = new String [rowCount][columnCount];
		for (int i=1; i<rowCount+1;i++){
		XSSFRow row = sheet.getRow(i);
		for (int j=0;j<columnCount;j++){
			String Cellvalue = "";
			if(row.getCell(j).getCellType()==1)
				row.getCell(j).getStringCellValue();
				else if(row.getCell(j).getCellType() == 0)
					Cellvalue = ""+row.getCell(j).getNumericCellValue();

			data [i-1][j] = Cellvalue;
			
				}
				
			}
			fis.close();
		workbook.close();
		
		return data;
		
	}
}
