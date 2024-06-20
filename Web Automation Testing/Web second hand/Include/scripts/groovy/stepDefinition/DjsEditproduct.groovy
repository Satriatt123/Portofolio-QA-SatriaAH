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
	@Then("user click the dotted line icon at the top right")
	public void user_click_the_dotted_line_icon_at_the_top_right() {
		WebUI.click(findTestObject('Daftar Jual Saya-Add Product/Daftarjualsaya_button'))
	}

	@Then("user click card produk")
	public void user_click_card_produk() {
		WebUI.click(findTestObject('Daftar Jual Saya-Edit and Delete Product/Cardproduct'))
	}

	@When("user click Edit")
	public void user_click_Edit() {
		WebUI.click(findTestObject('Daftar Jual Saya-Edit and Delete Product/Ctaedit'))
		WebUI.delay(5)
	}

	@When("user change Nama produk")
	public void user_change_Nama_produk() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Homepage-Add Product/Nama_field'), 'bento baru ini')
	}

	@When("user click Terbitkan")
	public void user_click_Terbitkan() {
		WebUI.click(findTestObject('Homepage-Add Product/Ctaterbitkan'))
	}

	@Then("user will Redirect to product detail page with new Nama produk, edit product success")
	public void user_will_Redirect_to_product_detail_page_with_new_Nama_produk_edit_product_success() {
	}

	@When("user change harga produk")
	public void user_change_harga_produk() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Homepage-Add Product/Price_Field'), '77777')
	}

	@Then("user will Redirect to product detail page with new harga produk, edit product success")
	public void user_will_Redirect_to_product_detail_page_with_new_harga_produk_edit_product_success() {
	}

	@When("user change kategori produk")
	public void user_change_kategori_produk() {
		WebUI.delay(3)
		WebUI.selectOptionByValue(findTestObject('Homepage-Add Product/Choosecategory_button'), '3', false)
	}

	@Then("user will Redirect to product detail page with new kategori produk, edit product success")
	public void user_will_Redirect_to_product_detail_page_with_new_kategori_produk_edit_product_success() {
	}

	@When("user change deskripsi produk")
	public void user_change_deskripsi_produk() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Homepage-Add Product/Description_Field'), 'ganti bento baru')
	}

	@Then("user will Redirect to product detail page with new deskripsi produk, edit product success")
	public void user_will_Redirect_to_product_detail_page_with_new_deskripsi_produk_edit_product_success() {
	}

	@When("user change produk image")
	public void user_change_produk_image() {
		WebUI.click(findTestObject('Daftar Jual Saya-Edit and Delete Product/deleteimage_button'))
		WebUI.delay(3)
		WebUI.uploadFile(findTestObject('Homepage-Add Product/Imageupload_button'), 'C:\\Users\\Our\\Pictures\\TinyTake01-03-2022-08-30-24.png')
	}

	@Then("user will Redirect to product detail page with new image product, edit product success")
	public void user_will_Redirect_to_product_detail_page_with_new_image_product_edit_product_success() {
	}

	@When("user add image produk more than one")
	public void user_add_produk_more_than_one() {
		WebUI.uploadFile(findTestObject('Homepage-Add Product/Imageupload_button'), 'C:\\Users\\Our\\Pictures\\TinyTake01-03-2022-08-30-24.png')
	}

	@When("user edit any data at edit produk")
	public void user_edit_any_data_at_edit_produk() {
		WebUI.selectOptionByValue(findTestObject('Homepage-Add Product/Choosecategory_button'), '4', false)
	}

	@Then("user will Redirect to Product Page")
	public void user_will_Redirect_to_Product_Page() {
	}
}