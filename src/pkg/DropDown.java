package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
ChromeDriver driver;
	
	@Before 
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php/FormName=user_details");
	}
	
	@Test
	public void testverify()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("01");
		
		WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select monthdetails=new Select(month);
	    monthdetails.selectByValue("05");
	    
	    WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	    Select yeardetails=new Select(year);
	    yeardetails.selectByValue("1999");
		
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}

}



