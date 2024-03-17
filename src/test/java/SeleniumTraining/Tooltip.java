package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://www.wechat.com/");

		// String actualtooltip =
		// driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		// String expectedtooltip = "We ask for your age only for statistical
		// purposes.";

		String actualtooltip = driver.findElement(By.xpath("//a[@id='new_ele']")).getAttribute("title");
		String expectedtooltip = "windows download";

		if (actualtooltip.equals(expectedtooltip)) {
			System.out.println("test passed");
		} else
			System.out.println("failed");
	}

}
