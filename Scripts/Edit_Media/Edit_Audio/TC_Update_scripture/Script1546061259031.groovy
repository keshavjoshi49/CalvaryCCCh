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
import locators.Locators
import calvaryCCH.workflows.LoginPageWorkflow as login
import calvaryCCH.workflows.editMediaCenterPageWorkflow as emcp
import calvaryCCH.workflows.mediaCenterPageWorkflow as mcp
//This test case check that the editing of scripture field.
login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Click on the first media:
mcp.mcpOpenFirstMedia()


//Get the current scripture and update the different scripture
cscripture = WebUI.getAttribute(Locators.edit_media_scripture(), 'value')

if (cscripture=='1')
{
	WebUI.selectOptionByValue(Locators.edit_media_scripture(),'2', false)
}
else
{
	WebUI.selectOptionByValue(Locators.edit_media_scripture(),'1', false)
}

//Get the updated scripture value and submit the form
uscripture = WebUI.getAttribute(Locators.edit_media_scripture(), 'value')

//Submit the form
emcp.emcpSubmitForm()

//Click on the first media:
mcp.mcpOpenFirstMedia()

uscripture1 = WebUI.getAttribute(Locators.edit_media_scripture(), 'value')

//Assertion
WebUI.verifyMatch(uscripture, uscripture1, false)
