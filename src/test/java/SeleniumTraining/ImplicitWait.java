package SeleniumTraining;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open url
		driver.get("https://sellglobal.ebay.in/seller-center/");

		// implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Stopwatch watch = null;

		try {
			watch = Stopwatch.createStarted();
			driver.findElement(By.linkText("START SELLING")).click();
		} catch (Exception e) {
			watch.stop();
			System.out.println("Exception");
		}
		System.out.println("Timelapse=" + watch.elapsed(TimeUnit.SECONDS) + "seconds");

	}

}
