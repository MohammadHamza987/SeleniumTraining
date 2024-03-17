package SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGdemo2 {
	@Test
	public void verifyPageTitle() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		// assert the title of the webpage
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";

		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();

	}
}
