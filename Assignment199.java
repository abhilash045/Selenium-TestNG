package TestNGCLAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//WAP to launch flipkart, click on Fashion,
//then under Mens category click on T-shirts, then Sort by any option

public class Assignment199 {
	WebDriver driver;

	@Test

	public void flipkart() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		 driver.findElement(By.linkText("Fashion")).click();
	

//		WebElement men = driver.findElement(By.xpath("//span[.='Men']"));
//		
//		Thread.sleep(2000);
//		WebElement tshirt = driver.findElement(By.linkText("T-Shirts"));
//		tshirt.click();
//		Thread.sleep(2000);
//		WebElement sort = driver.findElement(By.xpath("//div[.='Newest First']"));
//		sort.click();

	}

}
