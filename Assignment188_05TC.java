package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment188_05TC {

	WebDriver driver;

	@Test
	@Parameters("browser")

	public void myntra(String Browsername) {

		if (Browsername.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		if (Browsername.equals("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		driver.get("https://www.myntra.com/");
		WebElement search = driver.findElement(By.className("desktop-searchBar"));
		search.sendKeys("fossile watch" + Keys.ENTER);

	}

}
