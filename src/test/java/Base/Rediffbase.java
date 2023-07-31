package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Rediffbase {
public WebDriver driver;
String url="https://mail.rediff.com/cgi-bin/login.cgi";
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
@AfterTest
public void end()
{
	System.out.println(">>>>>>COMPLETED<<<<<<");
}
}
