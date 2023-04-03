package Hooks;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {
	
	protected static WebDriver driver;
	
	
	
	@Before(order=0)
	public void setup1()
	{
		
		System.out.println("000000000000");
		
		
	}

	

	@Before(order=1)
	public void setup2()
	{
		
		System.out.println("1111111111111");
		
		
	}
	

	@Before(order=2)
	public void setup3()
	{
		
		System.out.println("333333333333333");
		
		
	}
	
	@After(order=0)
	public void tear()
	{
		
		System.out.println("oyee");
	}
}
