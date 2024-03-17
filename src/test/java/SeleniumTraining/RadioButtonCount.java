package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// creating object of chromedriver
		// driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		driver.get("https://www.calculator.net");
		driver.manage().window().maximize();

		// common radio button xpath because we have to find all radio buttons count
		List<WebElement> radiobuttonlistt = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total no of radio buttons on webpage are=" + radiobuttonlistt.size());
		driver.close();

	}

}
