import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.eclipse.persistence.internal.oxm.record.json.JSONParser.object_return as object_return
import org.junit.After as After
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

'App installed '
Mobile.startApplication('C:\\Users\\ashok\\Downloads\\app-release.apk', true)

Mobile.delay(5)

Mobile.swipe(800, 1150, 400, 1150)

Mobile.delay(5)

Mobile.swipe(800, 1150, 400, 1150)

Mobile.delay(5)

Mobile.swipe(800, 1150, 400, 1150)

Mobile.delay(5)

Mobile.swipe(800, 1150, 400, 1150)

Mobile.delay(5)

Mobile.tap(findTestObject('android.widget.TextView0 - GET STARTED'), 0)

WebUI.delay(3)

Mobile.setText(findTestObject('android.widget.EditText0 - Mobile Number'), '9791072819', 0)

Mobile.tap(findTestObject('android.widget.TextView0 - SUBMIT'), 0)

Mobile.delay(10)

Mobile.openNotifications()

String OTP_msg = Mobile.getText(findTestObject('android.widget.TextView0 -  OTP is 8426'), 0)

String OTP = OTP_msg.split(' is')[1]

Mobile.delay(5)

Mobile.closeNotifications()

println(OTP)

char one = OTP.charAt(1)

String first = Character.toString(one)

char two = OTP.charAt(2)

String second = Character.toString(two)

char three = OTP.charAt(3)

String third = Character.toString(three)

char four = OTP.charAt(4)

String fourth = Character.toString(four)

Mobile.setText(findTestObject('OTP Edittext/android.widget.EditText0'), first, 0)

Mobile.setText(findTestObject('OTP Edittext/android.widget.EditText0 (1)'), second, 0)

Mobile.setText(findTestObject('OTP Edittext/android.widget.EditText0 (2)'), third, 0)

Mobile.setText(findTestObject('OTP Edittext/android.widget.EditText0 (3)'), fourth, 0)

