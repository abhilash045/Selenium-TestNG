package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment200_TC01 {

	@Test(retryAnalyzer =TestNGCLAssignments.Assignment200.class)

	public void Glogin() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		driver.findElement(By.id("APsjFqb")).sendKeys("grotechminds" + Keys.ENTER);

	}

}
