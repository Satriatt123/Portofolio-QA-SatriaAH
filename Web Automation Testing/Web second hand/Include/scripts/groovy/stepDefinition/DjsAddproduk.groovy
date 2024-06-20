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



class DjsAddproduk {
	@Given("User go to the secondhand website")
	public void user_go_to_the_secondhand_website() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow();
		WebUI.navigateToUrl('https://secondhand.binaracademy.org/');
	}

	@Then("user clicks the dotted line icon at the top right")
	public void user_clicks_the_dotted_line_icon_at_the_top_right() {
		WebUI.click(findTestObject('Daftar Jual Saya-Add Product/Daftarjualsaya_button'))
	}

	@When("user click cta Tambah Produk")
	public void user_click_cta_Tambah_Produk() {
		WebUI.click(findTestObject('Daftar Jual Saya-Add Product/Tambahproduk_button'))
	}

	@When("User click cta Terbitkan")
	public void user_click_cta_Terbitkan() {
		WebUI.click(findTestObject('Homepage-Add Product/Ctaterbitkan'))
	}

	@When("User click cta Preview")
	public void user_click_cta_Preview() {
		WebUI.click(findTestObject('Homepage-Add Product/Ctapreview'))
	}

	@Then("user will Redirect to product detail page and cta Terbitkan will show")
	public void user_will_Redirect_to_product_detail_page_and_cta_Terbitkan_will_show() {
		WebUI.verifyElementPresent(findTestObject('Homepage-Add Product/previewproductpage'), 5)
	}

	@When("user not upload image produk")
	public void user_not_upload_image_produk() {
	}

	@Then("user will Redirect to product detail page")
	public void user_will_Redirect_to_product_detail_page() {
		WebUI.verifyElementPresent(findTestObject('Homepage-Add Product/Productdetailpage'),
				5)
	}
}