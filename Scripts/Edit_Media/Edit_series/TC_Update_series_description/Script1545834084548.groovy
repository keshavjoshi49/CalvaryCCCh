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

import locators.Locators
import calvaryCCH.workflows.LoginPageWorkflow as login
import calvaryCCH.workflows.editMediaCenterPageWorkflow as emcp
import calvaryCCH.workflows.mediaCenterPageWorkflow as mcp

login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Click on the first media:
mcp.mcpOpenFirstMedia()

emcp.emcpUpdateSeriesDesc(series_desc)

//Click on the first media:
mcp.mcpOpenFirstMedia()

useries_desc=WebUI.getText(findTestObject('Edit_Media/Edit_series_fields/series_description'))

//Assertion
WebUI.verifyMatch(useries_desc, series_desc, false)

