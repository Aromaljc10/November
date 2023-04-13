package TestNGpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngdemo {
	ChromeDriver driver;
	
	@BeforeGroups
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
		System.out.println("urlloading");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}

	@Test
	public void test3()
	{
		System.out.println("test3");
	} 

	@AfterMethod
	public void aftermtd()
	{
		 
	}
	
	@AfterTest
	public void aftertest()
	{
		
	}
	
	
}
