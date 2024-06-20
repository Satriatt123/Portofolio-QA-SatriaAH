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
	@Given("User launch the application")
	public void user_launch_the_application() {
		Mobile.startApplication('Apk/secondhand-24082023.apk', true)
	}

	@When("User click menu Akun on tab")
	public void user_click_menu_akun_on_tab() {
		Mobile.tap(findTestObject('Feature Login/iconAkun'), 2)
	}

	@And("User click cta Masuk")
	public void user_click_cta_masuk() {
		Mobile.tap(findTestObject('Object Repository/Feature Login/ctaMasuk'), 2)
	}

	@Then("Show form sign in")
	public void show_form_sign_in() {
		Mobile.verifyElementVisible(findTestObject('Feature Login/titleMasuk'), 2)
	}

	@And("User input Email {string}")
	public void user_input_Email(String email) {
		Mobile.setText(findTestObject('Feature Login/fieldInputEmail'), email, 2)
	}

	@And("User input Password {string}")
	public void user_input_Password(String password) {
		Mobile.setText(findTestObject('Feature Login/fieldInputPassword'), password, 2)
	}

	@And("User click cta view password")
	public void user_click_cta_view_password (){
		Mobile.tap(findTestObject('Feature Login/ctaViewPassword'), 2)
	}

	@And("User click cta Login")
	public void User_click_cta_login (){
		Mobile.tap(findTestObject('Feature Login/ctaLogin'), 2)
	}

	@Then("Redirect to profile page sign in success")
	public void Redirect_to_profile_page_sign_in_success() {
	}

	@Then("Show an error message, sign in failed")
	public void show_an_error_message() {
	}

	@Then("Show an error message on coloumn Email 'Email tidak boleh kosong'")
	public void show_an_error_message_email_blank() {
		Mobile.waitForElementPresent(findTestObject('Feature Login/errEmailKosong'), 2)
	}

	@Then("Show an error message on coloumn Password 'Password tidak boleh kosong'")
	public void show_an_error_message_password_blank() {
		Mobile.waitForElementPresent(findTestObject('Feature Login/errPasswordKosong'), 2)
	}

	@Then("Show an error message on coloumn Email 'Email tidak valid'")
	public void show_an_error_message_email_not_valid() {
		Mobile.waitForElementPresent(findTestObject('Feature Login/errEmailNotValid'), 2)
	}

	@Then("Show an error message on coloumn Password 'Password harus lebih dari 6 karakter'")
	public void show_an_error_message_on_coloumn_password_minimal() {
		Mobile.waitForElementPresent(findTestObject('Feature Login/errMinimalPassword'), 2)
	}
}
