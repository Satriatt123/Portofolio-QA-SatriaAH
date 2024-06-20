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

Mobile.tap(findTestObject('Feature Login/iconAkun'), 2)

Mobile.tap(findTestObject('Feature Login/ctaMasuk'), 2)

Mobile.verifyElementVisible(findTestObject('Feature Login/titleMasuk'), 2)

Mobile.tap(findTestObject('Feature Register/ctaDaftar'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Feature Register/titlePageDaftar'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Feature Register/fieldInputNamaLengkap'), 'Kai Yama', 2)

Mobile.setText(findTestObject('Feature Login/fieldInputEmail'), 'kai@mail.co', 2)

Mobile.setText(findTestObject('Feature Login/fieldInputPassword'), '123456', 2)

Mobile.tap(findTestObject('Feature Login/ctaViewPassword'), 2)

Mobile.setText(findTestObject('Feature Register/fieldInputPhoneNumber'), '087877887788', 2)

Mobile.setText(findTestObject('Feature Register/fieldInputKota'), 'Jakarta', 2)

Mobile.setText(findTestObject('Feature Register/fieldInputAlamat'), 'jalanin jalannya', 2)

Mobile.tap(findTestObject('Feature Register/ctaRegister'), 2)

