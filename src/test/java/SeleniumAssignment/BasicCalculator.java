package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicCalculator {
	
	
	@Test

	public static void Basiccal() throws InterruptedException {
		
		


		System.setProperty("webdriver.chrome.driver",
				"/Users/anandsortur/eclipse-workspace/DemoC/src/test/java/SeleniumAssignment/BasicCalculator.java");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");

		WebElement Firstnumber = driver.findElement(By.xpath("//*[@id=\"number1Field\"]"));
		Firstnumber.sendKeys("10");
		Thread.sleep(2000);
		
		WebElement Secondnumber = driver.findElement(By.xpath("//*[@id=\"number2Field\"]"));
		Secondnumber.sendKeys("20");
		Thread.sleep(2000);
		
		/*WebElement Operation = driver.findElement(By.xpath("///*[@id=\"selectOperationDropdown\"]"));
		Operation.click();
		Thread.sleep(2000);*/

		WebElement select = driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]"));
		select.click();
		
		WebElement Calculate = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
		Calculate.click();
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
