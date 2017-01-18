
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; //*** FF driver is now needed with Selenium 3.0
import org.testng.Assert; //add external path, add eclipse pluging

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class musiciansManager {
	WebDriver dr;

	@Given("^mmnavigate to Musicians Manager$")

	public void mmGiven() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Temp\\SeleniumWebDriver\\Selenium-java-3.0.1\\geckodriver.exe");

		dr = new FirefoxDriver();

		System.out.println("in mmGiven");

		dr.get("http://technologynursery.org:81");

		String expectedTitleText = "Musicians Manager";

		String actualText = dr.findElement(By.xpath("html/body/nav/div/div[1]/a")).getText();

		Assert.assertEquals(expectedTitleText, actualText);
		System.out.println("App  is running");
	}

	@When("^mmuser logs in$")

	public void mmWhen() {

		System.out.println("in mmWhen");

		dr.findElement(By.xpath("html/body/main/div/div/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("pscheid");

		dr.findElement(By.xpath("html/body/main/div/div/div/div/div/div[2]/form/div[2]/div/input"))
				.sendKeys("Passw0rd");

		dr.findElement(By.xpath("html/body/main/div/div/div/div/div/div[2]/form/div[4]/div/button")).click();

		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Then("^mmhome page should be displayed$")

	public void mmThen() {

		System.out.println("In mmThen");

		String expectedText = "Welcome to the Musicians' Manager Website";

		String actualText = dr.findElement(By.xpath("html/body/main/div/div/h4/b")).getText();

		Assert.assertEquals(expectedText, actualText);

	}

}
