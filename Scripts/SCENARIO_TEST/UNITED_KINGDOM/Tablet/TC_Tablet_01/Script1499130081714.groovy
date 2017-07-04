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

'Tablet'
WebUI.setViewPortSize(800, 900)

WebUI.navigateToUrl('http://www.samsung.com/uk/support/model/SM-G955FZVDXEU')

not_run: WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/01. button_s-svg s-gnb-toggler'))

not_run: WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/02 .a_SUPPORT'))

not_run: WebUI.setText(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/03. input_searchItem3'), 'galaxy')

'galaxy \uCD94\uCC9C \uAC80\uC0C9\uC5B4\uCC3D\uC774 \uB728\uAE30 \uC804\uAE4C\uC9C0 \'\uBE44\uB3D9\uAE30 \uD1B5\uC2E0\'\uC5D0 \uC758\uD55C \uC2DC\uAC04\uCC28\uB97C \uC704\uD55C wait\r\n'
not_run: WebUI.waitForJQueryLoad(10)

'\uBC29\uBC95 1. text \uBD80\uBD84 \uCCB4\uD06C_3\uAC1C\uC758 \uC911\uBCF5 Xpath \uBC1C\uACAC\uB428\r\n\uBC29\uBC95 2. \uD06C\uB86C \uAC1C\uBC1C\uC790\uC5D0\uC11C Xpath \uCD94\uCD9C\uD568.(\uC804\uCCB4 \uB3C4\uD615 \uBD80\uBD84) //*[@id=\"appendTarget\"]/li[2]/a\r\n\uBC29\uBC95 3. \uD06C\uB86C \uAC1C\uBC1C\uC790\uC5D0\uC11C Xpath \uCD94\uCD9C\uD568.(\uC774\uBBF8\uC9C0 \uBD80\uBD84) //*[@id=\"appendTarget\"]/li[2]/a/span[1]/img\r\n'
not_run: WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/04. img_'))

not_run: WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/05. a_SOLUTIONS'))

not_run: WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/06. a_MANUAL DOWNLOAD'))

not_run: WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/07. a_USEFUL SOFTWARE'))

not_run: WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/08. a_USEFUL LINK'))

'1. object spy\uB97C \uD1B5\uD574 \uAC80\uC0C9\uD560 \uACBD\uC6B0, \uC911\uBCF5\uC758 xpath\uAC00 \uAC80\uC0C9\uB418\uC5B4, \uAD6C\uAE00 \uAC1C\uBC1C\uC790 \uBAA8\uB4DC\uC5D0\uC11C xpath \uCD94\uCD9C\r\n2. \uBB38\uC81C \uD574\uACB0\uC774 \uB418\uC9C0\uC54A\uC74C. \uC0C1\uC704 \uD56D\uBAA9\uC758 class \uBA85\uC5D0 \'\uBE48\uCE78\'\uC774 \uC788\uC5C8\uC74C. '
WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/09. a_Offers'))

'\uC774\uBBF8\uC9C0\uB97C \uD68C\uC804\uC2DC\uD0AC \uC218\uB294 \uC788\uC73C\uB098, \uC544\uB798 \uC810 \uBD80\uBD84\uC740 \uBCC0\uD558\uC9C0 \uC54A\uC74C'
WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/10. img_js-img-src_01'), findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/10. for rotating_span_sort by'))

WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/10. img_js-img-src_02'), findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/10. _for rotating'))

WebUI.dragAndDropToObject(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/10. img_js-img-src_03'), findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/10. _for rotating'))

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/11. span_current_archieve'))

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/12. span_s-filter-select-arrow'))

WebUI.click(findTestObject('SCENARIO_TEST/UNITED_KINGDOM/Tablet/13. span_sort_Oldest'))

WebUI.closeBrowser()

