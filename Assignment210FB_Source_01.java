package TestNGCLAssignments210_01;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment210FB_Source_01 {

	ChromeDriver driver;
	
	// Step01

	@FindBy(id = "email")
	WebElement email_id;

	@FindBy(name = "pass")
	WebElement pswd;

	@FindBy(id = "loginbutton")
	WebElement login_button;

	// step 2 method

	public void email_id() {

		email_id.sendKeys("9866093612");

	}

	public void pswd() {
		pswd.sendKeys("abhoials@1234");
	}

	public void login_button() {
		login_button.click();
	}
	
	public Assignment210FB_Source_01 (ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
