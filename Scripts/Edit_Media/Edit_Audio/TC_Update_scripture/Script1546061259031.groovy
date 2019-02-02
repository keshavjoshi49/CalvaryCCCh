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
//This test case check that the editing of scripture field.
CustomKeywords.'basePages.BasePage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.MediaCenterPageSub.clickOnMedia'()


//Get the current scripture and update the different scripture
cscripture = WebUI.getAttribute(elements.edit_media_scripture(), 'value')

if (cscripture=='1')
{
	WebUI.selectOptionByValue(elements.edit_media_scripture(),'2', false)
}
else
{
	WebUI.selectOptionByValue(elements.edit_media_scripture(),'1', false)
}

//Get the updated scripture value and submit the form
uscripture = WebUI.getAttribute(elements.edit_media_scripture(), 'value')

//Submit the form
CustomKeywords.'calvaryCCH.pages.EditMediaCenterSub.submitForm'()

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.MediaCenterPageSub.clickOnMedia'()

uscripture1 = WebUI.getAttribute(elements.edit_media_scripture(), 'value')

//Assertion
WebUI.verifyMatch(uscripture, uscripture1, false)
