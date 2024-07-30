package stepDef;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TutoNinjaLogin {
		
	WebDriver driver;
	@Before("@Tuto")
		public void Entry() {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		 @Given("^I navigate to the Toto applicaion$")
		 public void i_navigate_to_the_toto_applicaion() {
		     
			 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		 }

		 @When("^I enetered valid cred \"([^\"]*)\" and \"([^\"]*)\" into the fields$")
		 public void i_enetered_valid_cred_emailaddress_and_password_into_the_fields(String emailadress, String password) throws InterruptedException {
		    
			
			 driver.findElement(By.id("input-email")).sendKeys(emailadress);
			 driver.findElement(By.id("input-password")).sendKeys(password);
			 
		 }

		 @And("^I clicked onto login button$")
		 public void i_clicked_onto_login_button() throws InterruptedException {
			 
			 driver.findElement(By.cssSelector("input[value='Login']")).click();
			 
		 }

		 @Then("^user should be able to login sucessfully$")
		 public void user_should_be_able_to_login_sucessfully() {
			 	
			 WebElement bread = null;
			 try {
			 bread = driver.findElement(By.xpath("//ul[@class = 'breadcrumb']//a[text()='Account']"));
			 }catch(Exception e)
			 {
				 System.out.println("Login failed");
			 }
			 Assert.assertNotNull("Login failed",bread);
			 
		 }
		 @After("@Tuto")
		 public void end() {
			 driver.quit();
		 }
}
