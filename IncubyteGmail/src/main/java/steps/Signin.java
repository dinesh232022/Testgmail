package steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin extends Baseclass {	 
	
	/*
	 * @Given("Open the Chrome Browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
	 */
	
	
	@And("Load the application Url {String }")
	public void loadUrl(String url) {
		 driver.get("url");
	}
	 
	@Given("Enter username as {string}")
	public void enterUsername(String username)   {
		
		 WebElement usernamesignin = driver.findElementByXPath("//input[@id='identifierId']");  
	          usernamesignin.sendKeys(username);
	}
	
	@When("Click next")
	public void clickpassButton() {
		 driver.findElementByXPath("//span[@jsname='V67aGc'][contains(.,'Next')]").click();
		 
	}
	@Given("Enter password as {string}")
	public void enterPassword(String password)   {
		 driver.findElementByXPath("//input[@name='password']").sendKeys(password);
		 
	}
	@When("Click Next Button1 to sigin")
	public void clickNextButton1() throws InterruptedException {
		 driver.findElementByXPath("//span[contains(.,'Next')]").click();
        
	}
	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		  System.out.println("Homepage is displayed");

	}

	@When("Click on Compose button")
   public void clickComposeButton() {
	       driver.findElementByXPath("//div[contains(@gh,'cm')]").click();

}
   @Given("Enter To send gmail name as {string}")
    public void enterUsernametoSendmail(String sendmailto) {
		    driver.findElementByXPath("//div[@id=':t0']").sendKeys(sendmailto);

	} 
	@And("Enter Subject name as {string}")
    public void enterSubjectName(String subject) {
		    driver.findElementByXPath("//input[@id=':sp']").sendKeys(subject);

	}
    @And("Enter body as {string}")
    public void enterBodyName(String body) {
    	
    	driver.findElementByXPath("//div[@id=':tv']").sendKeys(body );
		 
	}
    @When("Click on Send button")
    public void clickSendButton() {
		 driver.findElementByXPath("//div[@id=':sf']").click();

	}
    
    @Then("message Sent verification")
    
    public void Verifymsg() {
		 System.out.println("Message send successfully");

	}
    
    @But("Error message should be display")
    public void msgverif() {
    	
    	System.out.println("message not sent Error msg is displayed");
		 

	}
    
	
	
}
