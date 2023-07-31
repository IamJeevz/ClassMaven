package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Vjrlpage;

public class Vjrltest {
	WebDriver driver;
	String url="https://www.vrlbus.in/";
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void testCase() throws Exception
	{
		Vjrlpage ob=new Vjrlpage(driver);
		ob.sendvalues();
		ob.search();
		ob.buscontract("Sample name", "9876543210", "sample123@mail.com");
	}
	
}
