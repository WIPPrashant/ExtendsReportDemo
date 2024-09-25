package reporterPKG;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports getReporterObject()
	{
		String path =System.getProperty("user.dir")+"//reports//index.html"; //report location
		String configpath =System.getProperty("user.dir")+"//config//extent-config.xml"; //configXML location

	// ExtentSparkReporter
		//String path =System.getProperty("user.dir")+"//reports//index.html"; //report location
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); 
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Extends Test Results");
		//reporter.loadXMLConfig(new File(configpath));
		reporter.config().setTheme(Theme.DARK);
		
		//	ExtentReports
		 extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester",System. getProperty("user.name")); // current system user name
		extent.setSystemInfo("Application Name", "DPS");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));// current Test system OS 
		extent.setSystemInfo("phone device", "Pixel7a");
		return extent;
		
	}

	
}
