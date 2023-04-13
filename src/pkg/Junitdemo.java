package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	   
	 @Before
	 public void setUp()
	 {
		
		  driver =new ChromeDriver();
		 driver.get("https://www.google.com");
		 
	 }
	
	@Test
	public void titleverfy()
	{
		
		 String exp="Google";
		  String actualtitle= driver.getTitle();
		  System.out.println("actualtitle"+actualtitle);
		  if(actualtitle.equals(actualtitle))
		  {
			  System.out.println("pass");
		  }
		  else
		  {
			  System.out.println("fail");
		  }
	   }

	   @After
	   public void tearDown()
	   {
		   driver.quit();
	   }
	}