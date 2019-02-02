package calvaryCCH.pages

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import locators.Locators
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import basePages.BasePage


public class mediaCenterPageSub {
	//verify texts
	public static def adminMenuTextPresent(){
		BasePage.verifyText(Locators.home_admin_menue_text_link())
	}
	//verify elements presence

	public static def logout() {
		BasePage.click(Locators.home_logout_link())
		BasePage.waitForElement(Locators.login_submit_button())
	}

	public static def clickOnMedia() {
		BasePage.click(Locators.home_first_media_link())
		WebUI.switchToWindowTitle(Locators.home_switch_title_text())
	}

	//		WebUI.click(Locators.home_first_media_link())
	//		WebUI.switchToWindowTitle(Locators.home_switch_title_text())
	//		WebUI.waitForElementPresent(Locators.edit_media_submit_button(), 10)
	//	}
}











