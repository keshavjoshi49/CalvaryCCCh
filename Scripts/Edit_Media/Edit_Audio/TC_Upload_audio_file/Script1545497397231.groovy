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
//This test case check that the editing of uploading an audio field.
login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Click on the first media:
mcp.mcpOpenFirstMedia()

//Check if already an audio is uploaded
b=WebUI.getText(Locators.edit_media_delete_audio_link())

// If audio is already uploaded then delete the audio
if (b=='Delete')
{
	WebUI.click(Locators.edit_media_delete_audio_link())
	WebUI.acceptAlert()
	//WebUI.delay(10)
	
	WebUI.click(Locators.edit_media_upload_audio_button())
	
	WebUI.uploadFile(Locators.edit_media_upload_audio_file(), audioPath)
	//CustomKeywords.'calvaryCCH.pages.EditMediaCenterSub.uploadFile'(audioPath)
	WebUI.delay(15)
	WebUI.verifyTextPresent('Upload Complete', true, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(Locators.edit_media_upload_close_button())
	//println("link present")
     
}
//If audio is not uploaded then upload a new file.
else
{
	WebUI.click(Locators.edit_media_upload_audio_button())
	WebUI.uploadFile(Locators.edit_media_upload_audio_file(), audioPath)
	//emcp.emcpUploadFile(audioPath)
	//CustomKeywords.'calvaryCCH.pages.EditMediaCenterSub.uploadFile'(audioPath)
	WebUI.delay(15)
	WebUI.verifyTextPresent('Upload Complete', true, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(Locators.edit_media_upload_close_button())
	
}
WebUI.delay(5)

//Submit the form
emcp.emcpSubmitForm()

//Click on the first media:
mcp.mcpOpenFirstMedia()

//Assertion
WebUI.verifyElementText(Locators.edit_media_delete_audio_link(), 'Delete')

