package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}

}
