package libraries;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class SuperTestNGBeforeAndAfterMethod

{
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		String browsername = "Firefox";
		
		if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} 		
		else if (browsername.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} 
		else if (browsername.equalsIgnoreCase("ie")) 
		{
			
		/*	System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			*/
			
			System.setProperty("webdriver.ie.driver", ".\\BrowserDrivers\\IEDriverServer.exe");
			
			 DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			 capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			 driver = new InternetExplorerDriver(capabilities);
			//driver = new InternetExplorerDriver();
		}
		
		
		else if (browsername.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver", ".\\BrowserDrivers\\MicrosoftWebDriver.exe");
			
			 
			 driver = new EdgeDriver();
			
		}
		
		driver.get("https://epc2017-itg-beta.msys.parts/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod(ITestResult it) throws IOException {
		
			EventFiringWebDriver capture = new EventFiringWebDriver(driver);
			File SrcFile = capture.getScreenshotAs(OutputType.FILE);
			String screenshotname = it.getTestClass().getName();
			File destfile = new File(".\\ScreenShots\\" + screenshotname + ".jpg");
			FileUtils.copyFile(SrcFile, destfile);
		driver.quit();

	}
}
