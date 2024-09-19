package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment224 {

	@Test
	public void Dimension() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();

		WebElement s1 = driver.findElement(By.xpath("(//a[.='New Releases'])[1]"));

		Dimension d1 = s1.getSize();

		int x = d1.getHeight();
		int y = d1.getWidth();

		System.out.println(x);
		System.out.println(y);

	}

}
