package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//WAP to launch google, type india & find out if the testcase is pass or fail?

public class Assignment195 {

	WebDriver driver;

	@Test
	public void search() {

		String excepted = "mobile";
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoes" + Keys.ENTER);

		Assert.assertEquals(driver.getTitle(), excepted, "sorry the title is not matched");

	}
}
