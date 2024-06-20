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

class EditProfile {

	//cta Edit Profile
	@And("User click icon edit Profile")
	public void user_click_icon_edit_Profile() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/iconEditProfile'), 2)
	}

	//cta Simpan
	@And("User click cta Simpan")
	public void user_click_cta_Simpan() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/ctaSimpan'), 2)
	}

	//cta Simpan Password
	@And("User click cta Simpan Password")
	public void user_click_cta_Simpan_Password() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/ctaSimpanPassword'), 2)
	}

	//Nama
	@And("User click icon edit name")
	public void user_click_icon_edit_name() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/iconEditNama'), 2)
	}

	@And("User input blank name {string}")
	public void user_input_blank_name(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditNama'), '', 2)
	}

	@And("User input name {string}")
	public void user_input_name(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditNama'), 'Seller1', 2)
	}

	@Then("Users can edit profiles name")
	public void users_can_edit_profiles_name() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Feature EditProfile/verifyProfilBerhasilDiperbarui'), 2)
		Mobile.delay(2)
	}

	//Nomor HP
	@And("User click icon edit phone number")
	public void user_click_icon_edit_phone_number() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/iconEditNomorHP'), 2)
	}

	@And("User input blank phone number {string}")
	public void user_input_blank_phone_number(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditNomorHP'), '', 2)
	}

	@And("User input phone number {string}")
	public void user_input_phone_number(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditNomorHP'), '081234567890', 2)
	}

	@Then("Users can edit profiles phone number")
	public void users_can_edit_profiles_phone_number() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Feature EditProfile/verifyProfilBerhasilDiperbarui'), 2)
		Mobile.delay(2)
	}


	//Kota
	@And("User click icon edit city")
	public void user_click_icon_edit_city() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/iconEditKota'), 2)
	}

	@And("User input blank city {string}")
	public void user_input_blank_city(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditKota'), '', 2)
	}

	@And("User input city {string}")
	public void user_input_city(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditKota'), 'Bandung', 2)
	}

	@Then("Users can edit profiles city")
	public void users_can_edit_profiles_city() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Feature EditProfile/verifyProfilBerhasilDiperbarui'), 2)
		Mobile.delay(2)
	}

	//Alamat
	@And("User click icon edit address")
	public void user_click_icon_edit_address() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/iconEditAlamat'), 2)
	}

	@And("User input blank address {string}")
	public void user_input_blank_address(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditAlamat'), '', 2)
	}

	@And("User input address {string}")
	public void user_input_address(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditAlamat'), 'Jalan duren baru', 2)
	}

	@Then("Users can edit profiles address")
	public void users_can_edit_profiles_address() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Feature EditProfile/verifyProfilBerhasilDiperbarui'), 2)
		Mobile.delay(2)
	}

	//Email
	@And("User click icon edit email")
	public void user_click_icon_edit_email() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/iconEditEmail'), 2)
	}

	@And("User input blank email {string}")
	public void user_input_blank_email(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditEmail'), '', 2)
	}

	@And("User input new Email {string}")
	public void user_input_new_Email(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditEmail'), 'kel3seller1@gmail.com', 2)
	}

	@Then("Users can edit profiles Email")
	public void users_can_edit_profiles_Email() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Feature EditProfile/verifyProfilBerhasilDiperbarui'), 2)
		Mobile.delay(2)
	}

	//Password
	@And("User click icon edit password")
	public void user_click_icon_edit_password() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/iconEditKataSandi'), 2)
	}

	@And("User input Kata Sandi Lama {string}")
	public void user_input_Kata_Sandi_Lama(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditKataSandiLama'), '123456', 2)
	}

	@And("User click icon eye to show Kata Sandi Lama")
	public void user_click_icon_eye_to_show_Kata_Sandi_Lama() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/ctaViewKataSandiLama'), 2)
	}

	@And("User input Kata Sandi Baru {string}")
	public void user_input_Kata_Sandi_Baru(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditKataSandiBaru'), '123456', 2)
	}

	@And("User click icon eye to show Kata Baru")
	public void user_click_icon_eye_to_show_Kata_Baru() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/ctaViewKataSandiBaru'), 2)
	}

	@And("User input Konfirmasi Kata Sandi {string}")
	public void user_input_Konfirmasi_Kata_Sandi(String string) {
		Mobile.setText(findTestObject('Object Repository/Feature EditProfile/fieldEditKonfirmasiKataSandi'), '123456', 2)
	}

	@And("User click icon eye to show Konfirmasi Kata Sandi")
	public void user_click_icon_eye_to_show_Konfirmasi_Kata_Sandi() {
		Mobile.tap(findTestObject('Object Repository/Feature EditProfile/ctaViewKonfirmasiKataSandi'), 2)
	}

	@Then("Users can edit profiles Password")
	public void users_can_edit_profiles_Password() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Feature EditProfile/verifyKataSandiBerhasilDiperbarui'), 2)
		Mobile.delay(2)
	}
}