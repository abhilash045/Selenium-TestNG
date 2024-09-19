package TestNGCLAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

//WAP using HardAssert & SoftAssert in main method?
public class Assignment220 {

	@Test
	public void HardAssertSoftAssert() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");

		driver.manage().window().maximize();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

		search.sendKeys("Shoes" + Keys.ENTER);

		List<WebElement> s2 = driver
				.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));

//		Assertion a1 = new Assertion();  //------> Hard Assertion
//		
//		a1.assertTrue(s2.size()>20);

		SoftAssert a2 = new SoftAssert(); // ---------->soft Assert(condition is false it fail)

		a2.assertTrue(s2.size() == 1);

	}

}
