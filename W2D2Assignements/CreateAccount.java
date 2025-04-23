package week2.Day2.W2D2Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		// step no 2: maximize
		driver.manage().window().maximize();
		
		// step no 3: load the URL
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		
		// step no 4: to locate the web element
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//sendKeys->simulate typing into the element
		
		// step no 5: enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		// step no 6 : click the login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// step no 7: click the CRM/SFA in the login page and leads option after login 
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Demotest");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement elementOne = driver.findElement(By.name("industryEnumId"));
		Select optionOne = new Select(elementOne);
		optionOne.selectByIndex(4);
		WebElement elementTwo = driver.findElement(By.name("ownershipEnumId"));
		Select optionTwo = new Select(elementTwo);
		optionTwo.selectByVisibleText("S-Corporation");
		WebElement elementThree = driver.findElement(By.id("dataSourceId"));
		Select optionThree = new Select(elementThree);
		optionThree.selectByValue("LEAD_EMPLOYEE"); 	
		WebElement elementFour = driver.findElement(By.name("marketingCampaignId"));
		Select optionFour = new Select(elementFour);
		optionFour.selectByIndex(6);
		WebElement elementFive = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select optionFive = new Select(elementFive);
		optionFive.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		String pageTitle = driver.getTitle(); 
		System.out.println(pageTitle);
		driver.close();


	}

}

