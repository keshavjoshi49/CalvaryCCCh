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


//This test case check that the uploading a series image.
CustomKeywords.'calvaryCCH.pages.LoginPage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

//check if delete button is present
boolean delete;
try
{
	WebUI.verifyElementPresent(findTestObject('Edit_Media/Edit_series_fields/uploaded_series_image'), 10)
	delete=true;
}
catch(Exception ex)
{
	delete=false;
}

//If already image present then delete and upload it again
if(delete)
{
	WebUI.click(findTestObject('Edit_Media/Edit_series_fields/delete_series_image_button'))
	WebUI.acceptAlert()
	CustomKeywords.'calvaryCCH.controls.controls.uploadFile'('Edit_Media/Edit_series_fields/upload_series_image', imagePath)
}

else
{
	CustomKeywords.'calvaryCCH.controls.controls.uploadFile'('Edit_Media/Edit_series_fields/upload_series_image', imagePath)
}
//Save the series 
CustomKeywords.'calvaryCCH.pages.editMediaCenter.saveSeries'()
//submit the form
CustomKeywords.'calvaryCCH.pages.editMediaCenter.submitForm'()

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()


//Assertion
WebUI.verifyElementPresent(findTestObject('Edit_Media/Edit_series_fields/uploaded_series_image'), 10)

