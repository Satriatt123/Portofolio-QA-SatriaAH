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



class DjsEditproduct {
	@Given("user launched the second hand apps")
	public void user_launched_the_second_hand_apps() {
		Mobile.startApplication('Apk/secondhand-24082023.apk', true)
	}

	@Given("user click menu Profile on tab")
	public void user_click_menu_Profile_on_tab() {
		Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Feature Login/iconAkun'), 2)
	}

	@When("User click cta Masuk in profile page")
	public void user_click_cta_Masuk_in_profile_page() {
		Mobile.tap(findTestObject('Feature Login/ctaMasuk'), 2)
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input the Email {string}")
	public void user_input_Email(String email) {
		Mobile.setText(findTestObject('Feature Login/fieldInputEmail'), email, 2)
	}

	@When("User input the Password {string}")
	public void user_input_Password(String password) {
		Mobile.setText(findTestObject('Feature Login/fieldInputPassword'), password, 2)
	}

	@When("User click eye icon to show Password")
	public void user_click_icon_eye_to_show_Password() {
		Mobile.tap(findTestObject('Feature Login/ctaViewPassword'), 2)
	}

	@When("user click cta Masuk")
	public void user_click_cta_Masuk() {
		Mobile.tap(findTestObject('Feature Login/ctaMasuk'), 2)
	}

	@Then("user will be Redirect to profile page, sign in success")
	public void user_will_be_Redirect_to_profile_page_sign_in_success() {
	}

	@Then("User click menu Daftar Jual Saya")
	public void user_click_menu_Daftar_Jual_Saya() {
		Mobile.tap(findTestObject('Feature Edit product/Daftarjualsaya_button'), 5)
	}

	@When("User click product card")
	public void user_click_product_card() {
		Mobile.tap(findTestObject('Feature Edit product/Cardproduct'), 3)
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	}

	@When("User input new Nama produk")
	public void user_input_new_Nama_produk() {
		Mobile.waitForElementPresent(findTestObject('Feature Edit product/Namaproduct_field'), 5)
		Mobile.tap(findTestObject('Feature Edit product/Namaproduct_field'), 2)
		Mobile.clearText(findTestObject('Feature Edit product/Namaproduct_field'), 1)
		Mobile.setText(findTestObject('Feature Edit product/Namaproduct_field'), 'kelompok5', 2)
	}

	@When("User click cta Perbarui Produk")
	public void user_click_cta_Perbarui_Produk() {
		Mobile.tap(findTestObject('Feature Edit product/Perbaruiproduk_button'), 3)
	}

	@When("User input new harga produk")
	public void user_input_new_harga_produk() {
		Mobile.waitForElementPresent(findTestObject('Feature Edit product/Hargaproduct_field'), 3)
		Mobile.clearText(findTestObject('Feature Edit product/Hargaproduct_field'), 1)
		Mobile.setText(findTestObject('Feature Edit product/Hargaproduct_field'), 'asasasaas', 1)
	}

	@When("User input new lokasi produk")
	public void user_input_new_lokasi_produk() {
		Mobile.swipe(32, 1050, 32, 550)
		Mobile.waitForElementPresent(findTestObject('Feature Edit product/Lokasi_field'), 3)
		Mobile.clearText(findTestObject('Feature Edit product/Lokasi_field'), 1)
		Mobile.setText(findTestObject('Feature Edit product/Lokasi_field'), 'asasasaas', 1)
	}

	@When("User input new deksripsi produk")
	public void user_input_new_deksripsi_produk() {
		Mobile.swipe(32, 1050, 32, 550)
		Mobile.waitForElementPresent(findTestObject('Feature Edit product/Deskripsi_field'), 3)
		Mobile.clearText(findTestObject('Feature Edit product/Deskripsi_field'), 1)
		Mobile.setText(findTestObject('Feature Edit product/Deskripsi_field'), 'asasasaas', 1)
	}

	@When("User upload new foto produk")
	public void user_upload_new_foto_produk() {
		Mobile.swipe(32, 1050, 32, 550)
		Mobile.tap(findTestObject('Feature Edit product/Image_box'), 2)
		Mobile.tap(findTestObject('Feature Edit product/Galeri_button'), 2)
		Mobile.tap(findTestObject('Feature Edit product/Image'), 2)
	}

	@Then("Show popup success message Produk berhasil diperbarui")
	public void show_popup_success_message_Produk_berhasil_diperbarui() {
	}
}