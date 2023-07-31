package page;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Vjrlpage {
	WebDriver driver;
	By popclose = By.xpath("//*[@id=\"largeModal\"]/div/div/button");
	By source=By.xpath("//*[@id=\"FromCity\"]");
	By destination=By.xpath("//*[@id=\"ToCity\"]");
	By date=By.xpath("//*[@id=\"txtFromDate\"]");
	By searchbtn=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	
	
	//Buses on contract elements
	By busoncontract=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a");
	By contactname=By.xpath("//*[@id=\"txtcontactPerson\"]");
	By contactnumber=By.xpath("//*[@id=\"txtMobileNo\"]");
	By emailaddress=By.xpath("//*[@id=\"txtEmail\"]");
	
	//constructor
	public Vjrlpage(WebDriver driver)
	{
		this.driver=driver;
	}
public void sendvalues() throws Exception
{	Thread.sleep(3000);
	boolean pop=driver.findElement(popclose).isDisplayed();
	if(pop)
	{
		driver.findElement(popclose).click();
		conditionpop();
	}
	else
	{
		conditionpop();
	}
	
}
public void conditionpop()
{
	driver.findElement(source).sendKeys("Bangalore",Keys.ENTER);
	driver.findElement(destination).sendKeys("Hyderabad",Keys.ENTER);
	WebElement datepick=driver.findElement(date);
	Actions act=new Actions(driver);
	act.keyDown(datepick, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE);
	act.perform();
	driver.findElement(date).sendKeys("16-07-2023");
}
public void search() throws Exception
{
	driver.findElement(searchbtn).click();
	Thread.sleep(3000);
}

public void buscontract(String name, String mob, String email)
{	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(busoncontract).click();
	driver.findElement(contactname).sendKeys(name);
	driver.findElement(contactnumber).sendKeys(mob);
	driver.findElement(emailaddress).sendKeys(email);
}

}
