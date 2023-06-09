package SeleniumAssignment;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDemoAlerts {

	
	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup(); // please jo bhi  req chrome k kaam k liye uska sbka set up kar do
			
			
			WebDriver driver= new ChromeDriver();
		
		
		

		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		   // where  as  the get method will get the URL directly
			
			// navigate is faster it does not wait the whole page to load
			// where as the driver.get will wait page to load 
			
			
			// case1: 
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			driver.switchTo().alert().accept(); // accepting the alert generated by previous action
			Thread.sleep(4000);
			
			// case2: 
			driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			driver.switchTo().alert().accept(); // click on OK
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			driver.switchTo().alert().dismiss(); // click on  Cancel
			
			// case 3: 
			
			driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			driver.switchTo().alert().accept(); // click on OK
			
			Thread.sleep(4000);
			String actualvalueOK= driver.findElement(By.xpath("//p[@id='demo1']")).getText();
			Assert.assertEquals("Hello Automation Testing user How are you today", actualvalueOK) ;
			
			
			driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			driver.switchTo().alert().dismiss(); // click on cancel
			
			Thread.sleep(4000);
			String actualvalueCancel= driver.findElement(By.xpath("//p[@id='demo1']")).getText();
			System.out.println("value of cancel"+actualvalueCancel);
			Assert.assertEquals("", actualvalueCancel) ;
			
			driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			driver.switchTo().alert().sendKeys("anumeha");
			driver.switchTo().alert().accept(); // click on OK
			
			Thread.sleep(4000);
			String actualvalueOKaftervalue= driver.findElement(By.xpath("//p[@id='demo1']")).getText();
			Assert.assertEquals("Hello anumeha How are you today", actualvalueOKaftervalue) ;
			
			
			
			
			
			
			Thread.sleep(4000);
			driver.close();
			
			
			}
			
		
			
}
