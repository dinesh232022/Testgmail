package asevc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
	 
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/0/#inboxx");
		
		
		driver.findElementByXPath("//div[@class='T-I T-I-KE L3']").click();
		
		driver.findElementByXPath("//textarea[@id=':8c']").sendKeys("dineshkumarsa2@gmail.com");
		
		driver.findElementByXPath("//input[@id=':8u']").sendKeys("Incubyte");
		
		driver.findElementByXPath("//div[@id=':7o']").sendKeys("Automation QA test for Incubyte");
		
		driver.findElementByXPath("//div[@id=':94']").click();
	}
	
}
