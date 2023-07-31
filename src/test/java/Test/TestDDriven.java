package Test;
import org.testng.annotations.Test;

import Base.BaseDDriven;
import Page.PageDDriven;
import Utilities.ExcelUtilities;

public class TestDDriven extends BaseDDriven {
	
	@Test
	public void TestCase()
	{
		PageDDriven ob=new PageDDriven(driver);
		String filepath="D:\\JEEVZ\\Selenium\\usrpass.xlsx";
		String sheetname="Sheet1";
		int RC=ExcelUtilities.rowcount(filepath, sheetname);
		for(int i=1;i<=RC;i++)
		{
			String User=ExcelUtilities.cellValues(filepath, sheetname, i, 0);
			System.out.println("USERNAME>>>"+User);
			String pass=ExcelUtilities.cellValues(filepath, sheetname, i, 1);
			System.out.println("PASSWORD>>>"+pass);
			ob.sendingValues(User, pass);
			ob.loginfunc();
			String currenturl=driver.getCurrentUrl();
			String expurl="https://practicetestautomation.com/logged-in-successfully/";
			if(currenturl.equalsIgnoreCase(expurl))
			{
				System.out.println("LOGIN SUCESSFULL");
				driver.navigate().back();
			}
			else
			{
				System.out.println("LOGIN FAILED");
			}
		}
	}

}
