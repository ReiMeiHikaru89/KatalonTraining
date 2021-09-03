import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

"Open Browser"
WebUI.openBrowser('')

"Navigate to URL kiemthutudong.com"
WebUI.navigateToUrl('https://kiemthutudong.com/blog')

"Open Create New Account page"
WebUI.click(findTestObject('Object Repository/Page_Automation Blog  Quality is not an act_8c22d4/a_Create New AccountCreate New Account'))

"Input username"
WebUI.setText(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Username_user_login'), 
    'QUANGMINH89')

"Input Email"
WebUI.setText(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Email_user_email'), 
    'reimeihikaru@gmail.com')

"Click Register button"
WebUI.click(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Email_wp-submit'))

"Delay page"
WebUI.delay(10)

"Take Screenshot"
WebUI.takeScreenshot()

"Close Browser"
WebUI.closeBrowser()

