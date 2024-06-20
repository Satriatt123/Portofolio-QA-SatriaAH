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

class ListProductCard {

	//User Klik Product To All
	@And("User clicks on one of the products")
	public void user_clicks_on_one_of_the_products() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/viewProduct'), 2)
	}

	//Semua
	@And("User click cta Semua")
	public void user_click_cta_Semua() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 2)
	}

	@Then("Users can view product details in the category Semua")
	public void users_can_view_product_details_in_the_category_Semua() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Elektronik
	@And("User click cta Elektronik")
	public void user_click_cta_Elektronik() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory2Elektronik'), 2)
	}

	@Then("Users can view product details in the category Elektronik")
	public void users_can_view_product_details_in_the_category_Elektronik() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Komputer dan Aksesoris
	@And("User click cta Komputer dan Aksesoris")
	public void user_click_cta_Komputer_dan_Aksesoris() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory3KomputerdanAksesoris'), 2)
	}

	@Then("Users can view product details in the category Komputer dan Aksesoris")
	public void users_can_view_product_details_in_the_category_Komputer_dan_Aksesoris() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Handphone dan Aksesoris
	@And("User click cta Handphone dan Aksesoris")
	public void user_click_cta_Handphone_dan_Aksesoris() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory4HandphonedanAksesoris'), 2)
	}

	@Then("Users can view product details in the category Handphone dan Aksesoris")
	public void users_can_view_product_details_in_the_category_Handphone_dan_Aksesoris() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Pakaian Pria
	@And("User swipe to the category section until see cta Pakaian Pria")
	public void user_swipe_to_the_category_section_until_see_cta_Pakaian_Pria() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory5PakaianPria'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Pakaian Pria")
	public void user_click_cta_Pakaian_Pria() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory5PakaianPria'), 2)
	}

	@Then("Users can view product details in the category Pakaian Pria")
	public void users_can_view_product_details_in_the_category_Pakaian_Pria() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Sepatu Pria
	@And("User swipe to the category section until see cta Sepatu Pria")
	public void user_swipe_to_the_category_section_until_see_cta_Sepatu_Pria() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory6SepatuPria'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Sepatu Pria")
	public void user_click_cta_Sepatu_Pria() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory6SepatuPria'), 2)
	}

	@Then("Users can view product details in the category Sepatu Pria")
	public void users_can_view_product_details_in_the_category_Sepatu_Pria() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Tas Pria
	@And("User swipe to the category section until see cta Tas Pria")
	public void user_swipe_to_the_category_section_until_see_cta_Tas_Pria() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory7TasPria'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Tas Pria")
	public void user_click_cta_Tas_Pria() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory7TasPria'), 2)
	}

	@Then("Users can view product details in the category Tas Pria")
	public void users_can_view_product_details_in_the_category_Tas_Pria() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Aksesoris Fashion
	@And("User swipe to the category section until see cta Aksesoris Fashion")
	public void user_swipe_to_the_category_section_until_see_cta_Aksesoris_Fashion() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory8AksesorisFashion'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Aksesoris Fashion")
	public void user_click_cta_Aksesoris_Fashion() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory8AksesorisFashion'), 2)
	}

	@Then("Users can view product details in the category Aksesoris Fashion")
	public void users_can_view_product_details_in_the_category_Aksesoris_Fashion() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Kesehatan
	@And("User swipe to the category section until see cta Kesehatan")
	public void user_swipe_to_the_category_section_until_see_cta_Kesehatan() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory9Kesehatan'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Kesehatan")
	public void user_click_cta_Kesehatan() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory9Kesehatan'), 2)
	}

	@Then("Users can view product details in the category Kesehatan")
	public void users_can_view_product_details_in_the_category_Kesehatan() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Hobi dan Koleksi
	@And("User swipe to the category section until see cta Hobi dan Koleksi")
	public void user_swipe_to_the_category_section_until_see_cta_Hobi_dan_Koleksi() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory10HobidanKoleksi'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Hobi dan Koleksi")
	public void user_click_cta_Hobi_dan_Koleksi() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory10HobidanKoleksi'), 2)
	}

	@Then("Users can view product details in the category Hobi dan Koleksi")
	public void users_can_view_product_details_in_the_category_Hobi_dan_Koleksi() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Makanan dan Minuman
	@And("User swipe to the category section until see cta Makanan dan Minuman")
	public void user_swipe_to_the_category_section_until_see_cta_Makanan_dan_Minuman() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory11MakanandanMinuman'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("click cta Makanan dan Minuman")
	public void click_cta_Makanan_dan_Minuman() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory11MakanandanMinuman'), 2)
	}

	@Then("Users can view product details in the category Makanan dan Minuman")
	public void users_can_view_product_details_in_the_category_Makanan_dan_Minuman() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Perawatan dan Kecantikan
	@And("User swipe to the category section until see cta Perawatan dan Kecantikan")
	public void user_swipe_to_the_category_section_until_see_cta_Perawatan_dan_Kecantikan() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory12PerawatandanKecantikan'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Perawatan dan Kecantikan")
	public void user_click_cta_Perawatan_dan_Kecantikan() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory12PerawatandanKecantikan'), 2)
	}

	@Then("Users can view product details in the category Perawatan dan Kecantikan")
	public void users_can_view_product_details_in_the_category_Perawatan_dan_Kecantikan() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Perlengkapan Rumah
	@And("User swipe to the category section until see cta Perlengkapan Rumah")
	public void user_swipe_to_the_category_section_until_see_cta_Perlengkapan_Rumah() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory13PerlengkapanRumah'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Perlengkapan Rumah")
	public void user_click_cta_Perlengkapan_Rumah() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory13PerlengkapanRumah'), 2)
	}

	@Then("Users can view product details in the category Perlengkapan Rumah")
	public void users_can_view_product_details_in_the_category_Perlengkapan_Rumah() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Pakaian Wanita
	@And("User swipe to the category section until see cta Pakaian Wanita")
	public void user_swipe_to_the_category_section_until_see_cta_Pakaian_Wanita() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory14PakaianWanita'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Pakaian Wanita")
	public void user_click_cta_Pakaian_Wanita() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory14PakaianWanita'), 2)
	}

	@Then("Users can view product details in the category Pakaian Wanita")
	public void users_can_view_product_details_in_the_category_Pakaian_Wanita() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Fashion Muslim
	@And("User swipe to the category section until see cta Fashion Muslim")
	public void user_swipe_to_the_category_section_until_see_cta_Fashion_Muslim() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory15FashionMuslim'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Fashion Muslim")
	public void user_click_cta_Fashion_Muslim() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory15FashionMuslim'), 2)
	}

	@Then("Users can view product details in the category Fashion Muslim")
	public void users_can_view_product_details_in_the_category_Fashion_Muslim() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Fashion Bayi dan Anak
	@And("User swipe to the category section until see cta Fashion Bayi dan Anak")
	public void user_swipe_to_the_category_section_until_see_cta_Fashion_Bayi_dan_Anak() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory16FashionbayidanAnak'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Fashion Bayi dan Anak")
	public void user_click_cta_Fashion_Bayi_dan_Anak() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory16FashionbayidanAnak'), 2)
	}

	@Then("Users can view product details in the category Fashion Bayi dan Anak")
	public void users_can_view_product_details_in_the_category_Fashion_Bayi_dan_Anak() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Ibu dan Bayi
	@And("User swipe to the category section until see cta Ibu dan Bayi")
	public void user_swipe_to_the_category_section_until_see_cta_Ibu_dan_Bayi() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory17IbudanBayi'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Ibu dan Bayi")
	public void user_click_cta_Ibu_dan_Bayi() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory17IbudanBayi'), 2)
	}

	@Then("Users can view product details in the category Ibu dan Bayi")
	public void users_can_view_product_details_in_the_category_Ibu_dan_Bayi() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Sepatu Wanita
	@And("User swipe to the category section until see cta Sepatu Wanita")
	public void user_swipe_to_the_category_section_until_see_cta_Sepatu_Wanita() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory18SepatuWanita'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Sepatu Wanita")
	public void user_click_cta_Sepatu_Wanita() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory18SepatuWanita'), 2)
	}

	@Then("Users can view product details in the category Sepatu Wanita")
	public void users_can_view_product_details_in_the_category_Sepatu_Wanita() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Tas Wanita
	@And("User swipe to the category section until see cta Tas Wanita")
	public void user_swipe_to_the_category_section_until_see_cta_Tas_Wanita() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory19TasWanita'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Tas Wanita")
	public void user_click_cta_Tas_Wanita() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory19TasWanita'), 2)
	}

	@Then("Users can view product details in the category Tas Wanita")
	public void users_can_view_product_details_in_the_category_Tas_Wanita() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Otomotif
	@And("User swipe to the category section until see cta Otomotif")
	public void user_swipe_to_the_category_section_until_see_cta_Otomotif() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory20Otomotif'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Otomotif")
	public void user_click_cta_Otomotif() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory20Otomotif'), 2)
	}

	@Then("Users can view product details in the category Otomotif")
	public void users_can_view_product_details_in_the_category_Otomotif() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Olahraga dan Outdoor
	@And("User swipe to the category section until see cta Olahraga dan Outdoor")
	public void user_swipe_to_the_category_section_until_see_cta_Olahraga_dan_Outdoor() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory21OlahragadanOutdoor'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Olahraga dan Outdoor")
	public void user_click_cta_Olahraga_dan_Outdoor() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory21OlahragadanOutdoor'), 2)
	}

	@Then("Users can view product details in the category Olahraga dan Outdoor")
	public void users_can_view_product_details_in_the_category_Olahraga_dan_Outdoor() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Buku dan Alat Tulis
	@And("User swipe to the category section until see cta Buku dan Alat Tulis")
	public void user_swipe_to_the_category_section_until_see_cta_Buku_dan_Alat_Tulis() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory22BukudanAlatTulis'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Buku dan Alat Tulis")
	public void user_click_cta_Buku_dan_Alat_Tulis() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory22BukudanAlatTulis'), 2)
	}

	@Then("Users can view product details in the category Buku dan Alat Tulis")
	public void users_can_view_product_details_in_the_category_Buku_dan_Alat_Tulis() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Voucher
	@And("User swipe to the category section until see cta Voucher")
	public void user_swipe_to_the_category_section_until_see_cta_Voucher() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory23Voucher'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Voucher")
	public void user_click_cta_Voucher() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory23Voucher'), 2)
	}

	@Then("Users can view product details in the category Voucher")
	public void users_can_view_product_details_in_the_category_Voucher() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Souvenir dan Pesta
	@And("User swipe to the category section until see cta Souvenir dan Pesta")
	public void user_swipe_to_the_category_section_until_see_cta_Souvenir_dan_Pesta() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory24SouvenirdanPesta'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Souvenir dan Pesta")
	public void user_click_cta_Souvenir_dan_Pesta() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory24SouvenirdanPesta'), 2)
	}

	@Then("Users can view product details in the category Souvenir dan Pesta")
	public void users_can_view_product_details_in_the_category_Souvenir_dan_Pesta() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}

	//Fotografi
	@And("User swipe to the category section until see cta Fotografi")
	public void user_swipe_to_the_category_section_until_see_cta_Fotografi() {
		int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)
		while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory25Fotografi'), 1, FailureHandling.OPTIONAL))
			Mobile.swipe(535, y, 47 , y)
	}

	@And("User click cta Fotografi")
	public void user_click_cta_Fotografi() {
		Mobile.tap(findTestObject('Object Repository/Feature ListProductCard/ctaCategory25Fotografi'), 2)
	}

	@Then("Users can view product details in the category Fotografi")
	public void users_can_view_product_details_in_the_category_Fotografi() {
		Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)
		Mobile.delay(2)
	}
}