package SeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedDay = "13";
		String expectedMonth = "September";
		String expectedYear = "2022";
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// webdriver is an interface
		driver.manage().window().maximize();

		// open url
		driver.get("https://jqueryui.com/datepicker/");
		// as date element is inside the iframe
		driver.switchTo().frame(0);

		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();

		while(true) {
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));

				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) 
						e.click();
						break;

					
				}

				
			} else// else click on next month
			
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				break;
			
		}

	}

}