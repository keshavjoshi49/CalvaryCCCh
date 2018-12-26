import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/first_media_link'))

WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 10)
cseries=WebUI.getAttribute(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'), 'value')
println(cseries)

if (cseries==102)
{
	WebUI.selectOptionByValue(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'),'122', false)
}

else
{
	WebUI.selectOptionByValue(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'),'102', false)
}
WebUI.clearText(findTestObject('Edit_Media/Edit_series_fields/series_description'))
WebUI.setText(findTestObject('Edit_Media/Edit_series_fields/series_description'), series_desc)
WebUI.click(findTestObject('Edit_Media/Edit_series_fields/Save_series_button'))
WebUI.delay(5)
WebUI.verifyTextPresent('Series Information Updated.', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Edit_Media/Buttons/submit_button'))
WebUI.waitForElementPresent(findTestObject('Edit_Media/Edit_audio_fields/series'), 10)

WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/first_media_link'))
WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 10)

useries_desc=WebUI.getText(findTestObject('Edit_Media/Edit_series_fields/series_description'))

//Assertion
WebUI.verifyMatch(useries_desc, series_desc, false)

