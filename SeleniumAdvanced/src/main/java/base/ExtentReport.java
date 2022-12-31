package base;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utilities.PropertiesOperation;

public class ExtentReport {

	static ExtentReports extent;

	public static ExtentReports setUpExtentReport() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date d = new Date();
		String actualDate = format.format(d);

		String reportPath = System.getProperty("user.dir") + "/Reports/ExecutionReport_" + actualDate + ".html";

		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		extent = new ExtentReports();
		extent.attachReporter(spark);
		spark.config().setDocumentTitle("VV Automation Report");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("ReportName");

		extent.setSystemInfo("Executed on Envt: ", PropertiesOperation.loadProperties("url"));
		extent.setSystemInfo("Executed on Browser: ", PropertiesOperation.loadProperties("browser"));
		extent.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
		extent.setSystemInfo("Executed on User: ", System.getProperty("user.name"));

		return extent;

	}

}
