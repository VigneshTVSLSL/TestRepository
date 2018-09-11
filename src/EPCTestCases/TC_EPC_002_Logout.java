package EPCTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_002_Logout extends SuperTestNGBeforeAndAfterMethod

{
  @Test
  public void loginlogout() throws InterruptedException  
  {
	  String filepath = ".\\TestData\\EPC Test Data.xlsx";
	  String sheetname1 = "Credentials";
	  String sheetname2 = "Webelements";
	  
//finding username field and entering username value
	  
	  driver.findElement(By.id(genericHandlingExcel.getdata(filepath, sheetname2, 1, 1))).clear();
	  driver.findElement(By.id(genericHandlingExcel.getdata(filepath, sheetname2, 1, 1))).sendKeys(genericHandlingExcel.getdata(filepath, sheetname1, 1,1));
	  
	//finding Password field and entering Password value
	  driver.findElement(By.id(genericHandlingExcel.getdata(filepath, sheetname2, 2,1))).clear();
		driver.findElement(By.id(genericHandlingExcel.getdata(filepath, sheetname2, 2,1))).sendKeys(genericHandlingExcel.getdata(filepath, sheetname1, 1, 2));
	  
	  // Finding & Clicking login Submit Button
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(filepath, sheetname2, 3, 1))).click();
	  System.out.println("Login Button Clicked");
	  
	  Thread.sleep(5000);
	  
	  // Finding & Clicking user Profile icon
	  driver.findElement(By.id(genericHandlingExcel.getdata(filepath, sheetname2, 6, 1))).click();
	  
	  //Finding & Clicking Logout Icon
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(filepath, sheetname2, 7, 1))).click();
	  
	  System.out.println("TC_EPC_002:Passed-User is able to logout from the application successfully");
	  
	  
  }
}
