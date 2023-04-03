package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccpetInput {
	
	
	

	@Given("user Login of registered")
	public void user_Login_of_registered() {
	    System.out.println("Opening a page ");
	}

	@Given("accept the value (.*) and <.{5}> fill the values")
	public void accept_the_value_mmmm_and_Pass_fill_the_values(String user, String Pass) {
	
		
		System.out.println("===== "+ user +"===="+Pass );
	}

	@Then("I verify the registered")
	public void i_verify_the_registered() {
		System.out.println("I verify the registered");
	}


}
