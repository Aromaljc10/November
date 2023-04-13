package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragnDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		
	}
	
	@BeforeTest
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	
	@Test
	public void test1()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.keyDown(drag,Keys.LEFT).dragAndDrop(drag, drop);
		act.perform();
		
	}
	
	
	

}
 