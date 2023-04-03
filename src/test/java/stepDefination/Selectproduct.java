package stepDefination;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Selectproduct {
	
	@Given("Login into application")
	public void login_into_application() {
		
		System.out.println("---------------------");
	    
	}

	@When("click on product with Name as {string} on product page")
	public void click_on_product_with_Name_as_on_product_page(String string) {
		System.out.println("productname");
	   
	}

	@Then("product page should open")
	public void product_page_should_open() {
	   
	}

	@Then("add it to cart")
	public void add_it_to_cart() {
	    
	}

	@Then("verify product is added to cart")
	public void verify_product_is_added_to_cart() {
	    
	}

	@Then("Click on product and come back")
	public void click_on_product_and_come_back(io.cucumber.datatable.DataTable dataTable) {
		
	    List< Map <String, String >> recivedata =  dataTable.asMaps(String.class, String.class);  
	    
		System.out.println(recivedata);
		System.out.println("====================");
		System.out.println(recivedata.get(0).get("id"));
		System.out.println(recivedata.get(0).get("nameOfProduct"));
		System.out.println(recivedata.get(0).get("details"));
		
		
		System.out.println(recivedata.get(1).get("id"));
		System.out.println(recivedata.get(1).get("nameOfProduct"));
		System.out.println(recivedata.get(1).get("details"));
		
	}
}
