package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.amznpage1;

public class amzntest1 {
WebDriver driver;
String url="https://www.amazon.in/";

@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
@Test
public void test()
{
	amznpage1 ob=new amznpage1(driver);
	ob.sendkey();
	ob.newtab();
	ob.addcart();
}
}
