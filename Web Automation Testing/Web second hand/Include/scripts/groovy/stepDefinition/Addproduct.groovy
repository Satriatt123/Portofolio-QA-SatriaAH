package stepDefinition
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



class Addproduct {
	@Given("User open the secondhand website")
	public void user_open_the_secondhand_website() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://secondhand.binaracademy.org/');
	}

	@When("user click cta Masuk on navbar")
	public void user_click_cta_Masuk_on_navbar() {
		WebUI.click(findTestObject('Object Repository/Feature Login/ctaMasukNavbar'))
	}

	@When("user input Email {string}")
	public void user_input_Email(String email) {
		WebUI.setText(findTestObject('Object Repository/Feature Login/fieldInputEmail'), 'kel3seller@gmail.com')
	}

	@When("user input Password {string}")
	public void user_input_Password(String password) {
		WebUI.setText(findTestObject('Object Repository/Feature Login/fieldInputPassword'), '123456')
	}

	@When("user click cta Masuk")
	public void user_click_cta_Masuk() {
		WebUI.click(findTestObject('Object Repository/Feature Login/ctaMasuk'))
	}

	@Then("user will redirect to website with login account, success to login website")
	public void user_will_redirect_to_website_with_login_account_success_to_login_website() {
		WebUI.verifyElementPresent(findTestObject('Homepage-Add Product/Homepage'), 5)
	}

	@When("user click cta jual")
	public void user_click_cta_jual() {
		WebUI.click(findTestObject('Homepage-Add Product/Cta_Jual'))
	}

	@When("user input Nama produk")
	public void user_input_Nama_produk() {
		WebUI.setText(findTestObject('Homepage-Add Product/Nama_Field'), 'namaku bento')
	}

	@When("user input harga produk")
	public void user_input_harga_produk() {
		WebUI.setText(findTestObject('Homepage-Add Product/Price_Field'), '111111')
	}

	@When("user choose kategori produk")
	public void user_choose_kategori_produk() {
		WebUI.selectOptionByValue(findTestObject('Homepage-Add Product/Choosecategory_button'), '1', false)
	}

	@When("user input deskripsi produk")
	public void user_input_deskripsi_produk() {
		WebUI.setText(findTestObject('Homepage-Add Product/Description_Field'), 'ini bento')
	}

	@When("user upload image product")
	public void user_upload_image_product() {
		WebUI.uploadFile(findTestObject('Homepage-Add Product/Imageupload_button'), 'C:\\Users\\Our\\Pictures\\TinyTake01-03-2022-07-10-24.png')
	}

	@When("user click cta Terbitkan")
	public void user_click_cta_Terbitkan() {
		WebUI.click(findTestObject('Homepage-Add Product/Ctaterbitkan'))
	}

	@Then("user will Redirect to product detail page, seller will get notification after published new product")
	public void user_will_Redirect_to_product_detail_page_seller_will_get_notification_after_published_new_product() {
		WebUI.verifyElementPresent(findTestObject('Homepage-Add Product/Productdetailpage'),
				5)
	}

	@When("user click cta Preview")
	public void user_click_cta_Preview() {
		WebUI.click(findTestObject('Homepage-Add Product/Ctapreview'))
	}

	@Then("user will redirect to product detail page and cta Terbitkan will show")
	public void user_will_redirect_to_product_detail_page_and_cta_Terbitkan_will_show() {
		WebUI.verifyElementPresent(findTestObject('Homepage-Add Product/previewproductpage'), 5)
	}

	@When("user not input Nama produk")
	public void user_not_input_Nama_produk() {
		WebUI.setText(findTestObject('Homepage-Add Product/Nama_Field'), '')
	}

	@Then("Show an error message on column Nama produk, {string}")
	public void show_an_error_message_on_column_Nama_produk(String nama) {
		WebUI.verifyTextPresent('Name can\'t be blank', false)
	}

	@When("user not input harga produk")
	public void user_not_input_harga_produk() {
		WebUI.setText(findTestObject('Homepage-Add Product/Price_Field'), '')
	}

	@Then("Show an error message on column harga produk, {string}")
	public void show_an_error_message_on_column_harga_produk(String harga) {
		WebUI.verifyTextPresent('Price can\'t be blank', false)
	}

	@When("user not choose kategori produk")
	public void user_not_choose_kategori_produk() {
		WebUI.selectOptionByValue(findTestObject('Homepage-Add Product/Choosecategory_button'), '', false)
	}

	@Then("Show an error message on column kategori produk, {string}")
	public void show_an_error_message_on_column_kategori_produk(String kategori) {
		WebUI.verifyTextPresent('Category must exist', false)
	}

	@When("user not input deskripsi produk")
	public void user_not_input_deskripsi_produk() {
		WebUI.setText(findTestObject('Homepage-Add Product/Description_Field'), '')
	}

	@Then("Show an error message on column deskripsi produk, {string}")
	public void show_an_error_message_on_column_deskripsi_produk(String deskripsi) {
		WebUI.verifyTextPresent('Description can\'t be blank', false)
	}

	@When("user not upload image product")
	public void user_not_upload_image_product() {
	}

	@When("user click icon back")
	public void user_click_icon_back() {
		WebUI.click(findTestObject('Homepage-Add Product/Back_button'))
	}

	@Then("user will redirect to Homepage")
	public void user_will_redirect_to_Homepage() {
		WebUI.verifyElementPresent(findTestObject('Homepage-Add Product/Homepage'), 5)
	}
}