package com.demoQA.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader_page {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelReader_page(String excelpath) {

		try {
	File src=new File(excelpath);
	FileInputStream fis=new FileInputStream(src);
	 wb=new XSSFWorkbook(fis);
		}
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
}
	
 public String getdata(int sheetnumber, int row, int cell) {
	 
	 sheet1=wb.getSheetAt(sheetnumber);
	String data=sheet1.getRow(row).getCell(cell).getStringCellValue();
	
	 return data;
 }
	
}
