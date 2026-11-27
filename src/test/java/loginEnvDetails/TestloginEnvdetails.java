package loginEnvDetails;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestloginEnvdetails {
	public WebDriver driver;
	
	@BeforeClass
	public void precondition() {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	@AfterClass
	public void postcondition() {
		driver.close();
	}

}
