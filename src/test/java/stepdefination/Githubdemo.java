package stepdefination;



import baselibrary.Baselibrary;

import io.cucumber.java.en.*;
import page.Login_page;

public class Githubdemo extends Baselibrary{
	Login_page ob;

	@Given("getLaunchgithub")
	public void get_launchgithub() {
		ob = new Login_page();
		  getLaunchUrl("https://github.com/");
	}

	@And("user is on github login page")
	public void user_is_on_github_login_page() {
		ob.getVerifyTitle();
		
	}

	@When("user enters login credential")
	public void user_enters_login_credential() throws InterruptedException{
		ob.clickonsign();
		ob.sendusername();
		ob.sendpassword();
	}

	@And("user clickonsigninbutton")
	public void user_clickonsigninbutton() {
		ob.clickonsigninbutton();
	}

	@Then("user is navigated to the homepage and perform other action")
	public void user_is_navigated_to_the_homepage_and_perform_other_action() throws InterruptedException {
		Thread.sleep(1000);
		  ob.clickonnewbutton();
		  Thread.sleep(1000);
		  ob.Createrepo();
		  ob.clickonissue();
		  ob.clickonnewissue();
		  ob.createnewissue();
		  ob.clickonnewissue1();
		  ob.createnewissue1();
		  ob.Addcomments();
		  ob.verifynewlink();
		  ob.clickonsetting();
		  ob.clickondeleterepo();
		  ob.clickondeleterepobutton();
		  ob.getsuccesfullmsg();
		  ob.clickonHomebutton();
		  ob.GetverifyRepo();
		  driver.quit();
	}

	
}
