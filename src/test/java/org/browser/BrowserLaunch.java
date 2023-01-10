package org.browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BrowserLaunch {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Lenovo\\Desktop\\Sathish Notes\\FrameWork\\Login Details.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		//Access Workbook
		Workbook workbook = new XSSFWorkbook(stream);
		
		//Access the Sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		
		//Access the row
		Row row = sheet.getRow(0);
		
		//Access the cell
		Cell cell = row.getCell(0);
		
		String cellValue = cell.getStringCellValue();
		//System.out.println(cellValue);
		
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		
		int numberOfCells = row.getPhysicalNumberOfCells();
		
		for(int i=0;i<numberOfRows;i++) {
			Row row2 = sheet.getRow(i);
			for(int j=0;j<numberOfCells;j++) {
				Cell cell2 = row2.getCell(j);
				String value = cell2.getStringCellValue();
				System.out.println(value);
			}
			
		}
	
	}
	
}
