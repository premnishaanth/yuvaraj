package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleClass {
	
	public static WebDriver driver;
	@Given("Opening the twitter login page")
	public static void opening_the_twitter_login_page() 
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/java/driver/ChromeDriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	   
	}

	@When("Entering the username and pwd")
	public void entering_the_username_and_pwd() throws InterruptedException {
		driver.get("https://twitter.com/login?lang=en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input")).sendKeys("prem");
	    driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input")).sendKeys("Nishaanth");
	    driver.findElement(By.xpath("//*[@id='page-container']/div/div[1]/form/div[2]/button")).click();
	}

	@Then("quit")
	public void quit() {
		driver.quit();
	    
	}


}
