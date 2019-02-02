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


CustomKeywords.'calvaryCCH.pages.LoginPage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.MediaCenterPageSub.clickOnMedia'()

cseries=WebUI.getAttribute(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'), 'value')
if (cseries==102)
{
	WebUI.selectOptionByValue(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'),'122', false)
}

else
{
	WebUI.selectOptionByValue(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'),'102', false)
}
useries=WebUI.getAttribute(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'), 'value')
CustomKeywords.'calvaryCCH.pages.EditMediaCenterSub.saveSeries'()
CustomKeywords.'calvaryCCH.pages.EditMediaCenterSub.submitForm'()

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.MediaCenterPageSub.clickOnMedia'()
eseries=WebUI.getAttribute(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'), 'value')
//Assertion
WebUI.verifyElementAttributeValue(findTestObject('Edit_Media/Edit_series_fields/series_drop_down'), useries, eseries, 0, FailureHandling.STOP_ON_FAILURE)

//WebUI.click(findTestObject('Edit_Media/Buttons/delete_button'))
//WebUI.acceptAlert()
//WebUI.waitForPageLoad(5);
//
//WebUI.verifyElementNotPresent(findTestObject('Edit_Media/Buttons/disable_button'), 10)
//WebUI.verifyTextPresent('Media Center Administration', true, FailureHandling.STOP_ON_FAILURE)
