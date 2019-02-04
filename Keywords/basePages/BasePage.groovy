package basePages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.value_return

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
public class BasePage {

	public static def lauchApplication (String url) {

		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.deleteAllCookies()
		WebUI.navigateToUrl(url)
	}

	public static def clearText(TestObject object) {
		WebUI.clearText(object)
	}

	public static def setText(TestObject object,String value) {
		WebUI.setText(object,value)
	}

	public static def click(TestObject object) {
		WebUI.click(object)
	}
	//Verify methods
	public static def verifyText(String text) {
		WebUI.verifyTextPresent(text, true, FailureHandling.STOP_ON_FAILURE)
	}
	public static def verifyElementPresent(TestObject object) {
		//WebUI.verifyElementPresent(object, true, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(object, 10)
	}
	// Wait methods
	public static def waitForElement(TestObject object){
		WebUI.waitForElementPresent(object,10)
	}

	@Keyword
	def selectValueInDropDown() {

		WebUI.selectOptionByValue(Locators.edit_media_series_drop_down(), Locators.edit_media_series_drop_down_value, false)
	}
	@Keyword
	static def uploadFile(String object,String filePath) {
		WebUI.uploadFile(findTestObject(object), filePath)
	}
	def getAttribute(String object, String value) {
		WebUI.getAttribute(object, value)
	}
}



