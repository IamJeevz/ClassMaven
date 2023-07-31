package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.VJRLsamplepage;

public class VJRLsampletest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/");
		driver.manage().window().maximize();
	
	}
	@Test
	public void testcase() throws Exception
	{
		VJRLsamplepage ob=new VJRLsamplepage(driver);
		ob.samp();
	}

}
