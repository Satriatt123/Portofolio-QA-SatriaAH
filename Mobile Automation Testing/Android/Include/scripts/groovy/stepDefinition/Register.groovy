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



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("User click cta Daftar")
	public void user_click_cta_daftar() {
		Mobile.tap(findTestObject('Feature Register/ctaDaftar'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User input email {string}")
	public void user_input_email(String email) {
		Mobile.setText(findTestObject('Feature Register/fieldInputEmail'), email, 2)
	}
	
	@And("User input password {string}")
	public void user_input_password(String password) {
		Mobile.setText(findTestObject('Feature Register/fieldInputPassword'), password, 2)
	}

	@And("User input Nama lengkap {string}")
	public void user_input_nama_lengkap(String NamaLengkap) {
		Mobile.setText(findTestObject('Feature Register/fieldInputNamaLengkap'), NamaLengkap, 2)
	}

	@And("User input nomor hp {string}")
	public void user_input_nomor_hp(String NomorHp) {
		Mobile.setText(findTestObject('Feature Register/fieldInputPhoneNumber'), NomorHp, 2)
	}
	
	@And("User input kota {string}")
	public void user_input_kota(String Kota) {
		Mobile.setText(findTestObject('Feature Register/fieldInputKota'), Kota, 2)
	}
	
	@And("User input alamat {string}")
	public void user_input_alamat(String Alamat) {
		Mobile.setText(findTestObject('Feature Register/fieldInputAlamat'), Alamat, 2)
	}
	
	@And("User click cta Register")
	public void user_click_cta_register() {
		Mobile.tap(findTestObject('Feature Register/ctaRegister'), 2)
	}
	
	@Then("Redirect to profile page, registration new account success")
	public void Redirect_to_profile_page_register_success() {
	}
	
	@Then("Show an error message on coloumn nama 'Nama tidak boleh kosong'")
	public void show_error_message_nama_kosong() {
		Mobile.waitForElementPresent(findTestObject('Feature Register/errNamaLengkapKosong'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Show an error message on coloumn nomor hp 'Nomor telepon tidak boleh kosong'")
	public void show_error_message_nomor_telepon_kosong() {
		Mobile.waitForElementPresent(findTestObject('Feature Register/errNoTelpKosong'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Show an error message on coloumn kota 'Kota tidak boleh kosong'")
	public void show_error_message_kota_kosong() {
		Mobile.waitForElementPresent(findTestObject('Feature Register/errKotaKosong'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Show an error message on coloumn alamat 'Alamat tidak boleh kosong'")
	public void show_error_message_alamat_kosong() {
		Mobile.waitForElementPresent(findTestObject('Feature Register/errAlamatKosong'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Show an error message on coloumn email 'Email tidak boleh kosong'")
	public void show_error_message_email_kosong() {
		Mobile.waitForElementPresent(findTestObject('Feature Register/errEmailKosong'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Show an error message on coloumn email 'Email tidak valid'")
	public void show_error_message_email_not_valid() {
		Mobile.waitForElementPresent(findTestObject('Feature Register/errEmailNotValid'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Show an error message on coloumn password 'Password tidak boleh kosong'")
	public void show_error_message_password_kosong() {
		Mobile.waitForElementPresent(findTestObject('Feature Register/errPasswordKosong'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Show an error message on coloumn password 'Password harus lebih dari 6 karakter'")
	public void show_error_message_password_char() {
		Mobile.waitForElementPresent(findTestObject('Feature Register/errCharPassword'), 2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("User click icon view password")
	public void user_click_icon_view_password (){
		Mobile.tap(findTestObject('Feature Register/iconViewPassword'), 2)
	}
	
	@And("User click icon back on header tab")
	public void user_click_icon_back_on_header_tab() {
	}
}