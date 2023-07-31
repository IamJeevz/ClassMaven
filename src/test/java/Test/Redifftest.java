package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.Rediffbase;
import Page.Rediffpage;
import Utilities.ExcelFunc;

public class Redifftest extends Rediffbase {
	
	@Test
	public void testCase()
	{
		Rediffpage ob=new Rediffpage(driver);
		String path="D:\\JEEVZ\\Selenium\\usrpass.xlsx";
		String sheet="Sheet1";
		int rowcount=ExcelFunc.rowsnum(path, sheet);
		for(int i=1;i<=rowcount;i++)		
		{
			String UN=ExcelFunc.cellvalues(path, sheet, i, 0);
			String PWD=ExcelFunc.cellvalues(path, sheet, i, 1);
			System.out.println("<<<USENAME:"+UN);
			System.out.println("PASSWORD:"+PWD);
			ob.sedval(UN, PWD);
			ob.btnact();
			String currenturl="https://mail.rediff.com/cgi-bin/login.cgi";
			String expurl=driver.getCurrentUrl();
			if(currenturl.equalsIgnoreCase(expurl))
			{
				System.out.println("LOGIN FAILED>>>");
			}
			else
			{
				System.out.println("LOGGED IN SUCCESFULLY>>>");
				driver.navigate().back();
			}
			
				}
	}

}
