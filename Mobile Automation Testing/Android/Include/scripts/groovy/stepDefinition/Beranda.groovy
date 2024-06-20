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


/*
 * Binar Academy
 * Wave			: 14
 * Nama Perserta: Ranovan Putra Wijaya
 * ID Peserta 	: QAE230800018
 * Email		: ranovan20@gmail.com
 *
 * Nama Fasil	: Fatahillah Ardhi
 * ID Fasil		: F-QAE23001010
 * Email		: fardhi@binaracademy.org
 */

class Beranda {

	@And("User click icon eye to show Password")
	public void user_click_icon_eye_to_show_password() {
		Mobile.tap(findTestObject('Object Repository/Feature Login/ctaViewPassword'), 2)
	}

	@And("User click cta Beranda")
	public void user_click_cta_Beranda() {
		Mobile.tap(findTestObject('Object Repository/Feature Beranda/ctaBeranda'), 2)
	}

	@Then("User successfully enters the home page")
	public void user_successfully_enters_the_home_page() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Feature Beranda/verifyBeranda'), 2)
		Mobile.delay(2)
	}
}