package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterHere 
{
	
static int i =0;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://epc2017-itg-beta.msys.parts/");
		driver.findElement(By.linkText("Register Here")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("vignesh1345345@tvslsl.com");
		//driver.findElement(By.id("use-email")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("username")).sendKeys("vignesh");
		driver.findElement(By.id("password")).sendKeys("Pass123#");
		driver.findElement(By.id("confirmPassword")).sendKeys("Pass123#");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@name='Forename']")).sendKeys("vignesh");
		driver.findElement(By.xpath("//input[@name='Surname']")).sendKeys("Krishnamoorthy");
		driver.findElement(By.xpath("//input[@name='Telephone']")).sendKeys("8767890987");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("company1");
		driver.findElement(By.xpath("//input[@name='Address1']")).sendKeys("Address1");
		driver.findElement(By.xpath("//input[@name='Address2']")).sendKeys("Address2");
		driver.findElement(By.xpath("//input[@name='PostalTown']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@name='County']")).sendKeys("Chorley");
		driver.findElement(By.xpath("//input[@name='Postcode']")).sendKeys("PR67AJ");
		driver.findElement(By.xpath("//input[@name='Country']")).sendKeys("UnitedKingdom");
		driver.findElement(By.id("TimeZone")).click();
		driver.findElement(By.xpath("//input[@class='m-auth-field']")).click();
		driver.findElement(By.xpath("//button[@class='btn-block btn btn-success']")).click();
		
		

	}

}
