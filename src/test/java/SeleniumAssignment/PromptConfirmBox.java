package SeleniumAssignment;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptConfirmBox {

	@Test

	public void clickOK() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("file:///Users/anandsortur/Downloads/confirmTest%20(1)%20(3).html");
		WebElement tryIt = driver.findElement(By.xpath("/html/body/button"));
		tryIt.click();
		Thread.sleep(1000);

		driver.switchTo().alert();

		Thread.sleep(1000);

		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		WebElement msg = driver.findElement(By.xpath("//*[@id=\"demo\"]"));

		Assert.assertEquals("You pressed OK!", msg.getText());
		//Assert.assertNotEquals("You perssed Cancel!", msg.getText() );
		Thread.sleep(1000);

		// driver.switchTo().alert().dismiss();
		
		driver.quit();
		// WebElement display = driver.findElement(By.xpath("//*[@id=\"demo\"]"));

	}

}
