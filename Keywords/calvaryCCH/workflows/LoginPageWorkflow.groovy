package calvaryCCH.workflows

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import basePages.BasePage
import calvaryCCH.pages.LoginPageSub
import calvaryCCH.pages.mediaCenterPageSub


public class LoginPageWorkflow {

	public static def openUrl(String url){
		BasePage.lauchApplication(url)
	}

	//Start All the methods for the texts on the page.
	public static def loginInvalidCredsText(){LoginPageSub.loginInvalidCredsTextPresent()}

	//End All the methods for the texts on the page.

	// Start All the main methods that will be called in Tests

	//Logout to application
	public static def loginToApplication(String username, String password){
		LoginPageSub.username(username)
		LoginPageSub.password(password)
		LoginPageSub.submit()
		LoginPageSub.waitForElement()
	}

	// End All the main methods that will be called in Tests

}