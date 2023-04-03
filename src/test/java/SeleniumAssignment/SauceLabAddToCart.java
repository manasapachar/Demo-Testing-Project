package SeleniumAssignment;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SauceLabAddToCart {
	
	

		
		private static final By By = null;

	     @Test
		public void SauceDemo() throws InterruptedException {
			


			System.setProperty("webdriver.chrome.driver",
					"/Users/anandsortur/Downloads/chromedriver_mac64/chromedriver");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");

			WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
			WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
			WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
			

			Username.sendKeys("problem_user");
			Thread.sleep(5000);
			Password.sendKeys("secret_sauce");
			Thread.sleep(5000);
			Login.click();
			Thread.sleep(5000);
			WebElement cart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
			cart.click();
			System.out.print("cart button is working ");
			Thread.sleep(5000);
			driver.quit();
		
			// TODO Auto-generated method stub

		}

	}



