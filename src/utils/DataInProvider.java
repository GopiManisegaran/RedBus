package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInProvider {
 public static String [][] getAllData(String sheetName) throws IOException{
	 String [][] data = null;
	 File src = new File (sheetName);
	 FileInputStream fis = new FileInputStream(src);
	 XSSFWorkbook wbook = new XSSFWorkbook(fis);
	 XSSFSheet sheet = wbook.getSheetAt(0);
	 int rowCount = sheet.getLastRowNum();
	 System.out.println(rowCount);
	 int colCount = sheet.getRow(0).getLastCellNum();
	 System.out.println(colCount);
	 data = new String [rowCount][colCount];
	 String comment="numeric";
	 for (int i= 1; i<rowCount+1;i++){
		 XSSFRow row  = sheet.getRow(i);
	 
	 
		 for(int j= 0; j<colCount;j++){
			 String CellValue ="";
		
//			 CellValue = row.getCell(j).getStringCellValue();
//			 data [i-1][j]= CellValue;
				if(row.getCell(j).getCellComment().equals(comment))
					CellValue= ""+row.getCell(j).getNumericCellValue();
					else
						CellValue = ""+row.getCell(j).getStringCellValue();
				data [i-1][j] = CellValue;
 }	 
 }
	 fis.close();
	 wbook.close();
	 return data;
}
}