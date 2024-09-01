package TestNGCLAssignments210_01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment211_HomepageSource {

	ChromeDriver driver;

	@FindBy(xpath = "//input[@placeholder='Search Facebook']")
	WebElement searchbox;

	public void FbSearch() {
		searchbox.sendKeys("saiteja" + Keys.ENTER);
	}

	public void SearchFriends(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
