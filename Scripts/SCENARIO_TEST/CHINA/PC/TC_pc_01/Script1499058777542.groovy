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

WebUI.navigateToUrl('http://www.samsung.com/cn/')

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/01. a_HELP'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/CHINA/PC/02. input_searchItem3'), '\u6D17\u8863\u673A')

WebUI.takeScreenshot()

'[\uD55C\uCC28\uC7A5\uB2D8] \uC2A4\uD06C\uB9BD\uD2B8 \uC624\uB958 \uC6D0\uC778 \uC9C8\uBB38\uD558\uAE30'
WebUI.sendKeys(findTestObject('SCENARIO_TEST/CHINA/PC/02. input_searchItem3'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/03. interactive guide'))

WebUI.verifyImagePresent(findTestObject('SCENARIO_TEST/CHINA/PC/04. a_classification'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/04. a_classification'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/05. highest rating'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/span_ (1)'))

WebUI.takeScreenshot()

WebUI.switchToWindowTitle('\u89C4\u683C | \u4E09\u661F\u6CE2\u8F6E\u6D17\u8863\u673A XQB60-K75S/XSC')

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/a_ Top 5'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/06. a_ (3)'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/input_point'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/input_resolution'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/a_btn-reg btn-submit'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/a_Copy URL'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/PC/a_Close'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

