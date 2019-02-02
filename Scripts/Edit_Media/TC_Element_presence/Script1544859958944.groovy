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
import locators.Locators as elements
//This test case check that all the buttons and fields are present in the edit mode.

//Launch application


//Launch application
CustomKeywords.'basePages.BasePage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.MediaCenterPageSub.clickOnMedia'()

//Assertions
WebUI.verifyTextPresent('Media Center Administration', true, FailureHandling.STOP_ON_FAILURE)
//Vereify the presence of all the buttons on the page
//1. Disable button
//WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 0, FailureHandling.STOP_ON_FAILURE)

//2. Submit button
WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/submit_button'), 0, FailureHandling.STOP_ON_FAILURE)

//3. Cancel button
WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/cancel_button'), 0, FailureHandling.STOP_ON_FAILURE)

//4. Delete button
WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/delete_button'), 0, FailureHandling.STOP_ON_FAILURE)

//5. Clear vimeo button
WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/clear_vimeo_url'), 0, FailureHandling.STOP_ON_FAILURE)

//6. Clear youtube button
WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/clear_youtube_url'), 0, FailureHandling.STOP_ON_FAILURE)

//7. Upload file button
//WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/upload_file_button'), 0, FailureHandling.STOP_ON_FAILURE)

//8. Save series information button
WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/save_series_info_button'), 0, FailureHandling.STOP_ON_FAILURE)
