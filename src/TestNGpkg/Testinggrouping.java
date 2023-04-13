package TestNGpkg;

import org.testng.annotations.Test;

public class Testinggrouping {
	

	@Test(groups = {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups = {"regression"})
	public void test2()
	{
		System.out.println("test2");
	}

	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("test3");
	}

}
