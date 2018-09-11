package EPCTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_007_NavigatingToMyAccounts extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void NavigatingToMyAccounts() throws InterruptedException 
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
			
			Thread.sleep(7000);
			
			//Finding the placed orders icon
			driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 12, 1))).click();
			
			Thread.sleep(6000);
			
			//Navigating to my accounts page
			driver.findElement(By.linkText(genericHandlingExcel.getdata(Filepath, Sheetname2, 13,1))).click();
			
			System.out.println("TC_EPC_007:Passed-My Accounts link has been clicked");
	  
  }
}
