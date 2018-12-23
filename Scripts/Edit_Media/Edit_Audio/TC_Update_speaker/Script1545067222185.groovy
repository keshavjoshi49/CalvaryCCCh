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

//This test case check that the editing of audio speaker field.
//Edit the media that is on the top.
WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/first_media_link'))
WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 10)

//Add new speaker and save the speaker name and save the form.
WebUI.selectOptionByValue(findTestObject('Edit_Media/Edit_audio_fields/speaker_drop_down'),'zzznew', false)
WebUI.waitForElementPresent(findTestObject('Edit_Media/Edit_audio_fields/speaker_input_field'), 10)
WebUI.setText(findTestObject('Edit_Media/Edit_audio_fields/speaker_input_field'),speakerText)
cspeaker=WebUI.getAttribute(findTestObject('Edit_Media/Edit_audio_fields/speaker_input_field'),'value')
println (cspeaker)
WebUI.click(findTestObject('Edit_Media/Buttons/submit_button'))
WebUI.waitForElementPresent(findTestObject('Edit_Media/Edit_audio_fields/speaker'), 10)

//Assertion
WebUI.verifyElementText(findTestObject('Edit_Media/Edit_audio_fields/speaker'), cspeaker)
println("pass")
