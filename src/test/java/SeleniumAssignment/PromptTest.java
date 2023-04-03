package SeleniumAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptTest {
	
	@Test

	public void alertTesting() throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("file:///Users/anandsortur/Downloads/promptTest%20(2).html");
		WebElement tryIt = driver.findElement(By.xpath("/html/body/button"));
		tryIt.click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().sendKeys("Anananananananaanananana");
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		//PromptScript();
		
		
		WebElement display = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
       // System.out.println("Manasa Anand");
        Thread.sleep(5000);
        
        driver.quit();
	
	}}
