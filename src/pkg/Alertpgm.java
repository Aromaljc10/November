package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
ChromeDriver driver;
	
	@Before 
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Documents/alert.html");
	}
	
	@Test
	public void alertp()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		//driver.switchTo().alert().accept();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		if(alerttext.equals("Hello i am an alertbox"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Aromal");
		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("JC");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
}