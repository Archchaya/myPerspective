package myp1_stepdefinitions;

import java.io.IOException;
import io.cucumber.java.en.Given;
import myP1_pageobjects.loginpage_objects;

public class login_stepdefinition {

	private loginpage_objects loginPO = new loginpage_objects ();
	
	@Given("I am login to the myp1 site")
	public void i_am_login_to_the_myp1_site() throws IOException, InterruptedException {
		loginPO.launchURL() ;
		loginPO.getCredentials() ;
	    
	}

	@Given("System navigate to the dashboard")
	public void system_navigate_to_the_dashboard() throws InterruptedException {
		loginPO.getSignin();
	  
		loginPO.tearDown();
		
	}


	
	
}
