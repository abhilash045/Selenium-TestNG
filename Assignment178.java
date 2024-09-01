package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP using @Test Annotation?

public class Assignment178 {
	
	@Test

	static void login() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		WebElement v1 = driver.findElement(By.name("q"));

		v1.sendKeys("grotechminds" + Keys.ENTER);

	}

}
