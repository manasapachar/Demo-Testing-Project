package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAssignment1 {

	public static void main(String[] args) throws Exception {

		// Do not change the below line. Otherwise your evaluation will fail
		// DesiredCapabilities caps = DesiredCapabilities.phantomjs();

		System.setProperty("webdriver.chrome.driver",
				"/Users/anandsortur/eclipse-workspace/DemoC/src/test/java/SeleniumAssignment/BasicCalculator.java");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.get("https://selenium-apps.doselect.in/to-do-list/");
	        
	        WebElement input = driver.findElement(By.xpath("/html/body/div/form/input"));
	        input.sendKeys("TaskOne");
	        WebElement addBut = driver.findElement(By.id("button"));
	        addBut.click();
	        
	        Thread.sleep(5000);
	        input.sendKeys("TaskTwo");
	        addBut.click();
	        Thread.sleep(5000);
	        input.sendKeys("TaskThree");
	        addBut.click();
	        
	        addBut
	        Thread.sleep(5000);
	        
	        // DO NOT REMOVE THIS LINE 
	        driver.quit();

	}
}