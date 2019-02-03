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
import org.stringtemplate.v4.compiler.STParser.element_return

import locators.Locators
import calvaryCCH.workflows.LoginPageWorkflow as login
import calvaryCCH.workflows.editMediaCenterPageWorkflow as emcp
import calvaryCCH.workflows.mediaCenterPageWorkflow as mcp

//This test case check that the editing of audio series field.
login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Click on the first media:
mcp.mcpOpenFirstMedia()

// Add a new series and save the series name and submit the form
//CustomKeywords.'basePages.BasePage.selectValueInDropDown'('Edit_Media/Edit_audio_fields/series_drop_down', 'zzznew')
CustomKeywords.'basePages.BasePage.selectValueInDropDown'()

WebUI.waitForElementPresent(Locators.edit_media_series_input_field(), 10)
WebUI.setText(Locators.edit_media_series_input_field(),seriesText)
cseries=WebUI.getAttribute(Locators.edit_media_series_input_field(), 'value')

//Submit the form
emcp.emcpSubmitForm()

//Assertion
WebUI.verifyElementText(Locators.edit_media_series(), cseries)

