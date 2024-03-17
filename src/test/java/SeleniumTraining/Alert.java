package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Switchto");

		// ********Simple Alert***************

		// find alert and perform click action
		// driver.findElement(By.xpath("//button[text()='Alert']")).click();
		// switch to alert window and accept the alert
		// driver.switchTo().alert().accept();// ok button

		// ********Confirm Alert************
		// driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		// switch to alert window and confirm/dismiss the alert
		// driver.switchTo().alert().dismiss();

		// *****Prompt Alert*********
		//driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		// switch to alert window and enter text in the alert
		//driver.switchTo().alert().sendKeys("Hamza");
		//driver.switchTo().alert().accept();// ok button
	

	}


}
