package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Assign1CartButton {
	

	@Test 
	
	public static void Cart() throws InterruptedException{
    
	System.setProperty("WebDriver.chrome.driver", "Users/anandsortur/eclipse-workspace/DemoC/src/test/java/SeleniumAssignment/Assign1CartButton.java");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	WebElement Username=  driver.findElement(By.xpath("//input[@id='user-name']"));
    WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
    WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
    
    Username.sendKeys("problem_user");
    Thread.sleep(1000);
    Password.sendKeys("secret_sauce");
    Thread.sleep(1000);
	Login.click();
	Thread.sleep(1000);
	WebElement cart = driver.findElement(By.xpath(l"//button[@id='add-to-cart-sauce-labs-bike-light']"));
	cart.click();
	System.out.print("cart button is working ");
	Thread.sleep(1000);
	driver.close();
	
	}

}


