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

public class editMediaCenter {
	@Keyword
	def submitForm() {
		WebUI.click(findTestObject('Edit_Media/Buttons/submit_button'))
		WebUI.waitForElementPresent(findTestObject('Edit_Media/date'), 10)
	}

	@Keyword
	def cancelForm() {
		WebUI.click(findTestObject('Edit_Media/Buttons/cancel_button'))
		WebUI.acceptAlert()
	}
	@Keyword
	def deleteForm() {
		WebUI.click(findTestObject('Edit_Media/Buttons/delete_button'))
		WebUI.acceptAlert()
		WebUI.waitForElementPresent(findTestObject('Edit_Media/date'), 10)
	}
	@Keyword
	def disableForm() {
		WebUI.click(findTestObject('Edit_Media/Buttons/disable_button'))
		WebUI.acceptAlert()
		WebUI.waitForElementPresent(findTestObject('Edit_Media/date'), 10)
	}
	@Keyword
	def enableForm() {
		WebUI.click(findTestObject('Edit_Media/Buttons/enable_button'))
		WebUI.acceptAlert()
		WebUI.waitForElementPresent(findTestObject('Edit_Media/date'), 10)
	}
	@Keyword
	def saveSeries() {
		WebUI.click(findTestObject('Edit_Media/Edit_series_fields/Save_series_button'))
		WebUI.delay(5)
		WebUI.verifyTextPresent('Series Information Updated.', true, FailureHandling.STOP_ON_FAILURE)
	}
}
