import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

int row = Integer.parseInt(no) ;

// Import excel sheet.
File src=new File("C:\\Users\\ashok\\OneDrive\\Documents\\Mobile Application TC.xlsx");

// Load the file.
FileInputStream finput = new FileInputStream(src);
// Load he workbook.
workbook = new XSSFWorkbook(finput);
// Load the sheet in which data is stored.
sheet = workbook.getSheet("DATA FILE");

Mobile.startApplication('C:\\Users\\ashok\\Downloads\\app-release.apk', false)

Mobile.delay(2)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 - Search'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 - Search (1)'), venue_name, 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.ViewGroup0'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.ViewGroup0'), 0)

Mobile.delay(5)

Mobile.swipe(800, 2000, 800, 1100)

Mobile.delay(1)

Mobile.tap(findTestObject('Time/Next Day'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Time/android.view.ViewGroup0 (4)'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Time/android.view.ViewGroup0 (5)'), 0)

Mobile.delay(1)

'Click on "Host game" button'
Mobile.tap(findTestObject('Host creation/android.widget.TextView0 - Host a game'), 0)

if (playing_game == 'Football') {
    'Selection Of Game "Football"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Football'), 0)
} else if (playing_game == 'Cricket') {
    'Selection Of Game "Cricket"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Cricket'), 0)
} else if (playing_game == 'Badminton') {
    'Selection Of Game "Cricket"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Badminton'), 0)
}

Mobile.delay(1)

if (format == '4 V 4') {
    'Selection Of Game "4vs4"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - 4 V 4'), 0)

    Mobile.delay(2)
} else if (format == '5 V 5') {
    'Selection Of Game "5vs5"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - 5 V 5'), 0)

    Mobile.delay(2)
} else if (format == '6 V 6') {
    'Selection Of Game "6vs6"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - 6 V 6'), 0)

    Mobile.delay(2)
} else if (format == 'singles') {
    'Selection Of Game "singles"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - singles'), 0)

    Mobile.delay(2)
} else if (format == 'doubles') {
    'Selection Of Game "doubles"'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - doubles'), 0)

    Mobile.delay(1)
}


int player = Integer.parseInt(players) ;

if(player > 10)
{
	int n = player-10
	
	for(int i=0;i<n;i++)
	{
		//Swipe right (increment by 1)
		Mobile.swipe(324, 1897, 108, 1897)
		
		Mobile.delay(2)
	}
}
else if(player < 10)
{
	int n = 10-player
	
	for(int i=0;i<n;i++)
	{
		//Swipe left (decrement by 1)
		Mobile.swipe(752, 1897, 965, 1897)
		
		Mobile.delay(2)
	}
}
else if(player == 10)
{
	
}


Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - NEXT'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.ViewGroup0 (5)'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Photos'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.RelativeLayout0 (1)'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.ViewGroup0 (6)'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 - Ashoks game'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 - Ashoks game (1)'), host_name, 
    0)

Mobile.delay(1)

Mobile.hideKeyboard()

Mobile.delay(1)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 - Give a short description about your game (optional)'), 
    0)

Mobile.delay(1)

Mobile.setText(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 - Give a short description about your game (optional) (1)'), 
    host_desc, 0)

Mobile.delay(1)

Mobile.hideKeyboard()

Mobile.delay(2)

if (sharing_option == 'Closed Game') {
    //'Closed game Radio button'
    //Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Closed Game'), 0)
} else if (sharing_option == 'Open Game') {
    'Open game Radio button'
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Open Game'), 0)
}

Mobile.delay(1)

Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - NEXT (1)'), 0)

Mobile.delay(1)

