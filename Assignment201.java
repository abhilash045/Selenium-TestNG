package TestNGCLAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP using implicit Wait?

public class Assignment201 {

	@Test

	public void GTestCase() {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait method

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		driver.findElement(By.id("APjFqb")).sendKeys("grotechminds" + Keys.ENTER);

	}

}
