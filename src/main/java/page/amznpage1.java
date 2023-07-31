package page;

import java.time.Duration;
import java.util.Set;
import java.util.Scannner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amznpage1 {
	WebDriver driver;
	By search=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	By searchbtn=By.xpath("//*[@id=\"nav-search-submit-button\"]");
	By firstitem=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a");
	By addcart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	By cart=By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input");
	
	//constructor
	public amznpage1(WebDriver driver)
	{
		this.driver=driver;
	}
public void sendkey()
{
	driver.findElement(search).sendKeys("mobilephone");
	driver.findElement(searchbtn).click();
	driver.findElement(firstitem).click();

}
public void newtab()
{
	String currentwindow=driver.getWindowHandle();
	Set<String> handles=driver.getWindowHandles();
	for(String win:handles)
	{
		if(!currentwindow.equalsIgnoreCase(win))
		{
			driver.switchTo().window(win);
		}
	}
}
public void addcart()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(addcart).click();
	driver.findElement(cart).click();
}
}
