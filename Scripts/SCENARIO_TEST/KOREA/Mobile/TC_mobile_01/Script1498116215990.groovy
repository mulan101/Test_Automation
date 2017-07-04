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

WebUI.setViewPortSize(360, 650)

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

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/11.a_'))

WebUI.takeScreenshot()

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/12.button_filter-sort__head-title'))

WebUI.waitForJQueryLoad(10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/13.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/14.span_filter-sort__inp-checkbox'))

WebUI.waitForJQueryLoad(10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/15.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/16.span_filter-sort__inp-checkbox'))

WebUI.waitForJQueryLoad(10)

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/17.span_filter-sort__inp-checkbox'))

WebUI.waitForJQueryLoad(10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/18.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/19.span_filter-sort__inp-checkbox'))

WebUI.waitForJQueryLoad(10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/20.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/21.span_filter-sort__inp-checkbox'))

WebUI.waitForJQueryLoad(10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/22.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/23.span_filter-sort__inp-checkbox'))

WebUI.waitForJQueryLoad(10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/24.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC CSS \uBCC0\uACBD\uC5D0 \uB530\uB978 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/25.span_filter-sort__inp-checkbox'))

WebUI.waitForJQueryLoad(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/26.button_'))

WebUI.waitForJQueryLoad(10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00, \uC2A4\uD06C\uB864 \uC6C0\uC9C1\uC784\uC5D0 \uB530\uB978 class \uBCC0\uACBD\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/Moble/27.li_ S'), 2)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00, \uC2A4\uD06C\uB864 \uC6C0\uC9C1\uC784\uC5D0 \uB530\uB978 class \uBCC0\uACBD\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/Moble/28.li_SK Telecom'), 2)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00, \uC2A4\uD06C\uB864 \uC6C0\uC9C1\uC784\uC5D0 \uB530\uB978 class \uBCC0\uACBD\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/Moble/29.li_KT'), 2)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00, \uC2A4\uD06C\uB864 \uC6C0\uC9C1\uC784\uC5D0 \uB530\uB978 class \uBCC0\uACBD\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/Moble/30.li_130 mm  140 mm'), 2)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00, \uC2A4\uD06C\uB864 \uC6C0\uC9C1\uC784\uC5D0 \uB530\uB978 class \uBCC0\uACBD\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/Moble/31.li_2560 x 1440 (Quad HD)'), 2)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00, \uC2A4\uD06C\uB864 \uC6C0\uC9C1\uC784\uC5D0 \uB530\uB978 class \uBCC0\uACBD\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/Moble/32.li_3000 mAh'), 2)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00, \uC2A4\uD06C\uB864 \uC6C0\uC9C1\uC784\uC5D0 \uB530\uB978 class \uBCC0\uACBD\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/Moble/33.li_1000   1500'), 2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/34.a_'))

WebUI.takeScreenshot()

'\uC228\uC5B4\uC788\uB294 \uC5D8\uB9AC\uBA3C\uD2B8\uB97C \uCC3E\uAE30 \uC704\uD574 \uC2A4\uD06C\uB864\uC744 \uD574\uB2F9 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC774\uB3D9\uD558\uB3C4\uB85D \uC218\uC815'
WebUI.scrollToElement(findTestObject('SCENARIO_TEST/KOREA/Moble/35.a_'), 2)

WebUI.delay(5)

'\uBAA8\uB4E0 \uC635\uC158\uC774 \uB3D9\uC77C\uD55C \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/35.a_'))

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/36.a_product-details__link'))

WebUI.waitForJQueryLoad(10)

'\uBAA8\uB4E0 \uC635\uC158\uC774 \uB3D9\uC77C\uD55C \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/37.a_'))

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/Moble/38.span_BT_color-chip'))

WebUI.waitForJQueryLoad(10)

WebUI.takeScreenshot()

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/KOREA/Moble/39.img'), findTestObject('SCENARIO_TEST/KOREA/Moble/41.div_s7_mixedmediaview_code0'))

WebUI.delay(2)

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/KOREA/Moble/40.img'), findTestObject('SCENARIO_TEST/KOREA/Moble/42.div_s7_mixedmediaview_code1'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.closeBrowser()

