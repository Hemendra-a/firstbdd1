package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baselibrary.Baselibrary;
class Login_page1 extends Baselibrary{
	String Title;
public Login_page1(){
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@href='/login']")
private WebElement Sign;
@FindBy(xpath="//*[@id='login_field']")
private WebElement username;
@FindBy(xpath="//*[@id='password']")
private WebElement password;
@FindBy(xpath="//*[@value='Sign in']")
private WebElement clickonsignin;   

public void getVerifyTitle() {
	String title=driver.getTitle();
	System.out.println("title="+title);
}
public void clickonsign() {
	if(Sign.isEnabled()) {
	System.out.println("Sign button is visible :"+Sign.isEnabled());
	Sign.click();
	}
	else {
		System.out.println("Button is not visible");
	}
}
public void sendusername() throws InterruptedException {
	Thread.sleep(1000);
	username.sendKeys("Enter email id");
}
public void sendpassword() throws InterruptedException {
	Thread.sleep(1000);
	password.sendKeys("Enter Password");
}
public void clickonsigninbutton() {
	if(clickonsignin.isEnabled()) {
	System.out.println("Signin button is visible :"+clickonsignin.isEnabled());
	clickonsignin.click();
	}
	else {
		System.out.println("Button is not visible");
	}
}
}
public class Login_page extends Login_page1 {
 @FindBy(xpath="//*[@data-hydro-click-hmac='b6c92577ccf7f7f0b025331e17a026339b8fd9f4c509024f584142f43bc6af92'] ")
 private WebElement clickonnewbutton;

 @FindBy(xpath="//*[@id='repository_name']")
 private WebElement createrepo;
 
 @FindBy(xpath="//*[@id='new_repository']/div[5]/button")
 private WebElement clickoncreaterepo;
 
 @FindBy(xpath="//*[@id='issues-tab']")
 private WebElement clickonissue;
 
 @FindBy(xpath="//*[@id='repo-content-turbo-frame']/div/div[1]/div[2]")
 private WebElement clickonnewissue;
 
 @FindBy(xpath="//*[@id='issue_title']")
 private WebElement createnewissue;
 
 @FindBy(xpath="//*[@id='new_issue']/div/div/div[1]/div/div[1]/div/div[2]/button")
 private WebElement Submitnewissue;
 
 @FindBy(xpath="//*[@class='btn btn-sm btn-primary m-0 ml-2 ml-md-2']")
 private WebElement clickonnewissue1;
 
 @FindBy(xpath="//*[@id='new_comment_field']")
 private WebElement addcomments;
 
 @FindBy(xpath="//*[@id='partial-new-comment-form-actions']/div/div[2]/button")
 private WebElement submitcomments;
 
 @FindBy(xpath="//*[@class='issue-link js-issue-link']")
 private WebElement verifynewlink;
 
 @FindBy(xpath="//*[@id='settings-tab']")
 private WebElement clickonsetting;

 @FindBy(xpath="//*[@id='options_bucket']/div[9]/ul/li[4]/details/summary")
 private WebElement clickondeleterepo;
 
 @FindBy(xpath="//*[@id='options_bucket']/div[9]/ul/li[4]/details/details-dialog/div[3]/form/p/input")
 private WebElement sendreponame;
 
 @FindBy(xpath="//*[@id='options_bucket']/div[9]/ul/li[4]/details/details-dialog/div[3]/form/button")
 private WebElement clickondeleterepobutton;
 
 @FindBy(xpath="//*[@id='js-flash-container']")
 private WebElement getsuccesfullmsg;
 
 @FindBy(xpath="/html/body/div[1]/div[1]/header/div[1]/a")
 private WebElement clickonHomebutton;
 
 @FindBy(xpath="/html/body/div[1]/div[5]/div/aside/div")
 private WebElement Titleverify;
 
 public void clickonnewbutton() {
	 if(clickonnewbutton.isEnabled()) {
		 System.out.println("New Button is visible :"+clickonnewbutton.isEnabled());
	    clickonnewbutton.click();
	 }
	 else {
		 System.out.println("Button is not available");
	 }
 }
 public void Createrepo() throws InterruptedException {
	 
	 createrepo.sendKeys("newdemo7");
	 Thread.sleep(1000);
	 if(clickoncreaterepo.isEnabled()) {
		 System.out.println("Create repo button is visible :"+clickoncreaterepo.isEnabled());
		 clickoncreaterepo.click();
		 Title=driver.getTitle();
		System.out.println("Get verify Title:"+Title);
	 }
	 else {
		 System.out.println("Skip the whole code");
	 }
 }
 
