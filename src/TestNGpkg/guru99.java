package TestNGpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class guru99 {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		
	}
	
	@BeforeTest
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void test1()
	{
		Alert a=driver.switchTo().alert();
		
		a.accept();
      driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
      driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span"));
      driver.findElement(By.xpath("//*[@id=\"authentication\"]/button")).click();
      
      
      
      
    }
}