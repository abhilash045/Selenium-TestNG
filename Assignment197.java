package TestNGCLAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//WAP to launch amazon, search shoes & find out if the testcase is pass or fail?

public class Assignment197 {

	WebDriver driver;

	@Test
	public void amzon01() throws InterruptedException {

		String Excp = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		driver = new FirefoxDriver();

		driver.get("https://amazon.in");
		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobiles" + Keys.ENTER);

		List<WebElement> s1 = driver.findElements(By.xpath("//div[@='a-section aok-relative s-image-fixed-height']"));

		Assert.assertEquals(s1.size(), 15, "total count doesnt matched"); // testcased failed

	}

}
