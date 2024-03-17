package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperlinks {

	public static void main(String[] args) {
		// Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// creating object of chromedriver
		// opening sauce.com
		driver.get("https://www.calculator.net");
		driver.manage().window().maximize();

		// finding list of all the hyperlinks
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));// storing all the elements in a list
		// displaying the total no of links
		System.out.println("Total links are=" + linkElements.size());
		// now printing all the links

		for (WebElement el : linkElements) {
			System.out.println(el.getText());
		}

		driver.close();
	}
}
