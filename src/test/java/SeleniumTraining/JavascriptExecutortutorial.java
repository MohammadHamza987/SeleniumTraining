package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutortutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// webdriver is an interface
		driver.manage().window().maximize();

		// open url
		driver.get("http://uitestpractice.com/Students/Index");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('SearchData').value='xyz';");// to search a name by entering text

		// ##########most common used JS Executor##################
		WebElement ele = driver.findElement(By.xpath("//input[@value='Find']"));
		js.executeScript("arguments[0].click();", ele);// to click on find button
//#############################################//
		js.executeScript("history.go(0)");// to refresh the browser

	}

}
