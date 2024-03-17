package SeleniumTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.google.co.in/");
		System.out.println("First page" + driver.getTitle());

		// open new tab
		// driver.switchTo().newWindow(WindowType.TAB );// switch to new tab
		driver.switchTo().newWindow(WindowType.WINDOW);// switch to new window

		driver.get("https://www.facebook.com/");// open fb
		System.out.println("Second tab=" + driver.getTitle());

		// get window handles of all open windows
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowhandles);

		driver.close();// now switch the driver back to google

		driver.switchTo().window(handles.get(0));
		System.out.println("First page= " + driver.getTitle());

	}

}
