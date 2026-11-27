package loginpagedetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestloginLogoutdetails {
	WebDriver driver;
	@FindBy(linkText="Log out")
	WebElement logout;
	public TestloginLogoutdetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	public void logoutbtn() {
		logout.click();
		
		
	}

}
