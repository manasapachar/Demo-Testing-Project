package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculationOfCirle {

@Test
		public  void Script() throws  InterruptedException {
			
			
			
					
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
			
		

			
			driver.get("https://selenium-apps.doselect.in/circle-calculator/");
			 WebElement CircumRad = driver.findElement(By.id("txtChar"));
			 CircumRad.sendKeys("12");
			 WebElement CircumCal = driver.findElement(By.id("btnCalcCircum"));
			 CircumCal.click();
			 WebElement AreaRad = driver.findElement(By.xpath("//form[@name='circleTwo']//input[@id='txtChar']"));
			 AreaRad.sendKeys("5");
			 WebElement AreaRadCal = driver.findElement(By.xpath("//*[@id=\"btnCalcArea\"]"));
			 AreaRadCal.click();
			 Thread.sleep(5000);
			 driver.quit();

		}


}
