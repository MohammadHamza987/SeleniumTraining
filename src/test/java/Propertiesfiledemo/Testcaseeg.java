package Propertiesfiledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcaseeg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Readconfigfile configfile = new Readconfigfile();// creating object of readconfig file

		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get(configfile.getURl());
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(configfile.getUsername());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(configfile.getPassword());
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();

	}

}
