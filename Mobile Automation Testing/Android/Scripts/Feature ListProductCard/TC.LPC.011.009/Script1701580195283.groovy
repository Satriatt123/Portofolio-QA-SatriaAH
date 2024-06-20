import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

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
Mobile.startApplication('Apk/secondhand-24082023.apk', false)

Mobile.tap(findTestObject('Feature Login/iconAkun'), 2)

Mobile.tap(findTestObject('Feature Login/ctaMasuk'), 2)

Mobile.setText(findTestObject('Feature Login/fieldInputEmail'), 'kel3seller1@gmail.com', 2)

Mobile.setText(findTestObject('Feature Login/fieldInputPassword'), '123456', 2)

Mobile.tap(findTestObject('Feature Login/ctaViewPassword'), 2)

Mobile.tap(findTestObject('Feature Login/ctaLogin'), 2)

Mobile.tap(findTestObject('Feature Beranda/ctaBeranda'), 2)

int y = Mobile.getElementTopPosition(findTestObject('Object Repository/Feature ListProductCard/ctaCategory1Semua'), 1)

while (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Feature ListProductCard/ctaCategory9Kesehatan'), 
    1, FailureHandling.OPTIONAL)) {
    Mobile.swipe(535, y, 47, y)
}

Mobile.tap(findTestObject('Feature ListProductCard/ctaCategory9Kesehatan'), 2)

Mobile.delay(2)

Mobile.tap(findTestObject('Feature ListProductCard/viewProduct'), 2)

Mobile.delay(2)

Mobile.verifyElementVisible(findTestObject('Feature ListProductCard/verifyProductCard'), 2)

Mobile.delay(2)

