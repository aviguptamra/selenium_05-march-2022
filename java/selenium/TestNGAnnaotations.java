package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnaotations {
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("BeforeSuite");
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforeTest");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeClass");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test");
	}
	
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("AfterMethod");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
}
