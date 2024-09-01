package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//WAP to test the google search with 10 TestCases using DataProvider?

public class Assignment192 {

	@DataProvider(name = "data1")

	public Object[][] requireddata() {
		return new Object[][] { { "facebook" }, { "instagram" }, { "flipkart" }, { "Amazon" }, { "Grotechminds" } };
	}

	@Test(dataProvider = "data1")
	public void testcase01(String input) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://google.com");

		driver.findElement(By.name("q")).sendKeys(input);

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
