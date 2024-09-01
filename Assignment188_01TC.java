package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Do Cross-Browser Testing with 5 TestCases?

public class Assignment188_01TC {

	WebDriver driver;

	@Test
	@Parameters("browser")

	public void crossbrowsing(String Browsername) {

		if (Browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}

		if (Browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		if (Browsername.equals("edge")) {
			driver = new EdgeDriver();
		}

		

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@ id = 'email']"));
		email.sendKeys("pasikantiabhilash@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@ id = 'pass']"));
		password.sendKeys("pasikantiabhilash@gmail.com");

		WebElement Login = driver.findElement(By.xpath("//button[@ name='login']"));
		Login.click();

	}

}
