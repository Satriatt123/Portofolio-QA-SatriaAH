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



class DetailProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("User click Icon detail product on navbar")
	public void User_click_Icon_detail_product_on_navbar() {
		WebUI.click(findTestObject('Object Repository/Feature Detail Product/IconListproduct'))
	}

	@Then("Redirect to product page")
	public void Redirect_to_product_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Detail Product/DaftarJualSayaText'))
	}

	@And("User click one product of list product daftar jual saya")
	public void User_click_one_product_of_list_product_daftar_jual_saya() {
		WebUI.click(findTestObject('Object Repository/Feature Detail Product/DetailProductLink'))
	}

	@Then("The system display product detail page")
	public void The_system_display_product_detail_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Detail Product/DetailProductText'))
	}

	@And("User scroll down website until section product list")
	public void User_scroll_down_website_until_section_product_list() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature Detail Product/ProductLink'), 30)
	}

	@And("User click product")
	public void User_click_product() {
		WebUI.click(findTestObject('Object Repository/Feature Detail Product/ProductBungakuText'))
	}

	@Then("The system display keyword product detail page")
	public void The_system_display_keyword_product_detail_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Detail Product/ProductBungakuText'))
	}
}