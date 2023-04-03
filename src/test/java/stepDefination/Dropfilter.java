package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropfilter {
	 WebDriver driver ;
	



@Given("open product page")
public void open_product_page() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(" https://www.saucedemo.com/ ");
	
	WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	 WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	 WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
	  username.sendKeys("problem_user");
	    password.sendKeys("secret_sauce");
		login.click();
	
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    
}

@When("apply filter by(.*) of the filter")
public void apply_filter_by_Name_A_to_Z_of_the_filter(String String) throws InterruptedException {
	
	System.out.println(String);
	
	((WebElement) driver.findElements(By.xpath("//select[@class='product_sort_container']"))).click();
	driver.findElement(By.xpath("//option[contains(text(),'"+String+"']")).click();
	Thread.sleep(3000);

	
}

@Then("verify products are arranged accordingly")
public void verify_products_are_arranged_accordingly() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("apply filter by Name \\(Z to A) of the filter")
public void apply_filter_by_Name_Z_to_A_of_the_filter() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("apply filter by Price \\(low to high) of the filter")
public void apply_filter_by_Price_low_to_high_of_the_filter() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("apply filter by Price \\(high to low) of the filter")
public void apply_filter_by_Price_high_to_low_of_the_filter() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

}
