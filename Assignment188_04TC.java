package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment188_04TC {

	WebDriver driver;

	@Test
	@Parameters("browser")

	public void flipkartlogin(String Browsername) {
		
		if (Browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if (Browsername.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoes" + Keys.ENTER);

	}

}
