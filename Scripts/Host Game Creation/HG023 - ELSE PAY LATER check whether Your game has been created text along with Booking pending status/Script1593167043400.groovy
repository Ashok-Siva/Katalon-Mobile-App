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

//==FORMAT==//
cell = sheet.getRow(19).getCell(3);
cell.setCellType(CellType.STRING);

if(cell.getStringCellValue() == "Pay Later")
{

if(Mobile.verifyElementExist(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Your game has been created'), 0) && Mobile.verifyElementExist(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - BOOKING PENDING'), 0))
{
String text1 = Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Your game has been created'), 0)

String text2 = Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - BOOKING PENDING'), 0)

sheet.getRow(26).createCell(8).setCellValue("CREATE STATUS : "+text1+"\n BOOKING STATUS : "+text2+"\n HOST BOOKED SUCCESSFULLY");

sheet.getRow(26).createCell(9).setCellValue("Pass");

Mobile.delay(2)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.ImageView0 (2)'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - My Games'), 0)

Mobile.delay(2)

//==HOST NAME==//
cell = sheet.getRow(14).getCell(3);
cell.setCellType(CellType.STRING);

Mobile.scrollToText(cell.getStringCellValue())


}
else
{
	sheet.getRow(26).createCell(9).setCellValue("Fail");
	}



}
else
{
	sheet.getRow(26).createCell(8).setCellValue("This scenario is skipped due to selection of PAY NOW");
	
	sheet.getRow(26).createCell(9).setCellValue("Pass");
}

// Specify the file in which data needs to be written.
FileOutputStream fileOutput = new FileOutputStream(src);
// finally write content
workbook.write(fileOutput);
 // close the file
fileOutput.close();

Mobile.delay(5)