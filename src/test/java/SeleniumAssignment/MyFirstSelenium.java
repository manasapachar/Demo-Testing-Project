package SeleniumAssignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
public class MyFirstSelenium {
	



		public static void main(String[] args) throws InterruptedException {

			WebDriver driver = new SafariDriver();
			driver.get("http://seleniumhq.org");
			Thread.sleep(5000);
			driver.quit();
			Thread.sleep(5000);
			 driver.quit();
		}

	}



