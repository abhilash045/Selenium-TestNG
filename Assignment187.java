package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment187 {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void amazonlogin(String nameofbrowsers) {

		if (nameofbrowsers.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if (nameofbrowsers.equals("edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}

		driver.get("https://www.flipkart.com/");
		WebElement login = driver.findElement(By.xpath("//span[.='Login']"));
		WebElement login1= driver.findElement(By.xpath("//div[@class='_1TOQfO']"));

		Actions a = new Actions(driver);
		a.moveToElement(login).perform();

		WebElement profile = driver.findElement(By.xpath("(//li[@class='AT0fUR'])[1]"));
		profile.click();

	}
}
