package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://epc2017-itg-beta.msys.parts/");
		
			}
	
	//webdriver.ie.driver

}
