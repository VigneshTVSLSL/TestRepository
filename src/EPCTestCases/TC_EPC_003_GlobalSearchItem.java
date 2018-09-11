package EPCTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_EPC_003_GlobalSearchItem extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void GlobalSearchItem() 
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
		
		
		//Finding the Global Search box, entering an item in that & searching that.
		driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 8, 1))).sendKeys(genericHandlingExcel.getdata(Filepath,Sheetname1, 2, 1));
		driver.findElement(By.xpath(genericHandlingExcel.getdata(Filepath, Sheetname2, 8,1))).click();
		
		System.out.println("TC_EPC_003:Passed-User is able to perform the global search");
		
  }
}
