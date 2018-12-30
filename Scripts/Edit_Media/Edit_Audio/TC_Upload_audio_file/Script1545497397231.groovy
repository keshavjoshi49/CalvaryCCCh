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

//This test case check that the editing of uploading an audio field.
CustomKeywords.'calvaryCCH.pages.LoginPage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

//Check if already an audio is uploaded
b=WebUI.getText(findTestObject('Edit_Media/Edit_audio_fields/Delete_audio_link'))
println(b)

// If audio is already uploaded then delete the audio
if (b=='Delete')
{
	WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/Delete_audio_link'))
	WebUI.acceptAlert()
	//WebUI.delay(10)
	
	WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/upload_audio_button'))
	WebUI.uploadFile(findTestObject('Edit_Media/Edit_audio_fields/upload_audio_file'), 'C:\\\\Users\\\\NITISH\\Desktop\\\\dummy\\\\Cuppy_Cake_Song.mp3')
	WebUI.delay(5)
	WebUI.verifyTextPresent('Upload Complete', true, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/upload_close_button'))
	println("link present")

        
}
//If audio is not uploaded then upload a new file.
else
{
	WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/upload_audio_button'))
	WebUI.uploadFile(findTestObject('Edit_Media/Edit_audio_fields/upload_audio_file'), 'C:\\\\Users\\\\NITISH\\Desktop\\\\dummy\\\\Cuppy_Cake_Song.mp3')
	WebUI.delay(10)
	WebUI.verifyTextPresent('Upload Complete', true, FailureHandling.STOP_ON_FAILURE)
	WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/upload_close_button'))
	println("link present")
}
WebUI.delay(5)

//Submit the form
CustomKeywords.'calvaryCCH.pages.editMediaCenter.submitForm'()

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

//Assertion
WebUI.verifyElementText(findTestObject('Edit_Media/Edit_audio_fields/Delete_audio_link'), 'Delete')


