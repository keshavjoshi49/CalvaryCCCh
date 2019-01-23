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
import locators.Locators as elements
public class BasePage {
	@Keyword
	def lauchApplication (String url) {

		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.deleteAllCookies()
		WebUI.navigateToUrl(url)
	}
	@Keyword
	def setText(String object,String value) {
		WebUI.setText(findTestObject(object),value)
	}
	@Keyword
	def click(String object) {
		WebUI.click(findTestObject(object))
	}
	@Keyword
	def selectValueInDropDown() {

		WebUI.selectOptionByValue(elements.edit_media_series_drop_down(), elements.edit_media_series_drop_down_value, false)
	}
	@Keyword
	static def uploadFile(String object,String filePath) {
		WebUI.uploadFile(findTestObject(object), filePath)
	}
	def getAttribute(String object, String value) {
		WebUI.getAttribute(object, value)
	}
}



