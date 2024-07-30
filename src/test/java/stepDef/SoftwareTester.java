package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareTester {

	@Given("^I am a \"([^\"]*)\" software tester$")
	public void I_am_a_good_software_tester(String Testertype) {
		
		System.out.println("<<<<<<<<<-----I am a"+Testertype+" software tester");
	}
	@When("^I go to work$")
	public void i_go_to_work() {
		System.out.println("<<<<<------------ I got to work");
	}
	@And("^I \"([a-zA-Z]{1,})\" with the work$")
	public void I_involve_with_the_work(String notice) {
		
		System.out.println("<<<<<<-------------I"+notice+" with the work");
	}
	@Then("^my boss \"([a-zA-Z]{1,})\" me$")
	public void my_boss_loves_me(String mood) {
		
		System.out.println("my boss"+mood+" me");
	}
}
