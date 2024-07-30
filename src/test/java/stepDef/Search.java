package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("^I visit the website as a guest user$")
	public void i_visit_the_website_as_a_guest_user() {
	   
		System.out.println("<<<----I visit the website as a guest user");
	}

	@When("^I select the books option from the search dropdown$")
	public void i_select_the_books_option_from_the_search_dropdown() {
	    System.out.println("<<<-------I select the books option from the search dropdown");
	}

	@When("^I click on the search icon option$")
	public void i_click_on_the_search_icon_option() {
	    System.out.println("<<<---------I click on the search icon option");
	}

	@Then("^I should see the page having Amazon Best Reads is getting displayed$")
	public void i_should_see_the_page_having_amazon_best_reads_is_getting_displayed() {
		System.out.println("<<<----------I should see the page having Amazon Best Reads is getting displayed");
	}

	@Then("^I should not see the other category products$")
	public void i_should_not_see_the_other_category_products() {
		System.out.println("<<<<-------I should not see the other category products");
	}

	@When("^I select the baby option from the search dropdown$")
	public void i_select_the_baby_option_from_the_search_dropdown() {
	  System.out.println("<<<------I select the baby option from the search dropdown");
	}

	@Then("^I should see the page having Offer on baby products is getting displayed$")
	public void i_should_see_the_page_having_offer_on_baby_products_is_getting_displayed() {
		System.out.println("<<<-----------I should see the page having Offer on baby products is getting displayed");
	}
	
}
