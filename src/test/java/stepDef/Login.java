package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	WebDriver driver;
	
	@Before("@Login")
	public void sample() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^I login into omayo website$")
	public void i_login_into_omayo_website() {
	

		driver.get("https://omayo.blogspot.com/");
	}

	@When("^I entered valid \"([^\"]*)\" and valid \"([^\"]*)\" credentials$")
	public void i_entered_valid_username_and_valid_password_credentials(String username, String password) {
	  
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
		
	}

	@And("^I clicked on login button$")
	public void i_clicked_on_login_button() {
	   
		driver.findElement(By.xpath("//input[@value='Login']"));
		
	}

	@Then("^user should be able to login with \"([^\"]*)\" results$")
	public void user_should_be_able_to_login_with_expected_results(String someexpected) {
		
		/*
		 * String actualResult = null;
		try 
		{
			Alert alert = driver.switchTo().alert();
			System.out.println(alert);
			if (alert.getText().contains("Error Password or Username")) {
				actualResult = "failure";
			}
		}catch(Exception e)
		{
			actualResult = "success";
		}
		Assert.assertEquals(someexpected, actualResult);*/
		
	}
	@After("@Login")
	public void end() {
		driver.close();
	}
	
}
