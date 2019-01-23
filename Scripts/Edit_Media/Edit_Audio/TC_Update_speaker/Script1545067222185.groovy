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
import locators.Locators as elements
//This test case check that the editing of audio speaker field.
CustomKeywords.'basePages.BasePage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

//Add new speaker and save the speaker name and save the form.
WebUI.selectOptionByValue(elements.edit_media_speaker_drop_down(),elements.getEdit_media_speaker_drop_down_value(), false)
WebUI.waitForElementPresent(elements.edit_media_speaker_input_field(), 10)
WebUI.setText(elements.edit_media_speaker_input_field(),speakerText)
cspeaker=WebUI.getAttribute(elements.edit_media_speaker_input_field(),'value')


//Submit the form
CustomKeywords.'calvaryCCH.pages.editMediaCenter.submitForm'()
//Assertion
WebUI.verifyElementText(elements.home_speaker(), cspeaker)

