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



class EditProfile {

	//--------------------------------------------- Positive ---------------------------------------------

	@And("User click icon people on navbar")
	public void user_click_icon_people_on_navbar() {
		WebUI.click(findTestObject('Object Repository/Feature Edit Profile/ctaProfile'))
	}

	@And("User click avatar profile")
	public void user_click_avatar_profile() {
		WebUI.click(findTestObject('Object Repository/Feature Edit Profile/ctaEditProfile'))
	}

	@And("User click cta Simpan")
	public void user_click_cta_Simpan() {
		WebUI.click(findTestObject('Object Repository/Feature Edit Profile/ctaSimpanEditProfile'))
	}

	//Foto Profile
	@And("User upload foto profile1")
	public void user_upload_foto_profile1() {
		WebUI.uploadFile(findTestObject('Object Repository/Feature Edit Profile/ctaEditFotoProfile'), 'D:\\Binar\\Challenge Gold\\Dagon.jpg')
	}

	@And("User upload foto profile2")
	public void user_upload_foto_profile2() {
		WebUI.uploadFile(findTestObject('Object Repository/Feature Edit Profile/ctaEditFotoProfile'), 'D:\\Binar\\Challenge Gold\\ShadowFiend.png')
	}

	@Then("Users can edit profiles foto")
	public void users_can_edit_profiles_foto() {
		//		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
		WebUI.println("Users can edit foto profile and it will show the homepage")
	}

	//Nama Profile
	@And("User input blank nama {string}")
	public void user_input_blank_nama(String nama) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditNama'), nama)
	}

	@Then("User input nama {string}")
	public void user_input_nama(String nama) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditNama'), nama)
	}

	@Then("Users can edit profiles nama")
	public void users_can_edit_profiles_nama() {
		//		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
		WebUI.println("Users can edit nama profile and it will show the homepage")
	}

	//Kota Profile
	@And("User select kota pilih kota {string}")
	public void user_select_kota_pilih_kota(String string) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Feature Edit Profile/selectKota'), '', false)
	}

	@Then("User select kota {string}")
	public void user_select_kota(String string) {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Feature Edit Profile/selectKota'), '4', true)
	}

	@Then("Users can edit profiles kota")
	public void users_can_edit_profiles_kota() {
		//		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
		WebUI.println("Users can edit kota profile and it will show the homepage")
	}

	//Alamat Profile
	@And("User input blank alamat {string}")
	public void user_input_blank_alamat(String alamat) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditAlamat'), alamat)
	}

	@Then("User input alamat {string}")
	public void user_input_alamat(String alamat) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditAlamat'), alamat)
	}

	@Then("Users can edit profiles alamat")
	public void users_can_edit_profiles_alamat() {
		//		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
		WebUI.println("Users can edit alamat profile and it will show the homepage")
	}

	//No Handphone Profile
	@And("User input blank no handphone {string}")
	public void user_input_blank_no_handphone(String no_handphone) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditNoHandphone'), no_handphone)
	}

	@Then("User input no handphone {string}")
	public void user_input_no_handphone(String no_handphone) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditNoHandphone'), no_handphone)
	}

	@Then("Users can edit profiles no handphone")
	public void users_can_edit_profiles_no_handphone() {
		//		WebUI.navigateToUrl('https://secondhand.binaracademy.org/')
		WebUI.println("Users can edit no handphone profile and it will show the homepage")
	}

	// --------------------------------------------- Negative ---------------------------------------------

	//Foto Profile Negative
	@And("User upload foto profile3")
	public void user_upload_foto_profile3() {
		WebUI.uploadFile(findTestObject('Object Repository/Feature Edit Profile/ctaEditFotoProfile'), 'D:\\Binar\\Challenge Gold\\Gambar duren\\Duren 9.jpg')
	}

	@And("User upload foto profile4")
	public void user_upload_foto_profile4() {
		WebUI.uploadFile(findTestObject('Object Repository/Feature Edit Profile/ctaEditFotoProfile'), 'D:\\Binar\\Challenge Gold\\Gambar duren\\Duren 1.jpg')
	}

	@Then("Users cannot edit foto profile")
	public void users_cannot_edit_foto_profile() {
		//		WebUI.println("Users cannot edit foto profile")
	}

	//Nama Profile Negative
	@And("User input nama space {string}")
	public void user_input_nama_space(String string) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditNama'), '')
	}

	@And("User input nama space2 {string}")
	public void user_input_nama_space2(String string) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditNama'), ' ')
	}

	@Then("Users cannot edit nama profile")
	public void users_cannot_edit_nama_profile() {
		//		WebUI.getText("Name can't be blank")
		WebUI.verifyElementText(findTestObject('Object Repository/Feature Edit Profile/notifTextNameCantBeBlank'), 'Name can\'t be blank')
	}

	//Kota Profile Negative
	@And("User select kota pilih kota")
	public void user_select_kota_pilih_kota() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Feature Edit Profile/selectKota'), '', false)
	}

	@Then("Users cannot edit kota profile")
	public void users_cannot_edit_kota_profile() {
		//		WebUI.println("pilih item pada daftar.")
		//		WebUI.getText("pilih item pada daftar.")
		WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Edit Profile/selectKota'))
	}

	//Alamat Profile Negative
	@And("User input alamat space {string}")
	public void user_input_alamat_space(String string) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditAlamat'), '')
	}

	@And("User input alamat space2 {string}")
	public void user_input_alamat_space2(String string) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditAlamat'), ' ')
	}

	@Then("Users cannot edit alamat profile")
	public void users_cannot_edit_alamat_profile() {
		//		WebUI.println("Users cannot edit alamat profile")
	}

	//No Handphone Negative
	@And("User input no handphone space {string}")
	public void user_input_no_handphone_space(String string) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditNoHandphone'), '')
	}

	@And("User input no handphone space2 {string}")
	public void user_input_no_handphone_space2(String string) {
		WebUI.setText(findTestObject('Object Repository/Feature Edit Profile/fieldEditNoHandphone'), ' ')
	}

	@Then("Users cannot edit no handphone profile")
	public void users_cannot_edit_no_handphone_profile() {
		//		WebUI.println("Users cannot edit no handphone profile")
	}
}