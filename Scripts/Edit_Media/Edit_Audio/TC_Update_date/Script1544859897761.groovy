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
import calvaryCCH.elements.PageElements as elements
import java.text.SimpleDateFormat;
import java.util.Date;
import locators.Locators as elements
//This test case check that the editing of date field.


CustomKeywords.'calvaryCCH.pages.LoginPage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()

//Get the current month and update the different month
month = WebUI.getAttribute(elements.edit_media_month(), 'value')
if (month=='12')
{
	WebUI.setText(elements.edit_media_month(),'10')
	
}
else
{
	WebUI.setText(elements.edit_media_month(),'12')
}
//Get updated month,day and year and create a date and then submit the form.
umonth = WebUI.getAttribute(elements.edit_media_month(), 'value')
day = WebUI.getAttribute(elements.edit_media_day(), 'value')
year = WebUI.getAttribute(elements.edit_media_year(), 'value')
date=WebUI.concatenate(umonth,'/',day,'/',year)
println(date)
Date date1=new SimpleDateFormat("dd/M/yyyy").parse(date)
println (date1)
//Submit the form
CustomKeywords.'calvaryCCH.pages.editMediaCenter.submitForm'()


//Get the date on the listing page and compare it with previous date.
udate = WebUI.getText(elements.home_date())

println(udate)
//Assertion
WebUI.verifyMatch(udate,date, false)


