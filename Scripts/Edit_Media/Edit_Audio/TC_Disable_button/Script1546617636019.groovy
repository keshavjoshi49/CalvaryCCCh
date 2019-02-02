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
import locators.Locators

import org.openqa.selenium.Keys as Keys

import calvaryCCH.workflows.LoginPageWorkflow as login
import calvaryCCH.workflows.editMediaCenterPageWorkflow as emcp
import calvaryCCH.workflows.mediaCenterPageWorkflow as mcp
//This test case check that the editing of audio description field.

//Launch application
login.openUrl(url)

//Pass different username and passwords
login.loginToApplication(username, password)

//Click on the first media:
mcp.mcpOpenFirstMedia()

//click on disable button
emcp.emcpDisableForm()

//boolean disable
//try {
//		WebUI.verifyElementPresent(elements.edit_media_disable_button(), 10)
//		disable=true;
//	} 
//catch (Exception e) 
//{
//	disable=false;
//}
//
//if(disable)
//{
//	//Click on disable button
//	CustomKeywords.'calvaryCCH.pages.EditMediaCenterSub.disableForm'()
//}
//else
//{
//	//Click on enable button
//	CustomKeywords.'calvaryCCH.pages.EditMediaCenterSub.enableForm'()
//	CustomKeywords.'calvaryCCH.pages.MediaCenterPageSub.clickOnMedia'()
//	CustomKeywords.'calvaryCCH.pages.EditMediaCenterSub.disableForm'()
//}
////Click on the first media:
//CustomKeywords.'calvaryCCH.pages.MediaCenterPageSub.clickOnMedia'()
//Assertion
//Println("complete")
mcp.mcpOpenFirstMedia()
WebUI.verifyElementPresent(Locators.edit_media_enable_button(), 10)

