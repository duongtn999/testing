import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://online.hcmue.edu.vn/')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Tn ng nhp_ctl00ContentPlaceHolder1ctl_537cb7'), 
    '42.01.104.217')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/td'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_Mt m_ctl00ContentPlaceHolder1ctl00ctl_4544f5'), 
    'qeRTSEhBB4qm+xlh2p1RXA==')

WebUI.click(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/input_S lng truy cp _ctl00ContentPlaceHolde_c71575'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/td_THNG BAO SINH VIN'), 
    'Thông Báo Sinh Viên')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_UP Portal  HoChiMinh University of Pedagogy/a_ng Thot'), 
    30)

WebUI.closeBrowser()

