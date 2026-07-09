import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://orange.katalon.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Or Web/Page_OrangeHRM/input_Username'), HRM_Username)

WebUI.setEncryptedText(findTestObject('Or Web/Page_OrangeHRM/input_Password'), 'NQuaCwkN8Pc=')

WebUI.click(findTestObject('Or Web/Page_OrangeHRM/button_Login'))

WebUI.assertElementText(findTestObject('Or Web/Page_OrangeHRM/p_Invalid credentials'), 'Invalid credentials', 10)

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

