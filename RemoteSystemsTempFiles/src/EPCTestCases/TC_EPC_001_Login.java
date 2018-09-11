package EPCTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_001_Login extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void Login() 
  
  {
	  
	  String FilePath = ".\\TestData\\EPC Test Data.xlsx";
	  String Sheetname1 = "Credentials";
	  String Sheetname2 = "Webelements";
	  
	//finding username field and entering username value
	  
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 1, 1))).clear();
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 1, 1))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname1, 1,1));
	  
	//finding Password field and entering Password value
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 2,1))).clear();
		driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 2,1))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname1, 1, 2));
	  
	  //finding Login Button & clicking Submit Button.
		driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname2, 3,1))).click();
	  
		
		System.out.println("TC_EPC_001:Passed- User is able to login to the application successfully");
	  
	  
  }
}
