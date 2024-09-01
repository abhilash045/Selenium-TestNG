package TestNGCLAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//WAP using explicit Wait?

public class Assignment202 {

	@Test
	public void Gsearch() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://google.com");

		driver.manage().window().maximize();

		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.titleIs("Google"));

		driver.findElement(By.id("APjFqb")).sendKeys("amazon" + Keys.ENTER);

	}

}
