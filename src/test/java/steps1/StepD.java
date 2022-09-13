package steps1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepD {

	WebDriver driver;
	
	@Given("Open the Chrome Browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Given("Load the url")
	public void load_the_url() {
	
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}
	@Given("Enter the userName as {string}")
	public void enter_the_user_name_as_demosales_manager(String user) {
	
		driver.findElement(By.id("username")).sendKeys(user);	
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
		
	@When("Click on the submit button")
	public void click_on_the_submit_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then("HomePage should be display")
	public void home_page_should_be_display() {
	 
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

	
	
	
	
	
	
	
	
	
	
	

