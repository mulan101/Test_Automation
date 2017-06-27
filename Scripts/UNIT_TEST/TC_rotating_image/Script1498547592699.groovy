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

WebUI.scrollToElement(findTestObject('UNIT_TEST/RE_ROTATING_IMAGE/04.div_primary-selection__product'), 2)

iLeft = Mobile.getElementLeftPosition(findTestObject('UNIT_TEST/RE_ROTATING_IMAGE/04.div_primary-selection__product'), 2)

iTop = Mobile.getElementTopPosition(findTestObject('UNIT_TEST/RE_ROTATING_IMAGE/04.div_primary-selection__product'), 2)

WebUI.dragAndDropByOffset(findTestObject('UNIT_TEST/RE_ROTATING_IMAGE/01.img_js-img-src primary-selecti'), iLeft, iTop)

WebUI.delay(5)

WebUI.closeBrowser()

