package TestNGpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class guru {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/articles_popup.php");
		
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>allWindowHandles=driver.getWindowHandles();
		
		for(String handle :allWindowHandles) {
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
				
				String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).getText();
				System.out.println(s);
				driver.close();
			}
			
			driver.switchTo().window(parentWindow);
		}
		
		
		
	}
        
}
