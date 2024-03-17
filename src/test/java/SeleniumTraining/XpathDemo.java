package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {

		// Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// creating object of chromedriver
		// opening sauce.com
		driver.get("https://www.saucedemo.com");

		// using single attribute
		// driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		// using contains
		// driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		// using starts-with
		driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("standard_user");

		// using multiple attribute
		driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys("secret_sauce");
		// or
		// driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");

		// login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		// add to cart first item
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		// using or expression
		driver.findElement(By.xpath(
				"//button[@id='add-to-cart-sauce-labs-bike-light' or @name='add-to-cart-sauce-labs-bike-light']"))
				.click();
		// using text
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();

	}

}
