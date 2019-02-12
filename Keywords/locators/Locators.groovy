package locators

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


class Locators {

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
	static def home_speaker(){findTestObject('Edit_Media/Edit_audio_fields/speaker')}

	//Edit Media Page
	static def edit_media_submit_button(){findTestObject('Edit_Media/Buttons/submit_button')}
	static def edit_media_cancel_button(){findTestObject('Edit_Media/Buttons/cancel_button')}
	static def edit_media_delete_button(){findTestObject('Edit_Media/Buttons/delete_button')}
	static def edit_media_disable_button(){findTestObject('Edit_Media/Buttons/disable_button')}
	static def edit_media_enable_button(){findTestObject('Edit_Media/Buttons/enable_button')}
	static def edit_media_save_series_button(){findTestObject('Edit_Media/Edit_series_fields/Save_series_button')}
	static def edit_media_save_series_text(){'Series Information Updated.'}
	static def edit_media_month(){findTestObject('Edit_Media/Edit_audio_fields/Month')}
	static def edit_media_day(){findTestObject('Edit_Media/Edit_audio_fields/Day')}
	static def edit_media_year(){findTestObject('Edit_Media/Edit_audio_fields/Year')}
	static def edit_media_description(){findTestObject('Edit_Media/Edit_audio_fields/description')}
	static def edit_media_keywords(){findTestObject('Edit_Media/Edit_audio_fields/keywords')}
	static def edit_media_scripture(){findTestObject('Edit_Media/Edit_audio_fields/book')}
	static def edit_media_series_drop_down(){findTestObject('Edit_Media/Edit_audio_fields/series_drop_down')}
	static edit_media_series_drop_down_value="zzznew"
	static def edit_media_series_input_field(){findTestObject('Edit_Media/Edit_audio_fields/series_input_field')}
	static def edit_media_series(){findTestObject('Edit_Media/Edit_audio_fields/series')}
	static def edit_media_speaker_drop_down(){findTestObject('Edit_Media/Edit_audio_fields/speaker_drop_down')}
	static edit_media_speaker_drop_down_value="zzznew"
	static def edit_media_speaker_input_field(){findTestObject('Edit_Media/Edit_audio_fields/speaker_input_field')}
	static def edit_media_title_input_field(){findTestObject('Edit_Media/Edit_audio_fields/title_input_field')}
	static def edit_media_vimeo_radio_button(){findTestObject('Edit_Media/Edit_audio_fields/vimeo_radio_button')}
	static def edit_media_vimeo_clear_button(){findTestObject('Edit_Media/Edit_audio_fields/vimeo_clear_button')}
	static def edit_media_vimeo_input_field(){findTestObject('Edit_Media/Edit_audio_fields/vimeo_input_field')}

	static def edit_media_youtube_radio_button(){findTestObject('Edit_Media/Edit_audio_fields/youtube_radio_button')}
	static def edit_media_youtube_clear_button(){findTestObject('Edit_Media/Edit_audio_fields/youtube_clear_button')}
	static def edit_media_youtube_input_field(){findTestObject('Edit_Media/Edit_audio_fields/youtube_input_field')}


	static def edit_media_delete_audio_link(){findTestObject('Edit_Media/Edit_audio_fields/Delete_audio_link')}
	static def edit_media_upload_audio_button(){findTestObject('Edit_Media/Edit_audio_fields/upload_audio_button')}
	static def edit_media_upload_audio_file(){findTestObject('Edit_Media/Edit_audio_fields/upload_audio_file')}
	static def edit_media_upload_close_button(){findTestObject('Edit_Media/Edit_audio_fields/upload_close_button')}

	//Edit series information
	static def edit_media_upload_series_image(){findTestObject('Edit_Media/Edit_series_fields/upload_series_image')}
	static def edit_media_uploaded_series_image(){findTestObject('Edit_Media/Edit_series_fields/uploaded_series_image')}
	static def edit_media_delete_series_image_button(){findTestObject('Edit_Media/Edit_series_fields/delete_series_image_button')}
	static def edit_media_delete_series_button_No_display(){findTestObject('Edit_Media/Edit_series_fields/delete_series_image_button_No_display')}
	static def edit_media_series_description(){findTestObject('Edit_Media/Edit_series_fields/series_description')}

	//input fields
	static def edit_media_title_field(){findTestObject('Edit_Media/Edit_audio_fields/title_input_field')}
}



