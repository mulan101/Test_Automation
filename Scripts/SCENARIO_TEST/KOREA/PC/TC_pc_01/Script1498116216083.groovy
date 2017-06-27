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

'\uC0BC\uC131\uB2F7\uCEF4 Main \uD654\uBA74 \uC774\uB3D9'
WebUI.navigateToUrl('http://www.samsung.com/sec/')

WebUI.takeScreenshot()

'\uB85C\uADF8\uC778 \uBA54\uB274 \uB9C8\uC6B0\uC2A4 \uC624\uBC84'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/01.Page_Samsung_main/01.span_s-svg s-ico-logout_mouseover'))

'\uB85C\uADF8\uC778 \uBC84\uD2BC \uD074\uB9AD / \uB85C\uADF8\uC778 \uD654\uBA74 \uC774\uB3D9'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/01.Page_Samsung_main/02.a_move_login_click'))

WebUI.takeScreenshot()

'\uC544\uC774\uB514 \uC785\uB825 , id\uAC12\uC774 \uC2DC\uD000\uC2A4\uB85C \uC0DD\uC131\uB418\uAE30 \uB54C\uBB38\uC5D0 \uCD94\uAC00 \uC218\uC815\r\n'
WebUI.setText(findTestObject('SCENARIO_TEST/KOREA/PC/02.Page_Login/03.input_pnDLFYZt5U0KqQjekainputU'), loginId)

'\uBE44\uBC00\uBC88\uD638 \uC785\uB825 , id\uAC12\uC774 \uC2DC\uD000\uC2A4\uB85C \uC0DD\uC131\uB418\uAE30 \uB54C\uBB38\uC5D0 \uCD94\uAC00 \uC218\uC815\r\n'
WebUI.setText(findTestObject('SCENARIO_TEST/KOREA/PC/02.Page_Login/04.input_pnDLFYZt5U0KqQjekainputP'), loginPwd)

'\uB85C\uADF8\uC778 \uBC84\uD2BC \uD074\uB9AD / Main\uD654\uBA74\uC73C\uB85C \uC774\uB3D9'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/02.Page_Login/05.input_btnSignIn_button'))

'edge\uC758 \uACBD\uC6B0 \uB85C\uADF8\uC778 \uC644\uB8CC \uC2DC\uC810\uC5D0 \uC624\uB958\uAC00 \uBC1C\uC0DD\uB418\uC5B4 delay \uB85C\uC9C1 \uCD94\uAC00'
WebUI.delay(20)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/01.Page_Samsung_main/06.span_s-svg s-ico-login_mouserover'))

'\uB85C\uADF8\uC778 \uC644\uB8CC \uCCB4\uD06C\uB97C \uC704\uD574 text \uBE44\uAD50'
WebUI.verifyElementPresent(findTestObject('SCENARIO_TEST/KOREA/PC/01.Page_Samsung_main/07.strong_validation_login'), 2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/01.Page_Samsung_main/08.a_menu_mouseover'))

'\uC2A4\uB9C8\uD2B8\uD3F0 \uBA54\uB274 \uD074\uB9AD'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/01.Page_Samsung_main/09.a_menu_click'))

WebUI.takeScreenshot()

'\uC2A4\uB9C8\uD2B8\uD3F0 \uC804\uCCB4 \uBCF4\uAE30 \uBC84\uD2BC \uD074\uB9AD / xpath \uC804\uCCB4 \uC218\uC815'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/03.Page_choice_mobile/10.a_smartphone_all_click'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/04.Page_choice_detail_mobile/11.span_filter-sort__arrow'))

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/12.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(2)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/13.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(2)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/14.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(2)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/15.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(2)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/16.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(2)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/17.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(2)

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/18.span_filter-sort__inp-checkbox'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/05.Page_search_mobile/19.button_submit'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(2)

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
WebUI.delay(5)

'class \uACF5\uBC31 \uCD94\uAC00 / xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/07.Page_ S7   SM-G935SZDESKC  Samsung/30.a_'))

WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/07.Page_ S7   SM-G935SZDESKC  Samsung/31.span_BT_color-chip'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(5)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/08.Page_SM-G935S  SM-G935STKFSKC  Sams/33.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(5)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/08.Page_SM-G935S  SM-G935STKFSKC  Sams/34.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(5)

'xpath \uC911\uBCF5 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC778\uD55C \uC870\uAC74 \uC218\uB3D9 \uCD94\uAC00'
WebUI.click(findTestObject('SCENARIO_TEST/KOREA/PC/08.Page_SM-G935S  SM-G935STKFSKC  Sams/35.a_product-details__link'))

'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\uC73C\uB85C \uC778\uD574 delay \uCD94\uAC00'
WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.closeBrowser()

