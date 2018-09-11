package EPCTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://epc2017-itg.msys.parts/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username-email")).sendKeys("test0508v1");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='primaryAction btn-success btn btn-block']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='word3']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Einstein")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Vetinerary")).click();
		System.out.println("veternary clicked");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText(" CleanAural Ear Drops Dog 250ml "))).click();
		
		
		//driver.findElement(By.xpath("//div[@class='row']")).click();
		
		//driver.findElement(By.xpath("//div[@class='row']")).click();
		System.out.println("cleanaural clicked");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		*/
		
		driver.findElement(By.id("TL1050417-add")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("m-basket-toggle")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("reference")).sendKeys("order27nov003");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[starts-with(text(),'Order')]")).click();
		
		// Clicking User Profile
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("m-user-toggle")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//clicking log out button
		driver.findElement(By.xpath("//a[@class='btn btn-block btn-success btn-small']")).click();
		/*
		driver.findElement(By.id("quantity")).sendKeys("20");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='btn btn-add']")).click();
		*/
		
	}

}
