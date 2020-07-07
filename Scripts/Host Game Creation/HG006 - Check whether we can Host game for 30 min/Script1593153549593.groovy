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
import org.apache.commons.io.FileUtils as FileUtils
import org.apache.poi.common.usermodel.HyperlinkType as HyperlinkType
import org.apache.poi.ss.usermodel.CellStyle as CellStyle
import org.apache.poi.ss.usermodel.CellType as CellType
import org.apache.poi.ss.usermodel.CreationHelper as CreationHelper
import org.apache.poi.ss.usermodel.Font as Font
import org.apache.poi.ss.usermodel.Hyperlink as Hyperlink
import org.apache.poi.ss.usermodel.IndexedColors as IndexedColors
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook

XSSFWorkbook workbook

XSSFSheet sheet

XSSFCell cell

// Import excel sheet.
File src = new File('C:\\Users\\ashok\\OneDrive\\Documents\\Mobile Application TC.xlsx')

// Load the file.
FileInputStream finput = new FileInputStream(src)

// Load he workbook.
workbook = new XSSFWorkbook(finput)

// Load the sheet in which data is stored.
sheet = workbook.getSheet('HOST GAME')

'Swipe to the time selection area for booking'
Mobile.swipe(800, 2000, 800, 1100)

Mobile.delay(5)

//'Swipe to next session'
//Mobile.swipe(950, 1250, 450, 1250)

'Select the "Next day" for booking'
Mobile.tap(findTestObject('Time/Next Day'), 0)

Mobile.delay(3)

'Select the 1st row 1st element of time'
Mobile.tap(findTestObject('Time/android.view.ViewGroup0'), 0)

Mobile.delay(3)

'Select the 1st row 3rd element of time'
Mobile.tap(findTestObject('Time/android.view.ViewGroup0 (2)'), 0)

Mobile.delay(3)

'Select the 2nd row 1st element of time'
Mobile.tap(findTestObject('Time/android.view.ViewGroup0 (4)'), 0)

Mobile.delay(3)

if (Mobile.verifyElementExist(findTestObject('Host creation/android.widget.TextView0 - Host a game'), 0)) {
    'Click on "Host game" button'
    Mobile.tap(findTestObject('Host creation/android.widget.TextView0 - Host a game'), 0)

    sheet.getRow(6).createCell(8).setCellValue(Mobile.takeScreenshot())
} else {
    sheet.getRow(6).createCell(8).setCellValue('Time slot is already booked')
}

sheet.getRow(6).createCell(9).setCellValue('Pass')

// Specify the file in which data needs to be written.
FileOutputStream fileOutput = new FileOutputStream(src)

// finally write content
workbook.write(fileOutput)

// close the file
fileOutput.close()

Mobile.delay(5)

