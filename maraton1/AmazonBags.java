package maraton1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBags {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys", Keys.ARROW_DOWN,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   
		String results = driver.findElement(By.xpath("//div[@class='sg-col-inner']//span")).getText();
		System.out.println("The total number of results is "+results);
		driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-checkbox')])[3]")).click(); 
		driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-checkbox')])[2]")).click(); 
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(1000);
		String bagName = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']")).getText();
		String bagPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("The first product name is "+bagName+" with the Price of "+bagPrice);
		String pageTitle = driver.getTitle(); 
		System.out.println(pageTitle);
		driver.close();
	}

}


