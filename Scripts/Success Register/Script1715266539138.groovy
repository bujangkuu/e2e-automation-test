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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.setText(findTestObject('Object Repository/Resgister/input_email_email'), 'test')

WebUI.click(findTestObject('Object Repository/Resgister/div_emailpasswordingin mencoba, daftar login'))

WebUI.setText(findTestObject('Object Repository/Resgister/input_email_email'), '')

WebUI.click(findTestObject('Object Repository/Resgister/a_ingin mencoba, daftar'))

WebUI.setText(findTestObject('Object Repository/Resgister/input_nama toko_name'), nama_toko)

WebUI.setText(findTestObject('Object Repository/Resgister/input_email_email'), '9052024test@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Resgister/input_password_password'), 'AGeku8d09m+5ZW271Zi/Gw==')

WebUI.click(findTestObject('Object Repository/Resgister/button_daftar'))

WebUI.click(findTestObject('Object Repository/Resgister/div_Toko berhasil didaftarkananda dapat men_b3a8bd'))

WebUI.click(findTestObject('Object Repository/Resgister/div_Toko berhasil didaftarkan'))

