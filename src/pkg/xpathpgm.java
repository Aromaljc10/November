package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpgm {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(" https://www.facebook.com");
	}
	
	@Test
	public void testverify()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("uhdsius@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("eiu8iu");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		}

	@After
	public void tearDown()
	{
		driver.quit();
	}
	

}
