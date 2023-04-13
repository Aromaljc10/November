package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Firstclass {

	public static void main(String[] args) {
		String exp="Google";
		String ex="Microsoft Edge"; 
		
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.microsoftedge.com  ");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actualtitle1 =driver1.getTitle();	
		System.out.println("actual title1="+actualtitle1);
		if(actualtitle1.equals(ex))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		String actualtitle =driver.getTitle();
		System.out.println("actual title="+actualtitle);
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();
	
	    
	}

}
