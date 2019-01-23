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

import org.junit.After
import org.openqa.selenium.Keys as Keys
import locators.Locators as elements

//This test case check that the uploading a series image.
//This test case check that the editing of uploading an audio field.
CustomKeywords.'calvaryCCH.pages.LoginPage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

boolean delete;
try
{
	WebUI.verifyElementPresent(elements.edit_media_uploaded_series_image(), 10)
	delete=true;
}
catch(Exception ex)
{
	delete=false;
}

println(delete)

if (delete)
{
	WebUI.click(elements.edit_media_delete_series_image_button())
	WebUI.acceptAlert()

	

}
else
{
	//CustomKeywords.'basePages.BasePage.uploadFile'('Edit_Media/Edit_series_fields/upload_series_image', imagePath)
	CustomKeywords.'calvaryCCH.pages.editMediaCenter.uploadFile'(imagePath)
	//Save the series
	CustomKeywords.'calvaryCCH.pages.editMediaCenter.saveSeries'()
	//Delete the uploaded image
	WebUI.click(elements.edit_media_delete_series_image_button())
	WebUI.acceptAlert()
}
//Save the series
CustomKeywords.'calvaryCCH.pages.editMediaCenter.saveSeries'()
//Submit the form
CustomKeywords.'calvaryCCH.pages.editMediaCenter.submitForm'()
//Again open the same first media
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

//Assertion
WebUI.verifyElementNotPresent(elements.edit_media_uploaded_series_image(), 10)

