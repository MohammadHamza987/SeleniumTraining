package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// webdriver is an interface
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// when there are multiple frames thaen we use indexing
		driver.switchTo().frame(0);// as it is the present inside the first iframe

		// OR WE can also use by webelement
		// WebElement ele=driver.findElement(By.name("packageListFrame"));
		// driver.switchTo().frame(ele);

		System.out.println(driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText());
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();

		// now clicking on the element that is on frame 2
		// to get out of the frame use- switchTo().defaultContent();
		driver.switchTo().defaultContent();// main page
		// now moving onto the iframe2
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();

		// now to count the total number of iframe in the webpage
		driver.switchTo().defaultContent();
		int noofiframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println(noofiframes);

	}

}
