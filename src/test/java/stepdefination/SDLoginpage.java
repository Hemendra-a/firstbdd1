package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDLoginpage {
	public static WebDriver driver;
	@Given("browsers is open")
	public void browsers_is_open() {
		System.out.println("Starting-browser is open");
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    System.out.println("Ending-browser is open");
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^user enters(.*)and(.*)$")
	public void user_enters_username_and_password(String username,String password) {
		 driver.findElement(By.name("user-name")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		 System.out.println("_____file has been updated_________");
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		 driver.findElement(By.name("login-button")).click();
	
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		 driver.findElement(By.className("title")).isDisplayed();
		 System.out.println( driver.findElement(By.className("title")).isDisplayed());
		 driver.close();
		
	}


}
