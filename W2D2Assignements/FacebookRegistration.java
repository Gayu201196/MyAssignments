package week2.Day2.W2D2Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("demo");
		driver.findElement(By.name("lastname")).sendKeys("user1");
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select day = new Select(date);
		day.selectByValue("20");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select birthMonth  = new Select(month);
		birthMonth.selectByValue("10");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select birthYear = new Select(year);
		birthYear.selectByVisibleText("1996");
		driver.findElement(By.className("_58mt")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("demouser1@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("demouser123");
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1000);
		driver.close();
		
		
	}
		
}

