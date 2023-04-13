package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	
	ChromeDriver driver;
	   
	 @Before
	 public void setUp()
	 {
		
		  driver =new ChromeDriver();
		 driver.get("https:www.google.com");
		 
	 }
	
	
	
	@Test
	public void titleverfication() throws IOException   
	{
	 
       File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileHandler.copy(src,new File("E://error1.png"));
       
      //search field
       WebElement search=driver.findElement(By.name("q"));
		File src1=search.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./Screenshot//error.png"));
		
	//search button	
		WebElement search1=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/*[1]"));
		File src2=search1.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2,new File("./Screenshot//error1.png"));
		
		 
	   }

}