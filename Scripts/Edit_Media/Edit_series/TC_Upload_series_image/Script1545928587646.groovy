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

//This test case check that the uploading a series image.
login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Click on the first media:
mcp.mcpOpenFirstMedia()

//check if delete button is present
b=WebUI.getAttribute(Locators.edit_media_delete_series_image_button(), 'style')
println(b)
if (b.contains('block'))
{
	WebUI.click(Locators.edit_media_delete_series_image_button())
	WebUI.acceptAlert()
	WebUI.uploadFile(Locators.edit_media_upload_series_image(), imagePath)
	//Save the series
	emcp.emcpSaveSeries()
}
else
{
	WebUI.uploadFile(Locators.edit_media_upload_series_image(), imagePath)
	emcp.emcpSaveSeries()
	
}
//
//boolean delete;
//try
//{
//	WebUI.verifyElementPresent(findTestObject('Edit_Media/Edit_series_fields/uploaded_series_image'), 10)
//	delete=true;
//}
//catch(Exception ex)
//{
//	delete=false;
//}
//
////If already image present then delete and upload it again
//if(delete)
//{
//	WebUI.click(findTestObject('Edit_Media/Edit_series_fields/delete_series_image_button'))
//	WebUI.acceptAlert()
//	CustomKeywords.'basePages.BasePage.uploadFile'('Edit_Media/Edit_series_fields/upload_series_image', imagePath)
//}
//
//else
//{
//	CustomKeywords.'basePages.BasePage.uploadFile'('Edit_Media/Edit_series_fields/upload_series_image', imagePath)
//}

//****************************

//submit the form
emcp.emcpSubmitForm()

//Click on the first media:
mcp.mcpOpenFirstMedia()


//Assertion
WebUI.verifyElementPresent(findTestObject('Edit_Media/Edit_series_fields/uploaded_series_image'), 10)

