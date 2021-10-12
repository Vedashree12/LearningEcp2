package stepDifinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Seleniumdev {
	WebDriver driver;

	@Before

	public void before() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\LTI\\CucumberProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After

	public void after() {
		driver.quit();

	}

	@Given("User is on Home Page of Selenium")
	public void user_is_on_home_page_of_selenium() {

		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

	}

	@When("User clicks on download link")
	public void user_clicks_on_download_link() {
		driver.findElement(By.linkText("Downloads")).click();
	}

	@Then("title should be\"Download | Selenium\"")
	public void title_should_be_download_selenium() {
		Assert.assertEquals("Downloads | Selenium", driver.getTitle());

	}

}
