package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch chrome web browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// creating object of chromedriver
		// opening sauce.com
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//select[@id='input-country']"));
		Select dd = new Select(ele);

		// dd.selectByVisibleText("Afghanistan");
		// dd.selectByValue("98");
		dd.selectByIndex(3);

		// some dropdowns allows to select multiple values we can also check if it
		// allows
		if (dd.isMultiple()) {
			System.out.println("Dropdown is multiple");
		} else
			System.out.println("Dropdown is not multiple");

		// list all elements dropdown list

		List<WebElement> allddoptions = dd.getOptions();// it stores all the options of dropdown into a list
		System.out.println("Total options are" + allddoptions.size());
		// displaying
		for (WebElement el : allddoptions) {
			System.out.println(el.getText());
		}

	}

}
