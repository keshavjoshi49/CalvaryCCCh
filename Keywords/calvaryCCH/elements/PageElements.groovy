package calvaryCCH.elements

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


class PageElements {
	//Login Page
	static def login_name(){findTestObject('Login/username')}
	static def login_password(){findTestObject('Login/password')}
	static def login_submit_button(){findTestObject('Login/input')}
	static def login_invalid_creds_text(){'Invalid username or password'}

	//Home Page
	static def home_logout_link(){findTestObject('Login/logout')}
	static def home_first_media_link(){findTestObject('Edit_Media/Edit_audio_fields/first_media_link')}
	static def home_switch_title_text(){'CCCH - Media Center Administration'}
	static def home_date(){findTestObject('Edit_Media/date')}
	static def home_admin_menue_text_link(){'Media Admin Menu'}
	static def home_title(){findTestObject('Edit_Media/Edit_audio_fields/title')}

	//Edit Media Page
	static def edit_media_submit_button(){findTestObject('Edit_Media/Buttons/submit_button')}
	static def edit_media_cancel_button(){findTestObject('Edit_Media/Buttons/cancel_button')}
	static def edit_media_delete_button(){findTestObject('Edit_Media/Buttons/delete_button')}
	static def edit_media_disable_button(){findTestObject('Edit_Media/Buttons/disable_button')}
	static def edit_media_enable_button(){findTestObject('Edit_Media/Buttons/enable_button')}
	static def edit_media_save_series_button(){findTestObject('Edit_Media/Edit_series_fields/Save_series_button')}
	static def edit_media_save_series_text(){'Series Information Updated.'}
	//input fields
	static def edit_media_title_field(){findTestObject('Edit_Media/Edit_audio_fields/title_input_field')}
}

