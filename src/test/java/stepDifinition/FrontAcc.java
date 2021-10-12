package stepDifinition;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrontAcc {

	WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\LTI\\CucumberProject\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.frontaccounting.eu/");
		driver.manage().window().maximize();

	}

	@When("user enters user name as {string} & password as {string} and click on Login Button")
	public void user_enters_user_name_as_password_as_and_click_on_login_button(String un, String pwd) {
		driver.findElement(By.name("user_name_entry_field")).clear();
		driver.findElement(By.name("user_name_entry_field")).sendKeys(un);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("SubmitUser")).click();
	}

	@Then("login {string} be happen")
	public void login_be_happen(String status) {
		if (status.equals("should")) {
			if (driver.getTitle().equals("Main Menu")) {
				System.out.println("Positive test pass");

			} else {
				System.out.println("positive test failed");
				Assert.fail("positive test failed");
			}
		} else {
			if (driver.getTitle().equals("Main Menu")) {
				System.out.println("Negative test fail");
				Assert.fail("Negative test failed");

			} else {
				System.out.println("Negative test passed");

			}
		}

		driver.quit();

	}

}
