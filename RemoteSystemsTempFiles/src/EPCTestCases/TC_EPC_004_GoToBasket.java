package EPCTestCases;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_004_GoToBasket extends SuperTestNGBeforeAndAfterMethod

{
	
  @Test
  public void GoToBasket() throws InterruptedException 
  
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
			
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Thread.sleep(10000);
			
			//Actions act = new Actions(driver);
			//act.moveToElement(driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 11, 1))).click();
			
		// Clicking the basket icon
			driver.findElement(By.id(genericHandlingExcel.getdata(Filepath, Sheetname2, 10, 1))).click();
			
			
			Thread.sleep(10000);
			
			// Clicking the "Go to Basket" link
			driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 11, 1))).click();
			
			System.out.println("TC_EPC_004:Passed-User is able to navigate to Go to Basket page");
		
	  
			
			
	  
  }
}
