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

if(cell.getStringCellValue() == "Pay Now")
{

//==FORMAT==//
cell = sheet.getRow(21).getCell(3);
cell.setCellType(CellType.STRING);

if(Mobile.verifyElementExist(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Pay advance of  0'), 0))
{

if(cell.getStringCellValue() == "PAY ADVANCE")
{
'PAY ADVANCE'
Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Pay advance of  0'), 0)

String text = Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Pay advance of  0'), 0)

sheet.getRow(21).createCell(8).setCellValue("Selected :"+text);

sheet.getRow(21).createCell(9).setCellValue("Pass");
}

else if(cell.getStringCellValue() == "PAY FULL AMOUNT")
{
'FULL AMOUNT'
Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Pay entire amount'), 0)

String text = Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Pay entire amount'), 0)

sheet.getRow(21).createCell(8).setCellValue("Selected :"+text);

sheet.getRow(21).createCell(9).setCellValue("Pass");
}


}
else
{
	sheet.getRow(21).createCell(9).setCellValue("Fail");
}


}
else
{
	sheet.getRow(21).createCell(8).setCellValue("This scenario is skipped due to selection of PAY LATER");
	
	sheet.getRow(21).createCell(9).setCellValue("Pass");
}

// Specify the file in which data needs to be written.
FileOutputStream fileOutput = new FileOutputStream(src);
// finally write content
workbook.write(fileOutput);
 // close the file
fileOutput.close();

Mobile.delay(5)