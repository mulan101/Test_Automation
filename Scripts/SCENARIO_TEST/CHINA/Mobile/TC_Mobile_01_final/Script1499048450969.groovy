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

'iPhone 6 diplay size'
WebUI.setViewPortSize(360, 650)

WebUI.navigateToUrl('http://www.samsung.com/cn/')

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/01. button_s-svg s-gnb-toggler'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/02. a_'))

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/03. a_Premium UHD TV'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/04. button_results'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/05. button_type'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/06. p_Premium UHD TV'))

WebUI.takeScreenshot()

'[\uD55C\uCC28\uC7A5\uB2D8] \uC790\uC8FC \uC624\uB958 \uBC1C\uC0DD / recording \uD560 \uB54C \uC624\uB958\uAC00 \uBC1C\uC0DD\uD558\uC5EC chrome \uAC1C\uBC1C\uC790 \uBAA8\uB4DC\uC5D0\uC11C Xpath \uC218\uC815\uD568\r\n'
WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/07. button_ results_02'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/08. select'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/08. select'), 'mostclicked', true)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/09-02.div_product-card'), 5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/09. button_buy_02'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/10. span_s-svg s-ico-search'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/11. input_gnb_search'), 'smart tv')

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/12. button_s-svg s-ico-search'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/13. select_sortBy'), 'date_ascending', true)

WebUI.takeScreenshot()

'[\uD55C\uCC28\uC7A5\uB2D8] \uBB34\uC2A8 \uC624\uB958\uC778\uC9C0 \uC9C8\uBB38'
WebUI.verifyImagePresent(findTestObject('SCENARIO_TEST/CHINA/Mobile_01/14. _checking_img'), 2)

'\uD14C\uC2A4\uD2B8 \uC885\uB8CC \uC804 \uB9C8\uC9C0\uB9C9 \uD654\uBA74\uC744 \uC704\uD55C \uC2DC\uAC04 5\uCD08'
WebUI.delay(5)

WebUI.closeBrowser()

