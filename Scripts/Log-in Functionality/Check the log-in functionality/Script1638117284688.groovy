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

WebUI.navigateToUrl('https://trello.com/')

WebUI.click(findTestObject('Object Repository/Login Functionality/Page_Trello/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Login Functionality/Page_Log in to Trello/input_Log in to Trello_user'), 
    'lanahameda22+trello@gmail.com')

WebUI.click(findTestObject('Object Repository/Login Functionality/Page_Log in to Trello/input_concat(Don, , t ask for codes when I _e2894b'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login Functionality/Page_Log in to continue - Log in with Atlas_6762ee/input_lanahameda22trellogmail.com_password'), 
    '83L4iC0wUXEcz+eu7QXdtQ==')

WebUI.click(findTestObject('Object Repository/Login Functionality/Page_Log in to continue - Log in with Atlas_6762ee/span_Log in'))

WebUI.navigateToUrl('https://id.atlassian.com/login/authorize?application=trello&continue=https%3A//trello.com/auth/atlassian/callback?returnUrl%3D%252F%26display%3D%26aaOnboarding%3D%26updateEmail%3D%26traceId%3D61a3de520a92c4c22421de3f6708d99c%26migrateGoogle%3D%26ssoVerified%3D&token=eyJraWQiOiJtaWNyb3NcL2FpZC1zaWdudXBcL284dTQ5b2xudHNoazhxY2IiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiJsaW5rLXNpZ25hdHVyZS12YWxpZGF0b3IiLCJtYXJrZWRWZXJpZmllZCI6ImZhbHNlIiwiY3NyZlRva2VuIjoiODk1Njg5Y2QtNWM4NS00ZWQzLWFjNmMtY2JjYTUwNzkwMzgyIiwibmJmIjoxNjM4MTI5MjQwLCJsb2dpblR5cGUiOiJwYXNzd29yZExvZ2luIiwic2NvcGUiOiJMb2dpbiIsImlzcyI6Im1pY3Jvc1wvYWlkLXNpZ251cCIsImV4cCI6MTYzODEyOTM2MCwidXNlcklkIjoiNjFhM2FkNDBjNTEwYmMwMDZiY2NmNGFhIiwiaWF0IjoxNjM4MTI5MjQwLCJqdGkiOiJiZDk0YmY3Ni0yMTRkLTRkZmMtODk2Yi02ZDJhYzc4MmYyZGQifQ.wAmrLmYwH15ikRnmc-7Bkk26NPKPMXWQx_wUxf45EJPIN3GhPWLPf0mwBDZP77RPNzB2h_EymnAvQKnmwkCVrCssJ-zAyxqYHFIg-dX-FcClMJq_Gk_Qk83HakXiOViB9BZfH0MnUM9KIzT4Uw2crt51uZLJ5ra8BdgrZbrQ-AKGEH2A3QAJBkZ3TFjVd76edWQkl6aTogwJEy47k3xzXBSwJr_Qm6V8ZGCHQMT16xp756L96XRUk-ePtOMRnJkotlcBj6HqN8iW1XnLN8nhEBlI5_4uXeNuDJkXYcbkbS39VuokwRa_Z9nRgrj4cbKf-mg7Y_4SJC_Q8oXlKUnfyA')

WebUI.setText(findTestObject('Object Repository/Login Functionality/Page_Log in to continue - Log in with Atlas_6762ee/input_Something went wrong while attempting_41ad15'), 
    'lanahameda22+trello@gmail.com')

WebUI.click(findTestObject('Object Repository/Login Functionality/Page_Log in to continue - Log in with Atlas_6762ee/span_Continue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login Functionality/Page_Log in to continue - Log in with Atlas_6762ee/input_lanahameda22trellogmail.com_password'), 
    '83L4iC0wUXEcz+eu7QXdtQ==')

WebUI.click(findTestObject('Object Repository/Login Functionality/Page_Log in to continue - Log in with Atlas_6762ee/span_Log in'))

