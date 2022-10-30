

package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class loginfeature {
	WebDriver driver;
	
	loginpage login;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      driver.manage().window().maximize();
	}

	@When("user enter username and pass word")
	public void user_enter_username_and_pass_word() {
		login = new loginpage(driver);
		login.Fb_username();
		login.Fb_password();
	}

	@When("hits login button")
	public void hits_login_button() {
		login.Fb_login();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	
		Thread.sleep(2000);
	}

	
	
	
}
