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

WebUI.setViewPortSize(360, 800)

WebUI.navigateToUrl('http://www.samsung.com/sa/')

'\uC2A4\uD06C\uB9B0\uC0F7 \uCD94\uAC00'
WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/01.span_s-svg s-ico-search'))

WebUI.setText(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/02.input_gnb_search'), 'TV')

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0 delay'
WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/03.a_ led tv'))

'\uC2A4\uD06C\uB9B0\uC0F7 \uCD94\uAC00'
WebUI.takeScreenshot()

'\uD14D\uC2A4\uD2B8 \uAC80\uC99D\uC744 \uC704\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/04.span_5'), 2)

WebUI.selectOptionByValue(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/06.select'), 'recommended', true)

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0 delay'
WebUI.waitForJQueryLoad(10)

'\uC2A4\uD06C\uB9B0\uC0F7 \uCD94\uAC00'
WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/07.button_'))

'\uC5D8\uB9AC\uBA3C\uD2B8\uAC00 \uD074\uB9AD \uC0C1\uD0DC\uAC00 \uB420\uB54C \uAE4C\uC9C0 \uAE30\uB2E4\uB9B0\uB2E4.'
WebUI.waitForElementClickable(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/08.a_'), 10)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8 \uC874\uC7AC\uB85C \uC778\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD'
WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/08.a_'))

'\uB9C8\uC6B0\uC2A4 \uC624\uBC84\uC2DC class \uBCC0\uACBD\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815, \uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8 \uC874\uC7AC\uB85C \uC778\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD. \uC6D0\uC778\uC744 \uC54C \uC218 \uC5C6\uB294 \uBB38\uC81C\uB85C \uC778\uD574 chrome\uC758 xpath \uCD94\uCD9C \uB370\uC774\uD130\uB85C \uC218\uC815'
WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/09.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0 delay'
WebUI.waitForJQueryLoad(10)

'\uD14D\uC2A4\uD2B8 \uAC80\uC99D\uC744 \uC704\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD, \uD14D\uC2A4\uD2B8 \uACF5\uBC31\uC73C\uB85C \uC778\uD574 \uBE44\uAD50 \uC870\uAC74 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/10.li_4049'), 2)

'\uD14D\uC2A4\uD2B8 \uAC80\uC99D\uC744 \uC704\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD, \uD14D\uC2A4\uD2B8 \uACF5\uBC31\uC73C\uB85C \uC778\uD574 \uBE44\uAD50 \uC870\uAC74 \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/11.li_LED TV'), 2)

'\uC2A4\uD06C\uB9B0\uC0F7 \uCD94\uAC00'
WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/12.button_'))

'\uC0C1\uC704 div \uD0DC\uADF8\uB85C \uC778\uD574 \uD074\uB9AD \uC774\uC288\uAC00 \uBC1C\uC0DD\uD558\uC5EC \uC784\uC758\uB85C \uC2A4\uD06C\uB864\uC744 \uC6C0\uC9C1\uC5EC\uC11C \uC0C1\uC704 div\uC640 \uACB9\uCE58\uC9C0 \uC54A\uB3C4\uB85D \uC870\uCE58\uD568'
WebUI.scrollToElement(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/13.img_js-img-src imgCylinder-img'), 2)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8 \uC874\uC7AC\uB85C \uC778\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD'
WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/13_1.p_43 Full HD Flat Smart TV J55'))

'\uC0C1\uC704 div \uD0DC\uADF8\uB85C \uC778\uD574 \uD074\uB9AD \uC774\uC288\uAC00 \uBC1C\uC0DD\uD558\uC5EC \uC784\uC758\uB85C \uC2A4\uD06C\uB864\uC744 \uC6C0\uC9C1\uC5EC\uC11C \uC0C1\uC704 div\uC640 \uACB9\uCE58\uC9C0 \uC54A\uB3C4\uB85D \uC870\uCE58\uD568'
WebUI.scrollToElement(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/16.img'), 2)

'\uBA40\uD2F0 \uC5D8\uB9AC\uBA3C\uD2B8 \uC874\uC7AC\uB85C \uC778\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD'
WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/14.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0 delay'
WebUI.waitForJQueryLoad(10)

'\uD14D\uC2A4\uD2B8 \uAC80\uC99D\uC744 \uC704\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD, class \uACF5\uBC31(2\uCE78)\uC73C\uB85C \uC778\uD574 xpath \uC218\uC815'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/15.h1_50 Full HD Flat Smart TV J5'), 2)

WebUI.takeScreenshot()

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/16.img'), findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/17.img'))

'\uC774\uBBF8\uC9C0 \uD68C\uC804 \uD655\uC778\uC744 \uC704\uD574 Delay \uCD94\uAC00'
WebUI.delay(3)

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/17.img'), findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/18.img'))

'\uC774\uBBF8\uC9C0 \uD68C\uC804 \uD655\uC778\uC744 \uC704\uD574 Delay \uCD94\uAC00'
WebUI.delay(3)

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/18.img'), findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/19.img'))

'\uC774\uBBF8\uC9C0 \uD68C\uC804 \uD655\uC778\uC744 \uC704\uD574 Delay \uCD94\uAC00'
WebUI.delay(3)

'\uC774\uBBF8\uC9C0 \uD68C\uC804\uC744 \uC704\uD55C \uAE30\uB2A5 \uC218\uB3D9 \uCD94\uAC00'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/19.img'), findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/19_1.img'))

'\uC774\uBBF8\uC9C0 \uD68C\uC804 \uD655\uC778\uC744 \uC704\uD574 Delay \uCD94\uAC00'
WebUI.delay(3)

'\uC2A4\uD06C\uB9B0\uC0F7 \uCD94\uAC00'
WebUI.takeScreenshot()

'\uC0C1\uC704 div \uD0DC\uADF8\uB85C \uC778\uD574 \uD074\uB9AD \uC774\uC288\uAC00 \uBC1C\uC0DD\uD558\uC5EC \uC784\uC758\uB85C \uC2A4\uD06C\uB864\uC744 \uC6C0\uC9C1\uC5EC\uC11C \uC0C1\uC704 div\uC640 \uACB9\uCE58\uC9C0 \uC54A\uB3C4\uB85D \uC870\uCE58\uD568'
WebUI.scrollToElement(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/14.a_product-details__link'), 2)

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/20.a_'))

'\uD14D\uC2A4\uD2B8 \uAC80\uC99D\uC744 \uC704\uD574 \uC870\uAC74 \uCD94\uAC00 \uC120\uD0DD'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/21.span_'), 2)

'\uC2A4\uD06C\uB9B0\uC0F7 \uCD94\uAC00'
WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/SAUDI_ARABIA/Mobile/22.a_'))

'\uC2A4\uD06C\uB9B0\uC0F7 \uCD94\uAC00'
WebUI.takeScreenshot()

WebUI.closeBrowser()

