package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LumaCreateAcc {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/anandsortur/Downloads/chromedriver_mac64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		Thread.sleep(1000);
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		WebElement Lastname= driver.findElement(By.xpath("//input[@id='lastname']"));
		WebElement Email= driver.findElement(By.xpath("//input[@id='email_address']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
		
		Firstname.sendKeys("Manasa");
		Thread.sleep(5000);
		Lastname.sendKeys("P Achar");
		Thread.sleep(5000);
		Email.sendKeys("manasapachar94@gmail.com");
		Thread.sleep(5000);
		Password.sendKeys("Achieve@1234");
		Thread.sleep(5000);
		ConfirmPassword.sendKeys("Achieve@1234");
		Thread.sleep(5000);
		WebElement CreateAccount = driver.findElement(By.xpath("//button[@title='Create an Account']"));
		CreateAccount.click();
		Thread.sleep(5000);
		driver.close();
		 driver.quit();
		
	}


}
