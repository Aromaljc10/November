 package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		
	}
	
	@BeforeTest
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php/FormName=user_details");
	}
	
	@Test
	public void test1()
	{
		WebElement firstname=driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]"));
		WebElement rediffid=driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]"));
		firstname.sendKeys("arun");
		Actions act=new Actions(driver);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
	}
	

}
