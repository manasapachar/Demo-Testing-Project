package SeleniumAssignment;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementAndElements {
@Test
	public void Elements() throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C/Users/anandsortur/eclipse-workspace/DemoC/C:\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 // URL of the Calculator Application to be opened
        driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
  
        // Maximize window size of browser
        driver.manage().window().maximize();
       
        List<WebElement> allInputElements = driver.findElements(By.cssSelector("input[type='checkbox']"));
        
        if(allInputElements.size() > 0) 
 	    {
        	  for(int i=0; i <= allInputElements.size(); i++)          // Starts the loop from first check box to the last one
              {   
        		  WebElement checkbox = allInputElements.get(0);
        		   if(!checkbox.isSelected())
 			    	  checkbox.click();
 			      Thread.sleep(500);
              }
 	    }
        
        driver.quit();
	}

}
//The driver executable does not exist: /Users/anandsortur/eclipse-workspace/DemoC/C:\SeleniumWebDriver\chromedriver_win32\chromedriver.exe