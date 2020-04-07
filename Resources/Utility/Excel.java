package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static void getcolumndata(String Filename, String sheet, String colname) throws EncryptedDocumentException, IOException
	{
		File f=new File("./Resources/Data/"+Filename+".xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet(sheet);
		int col=0;
		for(int i=col;i<=sh.getRow(0).getLastCellNum();i++)
		{
			if(sh.getRow(0).getCell(i).getStringCellValue().equals(colname))
			{
				col=i;
				break;
			}
		}
		for(int j=1;j<=sh.getLastRowNum();j++)
		{
			System.out.println(sh.getRow(j).getCell(col).getStringCellValue());
		}
	}
}
