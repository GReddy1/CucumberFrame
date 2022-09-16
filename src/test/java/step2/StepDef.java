package step2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

WebDriver driver;
	
	@Given("Open the chrome")
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
	
		@And("Enter username as {string}")
	public void username(String user) {

		driver.findElement(By.id("username")).sendKeys(user);
	}
	
	@And("Enter password as {string}")
	public void password(String pass) {
driver.findElement(By.id("password")).sendKeys(pass);
		
		
	}
	
	@When("Click on the submit button")
	public void sumbit() {

		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then("Home page should display")
	public void verifyHome() {

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		if (displayed) {
			System.out.println("Home page is display");
		}else {
			System.out.println("Home page is not display");
		}
	}
	
	@But("Error Massage should display")
	public void errorMassage() {
System.out.println("get Error Massage");
	}
	
	
	
	
	
	
}
