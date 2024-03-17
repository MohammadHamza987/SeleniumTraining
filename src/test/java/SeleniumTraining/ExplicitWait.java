package SeleniumTraining;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open url
		driver.get("https://sellglobal.ebay.in/seller-center/");

		// explicit wait of 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Stopwatch watch = null;

		try {
			watch = Stopwatch.createStarted();
			// driver.findElement(By.linkText("START SELLING")).click();
			WebElement element = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
			element.click();
		} catch (Exception e) {
			watch.stop();
			System.out.println("Exception");
		}
		System.out.println("Timelapse=" + watch.elapsed(TimeUnit.SECONDS) + "seconds");

	}

}
