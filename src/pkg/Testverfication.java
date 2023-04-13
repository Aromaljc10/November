 package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testverfication {
	ChromeDriver driver;
	

   @Before
   public void setUp()
   {
	     driver  =new ChromeDriver();
	    driver.get("https://www.google.com");
   }
   
   @Test
   public void testverify()
   {
	   String src=driver.getPageSource();
	   if(src.contains("Gmail"))
	   {
		   System.out.println("text is present");
		   
	   }
	   else
	   {
		   System.out.println("text is not present");
	   }
   }


   @After
   public void tearDown()
   {
	   driver.quit();
   }
}
