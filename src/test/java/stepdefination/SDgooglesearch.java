package stepdefination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SDgooglesearch {
	public static WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Starting-browser is open");
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    System.out.println("Ending-browser is open");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("yes");
		
	   driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in google search box")
	public void user_enters_a_text_in_google_search_box() {
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	}

	@And("hit enters")
	public void hit_enters() {
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user navigate to the search result page")
	public void user_navigate_to_the_search_result_page() {
	   driver.getPageSource().contains("Selenium");
	   driver.close();
	}

}
