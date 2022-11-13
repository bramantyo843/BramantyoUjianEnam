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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shop.demoqa.com/')

WebUI.click(findTestObject('Object Repository/RegisterTest/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_My Account'))

WebUI.setText(findTestObject('Object Repository/RegisterTest/Page_My Account  ToolsQA Demo Site/input__username'), 'sanji')

WebUI.setText(findTestObject('Object Repository/RegisterTest/Page_My Account  ToolsQA Demo Site/input__email'), 'sanji@gmail.com')

WebUI.setText(findTestObject('Object Repository/RegisterTest/Page_My Account  ToolsQA Demo Site/input__username'), 'sanji212')

WebUI.setEncryptedText(findTestObject('Object Repository/RegisterTest/Page_My Account  ToolsQA Demo Site/input__password'), 
    'OgbrUcIZsoS9KW8lCLTmjw==')

WebUI.click(findTestObject('Object Repository/RegisterTest/Page_My Account  ToolsQA Demo Site/span_Medium_show-password-input'))

WebUI.click(findTestObject('Object Repository/RegisterTest/Page_My Account  ToolsQA Demo Site/button_Register'))

WebUI.click(findTestObject('Object Repository/RegisterTest/Page_My Account  ToolsQA Demo Site/p_Hello sanji212 (not sanji212 Log out)'))

WebUI.click(findTestObject('Object Repository/RegisterTest/Page_My Account  ToolsQA Demo Site/a_Log out'))

WebUI.closeBrowser()

