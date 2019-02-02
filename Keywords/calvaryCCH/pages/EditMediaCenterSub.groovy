package calvaryCCH.pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import locators.Locators
import basePages.BasePage

public class EditMediaCenterSub {

	public static def clickOnCancelButton() {
		BasePage.click(Locators.edit_media_cancel_button())
	}


	public static def submitForm() {
		BasePage.click(Locators.edit_media_submit_button())
	}
	public static def deleteForm() {
		BasePage.click(Locators.edit_media_delete_button())
	}
	public static def enableForm() {
		BasePage.click(Locators.edit_media_enable_button())
	}
	public static def disableForm() {
		BasePage.click(Locators.edit_media_disable_button())
	}

	//	@Keyword
	//	def disableForm() {
	//		WebUI.click(elements.edit_media_disable_button())
	//		WebUI.acceptAlert()
	//		WebUI.waitForElementPresent(elements.home_date(), 10)
	//	}
	//	@Keyword
	//	def enableForm() {
	//		WebUI.click(elements.edit_media_enable_button())
	//		WebUI.acceptAlert()
	//		WebUI.waitForElementPresent(elements.home_date(), 10)
	//	}
	@Keyword
	def saveSeries() {
		WebUI.click(Locators.edit_media_save_series_button())
		WebUI.delay(10)
		WebUI.verifyTextPresent(Locators.edit_media_save_series_text(), true)
	}
	@Keyword
	def uploadFile(filePath) {

		BasePage.uploadFile(Locators.edit_media_upload_audio_file(), filePath)
	}
}

