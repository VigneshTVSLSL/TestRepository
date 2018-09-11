package EPCTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_PlaceOrder_018 extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void placeorder() 
  
  {
	  
	  String filepath = ".\\TestData\\EPC Test Data.xlsx";
	  String sheetname1 = "Credentials";
	  String sheetname2 = "Webelements";
	  
	//finding username field and entering username value
	  driver.findElement(By.id(genericHandlingExcel.getdata(filepath, sheetname2, 9, 1))).sendKeys(genericHandlingExcel.getdata(filepath, sheetname1, 1,1));
	  
	//finding Password field and entering Password value
		driver.findElement(By.id(genericHandlingExcel.getdata(filepath, sheetname2, 2,1))).sendKeys(genericHandlingExcel.getdata(filepath, sheetname1, 1, 2));
	  
	  //finding Login Button & clicking Submit Button.
		driver.findElement(By.xpath(genericHandlingExcel.getdata(filepath, sheetname2, 3,1))).click();
	  
	  
	  
  }
}
