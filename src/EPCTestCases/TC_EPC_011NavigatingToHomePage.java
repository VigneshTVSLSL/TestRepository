package EPCTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_011NavigatingToHomePage extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void NavigatingToHomePage() throws InterruptedException 
  
  {
	  
	  String Filepath = ".\\TestData\\EPC Test Data.xlsx";
		String Sheetname1 = "Credentials";
		String Sheetname2 = "Webelements";
		
		//finding username field and entering username value
		  
		  driver.findElement(By.id(genericHandlingExcel.getdata(Filepath, Sheetname2, 1, 1))).clear();
		  driver.findElement(By.id(genericHandlingExcel.getdata(Filepath, Sheetname2, 1, 1))).sendKeys(genericHandlingExcel.getdata(Filepath, Sheetname1, 1,1));
		  
		//finding Password field and entering Password value
		  driver.findElement(By.id(genericHandlingExcel.getdata(Filepath, Sheetname2, 2,1))).clear();
			driver.findElement(By.id(genericHandlingExcel.getdata(Filepath, Sheetname2, 2,1))).sendKeys(genericHandlingExcel.getdata(Filepath, Sheetname1, 1, 2));
			
		  //finding Login Button & clicking Submit Button.
			driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 3,1))).click();
			
			//Finding & clicking the placed orders icon
			driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 12, 1))).click();
			
			Thread.sleep(5000);
			
			// Finding and clicking the Messages link
			driver.findElement(By.linkText(genericHandlingExcel.getdata(Filepath, Sheetname2, 16, 1))).click();
			
			System.out.println("User navigate to the Message Page");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			Thread.sleep(10000);
			
			// Clicking the Home Page Icon
			driver.findElement(By.xpath("//input[@class='m-header-logo img-responsive hidden-xs']")).click();
			
			//driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 17, 1))).click();
			
			System.out.println("TC_EPC_011:Passed-Home page is displayed");
			
  }
}
