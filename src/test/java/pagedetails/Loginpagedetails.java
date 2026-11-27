package pagedetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagedetails {
public WebDriver driver;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submit;
	
	 public void loginpagedetails(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
		 public void Setvlues(String UN,String pswd)throws InterruptedException {
			 username.clear();
			 username.sendKeys(UN);
			 Thread.sleep(2000);
			 password.clear();
			 password.sendKeys(pswd);
			 Thread.sleep(2000);
		 }
		 public void submiytbuttn() {
			 submit.click();
		 }		 
}


