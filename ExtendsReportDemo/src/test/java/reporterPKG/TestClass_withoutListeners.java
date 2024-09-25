package reporterPKG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import junit.framework.Assert;
import net.bytebuddy.asm.Advice.Local;

public class TestClass_withoutListeners {

	static ExtentReports extent;

	
	  @BeforeTest(groups = { "smoke", "regression" }) public void ExtentReports() {
	  
		  String path =System.getProperty("user.dir")+"//reports//report1//index.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(path);
			reporter.config().setReportName("Web Automation Results");
			reporter.config().setDocumentTitle("Test Results");
			
			 extent =new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Prashant Ranjan");
			//return extent;
			
	  }
	  
	 
	@Test
	public void test13331313() {
		extent.createTest("firstTest"); // this line to generate report for this test

		System.out.println("test1 to check extend report result");

		extent.flush(); // this line to flush report 
	}

	@Test(groups = { "smoke", "regression" })
	public void test2() {
		// String name = Local.class.getEnclosingMethod().getName(); // it will give you
		// current method name
		// extent.createTest("test2:SmokeTest");

		System.out.println("test1 to check extend report result");

		// extent.flush();
	}

	@Test(groups = { "regression" })
	public void test3() {
		// extent.createTest("firstTest");

		System.out.println("test1 to check extend report result");

		// extent.flush();
	}

	@Test(groups = { "regression" })
	public void test_fail() {
		Assert.fail();
		System.out.println("Forced to fail this TCs");

		// extent.flush();
	}

}
