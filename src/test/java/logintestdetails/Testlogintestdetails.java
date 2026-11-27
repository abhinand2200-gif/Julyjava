package logintestdetails;

import org.testng.annotations.Test;

import loginEnvDetails.TestloginEnvdetails;
import loginpagedetails.TestloginLogoutdetails;
import loginpagedetails.Testloginpagedetails;


public class Testlogintestdetails extends TestloginEnvdetails {
	  @Test
	    public void login() throws InterruptedException {

		  Testloginpagedetails ob = new Testloginpagedetails(driver);	

	        //ob.setvalues("student","Password123");

	        ob.loginbutton();
	        Thread.sleep(2000);
	        TestloginLogoutdetails ob1= new TestloginLogoutdetails(driver);
	        ob1.logoutbtn();
	        Thread.sleep(2000);
	        
	        
	        
	  }
}
