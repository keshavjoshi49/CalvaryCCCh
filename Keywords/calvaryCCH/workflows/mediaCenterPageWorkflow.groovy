package calvaryCCH.workflows

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import basePages.BasePage
import calvaryCCH.pages.mediaCenterPageSub
import locators.Locators
import calvaryCCH.pages.LoginPageSub


public class mediaCenterPageWorkflow {

	// All the methods for the texts on the page.
	public static def mcpAdminMenuText(){mediaCenterPageSub.adminMenuTextPresent()}

	// All the main methods that will be called in Tests
	public static def mcpLogoutToApp(){
		mediaCenterPageSub.logout()
		WebUI.waitForPageLoad(5)
	}
	public static def mcpOpenFirstMedia(){
		mediaCenterPageSub.clickOnMedia()
		WebUI.waitForElementPresent(Locators.edit_media_submit_button(), 0)
	}

	public static def mcpAdminMenuNotPresent(){
		WebUI.verifyTextNotPresent(Locators.home_admin_menue_text_link(), false)
	}
}


