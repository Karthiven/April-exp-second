package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils 
{
	private static XSSFSheet ExcelWSheet;
	 
	 private static XSSFWorkbook ExcelWBook;
	 
	 private static XSSFCell Cell;
	 
	 private static XSSFRow Row;
	 
	 public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   
	 
	    String[][] tabArray = null;
	 
	    try {
	 
	    FileInputStream ExcelFile = new FileInputStream(FilePath);
	 
	    // Access the required test data sheet
	 
	    ExcelWBook = new XSSFWorkbook(ExcelFile);
	 
	    ExcelWSheet = ExcelWBook.getSheet(SheetName);
	 
	     int totalRows = ExcelWSheet.getLastRowNum();
	     int totalCols=  ExcelWSheet.getRow(0).getLastCellNum();
	    tabArray=new String[totalRows][totalCols];
	   int ci=0,cj=0;
	    for (int i=1;i<=totalRows;i++) 
	    {              
	    	cj=0;
	         for (int j=0;j<=totalCols-1;j++)
	          {
	              
	              tabArray[ci][cj]=ExcelWSheet.getRow(i).getCell(j).getStringCellValue();  
	              cj++;
	          }
	          ci++;
	     }
	 
	 }
	 
	 catch (FileNotFoundException e){
	 
	 System.out.println("Could not read the Excel sheet");
	 
	 e.printStackTrace();
	 
	 }
	 
	 catch (IOException e){
	 
	 System.out.println("Could not read the Excel sheet");
	 
	 e.printStackTrace();
	 
	 }
	 
	 return(tabArray);
	 
	 }
	 

}
