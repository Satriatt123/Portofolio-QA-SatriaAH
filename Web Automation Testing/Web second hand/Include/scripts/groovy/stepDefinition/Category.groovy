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



class Category {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("User scroll down website until section Telusuri Kategori")
	public void user_scroll_down_website_until_section_Telusuri_Kategori() {
		WebUI.scrollToElement(findTestObject('Object Repository/Feature Homepage-category/ctascrolltobanner'), 5)
	}

	@And("User click cta Semua")
	public void user_click_cta_semua() {
		WebUI.click(findTestObject('Object Repository/Feature Homepage-category/ctaSemua'))
	}

	@Then("Show list product by category product Semua")
	public void show_list_product_by_category_product_semua() {
	}

	@And("User click cta Hobi")
	public void user_click_cta_hobi() {
		WebUI.click(findTestObject('Object Repository/Feature Homepage-category/ctaHobi'))
	}

	@Then("Show list product by category product Hobi")
	public void show_list_product_by_category_product_hobi() {
	}

	@And("User click cta Kendaraan")
	public void user_click_cta_kendaraan() {
		WebUI.click(findTestObject('Object Repository/Feature Homepage-category/ctaKendaraan'))
	}

	@Then("Show list product by category product Kendaraan")
	public void show_list_product_by_category_product_kendaraan() {
	}

	@And("User click cta Baju")
	public void user_click_cta_baju() {
		WebUI.click(findTestObject('Object Repository/Feature Homepage-category/ctaBaju'))
	}

	@Then("Show list product by category product Baju")
	public void show_list_product_by_category_product_baju() {
	}

	@And("User click cta Elektronik")
	public void user_click_cta_elektronik() {
		WebUI.click(findTestObject('Object Repository/Feature Homepage-category/ctaElektronik'))
	}

	@Then("Show list product by category product Elektronik")
	public void show_list_product_by_category_product_elektronik() {
	}

	@And("User click cta Kesehatan")
	public void user_click_cta_kesehatan() {
		WebUI.click(findTestObject('Object Repository/Feature Homepage-category/ctaKesehatan'))
	}

	@Then("Show list product by category product Kesehatan")
	public void show_list_product_by_category_product_kesehatan() {}
}