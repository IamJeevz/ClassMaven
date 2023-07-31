package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Rediffbase;

public class Rediffpage  {
WebDriver driver;
By mailid=By.xpath("//*[@id=\"login1\"]");
By password=By.xpath("//*[@id=\"password\"]");
By loginbtn=By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]");

public Rediffpage(WebDriver driver) {
	
	this.driver=driver;
}

public void btnact()
{
	driver.findElement(loginbtn).click();
}
public void sedval(String UN,String PWD)
{
	driver.findElement(mailid).clear();;
	driver.findElement(password).clear();
	driver.findElement(mailid).sendKeys(UN);
	driver.findElement(password).sendKeys(PWD);
}
}
