package DemoTest.Test1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_xpath_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// creating object of chromedriver
		// opening sauce.com
		driver.get("https://www.saucedemo.com");

		// username by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		// password by name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		// login by classname
		driver.findElement(By.className("submit-button")).click();

		// getting window handle and switching to product page
		String currentwindowhandle = driver.getWindowHandle();
		driver.switchTo().window(currentwindowhandle);
		// clicking on a text
		// driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		//
		// driver.findElement(By.partialLinkText("Jacket")).click();

		// for list of webelements use findelements
		// here we can find the number of times 'sauce' is present in the webpage
		List<WebElement> elementlist = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element Size " + elementlist.size());
		

	}

}
