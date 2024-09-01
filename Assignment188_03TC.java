package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment188_03TC {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")

	public void amazonsearch(String Browsername) {
		
		if (Browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if (Browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes" + Keys.ENTER);

	}

}
