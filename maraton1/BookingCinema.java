package maraton1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingCinema {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='PVR AEROHUB Chennai']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		driver.findElement(By.xpath("//span[text()=\"Tomorrow\"]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Select Movie']")).click();
		driver.findElement(By.xpath("(//span[text()='SACHEIN (RE RELEASE)'])[2]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Select Timing']")).click();
		driver.findElement(By.xpath("(//span[text()='06:45 PM'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Book'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='13']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(3000);
		String seatNumber = driver.findElement(By.xpath("(//div[@class=\"seat-number\"]/p)")).getText();
		String grandTotal = driver.findElement(By.xpath("(//div[@class='grand-tota col-md-3']//span)")).getText();
		Thread.sleep(3000);
		System.out.println("The seat number is "+seatNumber);
		System.out.println("The Grand Total is "+grandTotal);
		String pageTitle = driver.getTitle(); 
		System.out.println(pageTitle);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]//i")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
}


/*
 * 1) Launch the Browser
2) Load the Url "https://www.pvrcinemas.com/"
3) Choose Your location as "Chennai" (sometimes it will be located automatically)
4) Click on Cinema under Quick Book
5) Select Your Cinema
6) Select Your Date as Tomorrow
7) Select Your Movie
8) Select Your Show Time
9) Click on Book Button
10) Click Accept on Term and Condition
11) Click any one available seat
12) Click Proceed Button
13) Print the Seat info under book summary
14) Print the grand total under book summary
15) Click Proceed Button
16) Close the popup
17) Print Your Current Page title
18) Close Browser
 */
