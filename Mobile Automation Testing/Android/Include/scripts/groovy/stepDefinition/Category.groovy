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
	@And("User click cta category semua")
	public void User_click_cta_category_semua() {
		Mobile.tap(findTestObject('Feature Category/cta category semua'), 2)
	}

	@Then("Show product list by category semua on beranda page")
	public void Show_product_list_by_category_semua_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User click cta category elektronik")
	public void User_click_cta_category_elektronik() {
		Mobile.tap(findTestObject('Feature Category/cta category elektronik'), 2)
	}

	@Then("Show product list by category elektronik on beranda page")
	public void Show_product_list_by_category_elektronik_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User click cta category komputer dan aksesoris")
	public void User_click_cta_category_komputer_dan_aksesoris() {
		Mobile.tap(findTestObject('Feature Category/cta category komputer dan aksesoris'), 2)
	}

	@Then("Show product list by category komputer dan aksesoris on beranda page")
	public void User_can_view_list_product_in_komputer_dan_aksesoris_category() {
		Mobile.delay(2)
	}

	@And("User click cta category handphone dan aksesoris")
	public void User_click_cta_category_handhone_dan_aksesoris() {
		Mobile.tap(findTestObject('Feature Category/cta category handphone dan aksesoris'), 2)
	}

	@Then("Show product list by category handphone dan aksesoris on beranda page")
	public void Show_product_list_by_category_handphone_dan_aksesoris_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category pakaian pria")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_pakaian_pria() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category pakaian pria'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(720, y, 20, y)
		}
	}

	@And("User click cta category pakaian pria")
	public void User_click_cta_category_pakaian_pria() {
		Mobile.tap(findTestObject('Feature Category/cta category pakaian pria'), 2)
	}

	@Then("Show product list by category pakaian pria on beranda page")
	public void Show_product_list_by_category_pakaian_pria_on_beranda_page() {
	}

	@And("User swipe left on categori cta section until see cta category sepatu pria")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_sepatu_pria() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category sepatu pria'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(720, y, 20, y)
		}
	}

	@And("User click cta category sepatu pria")
	public void User_click_cta_category_sepatu_pria() {
		Mobile.tap(findTestObject('Feature Category/cta category sepatu pria'), 2)
	}

	@Then("Show product list by category sepatu pria on beranda page")
	public void Show_product_list_by_category_sepatu_pria_on_beranda_page() {
	}

	@And("User swipe left on categori cta section until see cta category tas pria")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_tas_pria() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category tas pria'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(720, y, 20, y)
		}
	}

	@And("User click cta category tas pria")
	public void User_click_cta_category_tas_pria() {
		Mobile.tap(findTestObject('Feature Category/cta category tas pria'), 3)
	}

	@Then("Show product list by category tas pria on beranda page")
	public void Show_product_list_by_category_tas_pria_on_beranda_page() {
	}

	@And("User swipe left on categori cta section until see cta category aksesoris fashion")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_aksesoris_fashion() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category aksesoris fashion'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(720, y, 20, y)
		}
	}

	@And("User click cta category aksesoris fashion")
	public void User_click_cta_category_aksesoris_fashion() {
		Mobile.tap(findTestObject('Feature Category/cta category aksesoris fashion'), 2)
	}

	@Then("Show product list by category aksesoris fashion on beranda page")
	public void Show_product_list_by_category_aksesoris_fashion_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category kesehatan")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_kesehatan() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category kesehatan'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(740, y, 10, y)
		}
	}

	@And("User click cta category kesehatan")
	public void User_click_cta_category_kesehatan() {
		Mobile.tap(findTestObject('Feature Category/cta category kesehatan'), 2)
	}

	@Then("Show product list by category kesehatan on beranda page")
	public void Show_product_list_by_category_kesehatan_on_beranda_page() {
	}

	@And("User swipe left on categori cta section until see cta category hobi dan koleksi")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_hobi_dan_koleksi() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category hobi dan koleksi'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(740, y, 10, y)
		}
	}

	@And("User click cta category hobi dan koleksi")
	public void User_click_cta_category_hobi_dan_koleksi() {
		Mobile.tap(findTestObject('Feature Category/cta category hobi dan koleksi'), 2)
	}

	@Then("Show product list by category hobi dan koleksi on beranda page")
	public void Show_product_list_by_category_hobi_dan_koleksi_on_beranda_page() {
	}

	@And("User swipe left on categori cta section until see cta category makanan dan minuman")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_makanan_dan_minuman() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category makanan dan minuman'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category makanan dan minuman")
	public void User_click_cta_category_makanan_dan_minuman() {
		Mobile.tap(findTestObject('Feature Category/cta category makanan dan minuman'), 2)
	}

	@Then("Show product list by category makanan dan minuman on beranda page")
	public void Show_product_list_by_category_makanan_dan_minuman_on_beranda_page() {
	}

	@And("User swipe left on categori cta section until see cta category perawatan dan kecantikan")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_perawatan_dan_kecantikan() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category perawatan dan kecantikan'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category perawatan dan kecantikan")
	public void User_click_cta_category_petrawatan_dan_kecantikan() {
		Mobile.tap(findTestObject('Feature Category/cta category perawatan dan kecantikan'), 2)
	}

	@Then("Show product list by category perawatan dan kecantikan on beranda page")
	public void Show_product_list_by_category_perawatan_dan_kecantikan_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category perlengkapan rumah")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_peralatan_rumah() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category perlengkapan rumah'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(760, y, 20, y)
		}
	}

	@And("User click cta category perlengkapan rumah")
	public void User_click_cta_category_perlengkapan_rumah() {
		Mobile.tap(findTestObject('Feature Category/cta category perlengkapan rumah'), 2)
	}

	@Then("Show product list by category perlengkapan rumah on beranda page")
	public void Show_product_list_by_category_perlengkapan_rumah_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category pakaian wanita")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_pakaian_wanita() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category pakaian wanita'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category pakaian wanita")
	public void User_click_cta_category_pakaian_wanita() {
		Mobile.tap(findTestObject('Feature Category/cta category pakaian wanita'), 2)
	}

	@Then("Show product list by category pakaian wanita on beranda page")
	public void Show_product_list_by_category_pakaian_wanita_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category fashion muslim")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_fashion_muslim() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category fashion muslim'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category fashion muslim")
	public void User_click_cta_category_fashion_muslim() {
		Mobile.tap(findTestObject('Feature Category/cta category fashion muslim'), 2)
	}

	@Then("Show product list by category fashion muslim on beranda page")
	public void Show_product_list_by_category_fashion_muslim_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category fashion bayi dan anak")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_fashion_bayi_dan_anak() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category fashion bayi dan anak'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category fashion bayi dan anak")
	public void User_click_cta_category_fashion_bayi_dan_anak() {
		Mobile.tap(findTestObject('Feature Category/cta category fashion bayi dan anak'), 2)
	}

	@Then("Show product list by category bayi dan anak on beranda page")
	public void Show_product_list_by_category_bayi_dan_anak_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category ibu dan bayi")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_ibu_dan_bayi() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category ibu dan bayi'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category ibu dan bayi")
	public void User_click_cta_category_ibu_dan_bayi() {
		Mobile.tap(findTestObject('Feature Category/cta category ibu dan bayi'), 2)
	}

	@Then("Show product list by category ibu dan bayi on beranda page")
	public void Show_product_list_by_category_ibu_dan_bayi_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category sepatu wanita")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_sepatu_wanita() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category sepatu wanita'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category sepatu wanita")
	public void User_click_cta_category_sepatu_wanita() {
		Mobile.tap(findTestObject('Feature Category/cta category sepatu wanita'), 2)
	}

	@Then("Show product list by category sepatu wanita on beranda page")
	public void Show_product_list_by_category_sepatu_wanita_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category tas wanita")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_tas_wanita() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category tas wanita'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category tas wanita")
	public void User_click_cta_category_tas_wanita() {
		Mobile.tap(findTestObject('Feature Category/cta category tas wanita'), 2)
	}

	@Then("Show product list by category tas wanita on beranda page")
	public void Show_product_list_by_category_tas_wanita_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category otomotif")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_otomotif() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category otomotif'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category otomotif")
	public void User_click_cta_category_otomotif() {
		Mobile.tap(findTestObject('Feature Category/cta category otomotif'), 2)
	}

	@Then("Show product list by category otomotif on beranda page")
	public void Show_product_list_by_category_otomotif_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category olahraga dan outdoor")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_olahrga_dan_outdoor() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category olahraga dan outdoor'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category olahraga dan outdoor")
	public void User_click_cta_category_olahraga_dan_outdoor() {
		Mobile.tap(findTestObject('Feature Category/cta category olahraga dan outdoor'), 2)
	}

	@Then("Show product list by category olahraga dan outdoor on beranda page")
	public void Show_product_list_by_category_olahtaga_dan_outdoor_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category buku dan alat tulis")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_buku_dan_alat_tulis() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category buku dan alat tulis'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category buku dan alat tulis")
	public void User_click_cta_category_buku_dan_alat_tulis() {
		Mobile.tap(findTestObject('Feature Category/cta category buku dan alat tulis'), 2)
	}

	@Then("Show product list by category buku dan alat tulis on beranda page")
	public void Show_product_list_by_category_buku_dan_alat_tulis_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category voucher")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_voucher() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category voucher'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category voucher")
	public void User_click_cta_category_voucher() {
		Mobile.tap(findTestObject('Feature Category/cta category voucher'), 2)
	}

	@Then("Show product list by category voucher on beranda page")
	public void Show_product_list_by_category_voucher_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category souvenir dan pesta")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_souvenir_dan_pesta() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category souvenir dan pesta'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category souvenir dan pesta")
	public void User_click_cta_category_souvenir_dan_pesta() {
		Mobile.tap(findTestObject('Feature Category/cta category souvenir dan pesta'), 2)
	}

	@Then("Show product list by category souvenir dan pesta on beranda page")
	public void Show_product_list_by_category_souvenir_dan_pesta_on_beranda_page() {
		Mobile.delay(2)
	}

	@And("User swipe left on categori cta section until see cta category fotografi")
	public void User_swipe_left_on_categori_cta_section_until_see_cta_category_fotografi() {
		int y = Mobile.getElementTopPosition(findTestObject('Feature Category/cta category semua'), 1)
		while(Mobile.verifyElementNotVisible(findTestObject('Feature Category/cta category fotografi'),1, FailureHandling.OPTIONAL)) {
			Mobile.swipe(750, y, 20, y)
		}
	}

	@And("User click cta category fotografi")
	public void User_click_cta_category_fotografi() {
		Mobile.tap(findTestObject('Feature Category/cta category fotografi'), 2)
	}

	@Then("Show product list by category fotografi on beranda page")
	public void Show_product_list_by_category_fotografi_on_beranda_page() {
		Mobile.delay(2)
	}
}