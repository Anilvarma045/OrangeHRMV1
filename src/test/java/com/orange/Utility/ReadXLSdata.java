package com.orange.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;


public class ReadXLSdata {

	@DataProvider(name="NewReaddata")
	public String[][] getData(Method m) throws IOException, Exception, InvalidFormatException{
		
		String excelsheetName=m.getName();   
		
		//m.get() method will access method name from method by because we are using to read data from excel
		//in excel we are metion sheet name same as method name so this reflect method use to that name.
		
		File fil=new File(System.getProperty("user.dir")+"/src\\test\\java\\com\\orange_testData\\LoginData.xlsx");
		FileInputStream  fis =new FileInputStream(fil);
		Workbook wb=WorkbookFactory.create(fis);             /// find Later what is this
		Sheet sheetName=wb.getSheet(excelsheetName);
		
		int totalRows=sheetName.getLastRowNum();
		System.out.println("tatal Rows are  "+totalRows );
		
		Row rowCells=sheetName.getRow(0);
		int totalcols=rowCells.getLastCellNum();
		System.out.println(totalcols);
		
		
		DataFormatter format=new DataFormatter();
		
		String testData[][]=new String [totalRows][totalcols];
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<totalcols;j++) {
				testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);

			}

		}
		return testData;
		

		
	}	
}
