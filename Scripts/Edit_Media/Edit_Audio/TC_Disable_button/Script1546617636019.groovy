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

//This test case check that the editing of audio description field.

CustomKeywords.'calvaryCCH.pages.LoginPage.lauchApplication'(url)

//Pass username and passwords
CustomKeywords.'calvaryCCH.pages.LoginPage.loginToApplication'(username, password)

//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()
boolean disable
try {
		WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 10)
		disable=true;
	} 
catch (Exception e) 
{
	disable=false;
}

if(disable)
{
	//Click on disable button
	CustomKeywords.'calvaryCCH.pages.editMediaCenter.disableForm'()
}
else
{
	//Click on enable button
	CustomKeywords.'calvaryCCH.pages.editMediaCenter.enableForm'()
	CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()
	CustomKeywords.'calvaryCCH.pages.editMediaCenter.disableForm'()
}
//Click on the first media:
CustomKeywords.'calvaryCCH.pages.mediaCenterPage.clickOnMedia'()
//Assertion
WebUI.verifyElementPresent(findTestObject('Edit_Media/Buttons/enable_button'), 10)
