import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://www.samsung.com/sa/')

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/01.span_s-svg s-ico-search'))

WebUI.setText(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/02.input_gnb_search'), 'TV')

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0 \uB300\uAE30\uB97C \uC704\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.takeScreenshot()
 
WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/03.a_ led tv'))

'text \uBE44\uAD50\uB97C \uC704\uD574 \uC870\uAC74 \uCD94\uAC00'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/04.span_5'), 2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/05.a_'))

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/06.span_Recommended'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0 \uB300\uAE30\uB97C \uC704\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD574 \uC870\uAC74\uCD94\uAC00, css \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815'
WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/07.span_filter-sort__inp-checkbox'))

WebUI.waitForJQueryLoad(10)

'text \uBE44\uAD50\uB97C \uC704\uD574 \uC870\uAC74 \uCD94\uAC00'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/08.li_4049'), 2)

'text \uBE44\uAD50\uB97C \uC704\uD574 \uC870\uAC74 \uCD94\uAC00'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/09.li_LED TV'), 2)

WebUI.takeScreenshot()

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD574 \uC870\uAC74\uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/10.p_43 Full HD Flat Smart TV J55'))

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD574 \uC870\uAC74\uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/11.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0 \uB300\uAE30\uB97C \uC704\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

'text \uBE44\uAD50\uB97C \uC704\uD574 \uC870\uAC74 \uCD94\uAC00'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/12.h1_50 Full HD Flat Smart TV J5'), 2)

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/13.img'), findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/14.img'))

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/14.img'), findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/15.img'))

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/15.img'), findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/16.img'))

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/16.img'), findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/17.img'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/19.a_'))

'text \uBE44\uAD50\uB97C \uC704\uD574 \uC870\uAC74 \uCD94\uAC00'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/20.span_'), 2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/21.a_'))

'text \uBE44\uAD50\uB97C \uC704\uD574 \uC870\uAC74 \uCD94\uAC00'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/PC/22.h2_'), 2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

