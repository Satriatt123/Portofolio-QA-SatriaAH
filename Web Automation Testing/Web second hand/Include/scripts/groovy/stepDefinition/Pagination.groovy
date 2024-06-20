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



class Pagination {

	// Scrool to Pagination
	@And("User scroll the website down to the Pagination")
	public void user_scroll_the_website_down_to_the_Pagination() {

		WebUI.scrollToElement(findTestObject('Object Repository/Feature Pagination/scroolToPagination1'), 5)

		WebUI.scrollToElement(findTestObject('Object Repository/Feature Pagination/scroolToPagination2'), 5)

		WebUI.scrollToElement(findTestObject('Object Repository/Feature Pagination/scroolToPagination3'), 5)

		WebUI.scrollToElement(findTestObject('Object Repository/Feature Pagination/scroolToPagination4'), 5)
	}

	// Semua

	@And("User click cta Next Semua")
	public void user_click_cta_Next_Semua() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaNextSemua'))
	}

	@And("User click cta Previous Semua")
	public void user_click_cta_Previous_Semua() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaPreviousSemua'))
	}

	@Then("Users can go to the next page and previous page in the category Semua")
	public void users_can_go_to_the_next_page_and_previous_page_in_the_category_Semua() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SecondHand/Homepage'), FailureHandling.STOP_ON_FAILURE)
	}

	//Hobi

	@And("User click cta Next Hobi")
	public void user_click_cta_Next_Hobi() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaNextHobi'))
	}

	@And("User click cta Previous Hobi")
	public void user_click_cta_Previous_Hobi() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaPreviousHobi'))
	}

	@Then("Users can go to the next page and previous page in the category Hobi")
	public void users_can_go_to_the_next_page_and_previous_page_in_the_category_Hobi() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SecondHand/Homepage'), FailureHandling.STOP_ON_FAILURE)
	}

	//Kendaraan

	@And("User click cta Next Kendaraan")
	public void user_click_cta_Next_Kendaraan() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaNextKendaraan'))
	}

	@And("User click cta Previous Kendaraan")
	public void user_click_cta_Previous_Kendaraan() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaPreviousKendaraan'))
	}

	@Then("Users can go to the next page and previous page in the category Kendaraan")
	public void users_can_go_to_the_next_page_and_previous_page_in_the_category_Kendaraan() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SecondHand/Homepage'), FailureHandling.STOP_ON_FAILURE)
	}

	//Baju

	@And("User click cta Next Baju")
	public void user_click_cta_Next_Baju() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaNextBaju'))
	}

	@And("User click cta Previous Baju")
	public void user_click_cta_Previous_Baju() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaPreviousBaju'))
	}

	@Then("Users can go to the next page and previous page in the category Baju")
	public void users_can_go_to_the_next_page_and_previous_page_in_the_category_Baju() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SecondHand/Homepage'), FailureHandling.STOP_ON_FAILURE)
	}

	//Elektronik

	@And("User click cta Next Elektronik")
	public void user_click_cta_Next_Elektronik() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaNextElektronik'))
	}

	@And("User click cta Previous Elektronik")
	public void user_click_cta_Previous_Elektronik() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaPreviousElektronik'))
	}

	@Then("Users can go to the next page and previous page in the category Elektronik")
	public void users_can_go_to_the_next_page_and_previous_page_in_the_category_Elektronik() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SecondHand/Homepage'), FailureHandling.STOP_ON_FAILURE)
	}

	//Kesehatan

	@And("User click cta Next Kesehatan")
	public void user_click_cta_Next_Kesehatan() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaNextKesehatan'))
	}

	@And("User click cta Previous Kesehatan")
	public void user_click_cta_Previous_Kesehatan() {
		WebUI.click(findTestObject('Object Repository/Feature Pagination/ctaPreviousKesehatan'))
	}

	@Then("Users can go to the next page and previous page in the category Kesehatan")
	public void users_can_go_to_the_next_page_and_previous_page_in_the_category_Kesehatan() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_SecondHand/Homepage'), FailureHandling.STOP_ON_FAILURE)
	}
}