package calvaryCCH.workflows

import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import basePages.BasePage
import calvaryCCH.pages.mediaCenterPageSub
import calvaryCCH.pages.EditMediaCenterSub
import locators.Locators
import calvaryCCH.pages.LoginPageSub


public class editMediaCenterPageWorkflow {

	public static def emcpCancelForm(){
		EditMediaCenterSub.clickOnCancelButton()
		WebUI.acceptAlert()
		WebUI.switchToWindowTitle("Media Center - Calvary Chapel Chino Hills")
	}
	public static def emcpNoCancelForm(){
		EditMediaCenterSub.clickOnCancelButton()
		WebUI.dismissAlert()
	}

	public static def emcpSubmitForm(){
		EditMediaCenterSub.submitForm()
		BasePage.waitForElement(Locators.home_date())
	}
	public static def emcpDeleteForm(){
		EditMediaCenterSub.deleteForm()
		WebUI.acceptAlert()
		BasePage.waitForElement(Locators.home_date())
	}
	public static def emcpSaveSeries(){
		EditMediaCenterSub.saveSeries()
		WebUI.delay(10)
	}

	public static def emcpDisableForm(){


		try {
			WebUI.verifyElementPresent(Locators.edit_media_disable_button(),5)
			EditMediaCenterSub.disableForm()
			WebUI.acceptAlert()
		}
		catch (StepFailedException e) {
			EditMediaCenterSub.enableForm()
			WebUI.acceptAlert()
			mediaCenterPageSub.clickOnMedia()
			EditMediaCenterSub.disableForm()
			WebUI.acceptAlert()
		}
	}

	public static def emcpEnableForm(){


		try {
			WebUI.verifyElementPresent(Locators.edit_media_enable_button(),5)
			println("try")
			EditMediaCenterSub.enableForm()
			WebUI.acceptAlert()
		}
		catch (StepFailedException e) {
			println("catch")
			EditMediaCenterSub.disableForm()
			WebUI.acceptAlert()
			mediaCenterPageSub.clickOnMedia()
			EditMediaCenterSub.enableForm()
			WebUI.acceptAlert()
		}
	}
	
	public static def emcpUpdateSeriesDesc(String series_desc){
		BasePage.clearText(Locators.edit_media_series_description())
		BasePage.setText(Locators.edit_media_series_description(), series_desc)
		EditMediaCenterSub.saveSeries()
		EditMediaCenterSub.submitForm()
	}

	public static def emcpUploadFile(String filePath) {
		EditMediaCenterSub.uploadFile(filePath)
	}

	//Verify element present
	public static def emcpVerifyCancelBtnPresence(){

		BasePage.verifyElementPresent(Locators.edit_media_cancel_button())
	}
}
