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
import groovy.time.TimeCategory
import java.text.DateFormat
import java.util.Date

//This test case check that the editing of date field.
//Edit the media that is on the top.
WebUI.click(findTestObject('Edit_Media/Edit_audio_fields/first_media_link'))
WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 10)

//Get the current month and update the different month
month = WebUI.getAttribute(findTestObject('Edit_Media/Edit_audio_fields/Month'), 'value')
if (month=='12')
{
	WebUI.setText(findTestObject('Edit_Media/Edit_audio_fields/Month'),'10')
}
else
{
	WebUI.setText(findTestObject('Edit_Media/Edit_audio_fields/Month'),'12')
}
//Get updated month,day and year and create a date and then submit the form.
umonth = WebUI.getAttribute(findTestObject('Edit_Media/Edit_audio_fields/Month'), 'value')
day = WebUI.getAttribute(findTestObject('Edit_Media/Edit_audio_fields/Day'), 'value')
year = WebUI.getAttribute(findTestObject('Edit_Media/Edit_audio_fields/Year'), 'value')
date=WebUI.concatenate(umonth,'/',day,'/',year)
println(date)
WebUI.click(findTestObject('Edit_Media/Buttons/submit_button'))
WebUI.waitForElementPresent(findTestObject('Edit_Media/date'), 10)

//Get the date on the listing page and compare it with previous date.
udate = WebUI.getText(findTestObject('Edit_Media/date'))
println(udate)
//Assertion
WebUI.verifyMatch(udate,date, false)