if (payment == 'Pay Later') {
    //Mobile.tap(findTestObject('Host creation/android.widget.TextView0 - Pay Later'), 0)
    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - CREATE GAME'), 0)

    Mobile.delay(1)
	
	if(Mobile.verifyElementExist(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Your game has been created'), 0))
	{
	Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Your game has been created'),
		0)

	Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - BOOKING PENDING'), 0)
	
	sheet.getRow(row).createCell(10).setCellValue("Passed");
	}
	else
	{
	sheet.getRow(row).createCell(10).setCellValue("Failed");
	}
	
	// Specify the file in which data needs to be written.
	FileOutputStream fileOutput = new FileOutputStream(src);
	// finally write content
	workbook.write(fileOutput);
	 // close the file
	fileOutput.close();
	Mobile.delay(5)
	
		Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.ImageView0 (2)'), 0)
	
		Mobile.delay(1)
	
		Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - My Games'), 0)
	
		Mobile.delay(1)
	
		Mobile.scrollToText(venue_name)
	
	
	//Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Apply coupon'), 0)
    //Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 -    Enter Coupon Code . . .'), 0)
    //Mobile.setText(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 -    Enter Coupon Code . . . (1)'), 'COUPON', 0)
    //Mobile.hideKeyboard()
    //Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Apply'), 0)
    //Mobile.pressBack()
} else if (payment == 'Pay Now') {
    Mobile.tap(findTestObject('Host creation/android.widget.TextView0 - Pay Now'), 0)

    Mobile.delay(1)

    Mobile.scrollToText('Pay entire amount')

    Mobile.delay(1)

    Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 -  0'), 0)

    Mobile.delay(1)

    Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - -  0'), 0)

    Mobile.delay(1)

    Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - -  0 (1)'), 0)

    Mobile.delay(1)

    Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 -  0 (1)'), 0)

    Mobile.delay(1)

    if (pay_option == 'PAY ADVANCE') {
        'PAY ADVANCE'
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Pay advance of  0'), 
            0)
    } else if (pay_option == 'PAY FULL AMOUNT') {
        'FULL AMOUNT'
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Pay entire amount'), 
            0)
    }
    
    Mobile.delay(1)

    Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - BOOK'), 0)

    Mobile.delay(1)

	/*
    if (Mobile.verifyElementExist(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0'), 0)) {
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0'), 0)

        Mobile.setText(findTestObject('Host Game (New Build with UI Changes)/android.widget.EditText0 (1)'), 'sivaashok132@gmail.com', 
            0)

        Mobile.hideKeyboard()

        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.Button0 - PROCEED'), 0)

        Mobile.delay(5)

        'Click on Netbanking'
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.View0 - Netbanking All Indian banks'), 
            0)

        Mobile.delay(1)

        'Click on SBI'
        Mobile.tap(findTestObject('Host creation/android.view.View0 - SBI'), 0)

        Mobile.delay(1)

        'Click PAY button at footer'
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.Button0 - PAY  200 PAY  200'), 0)

        Mobile.delay(1)

        'Click on SUCCESS button'
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.Button0 - Success'), 0)

        Mobile.delay(1)
		
		if(Mobile.verifyElementExist(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Your game has been created (1)'), 0))
		{
		Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Your game has been created (1)'),
			0)

		Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - SLOT BOOKED'), 0)
		
		sheet.getRow(Row).createCell(8).setCellValue("Passed");
		}
		else
		{
		sheet.getRow(Row).createCell(8).setCellValue("Failed");
		}
		
    } 
    */
	if(Mobile.verifyElementExist(findTestObject('Host Game (New Build with UI Changes)/android.view.View0 - Netbanking All Indian banks'), 0)) 
	{
        'Click on Netbanking'
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.view.View0 - Netbanking All Indian banks'), 0)

        Mobile.delay(1)

        'Click on SBI'
        Mobile.tap(findTestObject('Host creation/android.view.View0 - SBI'), 0)

        Mobile.delay(1)

        'Click PAY button at footer'
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.Button0 - PAY  200 PAY  200'), 0)

        Mobile.delay(1)

        'Click on SUCCESS button'
        Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.Button0 - Success'), 0)

        Mobile.delay(5)
		
		if(Mobile.verifyElementExist(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Your game has been created (1)'), 0))
		{
        Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - Your game has been created (1)'), 
            0)

        Mobile.getText(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - SLOT BOOKED'), 0)
		
		sheet.getRow(row).createCell(10).setCellValue("Passed");
		}
		else
		{
		sheet.getRow(row).createCell(10).setCellValue("Failed");
		}
		
		// Specify the file in which data needs to be written.
		FileOutputStream fileOutput = new FileOutputStream(src);
		// finally write content
		workbook.write(fileOutput);
		 // close the file
		fileOutput.close();
		Mobile.delay(5)
    }

	
		Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.ImageView0 (2)'), 0)
	
		Mobile.delay(1)
	
		Mobile.tap(findTestObject('Host Game (New Build with UI Changes)/android.widget.TextView0 - My Games'), 0)
	
		Mobile.delay(1)
	
		Mobile.scrollToText(venue_name)
	
}

	
	


Mobile.closeApplication()

Mobile.delay(5)