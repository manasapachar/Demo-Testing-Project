package SeleniumAssignment;

import org.apache.commons.lang3.exception.ContextedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.ChromeFilter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterForm {
	
	@Test
	
	public void register() throws ContextedException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
				"/Users/anandsortur/eclipse-workspace/DemoC/src/test/java/SeleniumAssignment/RegisterForm.java");	
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();
	driver.get("file:///Users/anandsortur/Downloads/Thirteen%20(1).html");
	 
	WebElement name = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[3]/input"));
	name.sendKeys("Manasa");
	Thread.sleep(1000);
	
	WebElement username = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[3]/input"));
	username.sendKeys("ManasaAnand");
    Thread.sleep(1000);	
    
    WebElement password = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td[3]/input"));
    password.sendKeys("hani@1234");
    Thread.sleep(1000);	
    
    WebElement reenterpassword = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td[3]/input"));
    reenterpassword.sendKeys("hani@1234");
    Thread.sleep(1000);		
    
    WebElement address = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td[3]/textarea"));
    address.sendKeys("Electronic-City,Banglore 580068");
    Thread.sleep(1000);	
		
	WebElement female = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td[3]/input[2]"));
	female.click();
	Thread.sleep(1000);	
	
	WebElement dname =driver.findElement(By.xpath("/html/body/center/table/tbody/tr[7]/td[3]/select"));
	dname.click();
	Thread.sleep(1000);	
	
	
	WebElement corporate = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[8]/td[3]/input[2]"));
	corporate.click();	
	Thread.sleep(1000);	
	
	WebElement register= driver.findElement(By.xpath("/html/body/center/table/tbody/tr[9]/td[3]/input"));
	register.click();
	Thread.sleep(1000);	
	
	driver.quit();
	
	
	}
	
	
	
	
	

}
