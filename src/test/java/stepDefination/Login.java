package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	WebDriver driver;
	
	
	
	@Given("landing page is open")
	public void landing_page_is_open() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	}

	

@When("entered usernamea as {string} in usernamefield")
public void entered_usernamea_as_in_usernamefield(String string) {
	     WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	     username.sendKeys("problem_user");
	     
	}

	@When("entered password as {string}  in passwordfiled")
	public void entered_password_as_in_passwordfiled(String string) {
	    WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	    password.sendKeys("secret_sauce");
	}

	@When("click on button")
	public void click_on_button() {
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
	}
	
	    

	@Then("home page should apper")
	public void home_page_should_apper() {
	   System.out.println("My home page is opened");
	   driver.close();
	}}
