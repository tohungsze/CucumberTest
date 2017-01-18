
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; //*** FF driver is now needed with Selenium 3.0
import org.testng.Assert; //add external path, add eclipse pluging

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class gmailLoginFeature {
	WebDriver dr;

	@Given("^navigate to gmail page$")

	public void navigate() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Temp\\SeleniumWebDriver\\Selenium-java-3.0.1\\geckodriver.exe");

		dr = new FirefoxDriver();

		dr.get("http://www.gmail.com");

	}

	@When("^user logged in using username as \"(.*)\" and password as \"(.*)\"$")

	public void login(String username, String password) {

		dr.findElement(By.xpath("//*[@id='Email']")).sendKeys(username);

		dr.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(password);

		dr.findElement(By.xpath("//*[@id='signIn']")).click();

		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Then("^home page should be displayed$")

	public void verifySuccessful() {

		System.out.println("In verifysuccessful");

		String expectedText = "Gmail";

		String actualText = dr.findElement(By.xpath("//*[@id='gbq1']/div/a/span")).getText();

		Assert.assertEquals("Login not successful", expectedText.equals(actualText));

	}

}
