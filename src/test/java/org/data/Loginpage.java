package org.data;

import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpage extends BaseMethod {
	
static PageF p;
	@When("user ushoud be in home page")
	public void user_ushoud_be_in_home_page() {
		browserlaunch("chrome");
		ImplicitlyWait(20);
		geturl("https://www.skullcandy.in/");
	 
	}

	@Then("user shoud select and product")
	public void user_shoud_select_and_product() {
		 p=new PageF();
		 click(p.getShop());
		click(p.getHeadphone());
		click(p.getAdd());
		
	    
	}

	@Then("use shoud add that product in cart")
	public void use_shoud_add_that_product_in_cart() {
		driver.quit();
	   
	}



}