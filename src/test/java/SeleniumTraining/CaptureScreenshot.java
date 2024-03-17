package SeleniumTraining;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

		// capture full page SS
		// step1- convert webdriver object to TakesScreenshot interface

		 TakesScreenshot screenshot = ((TakesScreenshot) driver);

		// step2-call getScreenshotAs method to creare image file

		 File src = screenshot.getScreenshotAs(OutputType.FILE);

		 File dest = new File("C:\\Users\\mohom\\Eclipsenew\\Test1byPrachi\\Screenshots\\FullScreenshot.png");
		// copy the image file to the destination
		 FileUtils.copyFile(src, dest);

	// ######SS of only a particular section of a webpage##################
		//TakesScreenshot screenshot = ((TakesScreenshot) driver);
		//WebElement section = driver.findElement(By.xpath("//div[@class='container red']"));

		// step2-call getScreenshotAs method to create image file

		//File src = section.getScreenshotAs(OutputType.FILE);

		//File dest = new File("C:\\Users\\mohom\\Eclipse new\\Test1byPrachi\\Screenshots\\Sectionss.png");
		// copy the image file to the destination
		//FileUtils.copyFile(src, dest);

		// ##########SS of only a webelement###########

		// WebElement
		// elementonly=driver.findElement(By.xpath("//button[@name='dblClick']"));
		// File src = elementonly.getScreenshotAs(OutputType.FILE);

		// File dest = new File("C:\\Users\\mohom\\Eclipse
		// new\\Test1byPrachi\\Screenshots\\onlyelement.png");
		// copy the image file to the destination
		// FileUtils.copyFile(src, dest);

	}
}
