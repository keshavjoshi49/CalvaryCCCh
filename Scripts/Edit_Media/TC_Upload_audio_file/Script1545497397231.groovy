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


WebUI.click(findTestObject('Edit_Media/Edit_media_fields/first_media_link'))

WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 40)

a=WebUI.verifyElementPresent(findTestObject('Edit_Media/Edit_media_fields/upload_audio_button'),5)
println(a)


//if (WebUI.verifyElementPresent(findTestObject('Edit_Media/Edit_media_fields/upload_audio_button'),FailureHandling.OPTIONAL))
//{
//	WebUI.click(findTestObject('Edit_Media/Edit_media_fields/upload_audio_button'))
//	WebUI.uploadFile(findTestObject('Edit_Media/Edit_media_fields/upload_audio_file'), 'C:\\\\Users\\\\NITISH\\Desktop\\\\dummy\\\\Cuppy_Cake_Song.mp3')
//	WebUI.delay(5)
//	WebUI.verifyTextPresent('Upload Complete', true, FailureHandling.STOP_ON_FAILURE)
//	WebUI.click(findTestObject('Edit_Media/Edit_media_fields/upload_close_button'))
//	println("link present")
//	
//}
//else
//{
//	WebUI.click(findTestObject('Edit_Media/Edit_media_fields/Delete_audio_link'))
//	WebUI.acceptAlert()
//	WebUI.delay(10)
//}

//+++++++++++++++++++++++++++++++++
//WebUI.click(findTestObject('Edit_Media/Edit_media_fields/Delete_audio_link'))
//WebUI.acceptAlert()
//WebUI.delay(10)
//WebUI.click(findTestObject('Edit_Media/Edit_media_fields/upload_audio_button'))
//
//WebUI.uploadFile(findTestObject('Edit_Media/Edit_media_fields/upload_audio_file'), 'C:\\\\Users\\\\NITISH\\Desktop\\\\dummy\\\\Cuppy_Cake_Song.mp3')
//WebUI.delay(5)
//WebUI.verifyTextPresent('Upload Complete', true, FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Edit_Media/Edit_media_fields/upload_close_button'))
//println("link present")
//WebUI.click(findTestObject('Edit_Media/Buttons/submit_button'))




//WebUI.click(findTestObject('Edit_Media/Edit_media_fields/vimeo_radio_button'))
//WebUI.click(findTestObject('Edit_Media/Edit_media_fields/vimeo_clear_button'))
//WebUI.setText(findTestObject('Edit_Media/Edit_media_fields/vimeo_input_field'), vimeoUrl)
//println(vimeoUrl)
//WebUI.click(findTestObject('Edit_Media/Buttons/submit_button'))
//WebUI.waitForElementPresent(findTestObject('Edit_Media/Edit_media_fields/title'), 10)
//
//WebUI.click(findTestObject('Edit_Media/Edit_media_fields/first_media_link'))
//WebUI.switchToWindowTitle('CCCH - Media Center Administration')
//WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 40)
//
//uvimeo=WebUI.getAttribute(findTestObject('Edit_Media/Edit_media_fields/vimeo_input_field'), 'value')
//println(uvimeo)
//WebUI.verifyMatch(vimeoUrl, uvimeo, false)
//println("pass")
