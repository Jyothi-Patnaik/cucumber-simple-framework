package stepDefinitions;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	WebDriver driver;

	@Given("User is on the Login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demo.hyva.io/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

driver.findElement(By.xpath("//button[@id='customer-menu']//*[name()='svg']")).click();
driver.findElement(By.xpath("//a[@id='customer.header.sign.in.link']")).click();
	
	}

	@When("User enters the valid emailId and password \\(email:{string} and password:{string})")
	public void user_enters_the_valid_email_id_and_password_email_and_password(String email, String pwd) {

driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);




	}

	@When("click on Login button")
	public void click_on_login_button() {

driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
	}

	@Then("User must be redirected to My Account page")
	public void user_must_be_redirected_to_my_account_page() {

		WebElement nopMsg= driver.findElement(By.xpath("//h1[@class='title-font text-4xl sm:text-5xl mb-2 font-bold text-blue-900']"));
		nopMsg.isDisplayed();
		System.out.println(nopMsg.getText());
	}

	@Then("user should be able to view Welcome message")
	public void user_should_be_able_to_view_welcome_message() {
		WebElement welcomeMsg= driver.findElement(By.xpath("//h2[normalize-space()='This is the default Hyvä Theme.']"));
				
				welcomeMsg.isDisplayed();
		System.out.println(welcomeMsg.getText());

	}


}
