package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerticalScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// webdriver is an interface
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.calculator.net/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		// js.executeScript("window.scrollBy(0,500)");// scroll down by vertical

		// to scroll down the webpage by the visibility of the element
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//a[text()='Calorie Calculator']")));
		// click on the element
		driver.findElement(By.xpath("//a[text()='Calorie Calculator']")).click();

		// to scroll till the bottom of the webpage
		// js.executeScript("window.scollTo(0, document.body.scrollHeight)");

		// horizontal scroll until the element is found
		// WebElement Element=driver.findElement(By.xpath(null));
		// js.executeScript("arguments[0].scrollIntoView();",Element);

	}
}
