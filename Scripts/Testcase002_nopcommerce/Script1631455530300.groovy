import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

"Open Browser"
WebUI.openBrowser('')

"Navigate to URL https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fdemo"
WebUI.navigateToUrl('https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fdemo')

"Maximize the page"
WebUI.maximizeWindow()

"Input UserName"
WebUI.setText(findTestObject('Object Repository/Page_Nopcommerce/txt_Username'), 'quangminh')

"Input Password"
WebUI.setText(findTestObject('Object Repository/Page_Nopcommerce/txt_password'), 'maiyeu')

"Delay page"
WebUI.delay(5)

"Take Screenshot"
WebUI.takeScreenshot()

"Click Login button"
WebUI.click(findTestObject('Object Repository/Page_Nopcommerce/btn_login'))

"Delay page"
WebUI.delay(5)

"Take Screenshot"
WebUI.takeScreenshot()

"Close Browser"
WebUI.closeBrowser()
