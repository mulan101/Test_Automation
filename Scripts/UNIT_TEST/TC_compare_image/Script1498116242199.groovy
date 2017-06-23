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

WebUI.navigateToUrl('http://www.samsung.com/sec/smartphones/galaxy-s8-g950/SM-G950NZKAKTC/')

WebUI.click(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/a_product-details__link_01'))

WebUI.delay(2)

bImgFlag1 = WebUI.verifyImagePresent(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/img_01'))

WebUI.click(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/a_product-details__link_02'))

WebUI.delay(2)

bImgFlag2 = WebUI.verifyImagePresent(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/img_02'))

WebUI.click(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/a_product-details__link_03'))

WebUI.delay(2)

bImgFlag3 = WebUI.verifyImagePresent(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/img_03'))

WebUI.click(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/a_product-details__link_04'))

WebUI.delay(2)

bImgFlag4 = WebUI.verifyImagePresent(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/img_04'))

WebUI.click(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/a_product-details__link_05'))

WebUI.delay(2)

bImgFlag5 = WebUI.verifyImagePresent(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/img_05'))

WebUI.click(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/a_product-details__link_06'))

WebUI.delay(2)

bImgFlag6 = WebUI.verifyImagePresent(findTestObject('UNIT_TEST/RE_COMPARE_IMAGE/Page_SM-G950N  SM-G950NZKAKTC  Sams/img_06'))

WebUI.closeBrowser()

