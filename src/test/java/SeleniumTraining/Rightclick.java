package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));// right click xpath
		WebElement buttondd = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));// double click xpath
		
		
		Actions act = new Actions(driver);
		
		// for right click we use context click
		act.contextClick(button).perform();// rightclick
		act.doubleClick(buttondd).perform();// doubleclick
	}

}
