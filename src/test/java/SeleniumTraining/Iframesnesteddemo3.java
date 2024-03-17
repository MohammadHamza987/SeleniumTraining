package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframesnesteddemo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ********switching of frames will be only done after switching the the main
		// frame***************

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// webdriver is an interface
		driver.manage().window().maximize();

		// open url
		driver.get("https://chercher.tech/practice/frames");
		// here we have to select checkbox first then enter the text
		// so first we will go to parent frame then child frame to select the checkbox,
		// then again move to parentv frame to enter the text

		driver.switchTo().frame("frame1");// parent frame
		driver.switchTo().frame("frame3");// childframe
		driver.findElement(By.xpath("//input[@id='a']")).click();// clicking on the checkbox

		// now for entering the text we will switch to frame1 as it is prensent in that
		// only
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).sendKeys("Hamza");

		// now we have to select the animal from the dropdown which is in the frame of
		// the main html code.
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");

		// to select dropdown we will use 'select' whenever there is select present
		// in
		// the html code
		WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
		Select ss = new Select(dd);
		ss.selectByVisibleText("Baby Cat");

	}
}
