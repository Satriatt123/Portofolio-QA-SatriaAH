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



class ListProductCard {

	//Scrool to Position Category
	@And("User scroll to the category section")
	public void user_scroll_to_the_category_section() {
		WebUI.scrollToPosition(0, 100)
	}

	//Scrool to Product Card
	@And("User scroll the website down to the product card")
	public void user_scroll_the_website_down_to_the_product_card() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature List Product Card/scroolToProductCard'), 5)
	}

	//Category Semua

	@And("User scroll the website down to the cta Semua")
	public void user_scroll_the_website_down_to_the_cta_Semua() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature Homepage-category/ctaSemua'), 5)
	}

	@And("User clicks on the first product card in the category Semua")
	public void user_clicks_on_the_first_product_card_in_the_category_Semua() {
		WebUI.click(findTestObject('Object Repository/Feature List Product Card/ctaProductCardSemua'))
	}

	@Then("Users can view product details in the category Semua")
	public void users_can_view_product_details_in_the_category_Semua() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature List Product Card/verifyProductCardSemua'), FailureHandling.STOP_ON_FAILURE)
	}


	//Category Hobi

	@And("User scroll the website down to the cta Hobi")
	public void user_scroll_the_website_down_to_the_cta_Hobi() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature Homepage-category/ctaHobi'), 5)
	}

	@And("User clicks on the first product card in the category Hobi")
	public void user_clicks_on_the_first_product_card_in_the_category_Hobi() {
		WebUI.click(findTestObject('Object Repository/Feature List Product Card/ctaProductCardHobi'))
	}

	@Then("Users can view product details in the category Hobi")
	public void users_can_view_product_details_in_the_category_Hobi() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature List Product Card/verifyProductCardHobi'), FailureHandling.STOP_ON_FAILURE)
	}


	//Category Kendaraan

	@And("User scroll the website down to the cta Kendaraan")
	public void user_scroll_the_website_down_to_the_cta_Kendaraan() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature Homepage-category/ctaKendaraan'), 5)
	}

	@And("User clicks on the first product card in the category Kendaraan")
	public void user_clicks_on_the_first_product_card_in_the_category_Kendaraan() {
		WebUI.click(findTestObject('Object Repository/Feature List Product Card/ctaProductCardKendaraan'))
	}

	@Then("Users can view product details in category Kendaraan")
	public void users_can_view_product_details_in_category_Kendaraan() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature List Product Card/verifyProductCardKendaraan'), FailureHandling.STOP_ON_FAILURE)
	}


	//Category Baju

	@And("User scroll the website down to the cta Baju")
	public void user_scroll_the_website_down_to_the_cta_Baju() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature Homepage-category/ctaBaju'), 5)
	}

	@And("User clicks on the first product card in the category Baju")
	public void user_clicks_on_the_first_product_card_in_the_category_Baju() {
		WebUI.click(findTestObject('Object Repository/Feature List Product Card/ctaProductCardBaju'))
	}

	@Then("Users can see product details in the category Baju")
	public void users_can_see_product_details_in_the_category_Baju() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature List Product Card/verifyProductCardBaju'), FailureHandling.STOP_ON_FAILURE)
	}


	//Category Elektronik

	@And("User scroll the website down to the cta Elektronik")
	public void user_scroll_the_website_down_to_the_cta_Elektronik() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature Homepage-category/ctaElektronik'), 5)
	}

	@And("User clicks on the first product card in the category Elektronik")
	public void user_clicks_on_the_first_product_card_in_the_category_Elektronik() {
		WebUI.click(findTestObject('Object Repository/Feature List Product Card/ctaProductCardElektronik'))
	}

	@Then("Users can view product details in the category Elektronik")
	public void users_can_view_product_details_in_the_category_Elektronik() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature List Product Card/verifyProductCardElektronik'), FailureHandling.STOP_ON_FAILURE)
	}


	//Category Kesehatan

	@And("User scroll the website down to the cta Kesehatan")
	public void user_scroll_the_website_down_to_the_cta_Kesehatan() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature Homepage-category/ctaKesehatan'), 5)
	}

	@And("User clicks on the first product card in the category Kesehatan")
	public void user_clicks_on_the_first_product_card_in_the_category_Kesehatan() {
		WebUI.click(findTestObject('Object Repository/Feature List Product Card/ctaProductCardKesehatan'))
	}

	@Then("Users can view product details in the category Kesehatan")
	public void users_can_view_product_details_in_the_category_Kesehatan() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature List Product Card/verifyProductCardKesehatan'), FailureHandling.STOP_ON_FAILURE)
	}
}