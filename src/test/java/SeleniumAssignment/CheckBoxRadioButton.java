package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class CheckBoxRadioButton {
	
	
	

	public void Checkbox() throws InterruptedException{
		
		
		 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		WebElement red = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
		red.click();
		Thread.sleep(1000);
		
		WebElement yellow = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[2]"));
		yellow.click();
		Thread.sleep(1000);
		
		WebElement blue = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[3]"));
		blue.click();
		Thread.sleep(1000);
		
		WebElement orange = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]"));
		orange.click();
		Thread.sleep(1000);
		
		WebElement green = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]"));
		green.click();
		Thread.sleep(1000);
		
		WebElement purple = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]"));
		purple.click();
		Thread.sleep(1000);
		
		WebElement mozilla = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[2]"));
		mozilla.click();
		Thread.sleep(1000);
		
		WebElement opera = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
		opera.click();
		Thread.sleep(1000);
		
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
