package stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {
	
	@Given("^user is on Netbanking page$")
    public void user_is_on_netbanking_page() throws Throwable {
        System.out.println("User is under net banking page");
    }

    @When("^user login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("User enters username and password");
    }

    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("The home page is populated");
    }

    @And("^cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("The card are displayed correctly");
    }
    
    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("The user enter username " + strArg1 + "and" +  "password is " + strArg2);
    	
    }
    
    @And("^cards are displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
        System.out.println("The are are correctly displayed" + strArg1 ); 
    }
    
    @When("^user sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    List <List<String>> obj = data.raw();
    System.out.println(obj.get(0).get(0));
    System.out.println(obj.get(0).get(1));
    System.out.println(obj.get(0).get(2));
    System.out.println(obj.get(0).get(3));
    System.out.println(obj.get(0).get(4));
        

    }
    
    @When("^user login into application with (.+) and (.+)$")
    public void user_login_in_to_application_with_and(String username, String password) throws Throwable {
      System.out.println("The paratametrized data is the following: " + username + password);
    }
}  
