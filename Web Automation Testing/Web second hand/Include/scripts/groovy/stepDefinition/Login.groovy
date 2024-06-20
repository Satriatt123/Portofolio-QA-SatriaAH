package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User launch the secondhand website")
	public void user_launch_the_secondhand_website() {
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://secondhand.binaracademy.org/');
		WebUI.println("Bulan RamadhanBanyak diskon!")
	}

	@When("User click cta Masuk on navbar")
	public void user_click_cta_Masuk_on_navbar() {
		WebUI.click(findTestObject('Object Repository/Feature Login/ctaMasukNavbar'))
	}

	@And("User input Email {string}")
	public void user_input_Email(String email) {
		WebUI.setText(findTestObject('Object Repository/Feature Login/fieldInputEmail'), email)
	}

	@And("User input Password {string}")
	public void user_input_Password(String password) {
		WebUI.setText(findTestObject('Object Repository/Feature Login/fieldInputPassword'), password)
	}

	@And("User click cta Masuk")
	public void user_click_cta_Masuk() {
		WebUI.click(findTestObject('Object Repository/Feature Login/ctaMasuk'))
	}

	@Then("Redirect to website with login account, success to login website")
	public void Redirect_to_website_with_login_account_success_to_login_website() {
		WebUI.println("Bulan RamadhanBanyak diskon!")
	}

	@Then("Show error message 'Invalid Email or password.', failed to login website")
	public void show_error_message_invalid_email_or_password_failed_to_login_website() {
		WebUI.getText("Invalid Email or password.")
	}

	@Then("User not redirect to homepage")
	public void user_not_redirect_to_homepage() {}
}