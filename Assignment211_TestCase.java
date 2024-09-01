package TestNGCLAssignments210_02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CL64_SourceFacebookPOM01.SearchFriends;

public class Assignment211_TestCase {

	ChromeDriver driver;

	@Test
	public void STestCase() {

		SearchFriends a2 = new SearchFriends(driver);

		a2.FbSearch();
	}

}
