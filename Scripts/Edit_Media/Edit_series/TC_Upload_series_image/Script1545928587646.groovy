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


//This test case check that the uploading a series image.
//Edit the media that is on the top.
WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/first_media_link'))
WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 10)

boolean delete;
try
{
	WebUI.verifyElementPresent(findTestObject('Edit_Media/Edit_series_fields/uploaded_series_image'), 10)
	delete=true;
}
catch(Exception ex)
{
	delete=false;
}

if(delete)
{
	WebUI.click(findTestObject('Edit_Media/Edit_series_fields/delete_series_image_button'))
	WebUI.acceptAlert()
	WebUI.uploadFile(findTestObject('Edit_Media/Edit_series_fields/upload_series_image'), imagePath)
	WebUI.delay(5)
}

else
{
	WebUI.uploadFile(findTestObject('Edit_Media/Edit_series_fields/upload_series_image'), imagePath)
	WebUI.delay(5)
}


WebUI.click(findTestObject('Edit_Media/Edit_series_fields/Save_series_button'))
WebUI.delay(10)
WebUI.verifyTextPresent('Series Information Updated.', true, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Edit_Media/Buttons/submit_button'))
WebUI.waitForElementPresent(findTestObject('Edit_Media/Edit_audio_fields/series'), 10)

WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/first_media_link'))
WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 10)


//Assertion
WebUI.verifyElementPresent(findTestObject('Edit_Media/Edit_series_fields/uploaded_series_image'), 10)

