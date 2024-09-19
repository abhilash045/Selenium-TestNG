package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP to scroll down to about us in amazon?
public class Assignment219 {
	@Test
	public void ScrollDown() {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/ref=nav_logo");

		driver.manage().window().maximize();

		WebElement scrolldown = driver.findElement(By.linkText("About Us"));

		Point p = scrolldown.getLocation();

		int x = p.getX();
		int y = p.getY();

		System.out.println(x);
		System.out.println(y);

		JavascriptExecutor j1 = driver;

		j1.executeScript("window.scrollBy(0,2000)"); // to move down ward

	}

}
