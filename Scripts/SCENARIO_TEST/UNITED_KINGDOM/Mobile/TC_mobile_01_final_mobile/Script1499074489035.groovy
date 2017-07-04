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
WebUI.setViewPortSize(375, 667)

WebUI.navigateToUrl('http://www.samsung.com/uk/')

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/01. button_s-svg s-gnb-toggler'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/02. a_TV  AV'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/03. a_QLED TVs'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/select'), 'rating', true)

WebUI.scrollToElement(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/04. div_product-card'), 0)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/05. a_Learn More'))

WebUI.takeScreenshot()

'\uD55C\uCC28\uC7A5\uB2D8\uAED8 \uC9C8\uBB38-rotating \uAD00\uB828_\uC774\uBBF8\uC9C0\uB294 \uC804\uD658\uB418\uB098, \uBC11\uC5D0 o\uC73C\uB85C \uD45C\uC2DC\uB41C \uBD80\uBD84\uC774 \uAC19\uC774 \uBCC0\uD558\uC9C0 \uC54A\uC74C'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/06. uk_img_01'), findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/06. uk_button_Next'))

WebUI.takeScreenshot()

WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/06. uk_img_02'), findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/06. uk_button_Next'))

WebUI.takeScreenshot()

WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/06. uk_img_03'), findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/06. uk_button_Next'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/09. span_s-svg s-ico-search'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/10. input_gnb_search'), 'smart tv')

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/11. button_s-svg s-ico-search'))

WebUI.takeScreenshot()

WebUI.selectOptionByValue(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Mobile/12. select_sortBy'), 'date_descending', true)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.closeBrowser()

