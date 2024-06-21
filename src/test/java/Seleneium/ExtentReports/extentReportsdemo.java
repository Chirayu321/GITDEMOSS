package Seleneium.ExtentReports;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class extentReportsdemo {
	
	ExtentReports extent;
	
	

	
	public void config() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Reults Demo");
		reporter.config().setDocumentTitle("TEst Results demo");
		
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Chirayu Dutt");
		
	}
	
	
	
	
	
	
	
	@Test
	public void intialDemo() {
		
		extent = new ExtentReports();
		extent.createTest("Intial");
		
		
		WebDriverManager.chromedriver().setup();

	     WebDriver driver = new ChromeDriver(); 
	     driver.manage().window().maximize();
	     driver.get("https://rahulshettyacademy.com");
	     System.out.println(driver.getTitle());
	     extent.flush();
	}

}
