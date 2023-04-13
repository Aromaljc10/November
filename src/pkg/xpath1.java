package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
	ChromeDriver driver;
	
	@Before 
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void testverify()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
		driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
	    driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("agj@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}

}
