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

WebUI.callTestCase(findTestCase('Creating New Board/Check creating new board'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Check adding,editing and delete a task/Page_Agile Board  Trello/span_Room for Improvement_icon-sm icon-add'))

WebUI.setText(findTestObject('Object Repository/Check adding,editing and delete a task/Page_Agile Board  Trello/textarea_Room for Improvement_list-card-com_4e7b49'), 
    'Lana Test creating new task')

WebUI.click(findTestObject('Object Repository/Check adding,editing and delete a task/Page_Agile Board  Trello/input_Room for Improvement_nch-button nch-b_588918'))

WebUI.click(findTestObject('Object Repository/Check adding,editing and delete a task/Page_Agile Board  Trello/span_1Lana Test creating new task'))

WebUI.setText(findTestObject('Object Repository/Check adding,editing and delete a task/Page_Lana Test creating new task on Agile B_80b97c/textarea_Lana Test creating new task_mod-ca_d127ec'), 
    'Lana Test creating new task editing')

WebUI.click(findTestObject('Object Repository/Check adding,editing and delete a task/Page_Lana Test creating new task editing on_cecf48/span_Archive'))

WebUI.click(findTestObject('Object Repository/Check adding,editing and delete a task/Page_Lana Test creating new task editing on_cecf48/a_contact us_icon-md icon-close dialog-clos_a06fe5'))

