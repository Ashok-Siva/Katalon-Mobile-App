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

//Mobile.startApplication('C:\\Users\\ashok\\Downloads\\app-release.apk', true)
'Clicking on Search bar at the top of the front page'
Mobile.tap(findTestObject('Booking/android.widget.EditText0 - Search'), 0)

Mobile.delay(5)

'Value passing at the search textbox'
Mobile.setText(findTestObject('Booking/android.widget.EditText0 - Search (1)'), 'HIT', 0)

//Mobile.hideKeyboard()
'Click on the First value on the list by passing the search value'
Mobile.tap(findTestObject('Booking/android.view.ViewGroup0'), 0)

Mobile.delay(5)

'Click on the First value on the list by passing the search value'
Mobile.tap(findTestObject('Booking/android.view.ViewGroup0'), 0)

Mobile.delay(5)

'Swipe to the time selection area for booking'
Mobile.swipe(550, 1450, 550, 750)

Mobile.delay(5)

'Select the "Next day" for booking'
Mobile.tap(findTestObject('Booking/android.view.ViewGroup0 (1)'), 0)

Mobile.delay(3)

'Select the 2nd row 1st element of time'
Mobile.tap(findTestObject('Booking/android.view.ViewGroup0 (2)'), 0)

Mobile.delay(3)

'Select the 2nd row 2nd element of time'
Mobile.tap(findTestObject('Booking/android.view.ViewGroup0 (3)'), 0)

Mobile.delay(3)

'Click on BOOK button'
Mobile.tap(findTestObject('Booking/android.widget.TextView0 - BOOK'), 0)

Mobile.delay(3)

'Radio button for Advance amount'
Mobile.tap(findTestObject('Booking/android.view.ViewGroup0 (4)'), 0)

Mobile.delay(3)

'Radio button for Full Amount'

//Mobile.tap(findTestObject('Booking/android.view.ViewGroup0 (5)'), 0)
'Click Book Button'
Mobile.tap(findTestObject('Booking/android.widget.TextView0 - BOOK (1)'), 0)

Mobile.delay(3)

'Card Selection'
Mobile.tap(findTestObject('Booking/android.view.View0 - Card Visa MasterCard RuPay  More'), 0)

Mobile.delay(3)

if (Mobile.verifyElementExist(findTestObject('Booking/android.widget.EditText0'), 0)) {
    'Credit Card Number value passing'
    Mobile.setText(findTestObject('Booking/android.widget.EditText0'), '5105105105105100', 0)

    Mobile.delay(3)

    'MM/YY value passing'
    Mobile.setText(findTestObject('Booking/android.widget.EditText0 (1)'), '05/25', 0)

    Mobile.delay(3)

    'CVV number value passing'
    Mobile.setText(findTestObject('Booking/android.widget.EditText0 (2)'), '123', 0)

    Mobile.delay(3)

    'Click PAY button'
    Mobile.tap(findTestObject('Booking/android.widget.Button0 - PAY  100'), 0)

    Mobile.delay(10)

    'Open notification to capture razor pay message'
    Mobile.openNotifications()

    Mobile.delay(10)

    String Razor = Mobile.getText(findTestObject('Booking/android.widget.TextView0 - 658015 is the OTP for accessing saved cards on TURF TOWN. Valid till 121630 IST. Do not share this with anyone.'), 
        0)

    String OTP = Razor.substring(0, 5)

    Mobile.delay(3)

    Mobile.closeNotifications()

    Mobile.tap(findTestObject('Booking/android.widget.EditText0 (3)'), 0)

    Mobile.delay(5)

    Mobile.setText(findTestObject('Booking/android.widget.EditText0 (3)'), OTP, 0)

    Mobile.delay(3)

    Mobile.tap(findTestObject('Booking/android.widget.Button0 - PAY  100'), 0)

    Mobile.delay(5)

    Mobile.tap(findTestObject('Booking/android.widget.Button0 - Success'), 0)

    Mobile.delay(10)
} else {

    Mobile.openNotifications()

    Mobile.delay(5)

    String Razor = Mobile.getText(findTestObject('Booking/android.widget.TextView0 - 658015 is the OTP for accessing saved cards on TURF TOWN. Valid till 121630 IST. Do not share this with anyone.'), 
        0)

    String OTP = Razor.substring(0, 6)

    Mobile.delay(3)

    Mobile.closeNotifications()

    Mobile.tap(findTestObject('Booking/android.widget.EditText0 (3)'), 0)

    Mobile.delay(5)

    Mobile.setText(findTestObject('Booking/android.widget.EditText0 (3)'), OTP, 0)

    Mobile.delay(3)

    Mobile.tap(findTestObject('Booking/android.widget.Button0 - VERIFY'), 0)

    Mobile.delay(5)
	
	'Credit Card Number value passing'
	Mobile.setText(findTestObject('Booking/android.widget.EditText0'), '5105105105105100', 0)

	Mobile.delay(3)

	'MM/YY value passing'
	Mobile.setText(findTestObject('Booking/android.widget.EditText0 (1)'), '05/25', 0)

	Mobile.delay(3)

	'CVV number value passing'
	Mobile.setText(findTestObject('Booking/android.widget.EditText0 (2)'), '123', 0)

	Mobile.delay(3)

	'Click PAY button'
	Mobile.tap(findTestObject('Booking/android.widget.Button0 - PAY  100'), 0)

	Mobile.delay(10)

    Mobile.tap(findTestObject('Booking/android.widget.Button0 - Success'), 0)

    Mobile.delay(10)
}

