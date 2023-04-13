package TestNGpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datapicker {
	WebDriver driver;
	String baseurl="https://www.expedia.com/";
	
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
	}
	
	@BeforeMethod 
	public void url()
	{
	    driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click(); //click departing date
		
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
					String month1=month.getText();//month march heading xpath
			if(month1.equals("March 2023"))
			{
				System.out.println(month1);
				break;
				
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			}//next button xpath
			
	}
          List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\\\"wizard-flight-tab-roundtrip\\\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[2]/button"));
				for(WebElement dateelement:alldates1)//xpath of the all dates of your suggested month
				{
					String date=dateelement.getAttribute("data-day");
					System.out.println(date);
					if(date.equals("10"))
					{
						dateelement.click();
						System.out.println("date selected");
					}
				}
	}
}

