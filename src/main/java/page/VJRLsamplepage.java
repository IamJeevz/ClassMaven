package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class VJRLsamplepage {
	WebDriver driver;
	By popbtn=By.xpath("//*[@id=\"largeModal\"]/div/div/button");
	By CL=By.xpath("//*[@id=\"demo\"]/footer/section/div/div/div[1]/div[1]/div/div/div[3]/div[2]/ul/li[1]/a");
	By src=By.xpath("//*[@id=\"FromCity\"]");
	
	public VJRLsamplepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void samp() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(popbtn).click();
		driver.findElement(src).sendKeys("Bangalore",Keys.ENTER);
		WebElement Element=driver.findElement(CL);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
	}

}
