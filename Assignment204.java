package TestNGCLAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*  "WAP Using iframe On below problem 

1. Launch Google
2. Type ""Grotechminds"" and press enter button
3. Click on hamburger button available on right TOP corner(9 dots)
4.Click on Youtube
5.Search for grotechminds
6. Click on ""Subscribe"" button of grotechminds youtube channel

Note: Please do this using TestNG" */

public class Assignment204 {

	@Test

	public void GSearch() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.name("q")).sendKeys("Grotechminds", Keys.ENTER);

		Thread.sleep(2000);

		WebElement b1 = driver.findElement(By.className("gb_A"));

		b1.click();
		driver.switchTo().frame(0);
		List<WebElement> apps = driver.findElements(By.xpath("//div[@class='LVal7b ']/ul/li"));
		int count = apps.size();

		for (int i = 0; i < count; i++) {

			WebElement sugg = apps.get(i);

			if (sugg.getText().contains("YouTube")) {
				sugg.click();
				break;
			}
		}
		String yt = driver.getWindowHandle();
		driver.switchTo().window(yt);
		WebElement ytsearch = driver.findElement(By.xpath("//form[@id='search-form']/div/div/input"));
		ytsearch.sendKeys("grotechminds");
		ytsearch.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@aria-label='Subscribe']")).click();

	}

}
