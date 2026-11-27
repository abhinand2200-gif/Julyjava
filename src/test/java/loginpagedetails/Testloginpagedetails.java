package loginpagedetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testloginpagedetails {
	 WebDriver driver;
		@FindBy(name="username")
		WebElement username;
		@FindBy(name="password")
		WebElement password;
		@FindBy(id="submit")
		WebElement submit;
		
		
		public Testloginpagedetails(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver,this);	

		}
		public void setvalues(String UN,String PSWD) throws InterruptedException {
			username.clear();
			username.sendKeys(UN);
			Thread.sleep(2000);
			password.clear();
			password.sendKeys(PSWD);
			Thread.sleep(2000);
			
		}	
		
		public void loginbutton() {
			submit.click();
		}
}


