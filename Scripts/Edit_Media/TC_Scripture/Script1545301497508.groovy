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

WebUI.click(findTestObject('Edit_Media/Edit_media_fields/first_media_link'))

WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 40)

cscripture = WebUI.getAttribute(findTestObject('Edit_Media/Edit_media_fields/book'), 'value')
println (cscripture)

if (cscripture=='1')

WebUI.selectOptionByValue(findTestObject('Edit_Media/Edit_media_fields/book'),'2', false)

else
WebUI.selectOptionByValue(findTestObject('Edit_Media/Edit_media_fields/book'),'1', false)


uscripture = WebUI.getAttribute(findTestObject('Edit_Media/Edit_media_fields/book'), 'value')
println (uscripture)
WebUI.click(findTestObject('Edit_Media/Buttons/submit_button'))
WebUI.waitForElementPresent(findTestObject('Edit_Media/Edit_media_fields/speaker'), 10)
WebUI.click(findTestObject('Edit_Media/Edit_media_fields/first_media_link'))

WebUI.switchToWindowTitle('CCCH - Media Center Administration')
WebUI.waitForElementPresent(findTestObject('Edit_Media/Buttons/disable_button'), 40)
uscripture1 = WebUI.getAttribute(findTestObject('Edit_Media/Edit_media_fields/book'), 'value')

WebUI.verifyMatch(uscripture, uscripture1, false)
println("pass")
