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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://orange.katalon.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Or Web/Page_OrangeHRM/input_Username'), HRM_Username)

WebUI.setEncryptedText(findTestObject('Or Web/Page_OrangeHRM/input_Password'), 'NQuaCwkN8Pc=')

WebUI.click(findTestObject('Or Web/Page_OrangeHRM/button_Login'))

WebUI.assertElementText(findTestObject('Or Web/Page_OrangeHRM/p_Invalid credentials'), 'Invalid credentials', 0)

WebUI.setText(findTestObject('Or Web/Page_OrangeHRM/input_Username'), 'mohit.kumar')

WebUI.setEncryptedText(findTestObject('Or Web/Page_OrangeHRM/input_Password'), 'H0Q291REJi8mZmD6Fe3ZMw==')

WebUI.click(findTestObject('Or Web/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Or Web/Page_OrangeHRM/span_Admin'))

WebUI.setText(findTestObject('Or Web/Page_OrangeHRM/input_oxd-input oxd-input-active'), 'mohit')

WebUI.click(findTestObject('Or Web/Page_OrangeHRM/button_Search'))

WebUI.click(findTestObject('Or Web/Page_OrangeHRM/button_Add'))

WebUI.click(findTestObject('Or Web/Page_OrangeHRM/span_Recruitment'))

WebUI.click(findTestObject('Or Web/Page_OrangeHRM/span_My Info'))

WebUI.assertElementText(findTestObject('Or Web/Page_OrangeHRM/h6_Personal Details'), 'Personal Details', 0)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

