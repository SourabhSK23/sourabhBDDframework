package StepDefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDef {
		WebDriver driver;
		@Given("User is on the login page")
		public void user_is_on_the_login_page() {
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    String url = "https://opensource-demo.orangehrmlive.com/";
		    driver.get(url);
		}

		@When("User enters valid username")
		public void user_enters_valid_username() {
		    WebElement username = driver.findElement(By.id("txtUsername"));
		    username.clear();
		    username.sendKeys("Admin");
		}

		@When("User enters valid password")
		public void user_enters_valid_password() {
			WebElement password = driver.findElement(By.id("txtPassword"));
			password.clear();
		    password.sendKeys("admin123");
		    
		    WebElement loginBtn = driver.findElement(By.name("Submit"));
		    loginBtn.submit();
		}

		@Then("User should be logged in successfully")
		public void user_should_be_logged_in_successfully() {
		    System.out.println("loggin successful");
		}
	}
