package TestNGCLAssignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment223 {

	@Test
	public void RobotClass() throws AWTException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		WebElement s1 = driver.findElement(By.linkText("Gmail"));

		Actions a1 = new Actions(driver);

		a1.contextClick(s1).perform();

		Robot r2 = new Robot();

		r2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);

		r2.keyPress(KeyEvent.VK_ENTER);

	}

}
