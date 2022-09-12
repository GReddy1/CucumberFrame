package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	WebDriver driver;
	
	@Given("Open the Chrome Browser")
	public void openChrome() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}		
		
		
		@And("Load the url")
	public void geturl() {

		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
		@And("Enter the userName as DemosalesManager")
	public void username() {

		driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	}
	
	@And("Enter the password as Crmsfa")
	public void password() {
driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
	}
	
	@When("Click on the submit button")
	public void sumbit() {

		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then("HomePage should be display")
	public void verifyHome() {

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		if (displayed) {
			System.out.println("Home page is display");
		}else {
			System.out.println("Home page is not display");
		}
	}
	
	
	
}
