package pkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonverification {
	
ChromeDriver driver;
	
	@Before 
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php/FormName=user_details");
	}
	
	@Test
	public void linkcount()
	{
		String buttontext=driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
			String exp="Check availability";
			if(buttontext.equals(exp))
			{
				System.out.println("Test pass");
				
			}
			else
			{
				System.out.println("Test fail");
				
				
			}
			
	}
	

}
