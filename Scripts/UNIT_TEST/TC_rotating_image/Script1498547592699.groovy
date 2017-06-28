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

WebUI.setViewPortSize(400, 700)

WebUI.navigateToUrl('http://www.samsung.com/sec/smartphones/')

'\uD68C\uC804 \uD655\uC778\uC744 \uC704\uD574 \uC2A4\uD06C\uB864 \uD3EC\uCEE4\uC2A4\uB97C \uB300\uC0C1 \uC5D8\uB9AC\uBA3C\uD2B8\uB85C \uC774\uB3D9\uD568'
WebUI.scrollToElement(findTestObject('UNIT_TEST/RE_ROTATING_IMAGE/04.div_primary-selection__product'), 2)

WebUI.delay(3)

'\uCCAB\uBC88\uC9F8 \uC774\uB3D9'
WebUI.dragAndDropToObject(findTestObject('UNIT_TEST/RE_ROTATING_IMAGE/01.img_js-img-src primary-selecti'), findTestObject(
        'UNIT_TEST/RE_ROTATING_IMAGE/04.div_primary-selection__product'))

WebUI.delay(3)

'\uB450\uBC88\uC9F8 \uC774\uB3D9'
WebUI.dragAndDropToObject(findTestObject('UNIT_TEST/RE_ROTATING_IMAGE/02.img_js-img-src primary-selecti'), findTestObject(
        'UNIT_TEST/RE_ROTATING_IMAGE/05.div_primary-selection__product'))

WebUI.delay(3)

'3\uBC88\uC9F8 \uC774\uB3D9'
WebUI.dragAndDropToObject(findTestObject('UNIT_TEST/RE_ROTATING_IMAGE/03.img_js-img-src primary-selecti'), findTestObject(
        'UNIT_TEST/RE_ROTATING_IMAGE/06.div_primary-selection__product'))

WebUI.delay(3)

WebUI.closeBrowser()

