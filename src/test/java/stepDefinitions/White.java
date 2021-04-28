package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class White {

	WebDriver driver;

	@Given("Set White Background button exist")
	public void set_skyblue_background_button_exist() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Peter\\CucumberTesting\\cucumber\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		Thread.sleep(2000);
	}

	@When("I click on a button")
	public void i_click_on_button() {
		driver.findElement(By.xpath("//*[contains(text(),'Set White Background')]")).click();
	}

	@Then("the background will change to White")
	public void the_background_will_change_to_skyblue() {
		System.out.println("Background is now white");
	}
}
