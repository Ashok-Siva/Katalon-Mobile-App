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

//==VENUE NAME==//
cell = sheet.getRow(8).getCell(3)

cell.setCellType(CellType.STRING)

if (cell.getStringCellValue() == 'Football') {
    'Selection Of Game "Football"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Football'), 0)

    String text = Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Football'), 
        0)

    sheet.getRow(8).createCell(8).setCellValue('Selected :' + text)
} else if (cell.getStringCellValue() == 'Cricket') {
    'Selection Of Game "Cricket"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Cricket'), 0)

    String text = Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Cricket'), 
        0)

    sheet.getRow(8).createCell(8).setCellValue('Selected :' + text)
}  else if (cell.getStringCellValue() == 'Badminton') {
    'Selection Of Game "Cricket"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Badminton'), 0)

    String text = Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Badminton'), 
        0)

    sheet.getRow(8).createCell(8).setCellValue('Selected :' + text)
}

// Specify the file in which data needs to be written.
FileOutputStream fileOutput = new FileOutputStream(src)

// finally write content
workbook.write(fileOutput)

// close the file
fileOutput.close()

Mobile.delay(5)

