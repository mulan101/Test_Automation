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

WebUI.setViewPortSize(800, 1028)

WebUI.navigateToUrl('http://www.samsung.com/sec/')

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/01.button_s-svg s-gnb-toggler'))

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/02.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/03.a_'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('SCENARIO_TEST/KOREA/Moble/04.input_inputUserID'), 'mulan101@gmail.com')

WebUI.setText(findTestObject('SCENARIO_TEST/KOREA/Moble/05.input_inputPassword'), 'hanjeho101!')

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/06.input_btnSignIn'))

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/07.button_s-svg s-gnb-toggler'))

WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/Moble/08.strong_'), 2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/09.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/10.a_'))

WebUI.takeScreenshot()

'\uC2A4\uB9C8\uD2B8\uD3F0 \uC804\uCCB4 \uBCF4\uAE30 \uBC84\uD2BC \uD074\uB9AD / xpath \uC804\uCCB4 \uC218\uC815'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/03.Page_choice_mobile/10.a_smartphone_all_click'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/04.Page_choice_detail_mobile/11.span_filter-sort__arrow'))

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/12.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/13.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/14.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/15.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/16.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/17.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/18.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/19.button_submit'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00/xpath \uC804\uCCB4 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/PC/06.Page_  Samsung/20.li_ S'), 2)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00/xpath \uC804\uCCB4 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/PC/06.Page_  Samsung/21.li_SK Telecom'), 2)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00/xpath \uC804\uCCB4 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/PC/06.Page_  Samsung/22.li_KT'), 2)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00/xpath \uC804\uCCB4 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/PC/06.Page_  Samsung/23.li_130 mm  140 mm'), 2)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00/xpath \uC804\uCCB4 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/PC/06.Page_  Samsung/24.li_2560 x 1440 (Quad HD)'), 2)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00/xpath \uC804\uCCB4 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/PC/06.Page_  Samsung/25.li_3000 mAh'), 2)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00/xpath \uC804\uCCB4 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/PC/06.Page_  Samsung/26.li_1000   1500'), 2)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/06.Page_  Samsung/27.a_detail_view'))

WebUI.takeScreenshot()

'class \uACF5\uBC31 \uCD94\uAC00 / xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/07.Page_ S7   SM-G935SZDESKC  Samsung/28.a_'))

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/07.Page_ S7   SM-G935SZDESKC  Samsung/29.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

'class \uACF5\uBC31 \uCD94\uAC00 / xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/07.Page_ S7   SM-G935SZDESKC  Samsung/30.a_'))

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/07.Page_ S7   SM-G935SZDESKC  Samsung/31.span_BT_color-chip'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.waitForJQueryLoad(10)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/08.Page_SM-G935S  SM-G935STKFSKC  Sams/33.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(3)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/08.Page_SM-G935S  SM-G935STKFSKC  Sams/34.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(3)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/08.Page_SM-G935S  SM-G935STKFSKC  Sams/35.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.closeBrowser()

