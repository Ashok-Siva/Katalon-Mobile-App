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

import org.apache.commons.io.FileUtils;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

XSSFWorkbook workbook;
XSSFSheet sheet;
XSSFCell cell;

// Import excel sheet.
File src=new File("C:\\Users\\ashok\\OneDrive\\Documents\\Mobile Application TC.xlsx");

// Load the file.
FileInputStream finput = new FileInputStream(src);
// Load he workbook.
workbook = new XSSFWorkbook(finput);
// Load the sheet in which data is stored.
sheet = workbook.getSheet("HOST GAME");


if(Mobile.verifyElementExist(findTestObject('Host creation/android.widget.TextView0 - HIT N RUN'), 0))
{
String Venue_name = Mobile.getText(findTestObject('Host creation/android.widget.TextView0 - HIT N RUN'), 0)

String Area = Mobile.getText(findTestObject('Host creation/android.widget.TextView0 - Kilpauk'), 0)

String Rating = Mobile.getText(findTestObject('Host creation/android.widget.TextView0 - 4.1'), 0)

String Address = Mobile.getText(findTestObject('Host creation/android.widget.TextView0 - Mock 19  20 Halls Rd Agasthiya Nagar Thandavaraya'), 
    0)

sheet.getRow(3).createCell(8).setCellValue("Venue name :"+Venue_name +"\n Area :"+ Area +"\n Rating :"+ Rating +"\n Address :"+ Address);

cell = sheet.getRow(1).getCell(3);
cell.setCellType(CellType.STRING);
String a = cell.getStringCellValue();

if(a==Venue_name)
{
sheet.getRow(3).createCell(9).setCellValue("Pass");
}
else
{
sheet.getRow(3).createCell(9).setCellValue("Fail");
}

}

// Specify the file in which data needs to be written.
FileOutputStream fileOutput = new FileOutputStream(src);
// finally write content
workbook.write(fileOutput);
 // close the file
fileOutput.close();

Mobile.delay(5)
