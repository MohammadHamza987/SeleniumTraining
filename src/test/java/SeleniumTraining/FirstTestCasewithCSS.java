package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCasewithCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// creating object of chromedriver

		// launching google
		// driver.navigate().to("http://www.google.com");
		driver.get("http://www.saucedemo.com");
		driver.manage().window().maximize();

		// using css selector---tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

		// using css selector--tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

		// using css selector---tag.classname
		driver.findElement(By.cssSelector("input.submit-button")).click();

		//String homepage = driver.getWindowHandle();
		//driver.switchTo().window(homepage);

		// add to cart using xpath
		driver.findElement(By.xpath(
				"//button[@class='btn btn_primary btn_small btn_inventory' and @id='add-to-cart-sauce-labs-backpack']"))
				.click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		

		// capture title of webpage and print
		String title = driver.getTitle();
		System.out.println("Page Title is :" + title);

		// capture url of the webpage
		System.out.println("URL is " + driver.getCurrentUrl());

		// capture page source
		driver.getPageSource();

		// close
		// driver.close();
	}
}
