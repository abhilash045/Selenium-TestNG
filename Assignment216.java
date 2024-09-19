package TestNGCLAssignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP to fetch the Broken links & also print its Status Code & Response Message?

public class Assignment216 {

	@Test
	public void BrokenLinks() throws IOException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

		List<WebElement> tag = driver.findElements(By.tagName("a"));

		int count = tag.size();

		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement text = tag.get(i);
			String s1 = text.getAttribute("href");
			System.out.println(s1);

			verfylinks(s1);
		}

	}

	static void verfylinks(String s1) throws IOException {

		URL u1 = new URL(s1);

		HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();

		if (h1.getResponseCode() == 200) {

			System.out.println("link is valid  " + u1 + h1.getResponseMessage() + "  " + h1.getResponseCode());

		} else {
			System.out.println("link is not  valid  " + u1 + h1.getResponseMessage() + "  " + h1.getResponseCode());
		}

	}

}