 public void clickonissue() {
	 if(clickonissue.isEnabled()) {
		 System.out.println("Issue button is visible :"+clickonissue.isEnabled());
		 clickonissue.click();
		 
	 }
	 else {
		 System.out.println("Issue button is not visible");
	 }
 }

    public void clickonnewissue() throws InterruptedException {
 	
 	 Thread.sleep(1000);
	 if(clickonnewissue.isEnabled()) {
		 System.out.println("new issue button"+clickonnewissue.isEnabled());
		 Thread.sleep(1000);
		 clickonnewissue.click();
	
	 }
	 else {
		 System.out.println("warning :Button is not visible");
	 }
 }
 
    public void createnewissue() throws InterruptedException {
    	 Thread.sleep(2000);
    	createnewissue.sendKeys("not able to login on git");
    	 Thread.sleep(2000);
    	if(Submitnewissue.isEnabled()) {
    		System.out.println("New issue button is visible :"+Submitnewissue.isEnabled());
    		Submitnewissue.click();
    	}
    }
    //
    public void clickonnewissue1() throws InterruptedException {
    	Thread.sleep(2000);
    	if(clickonnewissue1.isEnabled()) {
    		System.out.println("SNew issue button is visible :"+clickonnewissue1.isEnabled());
    		Thread.sleep(2000);
    		clickonnewissue1.click();
    	}
    	else {
    		System.out.println("button is not visible");
    	}
    }
    
    public void createnewissue1() throws InterruptedException {
   	    Thread.sleep(2000);
    	 createnewissue.sendKeys("captcha is not working");
    	 Thread.sleep(2000);
    	if(Submitnewissue.isEnabled()) {
    		System.out.println("Submit button is visible :"+Submitnewissue.isEnabled());
    		Submitnewissue.click();
    	}
    	else {
    		System.out.println("button is not visible");
    	}
    }
    
    public void Addcomments() throws InterruptedException {
    	addcomments.sendKeys("this issue is related to #1 ");
    	Thread.sleep(1000);
    	if(submitcomments.isEnabled()) {
    		System.out.println("Comment button is visible :"+submitcomments.isEnabled());
    		submitcomments.click();
    	}
    	else {
    		System.out.println("button is not visible");
    	}
    }
    
    public void verifynewlink() throws InterruptedException {
    	Thread.sleep(5000);
    	if(verifynewlink.isEnabled()) {
    		Thread.sleep(5000);
    		verifynewlink.click();
    		Thread.sleep(5000);
    		System.out.println("is first issue visible"+driver.getTitle());
    	}
    	else {
    		System.out.println("button is not visible");
    	}
    }
    
    public void clickonsetting() {
    	if(clickonsetting.isEnabled()) {
    		System.out.println("Setting button is visible :"+clickonsetting.isEnabled());
    		clickonsetting.click();
    		
    	}
    	else {
    		System.out.println("button is not visible");
    	}
    }
    public void clickondeleterepo() throws InterruptedException {
    	Thread.sleep(5000);
    	if(clickondeleterepo.isEnabled()) {
    		System.out.println("Delete repo button is visible :"+clickondeleterepo.isEnabled());
    		Thread.sleep(5000);
    		clickondeleterepo.click();
    		sendreponame.sendKeys(Title);
    	}
    	
    	else {
    		System.out.println("button is not visible");
    	}
    }
    public void clickondeleterepobutton() throws InterruptedException {
    	Thread.sleep(5000);
    	if(clickondeleterepobutton.isEnabled()) {
    		System.out.println("Delete repo button is visible :"+clickondeleterepobutton.isEnabled());
    		Thread.sleep(5000);
    		clickondeleterepobutton.click();
    	}
    	else {
    		System.out.println("button is not visible");
    	}
    }
   public void getsuccesfullmsg() {
	   System.out.println("Get final msg :"+getsuccesfullmsg.getText());
   } 
   public void clickonHomebutton() throws InterruptedException {
	   Thread.sleep(2000);
	   clickonHomebutton.click();
   }
   
   public void GetverifyRepo() {
	   Titleverify.getText().contains(Title);
	   if( Titleverify.getText().contains(Title)==false) {
	   System.out.println("Repo not exit ");
	   }
	   else {
		   System.out.println("Repo Exit");
	   }
	  
   }
   
}





    
