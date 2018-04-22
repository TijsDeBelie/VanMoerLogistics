package be.odisee.brainstorm;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {

	WebDriver driver;

	@Given("^I am on the page where I can introduce a new customer$")
	public void i_am_on_the_page_where_I_can_introduce_a_new_customer() throws Throwable {
		// voor het gemak zetten we de geckodriver in de root van het project - indien path de backspaces escapen
		// geckodriver voor Linux, geckodriver.exe voor Windows 64bit
		// System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:8080/nieuwePersoon.html");
	}

	@When("^I enter \"([^\"]*)\" in the ([^\"]*) field$")
	public void i_enter_in_the_firstname_field(String enteredText, String fieldName) throws Throwable {

		driver.findElement(By.id(fieldName)).sendKeys(enteredText);
	}

	@When("^I press on the Save button$")
	public void i_press_on_the_Submit_button() throws Throwable {
		driver.findElement(By.name("submit")).click();
	}

	class LabelData {
		String label;
		String data;
	}

	@Then("^I should see the following on the screen$")
	public void i_should_see_the_following_on_the_screen(List<LabelData> checklist) throws Throwable {
		// wacht tot de juiste pagina geladen is
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.textToBePresentInElementLocated(By.tagName("body"), "Details van persoon"));

		String bodyText = driver.findElement(By.tagName("body")).getText();
		for (LabelData ld: checklist){
			String text2bFound = ld.label + " " + ld.data;
			Assert.assertTrue("Did not find this text: "+text2bFound+"\n",bodyText.contains(text2bFound));
		}

	}

	@When("^I click the Lijst van alle klanten Link$")
	public void i_click_the_Home_Link() throws Throwable {
		driver.findElement(By.linkText("Lijst van alle personen")).click();
	}

	@Then("^I should see a list containing \"([^\"]*)\"$")
	public void i_should_see_a_list_containing(String text2bFound) throws Throwable {
		// wacht tot de juiste pagina geladen is
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.textToBePresentInElementLocated(By.tagName("body"), "Lijst van personen"));
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Did not find this text: "+text2bFound+"\n",bodyText.contains(text2bFound));
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		driver.quit();
	}
}