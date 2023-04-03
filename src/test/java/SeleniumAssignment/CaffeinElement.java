package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class CaffeinElement {
	
private static final String WebDriverManger = null;

public void caffeine() throws InterruptedException {
	
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("file:///Users/anandsortur/Downloads/TenthhAssignment%20(2).html");
	//System.out.println( "stoc116	caffeine	beverages	120	Not available	5");
	
	
	WebElement stockname = driver.findElement(By.xpath("//*[@id=\"StockName\"]"));
	stockname.sendKeys("caffeine");
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
}
	

}
