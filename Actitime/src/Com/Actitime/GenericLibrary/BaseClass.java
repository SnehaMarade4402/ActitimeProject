package Com.Actitime.GenericLibrary;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
@BeforeSuite
public void databaseconnection() {
	Reporter.log("Database Connected Successfully",true);
}
@AfterSuite
public void databasedisconnection() {
Reporter.log("Database Disconnected Successfully",true);
}

@BeforeClass
public void launchbrowser() {
	ChromeOptions option=new ChromeOptions();
	
}
}
