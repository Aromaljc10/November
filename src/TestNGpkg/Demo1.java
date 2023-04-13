package TestNGpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver ();
		;
	}
	
	@BeforeTest
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php/FormName=user_details");
	}
	
	@Test
	public void createbutton()
	{
	WebElement createbutton=driver.findElement(By.xpath("//input[@id='Register']"));
	Boolean b=createbutton.isEnabled();
	if(b)
	{
		System.out.println("createbutton is enabled");
	}
	else
	{
		System.out.println("not enabled");
	}
	}
	@Test
	public void logo()
	{
	   WebElement logo=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]"));
	  Boolean c= logo.isDisplayed();
	  if(c)
	  {
		  System.out.println("is displayed");
	  }
	  else {
		  System.out.println("not displayed");
	  }
	}
		
	

}
