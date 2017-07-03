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

WebUI.navigateToUrl('https://shop.samsung.com/uk/')

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/01. a_Sign In'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/02.input_svcIptLgnID'), '1234')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/03. input_svcIptLgnPD'), '1234')

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/04. a_SIGN IN (1)'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/05. input_OmC2zwskBCbPKBUinputUser'), 'sang-mook.kim@kr.ey.com')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/06. input_OmC2zwskBCbPKBUinputPass'), 'test!test2')

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/07. input_btnSignIn'))

WebUI.takeScreenshot()

WebUI.mouseOver(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/08. a_shop'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/09. a_Wearables'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/10. a_Above 225'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/11. a_150 - 225'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/12. i_listing__filters-swatch list'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/13. button_Add to basket'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/14. a_Proceed to Checkout'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/16. input_voucher_code'), '1111')

WebUI.takeScreenshot()

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.takeScreenshot()

'\uBC18\uC751\uC18D\uB3C4\uAC00 \uB290\uB9AC\uBBC0\uB85C delay \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/15. li_basket__prod-qty-plus js-ba'))

WebUI.takeScreenshot()

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/17. input_pm'))

WebUI.takeScreenshot()

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/PC/18. button_Checkout'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

