package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFunc {
	
	public static int rowsnum(String path,String sheet)
	{
		try {
			FileInputStream file=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			XSSFSheet sh=wb.getSheet(sheet);
			return sh.getLastRowNum();
			
		} catch (Exception e) {
			return 0;
		}
		
	}
	public static String cellvalues(String path,String sheet,int r,int c)
	{
		try
		{
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet(sheet);
		XSSFCell cell=sh.getRow(r).getCell(c);
		if(cell.getCellType()==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else
		{
			double v=cell.getNumericCellValue();
			int val=(int)v;
			return String.valueOf(val);
		}
		}
		catch(Exception e)
		{
			return null;
		}
		
	}

}
