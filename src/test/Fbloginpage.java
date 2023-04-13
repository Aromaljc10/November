package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fbloginpage extends Baseclass {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void testlogin()
	{
		Fbloginpage ob=new Fbloginpage();
	    ob.setvalues("gf@gmail.com","rsryu");
		ob.login();
        
	}

	
	

}
