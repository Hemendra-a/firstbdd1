package stepdefination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefination {

    @Given("^The user has opened (.*) browser$")
    public void openBrowser(String browserType) {
    	System.out.println("In openBrowser,browser is"+" :"+browserType);
    }
    
    @When("^user enters (.*) application*")
    public void openApplication(String application) {
    	System.out.println("In openApplication,application is :"+application);

    	System.out.println("create new branch");

    	
    }

    @Then("^user asserts that the page title is \"(.*)\"*")
    public void assertPageTitle(String title) {
    	System.out.println("In assertPageTitle,title is :"+title);
    }
   

}
