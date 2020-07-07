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

WebUI.callTestCase(findTestCase('Start Application'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Clicking on Search bar at the top of the front page'
Mobile.tap(findTestObject('Booking/android.widget.EditText0 - Search'), 0)

Mobile.delay(3)

'Value passing at the search textbox'
Mobile.setText(findTestObject('Booking/android.widget.EditText0 - Search (1)'), venue_name, 0)

Mobile.delay(5)

'Click on the First value on the list by passing the search value'
Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.ViewGroup0'), 0)

Mobile.delay(5)

'Click on the First value on the list by passing the search value'
Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.ViewGroup0'), 0)

Mobile.delay(5)

Mobile.swipe(550, 2000, 550, 500)

Mobile.delay(3)

Mobile.swipe(550, 2000, 550, 500)

if (Rating == 1) {
    Mobile.tap(findTestObject('Rating/Rating 1'), 0)
} else if (Rating == 2) {
    Mobile.tap(findTestObject('Rating/Rating 2'), 0)
} else if (Rating == 3) {
    Mobile.tap(findTestObject('Rating/Rating 3'), 0)
} else if (Rating == 4) {
    Mobile.tap(findTestObject('Rating/Rating 4'), 0)
} else if (Rating == 5) {
    Mobile.tap(findTestObject('Rating/Rating 5'), 0)
}

Mobile.delay(3)

Mobile.tap(findTestObject('Rating/android.widget.TextView0 - Write a review'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Rating/android.widget.EditText0 - Tell us your game here . . .'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Rating/android.widget.EditText0 - Tell us your game here . . . (1)'), Review, 0)

Mobile.delay(3)

Mobile.hideKeyboard()

Mobile.delay(3)

Mobile.tap(findTestObject('Rating/android.widget.TextView0 - POST'), 0)

Mobile.delay(3)

Mobile.pressBack()

Mobile.delay(3)

'Clicking on Search bar at the top of the front page'
Mobile.tap(findTestObject('Booking/android.widget.EditText0 - Search'), 0)

Mobile.delay(3)

'Value passing at the search textbox'
Mobile.setText(findTestObject('Booking/android.widget.EditText0 - Search (1)'), venue_name, 0)

Mobile.delay(5)

'Click on the First value on the list by passing the search value'
Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.ViewGroup0'), 0)

Mobile.delay(5)

'Click on the First value on the list by passing the search value'
Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.ViewGroup0'), 0)

Mobile.scrollToText(Review)