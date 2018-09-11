package EPCTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_012_SelectingAccount extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void SelectingAccount () throws InterruptedException 
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
				
				Thread.sleep(5000);
				
				//finding the Select Account & clicking it
				driver.findElement(By.id(genericHandlingExcel.getdata(Filepath, Sheetname2, 18, 1))).click();
				
				System.out.println("Account is clicked");
				
				
				//Finding the Account & selecting it.
				
				Thread.sleep(6000);
				
				driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 19, 1))).click();
				
				System.out.println("TC_EPC_012: Passed- CARREFOUR DRANCY Account has been selected");
				
				Thread.sleep(10000);

				
				
				
	  
	  
  }
}
