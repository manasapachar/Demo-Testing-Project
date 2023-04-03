package stepDefination;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginparam {
	
	WebDriver driver;

	@Given("Open the landing page")
	public void open_the_landing_page() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	  
	}

	@When("enter usernamea as {string} in usernamefield")
	public void enter_usernamea_as_in_usernamefield(String string) {
		WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	     username.sendKeys("problem_user");
	     
	
		
		
	}

	@When("enter password as {string} in passwordfiled")
	public void enter_password_as_in_passwordfiled(String string) {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		    password.sendKeys("secret_sauce");
	}
		

	@When("click button")
	public void click_button() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		
		
		
	}

	@Then("home page should be apper")
	public void home_page_should_be_apper() {
		System.out.println("My home page will opened");
	}

}
