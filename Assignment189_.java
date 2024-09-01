package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Do Parallel Testing with minimum 3 browser?

public class Assignment189_ {

	WebDriver driver;

	@Test
	@Parameters("browser")

	public void paralletestcase01(String Browsername) {

		if (Browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}

		if (Browsername.equals("Firefox")) {
			driver = new FirefoxDriver();
		}

		if (Browsername.equals("Edge")) {
			driver = new EdgeDriver();
		}

		driver.get("https://google.com");

		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("facebook" + Keys.ENTER);

	}

}
