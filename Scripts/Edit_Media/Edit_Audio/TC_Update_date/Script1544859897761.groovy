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

import basePages.BasePage
import internal.GlobalVariable as GlobalVariable
import groovy.time.TimeCategory
import java.text.DateFormat
import java.util.Date
import java.text.SimpleDateFormat;
import java.util.Date;
import locators.Locators
import calvaryCCH.workflows.LoginPageWorkflow as login
import calvaryCCH.workflows.editMediaCenterPageWorkflow as emcp
import calvaryCCH.workflows.mediaCenterPageWorkflow as mcp
//This test case check that the editing of date field.


login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Click on the first media:
mcp.mcpOpenFirstMedia()


//Get the current month and update the different month
month = WebUI.getAttribute(Locators.edit_media_month(), 'value')
//WebUI.getAttribute(findTestObject(month))
println (month)
if (month=='12')
{
	//WebUI.selectOptionByValue(Locators.edit_media_month(), '10', false)
	BasePage.dropDownSelect(Locators.edit_media_month(), '10')
}
else
{
	BasePage.dropDownSelect(Locators.edit_media_month(), '12')
}
//Get updated month,day and year and create a date and then submit the form.
umonth = WebUI.getAttribute(Locators.edit_media_month(), 'value')
println (umonth)
day = WebUI.getAttribute(Locators.edit_media_day(), 'value')
year = WebUI.getAttribute(Locators.edit_media_year(), 'value')
date=WebUI.concatenate(umonth,'/',day,'/',year)
println(date)
emcp.emcpSubmitForm()


//Get the date on the listing page and compare it with previous date.
udate = WebUI.getText(Locators.home_date())

println(udate)
//Assertion
WebUI.verifyMatch(udate,date, false)


