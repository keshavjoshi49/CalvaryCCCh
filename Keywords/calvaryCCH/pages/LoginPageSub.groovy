package calvaryCCH.pages

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import locators.Locators
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
//import locators.Locators
import basePages.BasePage
import calvaryCCH.pages.LoginPageSub
import calvaryCCH.pages.mediaCenterPageSub

class LoginPageSub {


	public static def username (String username){BasePage.setText(Locators.login_name(), username)}
	public static def password (String password) {BasePage.setText(Locators.login_password(), password)}
	public static def submit(){BasePage.click(Locators.login_submit_button())}
	public static def waitForElement(){BasePage.waitForElement(Locators.home_logout_link())}


	//Start Verify Texts presence
	public static def loginInvalidCredsTextPresent(){
		BasePage.verifyText(Locators.login_invalid_creds_text())
	}
	//End Verify Texts presence

	// Verify Elements presence
	public static def submitButtonPresence(){
		BasePage.verifyElementPresent(Locators.login_submit_button())
	}
}