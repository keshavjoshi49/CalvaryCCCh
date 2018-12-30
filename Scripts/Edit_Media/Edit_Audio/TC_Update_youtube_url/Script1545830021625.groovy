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

//This test case check that the editing of audio Youtube url field.
CustomKeywords.'calvaryCCH.pages.LoginPage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

//Select vimeo check box and add a new vimeo url and save the form.
WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/youtube_radio_button'))
WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/youtube_clear_button'))
WebUI.setText(findTestObject('Edit_Media/Edit_audio_fields/youtube_input_field'), youtubeUrl)
//Submit the form
CustomKeywords.'calvaryCCH.pages.editMediaCenter.submitForm'()

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

uyoutube=WebUI.getAttribute(findTestObject('Edit_Media/Edit_audio_fields/youtube_input_field'), 'value')
println(uyoutube)

//Assertion
WebUI.verifyMatch(youtubeUrl, uyoutube, false)
