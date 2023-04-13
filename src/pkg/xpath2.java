package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
	ChromeDriver driver;
	
	
	
	@Before 
	public void setUp()
	{
		driver=new ChromeDriver(); 
		driver.get("https://www.wappalyzer.com");
		
	}
	
	@Test
	public void testverify()
	{
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]")).click();
		driver.findElement(By.xpath("//div[@class='v-responsive__sizer']")).click();
		driver.findElement(By.xpath("")
		
		
		
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
