package SeleniumTraining;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadfile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");

		 driver.findElement(By.xpath("//input[@id='uploadFile']"))
		 .sendKeys("C:\\Users\\mohom\\Downloads\\HAMZA+blockchain+resumee.docx");// we
		// can only use
		// sendkeys if type=file
		// in source code

		// ***********if type is not equal to file given then we will use robot class to
		// upload*************
		// file
		// as directly we are not able to click on 'choose file' button so using action
		// class
		//WebElement ele = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		//Actions act = new Actions(driver);
		//act.moveToElement(ele).click().perform();

		// Robot rb = new Robot();
		// rb.delay(2000);
		// copy file to clipboard
		// StringSelection ss = new
		// StringSelection("C:\\Users\\mohom\\Downloads\\HAMZA+blockchain+resumee.docx");
		// Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		// now pasting into select file dialog box
		// ctrl+V action to paste file
		// rb.keyPress(KeyEvent.VK_CONTROL);
		// rb.keyPress(KeyEvent.VK_V);
		// after pressing ctrl+V we have to release it also
		// rb.keyRelease(KeyEvent.VK_CONTROL);
		// rb.keyRelease(KeyEvent.VK_V);
		// press enter to upload
		// rb.keyPress(KeyEvent.VK_ENTER);
		// release enter
		// rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
