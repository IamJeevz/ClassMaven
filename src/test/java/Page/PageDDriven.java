package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageDDriven {
	WebDriver driver;
	By usernamefield=By.xpath("//*[@id=\"username\"]");
	By passwordfield=By.xpath("//*[@id=\"password\"]");
	By loginbutton=By.xpath("//*[@id=\"submit\"]");
	
	//constructor
	public PageDDriven(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void loginfunc()
	{
		driver.findElement(loginbutton).click();
	}
	
	public void sendingValues(String UN,String PWD)
	{
		driver.findElement(usernamefield).clear();
		driver.findElement(passwordfield).clear();
		driver.findElement(usernamefield).sendKeys(UN);
		driver.findElement(passwordfield).sendKeys(PWD);
	}

}
