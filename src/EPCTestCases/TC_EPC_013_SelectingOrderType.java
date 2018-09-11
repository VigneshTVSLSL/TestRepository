package EPCTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_013_SelectingOrderType extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void SelectingOrderType() throws InterruptedException 
  
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
			
			//finding the Order Type & Clicking it.
			
			driver.findElement(By.id(genericHandlingExcel.getdata(Filepath, Sheetname2, 20, 1))).click();
			
			System.out.println("Order type has been Selected");
			
			Thread.sleep(5000);
			
			//Selecting the order type from the drop Down.
			driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 24, 1))).click();
			
			System.out.println("TC_EPC_013: Passed-Order type-'Service Centre Sales' has been selected");
			
			Thread.sleep(5000);
  }
  
}
