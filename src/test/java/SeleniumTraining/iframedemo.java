package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// webdriver is an interface
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.rediff.com/");

		// we will print NSE
		// String ns = driver.findElement(By.xpath("//span[text()='NSE']")).getText();
		// System.out.println(ns);
		// We are unable to print nse becasue it is giving error as no such element
		// exception. This is becasuse nse is present inside iframe

		// Now we can switching to iframe with 3 ways
		// id
		// byindex
		// by webelement
		driver.switchTo().frame("moneyiframe");
		System.out.println(driver.findElement(By.xpath("//span[text()='NSE']")).getText());
		 
		
		

	}

}
