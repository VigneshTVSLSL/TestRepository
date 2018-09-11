package EPCTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_016_RegisterHere extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void RegisterHere() 
  {
	
	  
	  String FilePath = ".\\TestData\\EPC Test Data.xlsx";
	  String Sheetname1 = "Credentials";
	  String Sheetname2 = "Webelements";
	  String Sheetname3 = "EPC_RegisterHere";
	  
	  //Finding the Register Here link & clicking it.
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 1, 2))).click();
	  
	  //Entering the Email Address in Account credentials page
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname3, 2,2))).sendKeys(genericHandlingExcel.getdata(FilePath,Sheetname3, 3, 3));
	  
	  //Entering the password in Account credentials page
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname3, 4, 2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 5,3));
	  
	  //Confirming the password in Account credentials page
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname3, 6, 2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 7, 3));
	  
	  //Clicking the register button.
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 8, 2))).click();
	  
	  
	  
	  //Entering the first name in register Profile page
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 9, 2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 10,3));
	  
	  
	  //Entering the last name in register profile page
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 11,2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 12, 3));
	  
	  
	  //Entering the Telephone number in Register profile page
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 13,2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 14, 3));
	  
	  
	//Entering the company name in Register profile page
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 15,2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 16, 3));

	  
	//Entering the Address Line 1 in Register profile page
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 17,2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 18, 3));
	
	//Entering the Address Line 2 in Register profile page
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 19,2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 20, 3));
	  
	  //Entering the Address Line 2 in Register profile page
	  driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname3, 19,2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname3, 20, 3));
	  	  
	  
	  
	  
  }
}
